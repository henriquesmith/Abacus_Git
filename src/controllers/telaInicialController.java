/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entites.Esforcos;
import entites.Materials;
import entites.secaoTransversal;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.telaInicial;

/**
 *
 * @author Administrador
 */
public class telaInicialController {

    private Materials materiais;
    private JFrame parent = null, frame;
    private telaInicial tela = null;
    private secaoTransversal secaoTransversal;
    private Esforcos esforcos;
    private Esforcos esforcosCalculo;

    public telaInicialController(JFrame parent) {
        this.parent = parent;
        tela = new telaInicial();
        init();

    }

    private void init() {
        tela.getBtnAbaco().addActionListener(e -> metodoIterativo());
        tela.getBtnConfig().addActionListener(e -> lancarCoeficientes());
        tela.getBtnProp().addActionListener(e -> lancarMateriais());
        tela.getBtnEsforcos().addActionListener(e -> lancarEsforcos());
        tela.getBtnSecao().addActionListener(e -> abrirSecao(e));
        frame = new JFrame(parent.getTitle());
        frame.add(tela);
        frame.pack();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(frame.getClass().getResource("/icons/Icone.png")));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(getFrame(), "Tem certeza que deseja sair?") == JOptionPane.OK_OPTION) {
                    frame.dispose();
                    parent.setVisible(true);
                }
            }
        });
        frame.setVisible(true);

    }

    private void abrirSecao(ActionEvent e) {
        secaoDrawController sdc = new secaoDrawController(frame);
        secaoTransversal = sdc.getSecEnviar();

        

    }

    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    private void lancarEsforcos() {
        if (this.secaoTransversal != null) {
            LancaEsforcosController lec = new LancaEsforcosController(frame);
            if (lec.getEsforcos() != null) {
                esforcos = lec.getEsforcos();
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Lance uma seção transversal! ", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void lancarMateriais() {
        MateriaisController mc = new MateriaisController(frame);
        if (mc.getMateriais() != null) {
            materiais = mc.getMateriais();
        }

    }

    private void lancarCoeficientes() {
        if (this.materiais != null && this.esforcos != null) {
            CoeficientesViewController CVC = new CoeficientesViewController(frame, materiais);
            this.materiais.setCoeficiente(CVC.getCoeficientes());
            this.materiais.getAco().setFyd((float) materiais.getCoef().getGamaS());
            this.materiais.getConcrete().setFcd((float) this.materiais.getCoef().getGamaC());
            this.materiais.getConcrete().setSigmaCD();

            this.materiais.getAco().setDefAco(CVC.getEuAco());
            this.esforcosCalculo = new Esforcos((float) (esforcos.getMxk() * materiais.getCoef().getGamaEsforcos()), (float) (esforcos.getMyk() * materiais.getCoef().getGamaEsforcos()), (float) (esforcos.getNk() * materiais.getCoef().getGamaEsforcos()));

        } else if (this.materiais == null && this.esforcos == null) {
            JOptionPane.showMessageDialog(frame, "Lance os esforços e os materiais da seção!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        } else if (this.materiais == null) {
            JOptionPane.showMessageDialog(frame, "Lance os materiais da seção!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else if (this.esforcos == null) {
            JOptionPane.showMessageDialog(frame, "Lance os esforços da seção!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void metodoIterativo() {
        if ( this.esforcosCalculo != null) {
            viewAbacoController avc = new viewAbacoController(parent, this.secaoTransversal, this.esforcosCalculo, this.materiais);
        } else {
            JOptionPane.showMessageDialog(frame, "Lance os coeficientes  e configure suas preferências","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * @return the esforcosCalculo
     */
    public Esforcos getEsforcosCalculo() {
        return esforcosCalculo;
    }
}
