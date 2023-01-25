/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.color;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author asanc
 */
public class JFrameColor extends javax.swing.JFrame {

    /**
     * Creates new form JFrameColor
     */
    public JFrameColor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupcolores = new javax.swing.ButtonGroup();
        jPanelEtiqueta = new javax.swing.JPanel();
        jLabelColor = new javax.swing.JLabel();
        jLabelCabecera = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonRojo = new javax.swing.JButton();
        jButtonAmarillo = new javax.swing.JButton();
        jButtonNegro = new javax.swing.JButton();
        jPanelRadioButtons = new javax.swing.JPanel();
        jRadioButtonVerde = new javax.swing.JRadioButton();
        jRadioButtonAzul = new javax.swing.JRadioButton();
        jRadioButtonBlanco = new javax.swing.JRadioButton();
        jComboBoxColor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colores");

        jPanelEtiqueta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabelColor.setOpaque(true);

        javax.swing.GroupLayout jPanelEtiquetaLayout = new javax.swing.GroupLayout(jPanelEtiqueta);
        jPanelEtiqueta.setLayout(jPanelEtiquetaLayout);
        jPanelEtiquetaLayout.setHorizontalGroup(
            jPanelEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEtiquetaLayout.setVerticalGroup(
            jPanelEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEtiquetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelColor, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelCabecera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCabecera.setForeground(new java.awt.Color(51, 51, 255));
        jLabelCabecera.setText("COLORES");

        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jButtonRojo.setText("ROJO");
        jButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRojoActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonRojo);

        jButtonAmarillo.setText("AMARILLO");
        jButtonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmarilloActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAmarillo);

        jButtonNegro.setText("NEGRO");
        jButtonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegroActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonNegro);

        jPanelRadioButtons.setLayout(new java.awt.GridLayout());

        jRadioButtonVerde.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonVerde.setText("Verde");
        jRadioButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVerdeActionPerformed(evt);
            }
        });
        jPanelRadioButtons.add(jRadioButtonVerde);
        buttonGroupcolores.add(jRadioButtonVerde);

        jRadioButtonAzul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonAzul.setText("Azul");
        jRadioButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAzulActionPerformed(evt);
            }
        });
        jPanelRadioButtons.add(jRadioButtonAzul);
        buttonGroupcolores.add(jRadioButtonAzul);

        jRadioButtonBlanco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonBlanco.setText("Blanco");
        jRadioButtonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBlancoActionPerformed(evt);
            }
        });
        jPanelRadioButtons.add(jRadioButtonBlanco);
        buttonGroupcolores.add(jRadioButtonBlanco);

        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERDE", "ROJO", "AZUL", "BLANCO", "NEGRO", "AMARILLO" }));
        jComboBoxColor.setSelectedIndex(0);
        jComboBoxColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRadioButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addComponent(jPanelEtiqueta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCabecera)
                .addGap(18, 18, 18)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanelRadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRojoActionPerformed
            jLabelColor.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRojoActionPerformed

    private void jButtonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmarilloActionPerformed
       jLabelColor.setBackground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAmarilloActionPerformed

    private void jButtonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegroActionPerformed
       jLabelColor.setBackground(Color.black); 
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonNegroActionPerformed

    private void jRadioButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVerdeActionPerformed
        jLabelColor.setBackground(Color.green);
        jLabelColor.setText("VERDE");
    }//GEN-LAST:event_jRadioButtonVerdeActionPerformed

    private void jRadioButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAzulActionPerformed
        jLabelColor.setBackground(Color.blue);
        jLabelColor.setText("AZUL");
    }//GEN-LAST:event_jRadioButtonAzulActionPerformed

    private void jRadioButtonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBlancoActionPerformed
        jLabelColor.setBackground(Color.white);
        jLabelColor.setText("BLANCO");
    }//GEN-LAST:event_jRadioButtonBlancoActionPerformed

    private void jComboBoxColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxColorActionPerformed
        String texto = "Color seleccionado:  ";
        if (evt.getSource() == jComboBoxColor) {
            String seleccionado=(String)jComboBoxColor.getSelectedItem();
            texto += seleccionado;
             jLabelColor.setText(texto);
             JOptionPane.showMessageDialog(jPanelBotones, texto);
        }
    }//GEN-LAST:event_jComboBoxColorActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupcolores;
    private javax.swing.JButton jButtonAmarillo;
    private javax.swing.JButton jButtonNegro;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JComboBox<String> jComboBoxColor;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelEtiqueta;
    private javax.swing.JPanel jPanelRadioButtons;
    private javax.swing.JRadioButton jRadioButtonAzul;
    private javax.swing.JRadioButton jRadioButtonBlanco;
    private javax.swing.JRadioButton jRadioButtonVerde;
    // End of variables declaration//GEN-END:variables
}
