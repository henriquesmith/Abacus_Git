/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();

    }

    public JButton getBntNew() {
        return btnNew;
    }

    public JButton getbtn_Contato() {
        return this.btn_Contato;
    }

    public JPanel getPanel() {
        return this.PanelCard;
    }

    public JButton getBtn_About() {
        return this.btn_About;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btn_Contato = new javax.swing.JButton();
        btn_About = new javax.swing.JButton();
        PanelCard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(60, 63, 65));
        setIconImage(Toolkit.getDefaultToolkit().getImage((this.getClass().getClassLoader().getResource("icons/Icone.png"))));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jLabel1.setBackground(new java.awt.Color(65, 63, 65));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem vindo ao Ábacus - Desenvolvido por: Henrique Smith");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 30));
        getContentPane().add(jLabel1, java.awt.BorderLayout.SOUTH);

        jPanel1.setBackground(new java.awt.Color(65, 63, 65));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(60, 63, 65), new java.awt.Color(60, 63, 65)));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        btnNew.setBackground(new java.awt.Color(65, 63, 65));
        btnNew.setForeground(new java.awt.Color(0, 0, 0));
        btnNew.setText("Novo ábaco");
        btnNew.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNew.setPreferredSize(new java.awt.Dimension(30, 130));
        jPanel1.add(btnNew);

        btn_Contato.setBackground(new java.awt.Color(65, 63, 65));
        btn_Contato.setForeground(new java.awt.Color(0, 0, 0));
        btn_Contato.setText("Contato");
        btn_Contato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_Contato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Contato.setPreferredSize(new java.awt.Dimension(30, 130));
        jPanel1.add(btn_Contato);

        btn_About.setBackground(new java.awt.Color(65, 63, 65));
        btn_About.setForeground(new java.awt.Color(0, 0, 0));
        btn_About.setText("Sobre");
        btn_About.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_About.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_About.setPreferredSize(new java.awt.Dimension(30, 130));
        jPanel1.add(btn_About);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        PanelCard.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(65, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 230));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("RomanD", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ABACUS");
        jPanel2.add(jLabel2, new java.awt.GridBagConstraints());

        PanelCard.add(jPanel2, "ini");

        jPanel3.setBackground(new java.awt.Color(65, 63, 65));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Henrique Eduardo Smith Alves");
        jPanel3.add(jLabel6, new java.awt.GridBagConstraints());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email_24px.png"))); // NOI18N
        jLabel7.setText(" henrique.eduardo@unemat.br");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/whats_24px.png"))); // NOI18N
        jLabel8.setText("(66) 9 9669-2917");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel8, gridBagConstraints);

        PanelCard.add(jPanel3, "contato");

        jPanel5.setBackground(new java.awt.Color(65, 63, 65));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setMinimumSize(new java.awt.Dimension(310, 200));
        jScrollPane2.setName(""); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(310, 200));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(1);
        jTextArea2.setRows(5);
        jTextArea2.setText("  Software: \n  Versao: 1.0.\n  Software restritamente de cunho educacional, sendo a\nvenda e cormercialização do mesmo restritamente proibi-\n-da. \nUso:\n  Não nos responsabilizamos pelo mal uso do software\ntendo em vista que: Os dados gerados por ele depen-\n-dem diretamente dos parametros passados pelo usu-\n-ário. Portanto, recomenda-se que verifique perante a\nNBR 6118:2014 a coerência dos parametros informados\ncomo, por exemplo, taxa de armadura mínima e índice \nde esbeltez.\n\n\n\n\n");
        jTextArea2.setMinimumSize(new java.awt.Dimension(320, 250));
        jTextArea2.setName(""); // NOI18N
        jTextArea2.setPreferredSize(new java.awt.Dimension(320, 250));
        jScrollPane2.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane2, new java.awt.GridBagConstraints());

        PanelCard.add(jPanel5, "infos");

        getContentPane().add(PanelCard, java.awt.BorderLayout.CENTER);
        PanelCard.getAccessibleContext().setAccessibleName("ini");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCard;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btn_About;
    private javax.swing.JButton btn_Contato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
