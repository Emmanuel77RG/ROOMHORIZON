/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author HP
 */
public class PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form PRINCIPAL
     */
    public PRINCIPAL() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CFACTURAS = new javax.swing.JButton();
        RPAGOS = new javax.swing.JButton();
        CHABITACION = new javax.swing.JButton();
        MHABITACIO = new javax.swing.JButton();
        EHABITACION = new javax.swing.JButton();
        CRESERVAS = new javax.swing.JButton();
        MRESERVAR = new javax.swing.JButton();
        CANCELARR = new javax.swing.JButton();
        RCIENTE = new javax.swing.JButton();
        REMPLEADO = new javax.swing.JButton();
        EEMPLEADO = new javax.swing.JButton();
        CHECKIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 186, 176));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO A ROOM HORIZON ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO3_1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        CFACTURAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/2.png"))); // NOI18N
        CFACTURAS.setText("Crear Facturas");

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

        EHABITACION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/11.png"))); // NOI18N
        EHABITACION.setText("Eliminar habitacion ");
        EHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EHABITACIONActionPerformed(evt);
            }
        });

        CRESERVAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1.png"))); // NOI18N
        CRESERVAS.setText("Crear reservas ");
        CRESERVAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRESERVASActionPerformed(evt);
            }
        });

        MRESERVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/12.png"))); // NOI18N
        MRESERVAR.setText("Modificar reservas");

        CANCELARR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/6.png"))); // NOI18N
        CANCELARR.setText("Cancelar reservas");

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
        EEMPLEADO.setText("Eliminar empleado");
        EEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEMPLEADOActionPerformed(evt);
            }
        });

        CHECKIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/9.png"))); // NOI18N
        CHECKIN.setText("Check-in");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CANCELARR, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECKIN, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(REMPLEADO, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CFACTURAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(CRESERVAS, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(CHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EHABITACION)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(240, 240, 240))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(RPAGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)
                                            .addComponent(RCIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(MRESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MHABITACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(74, 74, 74)))))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MHABITACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CRESERVAS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CANCELARR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MRESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CFACTURAS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RPAGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RCIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECKIN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHABITACIONActionPerformed
        new CREARHABITACION().setVisible(true);
    }//GEN-LAST:event_CHABITACIONActionPerformed

    private void MHABITACIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHABITACIOActionPerformed
        new MODIFICARHABITACION().setVisible(true);
    }//GEN-LAST:event_MHABITACIOActionPerformed

    private void EHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EHABITACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EHABITACIONActionPerformed

    private void REMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMPLEADOActionPerformed
        new CREAREMPLEADO().setVisible(true);
    }//GEN-LAST:event_REMPLEADOActionPerformed

    private void EEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEMPLEADOActionPerformed
        new ELIMINAREMPLEADO().setVisible(true);
    }//GEN-LAST:event_EEMPLEADOActionPerformed

    private void RCIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCIENTEActionPerformed
        new REGISTROCLIENTE().setVisible(true);
    }//GEN-LAST:event_RCIENTEActionPerformed

    private void CRESERVASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRESERVASActionPerformed
        new CREARESERVAS().setVisible(true);
    }//GEN-LAST:event_CRESERVASActionPerformed

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELARR;
    private javax.swing.JButton CFACTURAS;
    private javax.swing.JButton CHABITACION;
    private javax.swing.JButton CHECKIN;
    private javax.swing.JButton CRESERVAS;
    private javax.swing.JButton EEMPLEADO;
    private javax.swing.JButton EHABITACION;
    private javax.swing.JButton MHABITACIO;
    private javax.swing.JButton MRESERVAR;
    private javax.swing.JButton RCIENTE;
    private javax.swing.JButton REMPLEADO;
    private javax.swing.JButton RPAGOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
