/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class viewAbaco extends javax.swing.JPanel {

    /**
     * Creates new form viewAbaco
     */
    public viewAbaco() {
        initComponents();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000, 600);
    }

    public JTextField getTxtV() {
        return this.txtV;
    }

    public JTextField getTxtTaxa() {
       return this.txtTaxa;
    }

    public JButton getBtnEnvoltoria() {

        return this.btnEnvoltoria;
    }

    public JButton getBtnAbaco() {
        return this.btnAbaco;
    }

    public JPanel getJPGraficos() {
        return this.jPanelGraficos;
    }

    public JPanel getJPEenvoltoria() {
        return this.jPEnvoltoria;
    }

    public JPanel getJPanelABACO() {
        return this.jPanelAbaco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTaxa = new javax.swing.JTextField();
        btnEnvoltoria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnAbaco = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelGraficos = new javax.swing.JPanel();
        jPEnvoltoria = new javax.swing.JPanel();
        jPanelInicial = new javax.swing.JPanel();
        jPanelAbaco = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 600));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Envoltória"));
        jPanel3.setMinimumSize(new java.awt.Dimension(195, 195));
        jPanel3.setPreferredSize(new java.awt.Dimension(195, 195));

        jLabel1.setText("Normal reduzida (v):");

        txtV.setMinimumSize(new java.awt.Dimension(50, 24));
        txtV.setPreferredSize(new java.awt.Dimension(50, 24));

        jLabel2.setText("Tax. Armadura (w):");
        jLabel2.setMaximumSize(new java.awt.Dimension(113, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(113, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(113, 16));

        txtTaxa.setMinimumSize(new java.awt.Dimension(50, 24));
        txtTaxa.setPreferredSize(new java.awt.Dimension(50, 24));

        btnEnvoltoria.setText("Gerar envoltória");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnEnvoltoria)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnEnvoltoria)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new java.awt.GridBagConstraints());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Abaco"));
        jPanel4.setMinimumSize(new java.awt.Dimension(195, 195));
        jPanel4.setPreferredSize(new java.awt.Dimension(195, 195));

        jLabel4.setText(" Normal reduzida V:");
        jLabel4.setMaximumSize(new java.awt.Dimension(113, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(113, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(113, 16));

        jTextField4.setMinimumSize(new java.awt.Dimension(50, 24));
        jTextField4.setPreferredSize(new java.awt.Dimension(50, 24));

        jLabel3.setText("Variação da tax. de armadura");

        jLabel5.setText("De");

        jTextField3.setMinimumSize(new java.awt.Dimension(30, 24));
        jTextField3.setPreferredSize(new java.awt.Dimension(30, 24));

        jLabel6.setText("à");

        jTextField5.setMinimumSize(new java.awt.Dimension(30, 24));
        jTextField5.setPreferredSize(new java.awt.Dimension(30, 24));

        btnAbaco.setText("GO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAbaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaco))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Dimensionar"));
        jPanel5.setMinimumSize(new java.awt.Dimension(195, 195));
        jPanel5.setPreferredSize(new java.awt.Dimension(195, 195));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jPanel5, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanelGraficos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelGraficos.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPEnvoltoriaLayout = new javax.swing.GroupLayout(jPEnvoltoria);
        jPEnvoltoria.setLayout(jPEnvoltoriaLayout);
        jPEnvoltoriaLayout.setHorizontalGroup(
            jPEnvoltoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        jPEnvoltoriaLayout.setVerticalGroup(
            jPEnvoltoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPEnvoltoria, "envoltoria");

        javax.swing.GroupLayout jPanelInicialLayout = new javax.swing.GroupLayout(jPanelInicial);
        jPanelInicial.setLayout(jPanelInicialLayout);
        jPanelInicialLayout.setHorizontalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        jPanelInicialLayout.setVerticalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPanelInicial, "card4");

        javax.swing.GroupLayout jPanelAbacoLayout = new javax.swing.GroupLayout(jPanelAbaco);
        jPanelAbaco.setLayout(jPanelAbacoLayout);
        jPanelAbacoLayout.setHorizontalGroup(
            jPanelAbacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        jPanelAbacoLayout.setVerticalGroup(
            jPanelAbacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPanelAbaco, "abaco");

        add(jPanelGraficos, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaco;
    private javax.swing.JButton btnEnvoltoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPEnvoltoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAbaco;
    private javax.swing.JPanel jPanelGraficos;
    private javax.swing.JPanel jPanelInicial;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtTaxa;
    private javax.swing.JTextField txtV;
    // End of variables declaration//GEN-END:variables
}
