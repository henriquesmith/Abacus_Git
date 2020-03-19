/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entites.Esforcos;
import entites.Materials;
import entites.NeutralLine;
import entites.secaoTransversal;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import views.abacoView;
import views.grafico;
import views.progressDialog;

/**
 *
 * @author Administrador
 */
public class abacoViewController {

    progressDialog pd;
    secaoTransversal sec;
    Esforcos esf;
    Materials mat;
    private abacoView view = null;
    private JFrame frame;
    private JFrame parent = null;
    private float taxaArm, NormalReduzida;
    private int count;

    public abacoViewController(JFrame parent, secaoTransversal sec, Esforcos esf, Materials mat) {
        this.sec = sec;
        this.esf = esf;
        this.mat = mat;
        this.parent = parent;
        this.view = new abacoView();
        pd = new progressDialog(this.frame);
        taxa();
        init();
    }

    private void gerarEnv(float atb, float nd) throws ExecutionException {
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esf, this.mat);
        grafico graf = new grafico();
        view.getJPanelEnvoltoria().setLayout(new BorderLayout());
        view.getJPanelEnvoltoria().add(graf.grafico("Mxdr (kN/m)", "Mydr (kN/m)"), BorderLayout.CENTER);
        view.getJPanelEnvoltoria().validate();
        CardLayout cl = (CardLayout) view.getJPChart().getLayout();
        cl.show(view.getJPChart(), "env");
        List<Esforcos> es = new ArrayList<>();
        List<Float> N = new ArrayList<>();
        List<Float> Mx = new ArrayList<>();
        List<Float> My = new ArrayList<>();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pd.setVisible(true);
            }
        });

        SwingWorker<List<Esforcos>, Integer> worker = new SwingWorker<List<Esforcos>, Integer>() {

            @Override
            protected List<Esforcos> doInBackground() throws Exception {
                float xLn;
                for (float i = 0; i < 360; i++) {
                    xLn = ln.bissecant(0, 1000, i, atb, nd);
                    es.add(ln.moments(xLn, i, atb));
                }
                es.stream().map((e) -> {
                    Mx.add(e.getMxk());
                    return e;
                }).forEach((e) -> {
                    My.add(e.getMyk());
                });
                grafico graf = new grafico();
                view.getJPanelEnvoltoria().setLayout(new BorderLayout());
                view.getJPanelEnvoltoria().add(graf.grafico("Mxdr (kN/m)", "Mydr (kN/m)"), BorderLayout.CENTER);
                view.getJPanelEnvoltoria().validate();
                CardLayout cl = (CardLayout) view.getJPChart().getLayout();
                cl.show(view.getJPChart(), "env");
                graf.setSeries(Mx, My, taxaArm);

                return es;
            }

            @Override
            protected void process(List<Integer> count) {
                int c = count.get(count.size() - 1);
                pd.setValue(c);
            }

            @Override
            protected void done() {
                pd.setVisible(false);
            }
        };
        worker.execute();

    }

    private void taxa() {
        if (this.mat != null && this.sec != null) {
            float Ac, As, sigma, fyd, normal;
            Ac = this.sec.getArea(); //cm²
            As = this.sec.getBars().getAreaBars() / 100; //cm²
            sigma = this.mat.getConcrete().getSigmacd() / 10; //kN/cm²
            fyd = this.mat.getAco().getFyd() / 10; //kN/cm²
            normal = this.esf.getNk();
            this.taxaArm = (As / Ac) * (fyd / sigma);
            this.NormalReduzida = ((normal) / (Ac * sigma));
        }
    }

    private void init() {
        view.getBtnGerar().addActionListener(e -> {
            try {
                gerarEnv(this.sec.getBars().getAreaBars(), this.esf.getNk());
            } catch (ExecutionException ex) {
                Logger.getLogger(abacoViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        view.getBtnEnvoltoria().addActionListener(e -> {
            try {
                envoltoria();
            } catch (ExecutionException ex) {
                Logger.getLogger(abacoViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        view.getJPanelEnvoltoria().validate();
        //testes
        CardLayout cl = (CardLayout) view.getJPChart().getLayout();
        cl.show(view.getJPChart(), "env");
        view.getTxtNormal().setText(String.format("%.2f", this.NormalReduzida));
        view.getTxtTaxa().setText(String.format("%.2f", this.taxaArm));
        frame = new JFrame("Ábaco");
        frame.setResizable(false);
        frame.add(view);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(parent);
        frame.setVisible(true);

    }
// metodo teste

    private void envoltoria() throws ExecutionException {


    }

    // metodo teste
    private void gerar() throws ExecutionException {
        grafico graf = new grafico();
        view.getJPanelEnvoltoria().add(graf.grafico("μx", "μy"), BorderLayout.CENTER);
        view.getJPanelEnvoltoria().validate();
        CardLayout cl = (CardLayout) view.getJPChart().getLayout();
        cl.show(view.getJPChart(), "env");
        NeutralLine LN = new NeutralLine(this.frame, this.sec, this.esf, this.mat);
        float deltaw = (float) 0.2;
        float ac = this.sec.getArea();
        float fyd = this.mat.getAco().getFyd() / 10;
        float sigma = this.mat.getConcrete().getSigmacd() / 10;
        float w1 = Float.parseFloat(view.getTxtVarTaxa().getText());
        float w2 = Float.parseFloat(view.getTxtVarTaxa2().getText());
        float V = Float.parseFloat(view.getTxtVarV().getText());
        float N;
        N = V * ac * sigma;
        System.out.println("N : " + N);
        float hx = this.sec.getHx();
        float hy = this.sec.getH();
        for (float k = w1; k <= w2; k = k + deltaw) {
            float As = ((k * ac * sigma) / fyd) * 100;
            List< Esforcos> es = null;
            List<Float> Nr = new ArrayList<>();
            List<Float> Mx = new ArrayList<>();
            List<Float> My = new ArrayList<>();
           es = LN.envoltoria(0, 360, As, N);
            for (int i = 0; i < es.size(); i++) {
                float mx = es.get(i).getMxk();
                float my = es.get(i).getMyk();
                mx = (((mx * 100)) / (ac * hx * sigma));
                my = (((my * 100)) / (ac * hy * sigma));
                float n = es.get(i).getNk();
                Mx.add(mx);
                My.add(my);

            }
            Mx.add(Mx.get(0));
            My.add(My.get(0));
            graf.setEspacamento(0.1);
            graf.setSeries(Mx, My, k);
            System.out.println("");
            System.out.println("Next w: " + k);
        }
    }

    /**
     * @return the taxaArm
     */
    public float getTaxaArm() {
        return taxaArm;
    }

    /**
     * @return the NormalReduzida
     */
    public float getNormalReduzida() {
        return NormalReduzida;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
}
