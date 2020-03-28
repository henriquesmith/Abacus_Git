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
import java.awt.GridBagLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import views.grafico;
import views.miniSecao;

import views.viewAbaco;
import views.progressDialog;

/**
 *
 * @author Administrador
 */
public class viewAbacoController implements PropertyChangeListener, progressDialogListener {

    private List<Float> Mx;
    private List<Float> My;
    private float taxaSec, Vsec, Uxs, Uys;
    private progressDialog pd;
    private JFrame frame;
    private final JFrame parent;
    private final viewAbaco view;
    private final secaoTransversal sec;
    private final Esforcos esforcos;
    private final Materials mat;
    miniSecao ms;
    private SwingWorker<Map<Float, List<Esforcos>>, Integer> worker;
    private SwingWorker<List<Esforcos>, Integer> worker2;

    public viewAbacoController(JFrame parent, secaoTransversal sec, Esforcos esforcos, Materials mat) {
        this.parent = parent;
        this.sec = sec;
        this.esforcos = esforcos;
        this.mat = mat;
        this.view = new viewAbaco();
        taxa(sec, esforcos, mat);
        ms = new miniSecao(sec);
        init();
    }

    private void init() {
        view.getBtnFcn_Go().addActionListener(e -> FCN());
        view.getPanelS().setLayout(new BorderLayout());
        view.getBtnFCN_X().addActionListener(e -> getGraf_FCN());
        view.getBtn_FCO().addActionListener(e -> getABACO());
        view.gettBtn_Env().addActionListener(e -> getEnV());
        view.getBtnDim().addActionListener(e -> gerarInclinacao());
        view.getBtnAbaco().addActionListener(e -> gerarAbaco());
        view.getBtnEnvoltoria().addActionListener(e -> gerarEnvoltoria());

        view.getGrup().add(view.getButton0());
        view.getGrup().add(view.getButton90());

        frame = new JFrame("Geração de abacos");
        this.pd = new progressDialog(this.frame);
        pd.setListener(this);
        frame.setIconImage(this.parent.getIconImage());
        frame.setResizable(false);
        frame.add(view);
        frame.setOpacity(1);
        view.getJPanelINI().setLayout(new GridBagLayout());
        view.getJPanelINI().add(ms);
        view.getPanelS().add(ms);
        view.getJPanelN_X().setLayout(new GridBagLayout());
        view.getJPEenvoltoria().setLayout(new GridBagLayout());
        view.getJPanelABACO().setLayout(new GridBagLayout());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(parent);
    }

