/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import javax.swing.*;

/**
 *
 * @author Notebook
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Main 
        /*
        JFrame f = new JFrame("Titulo de ventana");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        */
        
        // Desde una clase
         MiVentana v = new MiVentana();
         v.setVisible(true);
          

    }
    
}
