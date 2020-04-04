/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.progressDialogListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
    private progressDialogListener pdListener;

    public progressDialog(Window parent) {
        super(parent, "Processamento dos dados", ModalityType.APPLICATION_MODAL);
        btn_Cancel = new JButton("Cancelar");
        btn_Cancel.addActionListener((ActionEvent e) -> {
            if (pdListener != null) {
                pdListener.ProgressBarcanceled();
                
            }
        });
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.green);
        progressBar.setValue(10);
        progressBar.setString("Processando...");
        setLayout(new FlowLayout());
        Dimension size = btn_Cancel.getPreferredSize();
        size.width = 400;
        progressBar.setPreferredSize(size);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                if (pdListener != null) {
                    pdListener.ProgressBarcanceled();

                }
            }

        });
        add(progressBar);
        add(btn_Cancel);
        btn_Cancel.addActionListener((ActionEvent e) -> {
            if (pdListener != null) {
                pdListener.ProgressBarcanceled();
            }
        });
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        btn_Cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pack();
        setLocationRelativeTo(parent);
    }

    public void setMax(int maxValue) {
        getProgressBar().setMaximum(maxValue);
    }

    public void setValue(int value) {
        int progress = value;

        getProgressBar().setValue(value);
        progressBar.setString("Progresso: " + progress + " %");
    }

    public void setListener(progressDialogListener listener) {
        this.pdListener = listener;
    }

    /**
     * @return the progressBar
     */
    public JProgressBar getProgressBar() {
        return progressBar;
    }
}
