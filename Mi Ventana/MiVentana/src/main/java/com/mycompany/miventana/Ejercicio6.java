/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;

/**
 *
 * @author Christian
 */
public class Ejercicio6 extends javax.swing.JFrame{
    JButton button;
    JTextField texto;
    JLabel etiqueta;
    Font fuente;
    Border border;
    
    public Ejercicio6 () {
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setBounds(0, 0, 600, 600);
        
        setTitle("Mi ventana");
        
        setLayout(null);
        
        button = new JButton("Finalizar");
        
        add(button);
        
        button.setBounds(480, 0, 100, 30);
        
        texto = new JTextField("Hola mundo");
        
        add(texto);
        
        texto.setBounds(10, 50, 500, 30);
        
        Font fuente = new Font("Tahoma", Font.BOLD | Font.ITALIC, 18);
        texto.setFont(fuente);
        
        etiqueta = new JLabel("MI PRIMERA ETIQUETA");
        
        add(etiqueta);
        
        etiqueta.setBounds(10, 5, 450, 30);
        
        etiqueta.setForeground(Color.blue);
        
        border = BorderFactory.createLineBorder(Color.yellow, 5);
        
        etiqueta.setBorder(border);
        
        etiqueta.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        etiqueta.setVerticalAlignment((int) CENTER_ALIGNMENT);
    }
    
    public static void main(String[] args) {
        new Ejercicio6();
    }
}
