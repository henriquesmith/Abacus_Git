/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.mainFrame;

/**
 *
 * @author Administrador
 */
public class mainFrameController {
    private final mainFrame mf;
    
    public mainFrameController() {
        mf = new mainFrame();
        mf.setPreferredSize(new Dimension(400,300));
        init();
    }
    private void init(){
        mf.getBtn_About().addActionListener(e-> info());
        mf.getBntNew().addActionListener(e -> Start(e));
        mf.getbtn_Contato().addActionListener(e -> contato());
        mf.setTitle("ABACUS");
        
        //Alterado pois a aplicação não estava finalização ao fechar as janelas
        mf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(mf, "Tem certeza que deseja sair?") == JOptionPane.OK_OPTION) {
                    mf.dispose();
                    System.exit(0);
                }
            }
        });
        mf.pack();
        mf.setVisible(true);
    
    }
    private void contato(){
        CardLayout cl = (CardLayout) mf.getPanel().getLayout();
        cl.show(mf.getPanel(), "contato");
    }
    private void Start(ActionEvent e){
               CardLayout cl = (CardLayout) mf.getPanel().getLayout();
        cl.show(mf.getPanel(), "ini");
     telaInicialController tic = new telaInicialController(mf);
     
     mf.setVisible(false);
    
    }
    private void info(){
    CardLayout cl =   (CardLayout) mf.getPanel().getLayout();
    cl.show(mf.getPanel(), "infos");
    }
}
