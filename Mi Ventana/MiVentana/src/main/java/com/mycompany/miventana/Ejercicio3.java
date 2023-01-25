/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miventana;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Christian
 */
public class Ejercicio3 extends javax.swing.JFrame{
    public Ejercicio3 () {
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setBounds(0, 0, 600, 600);
        
        setLocationRelativeTo(null);
        
        setTitle("Esta es mi ventana");
    }
    
    public static void main(String[] args) {
        new Ejercicio3();
    }
}
