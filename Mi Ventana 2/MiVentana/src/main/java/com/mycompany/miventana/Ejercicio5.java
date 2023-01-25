/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miventana;

import javax.swing.JButton;

/**
 *
 * @author Christian
 */
public class Ejercicio5 extends javax.swing.JFrame{
    JButton button;
    
    public Ejercicio5 () {
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setBounds(0, 0, 400, 400);
        
        setResizable(false);
        
        button = new JButton("Empezar");
        
        add(button);
        
        button.setBounds(280, 0, 100, 30);
        
        setLayout(null);
    }
    
    
    
    public static void main(String[] args) {
        new Ejercicio5();
    }
}
