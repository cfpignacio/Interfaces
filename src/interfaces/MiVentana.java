/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Notebook
 */
public class MiVentana extends JFrame {
   
    public MiVentana(){
       super("Titulo de ventana");
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container cp = getContentPane(); 
       cp.setLayout(new FlowLayout()); 
       JLabel etiqueta = new JLabel("Nombre: "); 
       JTextField texto = new JTextField(20);   
       JButton boton = new JButton("Saludar");   
       cp.add(etiqueta);   
       cp.add(texto);    
       cp.add(boton);

   }
    
    
    
   
}
