/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author Administrador
 */
public class progressDialog extends JDialog {

    private JButton btn_Cancel;
    private JProgressBar progressBar;

    public progressDialog(Window parent) {
        super(parent, "Progresso", ModalityType.APPLICATION_MODAL);
        btn_Cancel = new JButton("Cancelar");
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.green);
        setLayout(new FlowLayout());
        Dimension size = btn_Cancel.getPreferredSize();
        size.width = 400;
        progressBar.setPreferredSize(size);
        add(progressBar);
        add(btn_Cancel);
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        pack();
        setLocationRelativeTo(parent);
    }

    public void setMax(int maxValue) {
        progressBar.setMaximum(maxValue);
    }

    public void setValue(int value) {
        progressBar.setValue(value);
    }
}
