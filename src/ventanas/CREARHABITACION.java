/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import conexion.HabitacionDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class CREARHABITACION extends javax.swing.JFrame {

    /**
     * Creates new form CREARHABITACION
     */
    public CREARHABITACION() {
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
        TipoHabitacionTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CapacidadTextField = new javax.swing.JTextField();
        TarifaHabitacionTextField = new javax.swing.JTextField();
        NumeroHabitacionTextField = new javax.swing.JTextField();
        estadoHabitacionCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetallesHabitacionTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 213, 193));

        jLabel1.setText("Numero habitacion:");

        jLabel2.setText("Tipo habitacion: ");

        jLabel3.setText("Capacidad");

        jLabel4.setText("Tarifa habitacion");

        jLabel5.setText("Estado de habitación");

        estadoHabitacionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupada", "En mantenimiento" }));

        jLabel6.setText("Detalles habitacion");

        DetallesHabitacionTextArea.setColumns(20);
        DetallesHabitacionTextArea.setRows(5);
        jScrollPane1.setViewportView(DetallesHabitacionTextArea);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("CREAR HABITACIÓN");

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/3.png"))); // NOI18N
        crear.setText("Crear Habitacion ");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(estadoHabitacionCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                                        .addComponent(TarifaHabitacionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CapacidadTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TipoHabitacionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NumeroHabitacionTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(crear)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TipoHabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CapacidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TarifaHabitacionTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroHabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estadoHabitacionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:

        String numeroHab = NumeroHabitacionTextField.getText();
        if (numeroHab.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El número de habitación no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si el número de habitación está vacío
        }

        // Validación de capacidad
        String numero = CapacidadTextField.getText();
        if (!esNumeroEnteroValido(numero)) {
            return;  // Detenemos la ejecución si la capacidad no es válida
        }
        int capacidad = Integer.parseInt(numero);

        // Validación de tarifa
        String tarifa = TarifaHabitacionTextField.getText();
        if (!esNumeroDecimalValido(tarifa)) {
            return;  // Detenemos la ejecución si la tarifa no es válida
        }
        double tarifaHabitacion = Double.parseDouble(tarifa);
        tarifaHabitacion = formatoTarifa(tarifaHabitacion);

        // Validación de tipo de habitación
        String tipoHabitacion = TipoHabitacionTextField.getText();
        if (tipoHabitacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El tipo de habitación no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si el tipo de habitación está vacío
        }

        // Validación de detalles de la habitación
        String detallesHabitacion = DetallesHabitacionTextArea.getText();
        if (detallesHabitacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los detalles de la habitación no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si los detalles están vacíos
        }

        // Validación de estado de la habitación (ComboBox)
        String estadoHabitacion = (String) estadoHabitacionCombo.getSelectedItem();
        if (estadoHabitacion == null || estadoHabitacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estado para la habitación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si el estado no está seleccionado
        }

        // Si todas las validaciones son correctas, se procede con la creación de la habitación
        try {
            HabitacionDAO crearHabitacion = new HabitacionDAO();
            crearHabitacion.crearHabitacion(numeroHab, tipoHabitacion, capacidad, tarifaHabitacion, estadoHabitacion, detallesHabitacion);
        } catch (SQLException ex) {
            Logger.getLogger(CREARHABITACION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí iría el código para guardar la información de la habitación
                // Por ahora, simplemente mostramos un mensaje de confirmación
                JOptionPane.showMessageDialog(null, "La habitación ha sido creada con éxito!");

                // Limpiar los campos
                NumeroHabitacionTextField.setText("");
                CapacidadTextField.setText("");
                TarifaHabitacionTextField.setText("");
                TipoHabitacionTextField.setText("");
                estadoHabitacionCombo.setSelectedIndex(0);
                DetallesHabitacionTextArea.setText("");
            }
        });
    }//GEN-LAST:event_crearActionPerformed

    private boolean esNumeroEnteroValido(String numero) {
        try {
            int valor = Integer.parseInt(numero);
            if (valor > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El número debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se ingresó un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

// Método para validar si una cadena es un número decimal válido y mayor que cero
    private boolean esNumeroDecimalValido(String numero) {
        try {
            double valor = Double.parseDouble(numero);
            if (valor > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El número debe ser mayor a cero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se ingresó un número decimal válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

// Método para formatear la tarifa a dos decimales
private double formatoTarifa(double tarifa) {
    String valorFormateado = String.format("%.2f", tarifa);
    return Double.parseDouble(valorFormateado);
}
    

  
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
            java.util.logging.Logger.getLogger(CREARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREARHABITACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CapacidadTextField;
    private javax.swing.JTextArea DetallesHabitacionTextArea;
    private javax.swing.JTextField NumeroHabitacionTextField;
    private javax.swing.JTextField TarifaHabitacionTextField;
    private javax.swing.JTextField TipoHabitacionTextField;
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> estadoHabitacionCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
