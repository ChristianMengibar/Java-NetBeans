/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adivinarnumero2;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author MichaelObinnaEzehEro
 */
public class ScreenElegirNumero extends javax.swing.JFrame {

    public static Integer myRandomNumber;
    public static Integer smallNumber;
    public static Integer bigNumber;

    /**
     * Creates new form ScreenElegirNumero
     */
    public ScreenElegirNumero() {
        initComponents();
         this.setLocationRelativeTo(null);
         btConfrimarNumeros.setForeground(Color.PINK);
         btVolverMenu2.setForeground(Color.PINK);
         btConfrimarNumeros.setBackground(Color.darkGray);
         btVolverMenu2.setBackground(Color.darkGray);
         ScreenMenu menu = new ScreenMenu();
         String nombre = menu.nombre;
         labelSaludo.setText("Hola " + nombre);
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btConfrimarNumeros = new javax.swing.JButton();
        TextFieldNumber1 = new javax.swing.JTextField();
        TextFieldNumber2 = new javax.swing.JTextField();
        LabelIndormation = new javax.swing.JLabel();
        btVolverMenu2 = new javax.swing.JButton();
        labelSaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ELIGE EL NUMERO MAS PEQUEÑO");

        jLabel2.setText("ELIGE EL NUMERO MAS GRANDE");

        btConfrimarNumeros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btConfrimarNumeros.setText("CONFIRMAR");
        btConfrimarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfrimarNumerosActionPerformed(evt);
            }
        });

        btVolverMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btVolverMenu2.setText("VOLVER AL MENU");
        btVolverMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverMenu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(LabelIndormation, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVolverMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfrimarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldNumber1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldNumber2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(LabelIndormation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfrimarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVolverMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfrimarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfrimarNumerosActionPerformed
        String number1;
        String number2;
      
        Integer result;

        number1 = TextFieldNumber1.getText();
        number2 = TextFieldNumber2.getText();

        try {

            smallNumber = Integer.parseInt(number1);
            bigNumber = Integer.parseInt(number2);

            if (TextFieldNumber1.getText().isEmpty() || TextFieldNumber2.getText().isEmpty()) {
                LabelIndormation.setText("No puede haber campos vacios");

            } else {

                if (smallNumber < 1 || bigNumber < 1) {
                    LabelIndormation.setText("No puede haber valores negativos");

                } else {

                    if (smallNumber > bigNumber) {

                        LabelIndormation.setText("El primer valor introducido debe ser mayor que el segundo");

                    } else if (smallNumber == bigNumber) {

                        LabelIndormation.setText("El primer valor introducido debe ser mayor que el segundo");

                    } else {
                        Random random = new Random();
                        int low = smallNumber;

                        int high = bigNumber;

                        result = random.nextInt(high - low) + low;

                        myRandomNumber = result;

                        ScreenJuegoNumero juegoNumero = new ScreenJuegoNumero();
                        juegoNumero.setVisible(true);
                        this.setVisible(false);

                    }

                }

            }

        } catch (NumberFormatException e) {

            LabelIndormation.setText("El valor introducido no es valido");

        }
    }//GEN-LAST:event_btConfrimarNumerosActionPerformed

    private void btVolverMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverMenu2ActionPerformed

        ScreenMenu screenMenu = new ScreenMenu();
        
        screenMenu.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btVolverMenu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenElegirNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenElegirNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenElegirNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenElegirNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenElegirNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelIndormation;
    private javax.swing.JTextField TextFieldNumber1;
    private javax.swing.JTextField TextFieldNumber2;
    private javax.swing.JButton btConfrimarNumeros;
    private javax.swing.JButton btVolverMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelSaludo;
    // End of variables declaration//GEN-END:variables
}
