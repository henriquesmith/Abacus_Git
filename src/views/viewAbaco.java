/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import java.util.Hashtable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
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
        return new Dimension(970, 610);
    }

    public JSlider getSlider() {
        return this.Jslider;
    }

    public JPanel getPanelS() {
        return this.pnlS;
    }

    public JButton getBtn_FCO() {
        return this.btn_FCO;
    }

    public JButton gettBtn_Env() {
        return this.btn_enV;
    }

    public JTextField getTxtUxS() {
        return this.txtUxS;
    }

    public JTextField getTxtUyS() {
        return this.txtUyS;
    }

    public JTextField getTxtVarV() {
        return this.txtvarV;
    }

    public JTextField getTxtW1() {
        return this.txtW1;
    }

    public JTextField getTxtW2() {
        return this.txtW2;
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

    public JButton getBtnDim() {
        return this.btnDim;
    }

    public JTextField getTxtInclinacao() {
        return this.txtInclinacao;
    }

    public JTextField getTxtProfundidade() {
        return this.txtProfundidade;
    }

    public JPanel getJPanelN_X() {
        return this.JPEnvN_X;
    }

    public JButton getBtnFCN_X() {
        return this.btnFCN_X;
    }

    public JTextField getTxtFcn_w1() {
        return this.txtFcn_w1;
    }

    public JTextField getTxtFcn_w2() {
        return this.txtFcn_w2;
    }

    public JButton getBtnFcn_Go() {
        return this.btn_FCN_GO;
    }

    public JPanel getJPanelINI() {
        return this.jPanelInicial;
    }

    public JRadioButton getButton0() {
        return this.radio0;
    }

    public JRadioButton getButton90() {
        return this.radio90;
    }

    public ButtonGroup getGrup() {
        return this.btnGrup;
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

        btnGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTaxa = new javax.swing.JTextField();
        btnEnvoltoria = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUxS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUyS = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtvarV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtW1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtW2 = new javax.swing.JTextField();
        btnAbaco = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtFcn_w1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFcn_w2 = new javax.swing.JTextField();
        radio0 = new javax.swing.JRadioButton();
        radio90 = new javax.swing.JRadioButton();
        btn_FCN_GO = new javax.swing.JButton();
        Jslider = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDim = new javax.swing.JButton();
        txtProfundidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtInclinacao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_enV = new javax.swing.JButton();
        btnFCN_X = new javax.swing.JButton();
        btn_FCO = new javax.swing.JButton();
        pnlS = new javax.swing.JPanel();
        jPanelGraficos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanelInicial = new javax.swing.JPanel();
        jPanelAbaco = new javax.swing.JPanel();
        jPEnvoltoria = new javax.swing.JPanel();
        JPEnvN_X = new javax.swing.JPanel();

        setBackground(new java.awt.Color(65, 63, 65));
        setMaximumSize(new java.awt.Dimension(930, 610));
        setMinimumSize(new java.awt.Dimension(970, 610));
        setPreferredSize(new java.awt.Dimension(970, 610));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(65, 63, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(190, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 600));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(65, 63, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Envoltória", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(195, 195));
        jPanel3.setPreferredSize(new java.awt.Dimension(195, 195));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Normal reduzida (v):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 11, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        txtV.setEditable(false);
        txtV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV.setMinimumSize(new java.awt.Dimension(50, 24));
        txtV.setPreferredSize(new java.awt.Dimension(50, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 6, 0, 24);
        jPanel3.add(txtV, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tax. Armadura (ω):");
        jLabel2.setMaximumSize(new java.awt.Dimension(113, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(113, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(113, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 11, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        txtTaxa.setEditable(false);
        txtTaxa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTaxa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaxa.setMinimumSize(new java.awt.Dimension(50, 24));
        txtTaxa.setPreferredSize(new java.awt.Dimension(50, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 24);
        jPanel3.add(txtTaxa, gridBagConstraints);

        btnEnvoltoria.setBackground(new java.awt.Color(69, 73, 74));
        btnEnvoltoria.setForeground(new java.awt.Color(255, 255, 255));
        btnEnvoltoria.setText("Gerar");
        btnEnvoltoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoltoriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 19, 24);
        jPanel3.add(btnEnvoltoria, gridBagConstraints);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mxd:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 11, 0, 0);
        jPanel3.add(jLabel9, gridBagConstraints);

        txtUxS.setEditable(false);
        txtUxS.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUxS.setMinimumSize(new java.awt.Dimension(46, 24));
        txtUxS.setPreferredSize(new java.awt.Dimension(46, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        jPanel3.add(txtUxS, gridBagConstraints);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Myd:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 11, 0, 0);
        jPanel3.add(jLabel10, gridBagConstraints);

        txtUyS.setEditable(false);
        txtUyS.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUyS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUyS.setMinimumSize(new java.awt.Dimension(46, 24));
        txtUyS.setPreferredSize(new java.awt.Dimension(46, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 19, 0);
        jPanel3.add(txtUyS, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(65, 63, 65));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Abaco FCO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setMinimumSize(new java.awt.Dimension(195, 230));
        jPanel4.setPreferredSize(new java.awt.Dimension(195, 230));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        jPanel4Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        jPanel4.setLayout(jPanel4Layout);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Normal reduzida v:");
        jLabel4.setMaximumSize(new java.awt.Dimension(113, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(113, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(113, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 9, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);

        txtvarV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtvarV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvarV.setMinimumSize(new java.awt.Dimension(50, 24));
        txtvarV.setPreferredSize(new java.awt.Dimension(50, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 124, 0, 0);
        jPanel4.add(txtvarV, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Variação da tax. de armadura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 9, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("De");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 9, 0, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        txtW1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtW1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtW1.setMinimumSize(new java.awt.Dimension(30, 24));
        txtW1.setPreferredSize(new java.awt.Dimension(30, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 26, 0, 0);
        jPanel4.add(txtW1, gridBagConstraints);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("à");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 63, 3, 30);
        jPanel4.add(jLabel6, gridBagConstraints);

        txtW2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtW2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtW2.setMinimumSize(new java.awt.Dimension(30, 24));
        txtW2.setPreferredSize(new java.awt.Dimension(30, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 75, 0, 0);
        jPanel4.add(txtW2, gridBagConstraints);

        btnAbaco.setBackground(new java.awt.Color(69, 73, 74));
        btnAbaco.setForeground(new java.awt.Color(255, 255, 255));
        btnAbaco.setText("GO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 129, 0, 10);
        jPanel4.add(btnAbaco, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(65, 63, 65));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abaco FCN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("w:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 7, 0, 0);
        jPanel6.add(jLabel13, gridBagConstraints);

        txtFcn_w1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFcn_w1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFcn_w1.setMinimumSize(new java.awt.Dimension(14, 23));
        txtFcn_w1.setPreferredSize(new java.awt.Dimension(14, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel6.add(txtFcn_w1, gridBagConstraints);

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("a");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 3, 0, 3);
        jPanel6.add(jLabel14, gridBagConstraints);

        txtFcn_w2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFcn_w2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFcn_w2.setMinimumSize(new java.awt.Dimension(14, 23));
        txtFcn_w2.setPreferredSize(new java.awt.Dimension(14, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 14, 0);
        jPanel6.add(txtFcn_w2, gridBagConstraints);

        radio0.setBackground(new java.awt.Color(65, 63, 65));
        radio0.setForeground(new java.awt.Color(0, 0, 0));
        radio0.setText(" 0°");
        radio0.setPreferredSize(new java.awt.Dimension(50, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(radio0, gridBagConstraints);

        radio90.setBackground(new java.awt.Color(65, 63, 65));
        radio90.setForeground(new java.awt.Color(0, 0, 0));
        radio90.setText("-90°");
        radio90.setPreferredSize(new java.awt.Dimension(50, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(radio90, gridBagConstraints);

        btn_FCN_GO.setBackground(new java.awt.Color(69, 73, 74));
        btn_FCN_GO.setForeground(new java.awt.Color(255, 255, 255));
        btn_FCN_GO.setText("GO");
        btn_FCN_GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FCN_GOActionPerformed(evt);
            }
        });
        jPanel6.add(btn_FCN_GO, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 3, 2, 0);
        jPanel4.add(jPanel6, gridBagConstraints);

        Jslider.setBackground(new java.awt.Color(65, 63, 65));
        Jslider.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        Jslider.setForeground(new java.awt.Color(0, 0, 0));
        Jslider.setMajorTickSpacing(20);
        Jslider.setMinimum(10);
        Jslider.setMinorTickSpacing(10);
        Jslider.setPaintLabels(true);
        Jslider.setPaintTicks(true);
        Jslider.setSnapToTicks(true);
        Jslider.setToolTipText("Define o quanto varia a taxa de armadura ao longo dos intervalos");
        Jslider.setMinimumSize(new java.awt.Dimension(160, 38));
        Jslider.setPreferredSize(new java.awt.Dimension(160, 38));
        Jslider.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(Jslider, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 11;
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(65, 63, 65));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Linha Neutra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setMinimumSize(new java.awt.Dimension(195, 160));
        jPanel5.setPreferredSize(new java.awt.Dimension(195, 160));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("xLN (cm): ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 22));

        btnDim.setBackground(new java.awt.Color(69, 73, 74));
        btnDim.setForeground(new java.awt.Color(255, 255, 255));
        btnDim.setText("Calcular");
        jPanel5.add(btnDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        txtProfundidade.setEditable(false);
        txtProfundidade.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtProfundidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtProfundidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 58, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Alfa L.N (°): ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 113, -1, -1));

        txtInclinacao.setEditable(false);
        txtInclinacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtInclinacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtInclinacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 107, 58, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 7;
        jPanel1.add(jPanel5, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(65, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMinimumSize(new java.awt.Dimension(95, 14));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 600));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 35));

        btn_enV.setBackground(new java.awt.Color(69, 73, 74));
        btn_enV.setForeground(new java.awt.Color(255, 255, 255));
        btn_enV.setText("ENV");
        btn_enV.setMinimumSize(new java.awt.Dimension(77, 60));
        btn_enV.setPreferredSize(new java.awt.Dimension(77, 60));
        jPanel2.add(btn_enV);

        btnFCN_X.setBackground(new java.awt.Color(69, 73, 74));
        btnFCN_X.setForeground(new java.awt.Color(255, 255, 255));
        btnFCN_X.setText("FCN");
        btnFCN_X.setMinimumSize(new java.awt.Dimension(77, 60));
        btnFCN_X.setPreferredSize(new java.awt.Dimension(77, 60));
        jPanel2.add(btnFCN_X);

        btn_FCO.setBackground(new java.awt.Color(69, 73, 74));
        btn_FCO.setForeground(new java.awt.Color(255, 255, 255));
        btn_FCO.setText("FCO");
        btn_FCO.setMinimumSize(new java.awt.Dimension(77, 60));
        btn_FCO.setPreferredSize(new java.awt.Dimension(77, 60));
        jPanel2.add(btn_FCO);

        pnlS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlS.setMinimumSize(new java.awt.Dimension(130, 130));

        javax.swing.GroupLayout pnlSLayout = new javax.swing.GroupLayout(pnlS);
        pnlS.setLayout(pnlSLayout);
        pnlSLayout.setHorizontalGroup(
            pnlSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        pnlSLayout.setVerticalGroup(
            pnlSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel2.add(pnlS);

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanelGraficos.setBackground(new java.awt.Color(65, 63, 65));
        jPanelGraficos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelGraficos.setMaximumSize(new java.awt.Dimension(605, 605));
        jPanelGraficos.setMinimumSize(new java.awt.Dimension(605, 605));
        jPanelGraficos.setOpaque(false);
        jPanelGraficos.setPreferredSize(new java.awt.Dimension(605, 605));
        jPanelGraficos.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(65, 63, 65));
        jPanel7.setMaximumSize(new java.awt.Dimension(605, 605));
        jPanel7.setMinimumSize(new java.awt.Dimension(605, 605));
        jPanel7.setPreferredSize(new java.awt.Dimension(605, 605));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPanel7, "card6");

        jPanelInicial.setBackground(new java.awt.Color(65, 63, 65));
        jPanelInicial.setMaximumSize(new java.awt.Dimension(605, 605));
        jPanelInicial.setMinimumSize(new java.awt.Dimension(605, 605));
        jPanelInicial.setOpaque(false);
        jPanelInicial.setPreferredSize(new java.awt.Dimension(605, 605));

        javax.swing.GroupLayout jPanelInicialLayout = new javax.swing.GroupLayout(jPanelInicial);
        jPanelInicial.setLayout(jPanelInicialLayout);
        jPanelInicialLayout.setHorizontalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jPanelInicialLayout.setVerticalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPanelInicial, "ini");

        jPanelAbaco.setBackground(new java.awt.Color(65, 63, 65));
        jPanelAbaco.setMaximumSize(new java.awt.Dimension(605, 605));
        jPanelAbaco.setMinimumSize(new java.awt.Dimension(605, 605));
        jPanelAbaco.setPreferredSize(new java.awt.Dimension(605, 605));

        javax.swing.GroupLayout jPanelAbacoLayout = new javax.swing.GroupLayout(jPanelAbaco);
        jPanelAbaco.setLayout(jPanelAbacoLayout);
        jPanelAbacoLayout.setHorizontalGroup(
            jPanelAbacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jPanelAbacoLayout.setVerticalGroup(
            jPanelAbacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPanelAbaco, "abaco");

        jPEnvoltoria.setBackground(new java.awt.Color(65, 63, 65));
        jPEnvoltoria.setMaximumSize(new java.awt.Dimension(605, 605));
        jPEnvoltoria.setMinimumSize(new java.awt.Dimension(605, 605));
        jPEnvoltoria.setPreferredSize(new java.awt.Dimension(605, 605));

        javax.swing.GroupLayout jPEnvoltoriaLayout = new javax.swing.GroupLayout(jPEnvoltoria);
        jPEnvoltoria.setLayout(jPEnvoltoriaLayout);
        jPEnvoltoriaLayout.setHorizontalGroup(
            jPEnvoltoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jPEnvoltoriaLayout.setVerticalGroup(
            jPEnvoltoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jPanelGraficos.add(jPEnvoltoria, "envoltoria");

        JPEnvN_X.setBackground(new java.awt.Color(65, 63, 65));
        JPEnvN_X.setMaximumSize(new java.awt.Dimension(605, 605));
        JPEnvN_X.setMinimumSize(new java.awt.Dimension(605, 605));
        JPEnvN_X.setPreferredSize(new java.awt.Dimension(605, 605));

        javax.swing.GroupLayout JPEnvN_XLayout = new javax.swing.GroupLayout(JPEnvN_X);
        JPEnvN_X.setLayout(JPEnvN_XLayout);
        JPEnvN_XLayout.setHorizontalGroup(
            JPEnvN_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        JPEnvN_XLayout.setVerticalGroup(
            JPEnvN_XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jPanelGraficos.add(JPEnvN_X, "nx");

        add(jPanelGraficos, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnvoltoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoltoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnvoltoriaActionPerformed

    private void btn_FCN_GOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FCN_GOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_FCN_GOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPEnvN_X;
    private javax.swing.JSlider Jslider;
    private javax.swing.JButton btnAbaco;
    private javax.swing.JButton btnDim;
    private javax.swing.JButton btnEnvoltoria;
    private javax.swing.JButton btnFCN_X;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.JButton btn_FCN_GO;
    private javax.swing.JButton btn_FCO;
    private javax.swing.JButton btn_enV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPEnvoltoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAbaco;
    private javax.swing.JPanel jPanelGraficos;
    private javax.swing.JPanel jPanelInicial;
    private javax.swing.JPanel pnlS;
    private javax.swing.JRadioButton radio0;
    private javax.swing.JRadioButton radio90;
    private javax.swing.JTextField txtFcn_w1;
    private javax.swing.JTextField txtFcn_w2;
    private javax.swing.JTextField txtInclinacao;
    private javax.swing.JTextField txtProfundidade;
    private javax.swing.JTextField txtTaxa;
    private javax.swing.JTextField txtUxS;
    private javax.swing.JTextField txtUyS;
    private javax.swing.JTextField txtV;
    private javax.swing.JTextField txtW1;
    private javax.swing.JTextField txtW2;
    private javax.swing.JTextField txtvarV;
    // End of variables declaration//GEN-END:variables
}
