/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ChristianMengibarCas
 */
public class Tarea3 {
    
    public Tarea3(){
        JFrame jFramePantalla;
        JLabel jLabelEdad;
        JButton botonEdad;
        JButton botonFinalizar;
        
        jFramePantalla = new JFrame();
        jFramePantalla.setLayout(null);
        jFramePantalla.setResizable(false);
        jFramePantalla.setBounds(0, 0, 450, 350);
        
        jLabelEdad = new JLabel("Introducir edad");
        jLabelEdad.setBounds(30, 30, 150, 50);
        
        botonEdad = new JButton();
        botonFinalizar = new JButton();
        
        botonEdad.setText("Edad");
        botonEdad.setBounds(30, 250, 100, 30);
        
        botonFinalizar.setText("Cerrar");
        botonFinalizar.setBounds(300, 250, 100, 30);
        
        jFramePantalla.add(botonEdad);
        jFramePantalla.add(botonFinalizar);
        jFramePantalla.add(jLabelEdad);
        
        
        botonEdad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String edadIntroducida = JOptionPane.showInputDialog(null, "Introduce edad");
                if (edadIntroducida.equals("")) {
                    JOptionPane.showMessageDialog(null, "Introduce edad");
                } else {
                    JOptionPane.showMessageDialog(null, "La edad es " + edadIntroducida);
                }
            }
        });
        
        botonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cerrando aplicacion");
                System.exit(0);
            }
        });
        
        jFramePantalla.setVisible(true);
    }
    public static void main(String[] args) {
       new Tarea3();
    }
}
