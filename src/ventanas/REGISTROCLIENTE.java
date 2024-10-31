/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Empleado;
import conexion.ClienteDAO;
import conexion.HabitacionDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class REGISTROCLIENTE extends javax.swing.JFrame {

    /**
     * Creates new form REGISTROCLIENTE
     */
    public REGISTROCLIENTE() {
        initComponents();
        setSize(469, 390); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JTextField();
        apeidocliente = new javax.swing.JTextField();
        correocliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(247, 243, 217));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Correo");

        nombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreclienteActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/7.png"))); // NOI18N
        agregar.setText("Registrar cliente");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("REGISTRO DE CLIENTE ");

        jLabel4.setText("Teléfono");

        REGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/flecha-izquierda.png"))); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addGap(19, 19, 19))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(telefono)
                                .addComponent(nombrecliente)
                                .addComponent(apeidocliente)
                                .addComponent(correocliente)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apeidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreclienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
         String nombrecli =nombrecliente.getText();
        if (nombrecli.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No puede estar vacio el campo de nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si los detalles están vacíos
        }
        String apellido =apeidocliente.getText();
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No puede estar vacio el campo del apellido .", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si los detalles están vacíos
        }
        String correo =correocliente.getText();
        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No puede estar vacio el campo de correo .", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si los detalles están vacíos
        }
        String tel = telefono.getText();
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puede estar vacio el campo de telefono .", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si los detalles están vacíos
        }
        String telefonoRegex = "^\\+?[0-9]{1,3} ?[0-9]{6,14}$";
        if (!tel.matches(telefonoRegex)) {
            JOptionPane.showMessageDialog(null, "El teléfono ingresado no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Si todas las validaciones son correctas, se procede con la creación de la habitación
        try {
            ClienteDAO crearCliente = new ClienteDAO();
            crearCliente.crearCliente(nombrecli, apellido, correo, tel);

            // Aquí iría el código para guardar la información de la habitación
            // Por ahora, simplemente mostramos un mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Se ha registrado el cliente con éxito!");

            // Limpiar los campos
            nombrecliente.setText("");
            apeidocliente.setText("");
            correocliente.setText("");
            telefono.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(CREARHABITACION.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarActionPerformed
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        REGRESARActionPerformed(evt);
    }
    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REGISTROCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTROCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTROCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTROCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTROCLIENTE().setVisible(true);
            }
        });
    }*/
private Empleado empleado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apeidocliente;
    private javax.swing.JTextField correocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombrecliente;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
