/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vithorramon.equacaocalc;

/**
 *
 * @author Vithor
 */
public class TelaCalc extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalc
     */
    public TelaCalc() {
        initComponents();
        panResult.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panResult = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        lblRaiz1 = new javax.swing.JLabel();
        lblRaiz2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtA = new javax.swing.JSpinner();
        txtB = new javax.swing.JSpinner();
        txtC = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("<html>&Delta; =</html>");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel10.setText("X' =");

        lblDelta.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblDelta.setText("0");

        lblRaiz1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblRaiz1.setText("0");

        lblRaiz2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblRaiz2.setText("0");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel11.setText("X\" =");

        javax.swing.GroupLayout panResultLayout = new javax.swing.GroupLayout(panResult);
        panResult.setLayout(panResultLayout);
        panResultLayout.setHorizontalGroup(
            panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panResultLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRaiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(panResultLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panResultLayout.setVerticalGroup(
            panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblRaiz1)
                    .addComponent(jLabel11)
                    .addComponent(lblRaiz2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("X²+");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("X+");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("= 0");

        btnCalc.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(255, 0, 0));
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("<html>&Delta;=</html>");

        lblB.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblB.setText("B² ");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel6.setText("4");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setText("-");

        lblA.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblA.setText("A");

        lblC.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblC.setText("C");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel9.setText(".");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setText(".");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel15.setText("Calcule sua Equação");

        txtA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtAStateChanged(evt);
            }
        });

        txtB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtBStateChanged(evt);
            }
        });

        txtC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblB)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel5)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel6)
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblA))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblC)
                            .addGap(193, 193, 193))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))))))
                    .addComponent(panResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(lblA)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblC)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addComponent(panResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        panResult.setVisible(true);

        int a = Integer.parseInt(txtA.getValue().toString());
        int b = Integer.parseInt(txtB.getValue().toString());
        int c = Integer.parseInt(txtC.getValue().toString());

        float delta = (b * b) - 4 * a * c;
        lblDelta.setText(String.format("%.1f", delta));

        if(delta<0){
            lblDelta.setText("Delta negativo");
            
        }  else{

            double x1 = (- b + Math.sqrt(delta))/(2*a);
            double x2 = (- b - Math.sqrt(delta))/(2*a);
            lblRaiz1.setText(String.format("%.1f", x1));
            lblRaiz2.setText(String.format("%.1f", x2));
        }

    }//GEN-LAST:event_btnCalcActionPerformed

    private void txtAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtAStateChanged
        // TODO add your handling code here:
        lblA.setText(txtA.getValue().toString());
                  
    }//GEN-LAST:event_txtAStateChanged

    private void txtBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtBStateChanged
        // TODO add your handling code here:
        lblB.setText(txtB.getValue().toString());
    }//GEN-LAST:event_txtBStateChanged

    private void txtCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCStateChanged
        // TODO add your handling code here:
         lblC.setText(txtC.getValue().toString());
    }//GEN-LAST:event_txtCStateChanged

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
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblRaiz1;
    private javax.swing.JLabel lblRaiz2;
    private javax.swing.JPanel panResult;
    private javax.swing.JSpinner txtA;
    private javax.swing.JSpinner txtB;
    private javax.swing.JSpinner txtC;
    // End of variables declaration//GEN-END:variables
}
