/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form PRINCIPAL
     */
    public PRINCIPAL(Empleado empleado) {
        initComponents();
        this.empleado=empleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CFACTURAS = new javax.swing.JButton();
        RPAGOS = new javax.swing.JButton();
        CHABITACION = new javax.swing.JButton();
        MHABITACIO = new javax.swing.JButton();
        CRESERVAS = new javax.swing.JButton();
        RCIENTE = new javax.swing.JButton();
        REMPLEADO = new javax.swing.JButton();
        EEMPLEADO = new javax.swing.JButton();
        CHECKIN = new javax.swing.JButton();
        historialReservasButton = new javax.swing.JButton();
        cerrarSesionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 186, 176));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO A ROOM HORIZON ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO3_1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        CFACTURAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/2.png"))); // NOI18N
        CFACTURAS.setText("Crear facturas");

        RPAGOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/4.png"))); // NOI18N
        RPAGOS.setText("Ralizar pagos ");

        CHABITACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/3.png"))); // NOI18N
        CHABITACION.setText("Crear habitacion ");
        CHABITACION.setBorder(null);
        CHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHABITACIONActionPerformed(evt);
            }
        });

        MHABITACIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/5.png"))); // NOI18N
        MHABITACIO.setText("Modificar habitacion ");
        MHABITACIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHABITACIOActionPerformed(evt);
            }
        });

        CRESERVAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1.png"))); // NOI18N
        CRESERVAS.setText("Reservas");
        CRESERVAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRESERVASActionPerformed(evt);
            }
        });

        RCIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/7.png"))); // NOI18N
        RCIENTE.setText("Registro de cliente");
        RCIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCIENTEActionPerformed(evt);
            }
        });

        REMPLEADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/8.png"))); // NOI18N
        REMPLEADO.setText("Registro de empleado");
        REMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REMPLEADOActionPerformed(evt);
            }
        });

        EEMPLEADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/10.png"))); // NOI18N
        EEMPLEADO.setText("Detalles de empleado");
        EEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEMPLEADOActionPerformed(evt);
            }
        });

        CHECKIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/9.png"))); // NOI18N
        CHECKIN.setText("Check-in");
        CHECKIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKINActionPerformed(evt);
            }
        });

        historialReservasButton.setText("Historial reservas");
        historialReservasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialReservasButtonActionPerformed(evt);
            }
        });

        cerrarSesionButton.setText("Cerrar sesion");
        cerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(199, 199, 199))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(historialReservasButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CFACTURAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(CRESERVAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CHABITACION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(REMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MHABITACIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cerrarSesionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RPAGOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(RCIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CHECKIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EEMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                        .addGap(62, 62, 62))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MHABITACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RCIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CRESERVAS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CHECKIN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RPAGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CFACTURAS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(historialReservasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(cerrarSesionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHABITACIONActionPerformed
        if (empleado.getRol().equals("Administrador")) {
            new CREARHABITACION().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permiso para acceder", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CHABITACIONActionPerformed

    private void MHABITACIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHABITACIOActionPerformed
        
        if (empleado.getRol().equals("Administrador")) {
            new MODIFICARHABITACION().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permiso para acceder", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MHABITACIOActionPerformed

    private void CRESERVASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRESERVASActionPerformed
        try {
            new CREARESERVAS(empleado).setVisible(true);
            //new CREARESERVAS().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CRESERVASActionPerformed

    private void RCIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCIENTEActionPerformed
        new REGISTROCLIENTE().setVisible(true);
    }//GEN-LAST:event_RCIENTEActionPerformed

    private void REMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMPLEADOActionPerformed
        
        if (empleado.getRol().equals("Administrador")) {
            new CREAREMPLEADO().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permiso para acceder", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_REMPLEADOActionPerformed

    private void EEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEMPLEADOActionPerformed
        
        if (empleado.getRol().equals("Administrador")) {
            try {
                new MODIFICAREMPLEADO(empleado).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permiso para acceder", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EEMPLEADOActionPerformed

    private void historialReservasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialReservasButtonActionPerformed
        try {
            // TODO add your handling code here:
            new HISTORIALRESERVAS(empleado).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_historialReservasButtonActionPerformed

    private void CHECKINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKINActionPerformed
        try {
            // TODO add your handling code here:
            new CHECKIN(empleado).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CHECKINActionPerformed

    private void cerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionButtonActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        dispose();
        empleado=null;
        // Crear una nueva instancia de INICIARREP y mostrarla
        new INCIARREP().setVisible(true);
    }//GEN-LAST:event_cerrarSesionButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PRINCIPAL().setVisible(true);
//            }
//        });
//    }

    private Empleado empleado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CFACTURAS;
    private javax.swing.JButton CHABITACION;
    private javax.swing.JButton CHECKIN;
    private javax.swing.JButton CRESERVAS;
    private javax.swing.JButton EEMPLEADO;
    private javax.swing.JButton MHABITACIO;
    private javax.swing.JButton RCIENTE;
    private javax.swing.JButton REMPLEADO;
    private javax.swing.JButton RPAGOS;
    private javax.swing.JButton cerrarSesionButton;
    private javax.swing.JButton historialReservasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}