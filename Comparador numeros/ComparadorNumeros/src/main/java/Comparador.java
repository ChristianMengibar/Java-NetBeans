/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuliánJiménezGuerrer
 */
public class Comparador extends javax.swing.JFrame {

    /**
     * Creates new form Comparador
     */
    public Comparador() {
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

        firstNumber_et = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secondNumber_et = new javax.swing.JTextField();
        compareButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        compareResult_tv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNumber_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNumber_etActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduzca el primer numero");

        jLabel2.setText("Introduzca el segundo numero");

        secondNumber_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondNumber_etActionPerformed(evt);
            }
        });

        compareButton.setText("Comparar");
        compareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado de la comparación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNumber_et)
                            .addComponent(secondNumber_et, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compareButton)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(compareResult_tv, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumber_et, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(secondNumber_et, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(compareButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(compareResult_tv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNumber_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNumber_etActionPerformed
        // TODO add your handling code here:
       String correccionPrimerNumero = firstNumber_et.getText();
       correccionPrimerNumero.replace(",",".");
       
    }//GEN-LAST:event_firstNumber_etActionPerformed

       
    
    private void compareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareButtonActionPerformed
        // TODO add your handling code here:
        
        
        try {
            if(Double.parseDouble(firstNumber_et.getText()) > Double.parseDouble(secondNumber_et.getText())){
            compareResult_tv.setText("El primer numero es " + firstNumber_et.getText() + ". Y el segundo numero es " + secondNumber_et.getText() + ". Por lo tanto, el primer numero("+ firstNumber_et.getText() +") es mayor que el segundo (" + secondNumber_et.getText() + ")");
            
        } else if(Double.parseDouble(firstNumber_et.getText()) == Double.parseDouble(secondNumber_et.getText())){
            compareResult_tv.setText("Los numeros son iguales");
        }else {
            compareResult_tv.setText("El primer numero es " + firstNumber_et.getText() + ". Y el segundo numero es " + secondNumber_et.getText() + ". Por lo tanto, el segundo numero(" + secondNumber_et.getText() + ")es mayor que el primero ("+ firstNumber_et.getText() +")");
        }
        } catch (Exception e) {
            compareResult_tv.setText("Uno de los caracteres no es un numero..");
        }
        
        
        
        
    }//GEN-LAST:event_compareButtonActionPerformed

    private void secondNumber_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondNumber_etActionPerformed
        // TODO add your handling code here:
        String correccionSegundoNumero = firstNumber_et.getText();
        correccionSegundoNumero.replace(",",".");
    }//GEN-LAST:event_secondNumber_etActionPerformed

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
            java.util.logging.Logger.getLogger(Comparador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comparador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comparador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comparador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comparador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compareButton;
    private javax.swing.JLabel compareResult_tv;
    private javax.swing.JTextField firstNumber_et;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField secondNumber_et;
    // End of variables declaration//GEN-END:variables
}
