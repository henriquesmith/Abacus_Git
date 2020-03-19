/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.javafx.tk.Toolkit;
import entites.Esforcos;
import entites.Materials;
import entites.NeutralLine;
import entites.secaoTransversal;
import java.awt.GridBagLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
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
        view.getBtnEnvoltoria().addActionListener(e -> gerarEnvoltoria());
        frame = new JFrame("Geração de abacos");
        this.pd = new progressDialog(this.frame);
        frame.setIconImage(this.parent.getIconImage());
        frame.setResizable(false);
        frame.add(view);
        pd = new progressDialog(frame);
        view.getJPEenvoltoria().setLayout(new GridBagLayout());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(parent);
    }

    private void gerarEnvoltoria() {
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
                for (float i = 0; i < 360; i++) {
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
        this.Vsec =V;
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
