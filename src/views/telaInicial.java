/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author Administrador
 */
public class telaInicial extends javax.swing.JPanel {

    /**
     * Creates new form telaInicial
     */
    public telaInicial() {
        initComponents();
    }

    public JButton getBtnSecao() {
        return btnSecao;
    }

    public JButton getBtnEsforcos() {
        return btnEsforcos;
    }

    public JButton getBtnProp() {
        return btnProp;
    }

    public JButton getBtnConfig() {
        return btnConfig;
    }

    public JButton getBtnAbaco() {
        return btnAbaco;
    }


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSecao = new javax.swing.JButton();
        btnEsforcos = new javax.swing.JButton();
        btnProp = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        btnAbaco = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(10.0F);
        setAlignmentY(10.0F);
        setMinimumSize(new java.awt.Dimension(485, 400));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(485, 400));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(10, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(10, 400));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnSecao.setBackground(new java.awt.Color(65, 63, 65));
        btnSecao.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnSecao.setForeground(new java.awt.Color(0, 0, 0));
        btnSecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/secaoP.png"))); // NOI18N
        btnSecao.setText("Lançar seção transversal  ");
        btnSecao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSecao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSecao.setMaximumSize(new java.awt.Dimension(300, 120));
        btnSecao.setMinimumSize(new java.awt.Dimension(300, 120));
        btnSecao.setPreferredSize(new java.awt.Dimension(300, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel2.add(btnSecao, gridBagConstraints);

        btnEsforcos.setBackground(new java.awt.Color(65, 63, 65));
        btnEsforcos.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnEsforcos.setForeground(new java.awt.Color(0, 0, 0));
        btnEsforcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esforcos.png"))); // NOI18N
        btnEsforcos.setText("Esforços solicitantes     ");
        btnEsforcos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEsforcos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsforcos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEsforcos.setMaximumSize(new java.awt.Dimension(300, 120));
        btnEsforcos.setMinimumSize(new java.awt.Dimension(300, 120));
        btnEsforcos.setPreferredSize(new java.awt.Dimension(300, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel2.add(btnEsforcos, gridBagConstraints);

        btnProp.setBackground(new java.awt.Color(65, 63, 65));
        btnProp.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnProp.setForeground(new java.awt.Color(0, 0, 0));
        btnProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/materiais.png"))); // NOI18N
        btnProp.setText("Propriedades dos materiais");
        btnProp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProp.setMaximumSize(new java.awt.Dimension(300, 120));
        btnProp.setMinimumSize(new java.awt.Dimension(300, 120));
        btnProp.setPreferredSize(new java.awt.Dimension(300, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel2.add(btnProp, gridBagConstraints);

        btnConfig.setBackground(new java.awt.Color(65, 63, 65));
        btnConfig.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(0, 0, 0));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/config40px.png"))); // NOI18N
        btnConfig.setText("Config. & Preferências   ");
        btnConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.setMaximumSize(new java.awt.Dimension(300, 120));
        btnConfig.setMinimumSize(new java.awt.Dimension(300, 120));
        btnConfig.setPreferredSize(new java.awt.Dimension(300, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel2.add(btnConfig, gridBagConstraints);

        btnAbaco.setBackground(new java.awt.Color(65, 63, 65));
        btnAbaco.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnAbaco.setForeground(new java.awt.Color(0, 0, 0));
        btnAbaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gerar.png"))); // NOI18N
        btnAbaco.setText("Gerar ábacos admensionais");
        btnAbaco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbaco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbaco.setMaximumSize(new java.awt.Dimension(300, 120));
        btnAbaco.setMinimumSize(new java.awt.Dimension(300, 120));
        btnAbaco.setPreferredSize(new java.awt.Dimension(300, 120));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel2.add(btnAbaco, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaco;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEsforcos;
    private javax.swing.JButton btnProp;
    private javax.swing.JButton btnSecao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