    private void FCN() {
        view.getJPanelN_X().removeAll();
        view.getJPanelN_X().revalidate();
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "nx");
        float deltaw = (float) 0.2;
        if (view.getTxtFcn_w1().getText().isEmpty() || view.getTxtFcn_w2().getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Insira a variação da taxa de armadura", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (view.getButton0().isSelected() || view.getButton90().isSelected()) {
                float w1 = Float.parseFloat(view.getTxtFcn_w1().getText());
                float w2 = Float.parseFloat(view.getTxtFcn_w2().getText());
                float ac = this.sec.getArea(); // cm²
                float sigma = this.mat.getConcrete().getSigmacd() / 10;//kN/cm²
                float fyd = this.mat.getAco().getFyd() / 10; //kN/cm²
                float hx = this.sec.getHx();
                float hy = this.sec.getH();
                pd.setMax(100);
                pd.setValue(0);

                NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        pd.setVisible(true);
                    }

                });

                worker = new SwingWorker<Map<Float, List<Esforcos>>, Integer>() {

                    @Override
                    protected void done() {
                        double tetaD = 0;
                        if (view.getButton0().isSelected() == true && view.getButton90().isSelected() == false) {
                            tetaD = 90;

                        } else if (view.getButton90().isSelected()) {
                            tetaD = 0;
                        }
                        grafico graf = new grafico();

                        pd.setVisible(false);
                        if (isCancelled() == true) {
                            return;
                        }

                        try {
                            Map<Float, List<Esforcos>> mo = get();
                            view.getJPanelN_X().add(graf.grafico("", "'", "TIPO DE AÇO  " + mat.getAco().getTypeAco().toString()));

                            graf.setPlot(.8);

                            graf.setSeriesMap(mo, ac, hx, hy, sigma, tetaD);
                            graf.addSecao(ms.setarImagem(), 350, 40, true);
                            graf.setGrid(false);
                            graf.setCL(1);

                            java.awt.Toolkit.getDefaultToolkit().beep();

                            pd.setVisible(false);
                        } catch (InterruptedException | ExecutionException ex) {

                        }
                    }

                    @Override
                    protected void process(List<Integer> count) {
                        int progress = count.get(count.size() - 1);
                        pd.setValue(progress);
                    }

                    @Override
                    protected Map<Float, List<Esforcos>> doInBackground() throws Exception {
                        Map<Float, List<Esforcos>> mom = new HashMap<Float, List<Esforcos>>();
                        float alfa = 0;
                        float alfa2 = 0;
                        float count = (100 / (w2));
                        if (view.getButton0().isSelected() == true && view.getButton90().isSelected() == false) {
                            alfa = 0;
                            alfa2 = 180;
                        } else if (view.getButton90().isSelected()) {
                            alfa = 90;
                            alfa2 = -90;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Selecione o angulo desejado!", "Importante", JOptionPane.INFORMATION_MESSAGE);
                        }
                        System.out.println("");
                        System.out.println("angulo: " + alfa + " angulo2: " + alfa2);

                        for (float w = w1; w <= w2; w = (w + deltaw)) {
                            if (isCancelled()) {
                                break;
                            }
                            System.out.println(" ");
                            System.out.println("w avaliado: " + w);
                            float As = (((w * ac * sigma) / fyd) * 100);
                            List< Esforcos> es;
                            es = ln.env_FCN(As, alfa, alfa2);
                            mom.put(w, es);
                            float p = count * w;
                            publish((int) p);
                        }

                        return mom;
                    }

                };
                worker.execute();

            } else {
                JOptionPane.showMessageDialog(frame, "Escolha um angulo no checkBox", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void getGraf_FCN() {
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "nx");
    }

    private void getEnV() {
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "envoltoria");
    }

    private void getABACO() {
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "abaco");
    }

    // arrumar method
    private void FC_N_ENV_X() {
        float area = this.sec.getArea();
        float hx = this.sec.getHx();
        float hy = this.sec.getH();
        float sigma = this.mat.getConcrete().getSigmacd() / 10;
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "nx");
        grafico graf = new grafico();
        List<Float> mx = new ArrayList<>();
        List<Float> my = new ArrayList<>();
        List<Float> N = new ArrayList<>();
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);

        List<Esforcos> mo = new ArrayList<>();
        float a = -2;
        while (a <= 2) {
            System.out.println(" ");
            System.out.println("valor avaliado: " + a);
            float n = a * (this.sec.getArea()) * (this.mat.getConcrete().getSigmacd() / 10);
            float xLN = ln.bissecant(0, 1000, (float) (this.esforcos.getTetaD() - 90), this.sec.getBars().getAreaBars(), n, (float) 0.002);
            Esforcos e = ln.moments(xLN, (float) (this.esforcos.getTetaD() - 90), this.sec.getBars().getAreaBars());
            Esforcos es = new Esforcos(e.getMxk(), e.getMyk(), e.getNk());
            mo.add(e);
            mo.add(es);
            a = (float) (a + 0.1);

        }
        for (Esforcos e : mo) {
            float x = e.getMxk();
            float y = e.getMyk();
            float nx = e.getNk();
            x = ((x * 100) / (area * hx * sigma));
            y = ((y * 100) / (area * hy * sigma));
            nx = ((nx) / (area * sigma));
            mx.add(x);
            my.add(y);
            N.add(nx);
        }

        view.getJPanelN_X().add(graf.grafico("v", "ux", "Teste FCO"));
        graf.setSeries(N, my, 10f);

    }

    private void gerarInclinacao() {
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);
        float inc = ln.inclinacaoLN((float) (this.esforcos.getTetaD() - 90), this.esforcos.getNk(), this.sec.getBars().getAreaBars(), this.esforcos, (float) 0.001);
        float xLN = ln.bissecant(0, 1000, inc, this.sec.getBars().getAreaBars(), this.esforcos.getNk(), (float) 0.001);
        view.getTxtInclinacao().setText(String.format("%.2f", inc));
        view.getTxtProfundidade().setText(String.format("%.2f", xLN));
    }

    private void gerarAbaco() {
        view.getJPanelABACO().removeAll();
        view.getJPanelABACO().revalidate();
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
        pd.setValue(0);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pd.setVisible(true);
            }

        });

        worker = new SwingWorker<Map<Float, List<Esforcos>>, Integer>() {
            Map<Float, List<Esforcos>> moR;

            @Override
            protected void done() {
                grafico graf = new grafico();
                pd.setVisible(false);
                if (isCancelled()) {
                    return;
                }
                try {
                    Map<Float, List<Esforcos>> mo = get();
                    System.out.println("Size: " + mo.size());
                    view.getJPanelABACO().add(graf.grafico("μx", "μy", "AÇO " + mat.getAco().getTypeAco().toString() + "        ν= " + view.getTxtVarV().getText()));
                    graf.setPlot(.70);
                    graf.setSeriesMap(mo, ac, hx, hy, sigma, 45);
                    graf.addSecao(ms.setarImagem(), 350, 40, true);
                    graf.setGrid(false);
                    graf.setCL(1);
                    pd.setValue(100);
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    pd.setVisible(false);

                } catch (InterruptedException | ExecutionException ex) {

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
                float w = w1;
                while (w <= w2) {
                    if (isCancelled()) {
                        break;
                    }
                    float As = ((w * ac * sigma) / fyd) * 100;
                    List< Esforcos> es;
                    es = ln.envoltoria(0, 360, As, N, (float) 0.0025);
                    mom.put(w, es);
                    p = count * w;
                    w = w + deltaW;
                    publish((int) p);

                }
                moR = mom;
                return mom;
            }

        };
        worker.execute();
    } //metodo que gera a envoltória de momentos da seçao idealizada

    private void gerarEnvoltoria() {
        view.getJPEenvoltoria().removeAll();
        view.getJPEenvoltoria().revalidate();
        CardLayout cl = (CardLayout) view.getJPGraficos().getLayout();
        cl.show(view.getJPGraficos(), "envoltoria");
        pd.setValue(0);
        pd.setMax(100);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pd.setVisible(true);
            }

        });
        NeutralLine ln = new NeutralLine(this.frame, this.sec, this.esforcos, this.mat);
        worker2 = new SwingWorker<List<Esforcos>, Integer>() {
            List<Esforcos> moR;

            @Override
            protected void done() {
                grafico graf = new grafico();
                List<Float> mx = new ArrayList<>();
                List<Float> my = new ArrayList<>();
                pd.setVisible(false);
                if (isCancelled()) {
                    return;
                }
                try {
                    List<Esforcos> mom = get();
                    for (Esforcos e : mom) {
                        mx.add(e.getMxk());
                        my.add(e.getMyk());
                    }
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    view.getJPEenvoltoria().add(graf.grafico("Mx (kN.m)", "My(kN.m)", "AÇO " + mat.getAco().getTypeAco().toString() + "    ν = " + String.format("%.2f", Vsec)));
                    graf.setPlot(0.8);
                    graf.setGrid(true);
                    graf.setSeries(mx, my, taxaSec);
                    graf.addSecao(ms.setarImagem(), 350, 40, true);
                    graf.setGrid(false);
                } catch (InterruptedException | ExecutionException ex) {

                }
                pd.setVisible(false);

            }

            @Override
            protected void process(List<Integer> count) {
                int lastcount = count.get(count.size() - 1);
                pd.setValue((100 * lastcount) / 360);
            }

            @Override
            protected List<Esforcos> doInBackground() throws Exception {
                List<Esforcos> mom = new ArrayList<>();
                int count = 0;
                for (float i = 0; i <= 360; i++) {
                    if (isCancelled()) {
                        break;
                    }
                    float xLN;
                    xLN = ln.bissecant(0, 1000, i, sec.getBars().getAreaBars(), esforcos.getNk(), (float) 0.002);
                    mom.add(ln.moments(xLN, i, sec.getBars().getAreaBars()));
                    count++;
                    publish(count);
                }
                moR = mom;
                return moR;
            }

        };
        worker2.execute();
    }

    private void taxa(secaoTransversal s, Esforcos esf, Materials mat) {
        float Ac, As, sigma, fyd, normal, taxa, V;
        Mx = new ArrayList<>();
        My = new ArrayList<>();
        Ac = s.getArea(); //cm²
        As = s.getBars().getAreaBars() / 100; //cm²
        sigma = mat.getConcrete().getSigmacd() / 10; //kN/cm²
        fyd = mat.getAco().getFyd() / 10; //kN/cm²
        normal = esf.getNk();
        taxa = (As / Ac) * (fyd / sigma);
        V = ((normal) / (Ac * sigma));
        this.Uxs = esf.getMxk(); // kN.m
        this.Uys = esf.getMyk();// kN.m
        this.Vsec = V;
        this.taxaSec = taxa;
        Mx.add(Uxs);
        My.add(Uys);
        view.getTxtV().setText(String.format("%.2f", Vsec));
        view.getTxtTaxa().setText(String.format("%.2f", taxaSec));
        view.getTxtUxS().setText(String.format("%.2f", this.Mx.get(0)));
        view.getTxtUyS().setText(String.format("%.2f", this.My.get(0)));
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

    /**
     * @return the Uxs
     */
    public float getUxs() {
        return Uxs;
    }

    /**
     * @return the Uys
     */
    public float getUys() {
        return Uys;
    }

    @Override
    public void ProgressBarcanceled() {
        if (worker != null) {
            worker.cancel(true);
        }
        if (worker2 != null) {
            worker2.cancel(true);
        }
    }
}
