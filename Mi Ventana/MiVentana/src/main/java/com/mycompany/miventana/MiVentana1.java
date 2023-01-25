/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miventana;

import java.awt.Color;

/**
 *
 * @author Christian
 */
public class MiVentana1 extends javax.swing.JFrame {
    
    //Constructor
    public MiVentana1 () {
        //Mostrar ventana
        setVisible(true);
        
        //Cerrar la aplicacion
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Crear las dimensiones de la ventana
        setBounds(0, 0, 600, 500);
        
        //No redimensionable
        setResizable(false);
        
        //Establecer un titulo
        setTitle("Mi ventana");
        
        //Centrar la ventana
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new MiVentana1 ();
    }
}
