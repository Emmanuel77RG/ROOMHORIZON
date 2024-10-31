/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Empleado;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import conexion.EmpleadoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CREAREMPLEADO extends javax.swing.JFrame {

    public CREAREMPLEADO() {
        initComponents();
        setSize(451, 543); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);
        
        crearComponentesExtra();
        this.OCULTAR.setVisible(false);
        
        
    }
     private void crearComponentesExtra() {
        calendario = new JDateChooser();
        calendario.setVisible(true);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));
        // Añadir el calendario a jPanel2
        jPanel3.add(calendario);

        jPanel3.revalidate();
        jPanel3.repaint();
        calendario.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                // Obtener la fecha seleccionada después de que el usuario haya interactuado
                fechaSeleccionada = calendario.getDate();

                // Verificar si se ha seleccionado una fecha
                if (fechaSeleccionada != null) {
                    // Corregir el formato de MySQL
                    SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd"); // Cambiar 'DD' a 'dd'
                    String formatoFechaMySQL = formatoMySQL.format(fechaSeleccionada);
                    System.out.println("Formato MySQL: " + formatoFechaMySQL);
                } else {
                    System.out.println("No se ha seleccionado ninguna fecha.");
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txcon = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        REGISTRAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        OCULTAR = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();
        telefonoText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        VER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 213, 193));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("NUEVO EMPLEADO ");

        jLabel1.setText("Nombre");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        jLabel3.setText("Correo");

        jLabel4.setText("Telefono");

        txcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txconActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Administrador" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Rol");

        jPanel4.setBackground(new java.awt.Color(230, 213, 193));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        REGISTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/8.png"))); // NOI18N
        REGISTRAR.setText("Registrar empleado");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha_contratacion :");

        jPanel3.setBackground(new java.awt.Color(230, 213, 193));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar-ojo.png"))); // NOI18N
        OCULTAR.setText("jLabel9");
        OCULTAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OCULTAR.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });

        REGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/flecha-izquierda.png"))); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        jLabel11.setText("Contraseña");

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/leer.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(73, 73, 73)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(REGISTRAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txcon, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VER)
                                    .addComponent(OCULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OCULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VER, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        String nombre = jTextField1.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación del campo Apellido
        String apellido = jTextField2.getText();
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación del campo Correo
        String correo = jTextField4.getText();
        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El correo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación del formato del correo electrónico
        String correoRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!correo.matches(correoRegex)) {
            JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tel =telefonoText.getText();
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El telefono no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String telefonoRegex = "^\\+?[0-9]{1,3} ?[0-9]{6,14}$";
        if (!tel.matches(telefonoRegex)) {
            JOptionPane.showMessageDialog(null, "El teléfono ingresado no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

         while (true) {
            // Validación del campo Contraseña
            contrasena = new String(txcon.getPassword());
             if (contrasena.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                 txcon.setText(""); // Limpiar el campo de contraseña
                 continue;
             }

             if (contrasena.length() != 8) {
                 JOptionPane.showMessageDialog(null, "La contraseña debe tener exactamente 8 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                 txcon.setText(""); // Limpiar el campo de contraseña
                 continue;
             }

             // Expresión regular para validar la contraseña
             String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#\\$%\\^&\\*])[A-Za-z\\d!@#\\$%\\^&\\*]{8}$";

             if (!contrasena.matches(regex)) {
                 JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula, una letra minúscula, un número y un símbolo.", "Error", JOptionPane.ERROR_MESSAGE);
                 txcon.setText(""); // Limpiar el campo de contraseña
                 continue;
             }

             // Si la contraseña cumple con todos los requisitos, rompemos el bucle
                break;
        }

        JOptionPane.showMessageDialog(null, "Contraseña válida.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    
        // Validación del campo Rol
        String rol = (String) jComboBox1.getSelectedItem();
        if (rol == null || rol.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un rol para el empleado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de la fecha de contratación
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de contratación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Imprimir la fecha seleccionada en formato MySQL
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
        String formatoFechaMySQL = formatoMySQL.format(fechaSeleccionada);
        
        try {
            empleadoDB = new EmpleadoDAO();
            //(String nombre,String apellido, String numero, String password, String correo,String fechaContratacion)
            empleadoDB.crearEmpleado(nombre, apellido, tel,contrasena,correo,formatoFechaMySQL,rol);
            JOptionPane.showMessageDialog(null, "El empleado se ha registrado con éxito.");
            limpiarcampos();
        } catch (SQLException ex) {
            Logger.getLogger(CREAREMPLEADO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // 
        
        
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void limpiarcampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        telefonoText.setText("");
    
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void OCULTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMouseClicked
        VER.setVisible(true);
        OCULTAR.setVisible(false);
        txcon.setEchoChar('●');
    }//GEN-LAST:event_OCULTARMouseClicked

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        VER.setVisible(false);
        OCULTAR.setVisible(true);
        txcon.setEchoChar((char)0);
    }//GEN-LAST:event_VERMouseClicked

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void txconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txconActionPerformed
   
    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CREAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREAREMPLEADO().setVisible(true);
            }
        });
    }*/
    private EmpleadoDAO empleadoDB;
    private JDateChooser calendario;
    private Date fechaSeleccionada;
    private Empleado empleado;
    String contrasena = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel VER;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JPasswordField txcon;
    // End of variables declaration//GEN-END:variables

    
}
