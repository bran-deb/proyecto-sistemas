/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author brian
 */
public class VentanaPrincipalEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipalEstudiante() {
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

        botonIngresarReunion = new java.awt.Button();
        botonExamenes = new java.awt.Button();
        botonVideos = new java.awt.Button();
        botonIngresarExamen = new java.awt.Button();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonIngresarReunion.setLabel("Ingresar a la reunion");
        botonIngresarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarReunionActionPerformed(evt);
            }
        });

        botonExamenes.setLabel("Examenes pasados");
        botonExamenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExamenesActionPerformed(evt);
            }
        });

        botonVideos.setLabel("Videos");
        botonVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVideosActionPerformed(evt);
            }
        });

        botonIngresarExamen.setLabel("Ingresar a un Examen");
        botonIngresarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarExamenActionPerformed(evt);
            }
        });

        label2.setText("Notificaciones");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("Menu Principal ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(botonIngresarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(botonIngresarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(botonVideos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVideos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExamenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExamenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonExamenesActionPerformed

    private void botonIngresarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarReunionActionPerformed
        // TODO add your handling code here:
        new VentanaEntrarReunion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIngresarReunionActionPerformed

    private void botonIngresarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarExamenActionPerformed
        ingresarAlExamen ingAEx = null;
        try {
            ingAEx = new ingresarAlExamen();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipalEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        ingAEx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIngresarExamenActionPerformed

    private void botonVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVideosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVideosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonExamenes;
    private java.awt.Button botonIngresarExamen;
    private java.awt.Button botonIngresarReunion;
    private java.awt.Button botonVideos;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
