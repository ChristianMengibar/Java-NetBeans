/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayoutpractise;

import javax.swing.JOptionPane;

/**
 *
 * @author SergioGilFernández
 */
public class JFrameLayout extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLayout
     */
    private String numeroVacuna;
    private String nombre;
    private String nombreVacuna;

    public JFrameLayout() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btPrimer = new javax.swing.JButton();
        btDos = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btCuatro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioPfizer = new javax.swing.JRadioButton();
        jRadioOtra = new javax.swing.JRadioButton();
        jRadioAstra = new javax.swing.JRadioButton();
        jLabelText = new javax.swing.JLabel();
        jFieldName = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PruebaLayouts");
        setPreferredSize(new java.awt.Dimension(400, 300));

        btPrimer.setText("UNO");
        btPrimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimerActionPerformed(evt);
            }
        });
        jPanel1.add(btPrimer);

        btDos.setText("DOS");
        btDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosActionPerformed(evt);
            }
        });
        jPanel1.add(btDos);

        btTres.setText("TRES");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });
        jPanel1.add(btTres);

        btCuatro.setText("NINGUNA");
        btCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btCuatro);

        buttonGroup1.add(jRadioPfizer);
        jRadioPfizer.setText("Pfizer");

        buttonGroup1.add(jRadioOtra);
        jRadioOtra.setText("Otra");

        buttonGroup1.add(jRadioAstra);
        jRadioAstra.setText("Astrazeneca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioPfizer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioAstra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioOtra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPfizer)
                    .addComponent(jRadioAstra)
                    .addComponent(jRadioOtra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelText.setText("Introduce el nombre:");

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btReset)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelText)
                            .addComponent(jFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEnviar)
                            .addComponent(btReset))
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPrimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimerActionPerformed
        // TODO add your handling code here:
        numeroVacuna = "Uno";
        jPanel2.setVisible(true);

    }//GEN-LAST:event_btPrimerActionPerformed

    private void btDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDosActionPerformed
        // TODO add your handling code here:
        numeroVacuna = "Dos";
        jPanel2.setVisible(true);

    }//GEN-LAST:event_btDosActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        // TODO add your handling code here:
        numeroVacuna = "Tres";
        jPanel2.setVisible(true);

    }//GEN-LAST:event_btTresActionPerformed

    private void btCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuatroActionPerformed
        // TODO add your handling code here:
        numeroVacuna = "Ninguna";
        jPanel2.setVisible(false);
    }//GEN-LAST:event_btCuatroActionPerformed

    private String nombreVacuna() {
        String result = "";
        if (jRadioOtra.isSelected()) {
            result = "Otra";
        } else if (jRadioPfizer.isSelected()) {
            result = "Pfizer";
        } else if (jRadioAstra.isSelected()) {
            result = "Astrazeneca";
        }
        return result;
    }

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        if (numeroVacuna == null) {
            JOptionPane.showMessageDialog(null, "Debe pulsar algun boton de vacuna.",
                    "PruebaLayout", JOptionPane.INFORMATION_MESSAGE);
        } else {
            nombreVacuna = nombreVacuna();
            if (nombreVacuna.isEmpty() && !numeroVacuna.equals("Ninguna")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar alguna vacuna.",
                        "PruebaLayout", JOptionPane.INFORMATION_MESSAGE);
            } else {
                nombre = jFieldName.getText();
                SegundaPantalla segundaPantalla = new SegundaPantalla(this, true, numeroVacuna, nombreVacuna, nombre);
                segundaPantalla.setVisible(true);
            }
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        jFieldName.setText("");
    }//GEN-LAST:event_btResetActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCuatro;
    private javax.swing.JButton btDos;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btPrimer;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btTres;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jFieldName;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioAstra;
    private javax.swing.JRadioButton jRadioOtra;
    private javax.swing.JRadioButton jRadioPfizer;
    // End of variables declaration//GEN-END:variables
}
