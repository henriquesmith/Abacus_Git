/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controllers.mainFrameController;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrador
 */
public class abacus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
        
        mainFrameController mainFrameController = new mainFrameController();
        }
        
        });
        
    }
    
}
