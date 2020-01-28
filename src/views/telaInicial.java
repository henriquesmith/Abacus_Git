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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSecao = new javax.swing.JButton();
        btnEsforcos = new javax.swing.JButton();
        btnProp = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        btnAbaco = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(10.0F);
        setAlignmentY(10.0F);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(10, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(10, 400));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        btnSecao.setBackground(new java.awt.Color(255, 255, 255));
        btnSecao.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnSecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/secaoC.png"))); // NOI18N
        btnSecao.setText("Lançar seção transversal  ");
        btnSecao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSecao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSecao.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnSecao);

        btnEsforcos.setBackground(new java.awt.Color(255, 255, 255));
        btnEsforcos.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnEsforcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esforcos.png"))); // NOI18N
        btnEsforcos.setText("Lançar esforços solicitantes");
        btnEsforcos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEsforcos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsforcos.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnEsforcos);

        btnProp.setBackground(new java.awt.Color(255, 255, 255));
        btnProp.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/materiais.png"))); // NOI18N
        btnProp.setText("Propriedades dos materiais");
        btnProp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProp.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnProp);

        btnConfig.setBackground(new java.awt.Color(255, 255, 255));
        btnConfig.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/config40px.png"))); // NOI18N
        btnConfig.setText("Config. & Preferências   ");
        btnConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnConfig);

        btnAbaco.setBackground(new java.awt.Color(255, 255, 255));
        btnAbaco.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnAbaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gerar.png"))); // NOI18N
        btnAbaco.setText("Gerar ábaco            ");
        btnAbaco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbaco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbaco.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnAbaco);

        btnResults.setBackground(new java.awt.Color(255, 255, 255));
        btnResults.setFont(new java.awt.Font("RomanD", 1, 12)); // NOI18N
        btnResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/results.png"))); // NOI18N
        btnResults.setText("Visualizar resultados     ");
        btnResults.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResults.setPreferredSize(new java.awt.Dimension(190, 120));
        jPanel2.add(btnResults);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaco;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEsforcos;
    private javax.swing.JButton btnProp;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnSecao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
