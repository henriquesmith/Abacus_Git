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
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import views.grafico;
import views.viewAbaco;
import views.progressDialog;

/**
 *
 * @author Administrador
 */
public class viewAbacoController implements PropertyChangeListener {

    private float taxaSec, Vsec;
    private progressDialog pd;
    private JFrame frame;
    private final JFrame parent;
    private final viewAbaco view;
    private final secaoTransversal sec;
    private final Esforcos esforcos;
    private final Materials mat;

    public viewAbacoController(JFrame parent, secaoTransversal sec, Esforcos esforcos, Materials mat) {
        this.parent = parent;
        this.sec = sec;
        this.esforcos = esforcos;
        this.mat = mat;
        this.view = new viewAbaco();
        taxa(sec, esforcos, mat);
        init();

    }

    private void init() {
        view.getBtnAbaco().addActionListener(e -> gerarAbaco());
        view.getBtnEnvoltoria().addActionListener(e -> gerarEnvoltoria());
        frame = new JFrame("Geração de abacos");
        this.pd = new progressDialog(this.frame);
        frame.setIconImage(this.parent.getIconImage());
        frame.setResizable(false);
        frame.add(view);
        pd = new progressDialog(frame);
        view.getJPEenvoltoria().setLayout(new GridBagLayout());
        view.getJPanelABACO().setLayout(new GridBagLayout());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(parent);
    }

    private void gerarAbaco() {
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "abaco");
        float V = Float.parseFloat(view.getTxtVarV().getText());
        float w1 = Float.parseFloat(view.getTxtW1().getText());
        float w2 = Float.parseFloat(view.getTxtW2().getText());
        float ac = this.sec.getArea(); // cm²
        float sigma = this.mat.getConcrete().getSigmacd() / 10;//kN/cm²
        float fyd = this.mat.getAco().getFyd() / 10; //kN/cm²
        float N;
        float deltaW = (float) 0.2;
        N = V * ac * sigma;
        float hx = this.sec.getHx();
        float hy = this.sec.getH();
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);
        pd.setMax(100);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pd.setVisible(true);
            }

        });

        SwingWorker<Map<Float, List<Esforcos>>, Integer> worker = new SwingWorker<Map<Float, List<Esforcos>>, Integer>() {
            Map<Float, List<Esforcos>> moR;

            @Override
            protected void done() {
                grafico graf = new grafico();
                try {
                    Map<Float, List<Esforcos>> mo = get();
                    System.out.println("Size: " + mo.size());
                    view.getJPanelABACO().add(graf.grafico("μx", "μy"));
                    graf.setSeriesMap(mo, ac, hx, hy, sigma);
                    pd.setValue(100);
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    pd.setVisible(false);

                } catch (InterruptedException ex) {
                    Logger.getLogger(viewAbacoController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(viewAbacoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            protected void process(List<Integer> count) {
                int progress = count.get(count.size() - 1);
                pd.setValue(progress);
            }

            @Override
            protected Map<Float, List<Esforcos>> doInBackground() throws Exception {
                float count = (100 / (w2));
                float p;
                Map<Float, List<Esforcos>> mom = new HashMap<Float, List<Esforcos>>();
                for (float w = w1; w <= w2; w = w + deltaW) {
                    float As = ((w * ac * sigma) / fyd) * 100;
                    List< Esforcos> es;
                    es = ln.envoltoria(0, 360, As, N);
                    mom.put(w, es);
                    p = count * w;
                    publish((int) p);
                }
                moR = mom;
                return mom;
            }

        };
        worker.execute();
    } //metodo que gera a envoltória de momentos da seçao idealizada

    private void gerarEnvoltoria() {
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "envoltoria");
        pd.setMax(360);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pd.setVisible(true);
            }

        });
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);
        SwingWorker<List<Esforcos>, Integer> worker = new SwingWorker<List<Esforcos>, Integer>() {
            List<Esforcos> moR;

            @Override
            protected void done() {
                grafico graf = new grafico();
                List<Float> mx = new ArrayList<>();
                List<Float> my = new ArrayList<>();
                try {
                    List<Esforcos> mom = get();
                    for (Esforcos e : mom) {
                        mx.add(e.getMxk());
                        my.add(e.getMyk());
                    }
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    view.getJPEenvoltoria().add(graf.grafico("mx", "my"));
                    graf.setSeries(mx, my, taxaSec);
                    graf.setEspacamento(125);
                } catch (InterruptedException ex) {
                    Logger.getLogger(viewAbacoController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(viewAbacoController.class.getName()).log(Level.SEVERE, null, ex);
                }
                pd.setVisible(false);

            }

            @Override
            protected void process(List<Integer> count) {
                int lastcount = count.get(count.size() - 1);
                pd.setValue(lastcount);
            }

            @Override
            protected List<Esforcos> doInBackground() throws Exception {
                List<Esforcos> mom = new ArrayList<>();
                int count = 0;
                for (float i = 0; i <= 360; i++) {
                    float xLN;
                    xLN = ln.bissecant(0, 1000, i, sec.getBars().getAreaBars(), esforcos.getNk());
                    mom.add(ln.moments(xLN, i, sec.getBars().getAreaBars()));
                    count++;
                    publish(count);
                }
                moR = mom;
                return moR;
            }

        };
        worker.execute();
    }

    private void taxa(secaoTransversal s, Esforcos esf, Materials mat) {
        float Ac, As, sigma, fyd, normal, taxa, V;
        Ac = s.getArea(); //cm²
        As = s.getBars().getAreaBars() / 100; //cm²
        sigma = mat.getConcrete().getSigmacd() / 10; //kN/cm²
        fyd = mat.getAco().getFyd() / 10; //kN/cm²
        normal = esf.getNk();
        taxa = (As / Ac) * (fyd / sigma);
        V = ((normal) / (Ac * sigma));
        this.Vsec = V;
        this.taxaSec = taxa;
        view.getTxtV().setText(String.format("%.2f", Vsec));
        view.getTxtTaxa().setText(String.format("%.2f", taxaSec));
    }

    /**
     * @return the parent
     */
    public JFrame getParent() {
        return parent;
    }

    /**
     * @return the view
     */
    public viewAbaco getView() {
        return view;
    }

    /**
     * @return the sec
     */
    public secaoTransversal getSec() {
        return sec;
    }

    /**
     * @return the esforcos
     */
    public Esforcos getEsforcos() {
        return esforcos;
    }

    /**
     * @return the mat
     */
    public Materials getMat() {
        return mat;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            int progress = (Integer) evt.getNewValue();
            pd.setValue(progress);
        }
    }
}
