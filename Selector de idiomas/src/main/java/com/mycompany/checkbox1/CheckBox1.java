/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.checkbox1;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;

/**
 *
 * @author asanc
 */
public class CheckBox1 extends javax.swing.JFrame {

    /**
     * Creates new form CheckBox1
     */
    public CheckBox1() {
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

        jCheckBoxAleman = new javax.swing.JCheckBox();
        jCheckBoxIngles = new javax.swing.JCheckBox();
        jCheckBoxItaliano = new javax.swing.JCheckBox();
        jCheckBoxFrances = new javax.swing.JCheckBox();
        jLabelResultado = new javax.swing.JLabel();
        jButtonFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDIOMAS");

        jCheckBoxAleman.setText("Alemán");
        jCheckBoxAleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAlemanActionPerformed(evt);
            }
        });

        jCheckBoxIngles.setText("Inglés");
        jCheckBoxIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInglesActionPerformed(evt);
            }
        });

        jCheckBoxItaliano.setText("Italiano");
        jCheckBoxItaliano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxItalianoActionPerformed(evt);
            }
        });

        jCheckBoxFrances.setText("Francés");
        jCheckBoxFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFrancesActionPerformed(evt);
            }
        });

        jButtonFin.setText("Finalizar");
        jButtonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBoxFrances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxItaliano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxIngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxAleman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBoxAleman)
                        .addGap(19, 19, 19)
                        .addComponent(jCheckBoxIngles)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxItaliano)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jCheckBoxFrances)
                .addGap(41, 41, 41)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinActionPerformed
       JOptionPane.showMessageDialog(null, "Cerrando aplicación");
       System.exit(0);
    }//GEN-LAST:event_jButtonFinActionPerformed

    private void jCheckBoxAlemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAlemanActionPerformed
        String texto = "Idiomas:  ";

        if (jCheckBoxAleman.isSelected()) {
            texto += "Alemán, ";
        }
        if (jCheckBoxIngles.isSelected()) {
            texto += "Ingles, ";
        }
        if (jCheckBoxItaliano.isSelected()) {
            texto += "Italiano, ";
        }
        if (jCheckBoxFrances.isSelected()) {
            texto += "Francés, ";
        }
        //Quito la última ',' y escribo el texto
        texto = texto.substring(0, texto.length() - 2);
        jLabelResultado.setText(texto);
    }//GEN-LAST:event_jCheckBoxAlemanActionPerformed

    private void jCheckBoxInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInglesActionPerformed
        String texto = "Idiomas:  ";

        if (jCheckBoxAleman.isSelected()) {
            texto += "Alemán, ";
        }
        if (jCheckBoxIngles.isSelected()) {
            texto += "Ingles, ";
        }
        if (jCheckBoxItaliano.isSelected()) {
            texto += "Italiano, ";
        }
        if (jCheckBoxFrances.isSelected()) {
            texto += "Francés, ";
        }
        //Quito la última ',' y escribo el texto
        texto = texto.substring(0, texto.length() - 2);
        jLabelResultado.setText(texto);
    }//GEN-LAST:event_jCheckBoxInglesActionPerformed

    private void jCheckBoxItalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxItalianoActionPerformed
        String texto = "Idiomas:  ";

        if (jCheckBoxAleman.isSelected()) {
            texto += "Alemán, ";
        }
        if (jCheckBoxIngles.isSelected()) {
            texto += "Ingles, ";
        }
        if (jCheckBoxItaliano.isSelected()) {
            texto += "Italiano, ";
        }
        if (jCheckBoxFrances.isSelected()) {
            texto += "Francés, ";
        }
        //Quito la última ',' y escribo el texto
        texto = texto.substring(0, texto.length() - 2);
        jLabelResultado.setText(texto);
    }//GEN-LAST:event_jCheckBoxItalianoActionPerformed

    private void jCheckBoxFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFrancesActionPerformed
       String texto = "Idiomas:  ";

        if (jCheckBoxAleman.isSelected()) {
            texto += "Alemán, ";
        }
        if (jCheckBoxIngles.isSelected()) {
            texto += "Ingles, ";
        }
        if (jCheckBoxItaliano.isSelected()) {
            texto += "Italiano, ";
        }
        if (jCheckBoxFrances.isSelected()) {
            texto += "Francés, ";
        }
        //Quito la última ',' y escribo el texto
        texto = texto.substring(0, texto.length() - 2);
        jLabelResultado.setText(texto);
    }//GEN-LAST:event_jCheckBoxFrancesActionPerformed
    
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
            java.util.logging.Logger.getLogger(CheckBox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBox1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFin;
    private javax.swing.JCheckBox jCheckBoxAleman;
    private javax.swing.JCheckBox jCheckBoxFrances;
    private javax.swing.JCheckBox jCheckBoxIngles;
    private javax.swing.JCheckBox jCheckBoxItaliano;
    private javax.swing.JLabel jLabelResultado;
    // End of variables declaration//GEN-END:variables
}