/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import conexion.HabitacionDAO;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class MODIFICARHABITACION extends javax.swing.JFrame {

    /**
     * Creates new form MODIFICARHABITACION
     */
    public MODIFICARHABITACION() {
        initComponents();
        
        try {
            rellenarDatosTabla1();
            rellenarDatosTabla2();
        } catch (SQLException ex) {
            Logger.getLogger(MODIFICARHABITACION.class.getName()).log(Level.SEVERE, null, ex);
        }
        agregarBotonEliminar();
    }
    private void agregarBotonEliminar() {
        // Agrega una nueva columna "Eliminar" al modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) habitacionTable2.getModel();
        model.addColumn("Eliminar");

        // Define el renderizador de la columna para mostrar un botón con un ícono
        habitacionTable2.getColumn("Eliminar").setCellRenderer(new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JButton button = new JButton("Eliminar");
                button.setIcon(new ImageIcon("ruta/a/icono.png")); // Coloca aquí la ruta a tu icono
                return button;
            }
        });

        // Define el editor de la celda para que los botones sean interactivos
        habitacionTable2.getColumn("Eliminar").setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                JButton button = new JButton("Eliminar");
                
                //button.setIcon(new ImageIcon("ruta/a/icono.png")); // Coloca aquí la ruta a tu icono

                // Acción al hacer clic en el botón
                button.addActionListener(e -> {
                    int confirmar = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar esta habitacion?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                    DefaultTableModel modelo=(DefaultTableModel)habitacionTable2.getModel();
                    if (confirmar == JOptionPane.YES_OPTION) {
                        Object idHabitacionT=modelo.getValueAt(row, 0);
                        String idHab=String.valueOf(idHabitacionT);
                        int idHAB=Integer.parseInt(idHab);
                        try {
                            HabitacionDAO habitacionSQL = new HabitacionDAO();
                            habitacionSQL.eliminarHabitacion(idHAB);
                            JOptionPane.showMessageDialog(null, "La habitación ha sido eliminada con éxito!");
                        ((DefaultTableModel) habitacionTable2.getModel()).removeRow(row); // Elimina la fila
                        } catch (SQLException ex) {
                            Logger.getLogger(MODIFICARHABITACION.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                });
                return button;
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        capacidadTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tarifaTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estadoTextField = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detallesHabitacionTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        habitacionTabla1 = new javax.swing.JTable();
        estadoTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        habitacionTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 243, 217));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel10.setText("MODIFICAR HABITACIÓN");

        jLabel3.setText("Capacidad");

        jLabel4.setText("Tarifa habitación");

        jLabel5.setText("Estado de habitación");

        estadoTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupada", "En mantenimiento" }));

        jLabel6.setText("Detalles habitación");

        detallesHabitacionTextArea.setColumns(20);
        detallesHabitacionTextArea.setRows(5);
        jScrollPane1.setViewportView(detallesHabitacionTextArea);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/actualizacion-de-sistema.png"))); // NOI18N
        jButton1.setText("Actualizar datos ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/8.png"))); // NOI18N
        jButton2.setText("Agregar nuevo ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        habitacionTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id habitacion", "Numero habitacion", "Tipo habitacion", "Capacidad", "Tarifa", "Estado", "Detalles"
            }
        ));
        habitacionTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habitacionTabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(habitacionTabla1);

        estadoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tarifaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(capacidadTextField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(estadoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estadoTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(capacidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tarifaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 660));

        jPanel2.setBackground(new java.awt.Color(190, 186, 176));

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("ELIMINAR HABITACIÓN");

        habitacionTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id habitacion", "Numero habitacion", "Tipo habitacion", "Capacidad", "Tarifa", "Estado", "Detalles"
            }
        ));
        jScrollPane3.setViewportView(habitacionTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(162, 162, 162))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 550, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CREARHABITACION().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void configurarComboBox() throws SQLException{
        ResultSet resultadosConsulta;
        HabitacionDAO habitaciones = new HabitacionDAO();
        resultadosConsulta=habitaciones.obtenerTiposHabitacion();
        while(resultadosConsulta.next()){
            String tipoHabitacion=resultadosConsulta.getString("Tipo_habitacion");
            estadoTextField.addItem(tipoHabitacion);
            
        }
    }
    private void habitacionTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habitacionTabla1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = (DefaultTableModel)habitacionTabla1.getModel();
        Object id_habitacionInt=modeloTabla.getValueAt(habitacionTabla1.getSelectedRow(), 0);
        String idHab=String.valueOf(id_habitacionInt);
        id_habitacion=Integer.parseInt(idHab);

        Object capacidadInt=modeloTabla.getValueAt(habitacionTabla1.getSelectedRow(), 3);
        String capacidad=String.valueOf(capacidadInt);
        
        Object tarifaHabitacionDouble=modeloTabla.getValueAt(habitacionTabla1.getSelectedRow(), 4);
        String tarifaHabitacion=String.valueOf(tarifaHabitacionDouble);
        
        Object estadoHabitacionTable=modeloTabla.getValueAt(habitacionTabla1.getSelectedRow(), 5);
        String estadoHabitacion=String.valueOf(estadoHabitacionTable);
        
        Object detallesHabObj=modeloTabla.getValueAt(habitacionTabla1.getSelectedRow(), 6);
        String detallesHab=String.valueOf(detallesHabObj);
        
        capacidadTextField.setText(capacidad);
        tarifaTextField.setText(tarifaHabitacion);
        estadoTextField1.setText(estadoHabitacion);
        detallesHabitacionTextArea.setText(detallesHab);
    }//GEN-LAST:event_habitacionTabla1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String capacidadNueva=capacidadTextField.getText();
        String nuevaTarifa=tarifaTextField.getText();
        String nuevoEstado = estadoTextField1.getText();
        String detallesHabNuevos = detallesHabitacionTextArea.getText();

        if (capacidadNueva.isEmpty() && nuevaTarifa.isEmpty() && nuevoEstado.isEmpty() && detallesHabNuevos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Detenemos la ejecución si todos los campos están vacíos
        }
        if (!esNumeroEnteroValido(capacidadNueva)) {
            return;
        }
        int capacidadN = Integer.parseInt(capacidadNueva);
        
        if (!esNumeroDecimalValido(nuevaTarifa)) {
            return;  // Detenemos la ejecución si la tarifa no es válida
        }
        double tarifaHabitacion = Double.parseDouble(nuevaTarifa);
        tarifaHabitacion = formatoTarifa(tarifaHabitacion);
        try {
            HabitacionDAO habitacionInsert=new HabitacionDAO();
            habitacionInsert.actualizarHabitacion(capacidadN, tarifaHabitacion, nuevoEstado, detallesHabNuevos,id_habitacion);
            JOptionPane.showMessageDialog(null, "La habitación ha sido modificada con éxito!");
        } catch (SQLException ex) {
            Logger.getLogger(MODIFICARHABITACION.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estadoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTextField1ActionPerformed
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
    private void rellenarDatosTabla1() throws SQLException{
        DefaultTableModel modeloTabla = (DefaultTableModel)habitacionTabla1.getModel();
        modeloTabla.setRowCount(0);
        ResultSet resultadosConsulta;
        HabitacionDAO habitaciones = new HabitacionDAO();
        resultadosConsulta=habitaciones.obtenerDatosHabitaciones();
        while(resultadosConsulta.next()){
            int id=resultadosConsulta.getInt("Id_habitacion");
            String numeroHabitacion=resultadosConsulta.getString("Numero_habitacion");
            String tipoHabitacion=resultadosConsulta.getString("Tipo_habitacion");
            int capacidad=resultadosConsulta.getInt("Capacidad");
            double tarifa=resultadosConsulta.getDouble("Tarifa_habitacion");
            String estadoHabitaion=resultadosConsulta.getString("Estado_habitacion");
            String detallesHabitacion=resultadosConsulta.getString("Detalles_habitacion");
            
            modeloTabla.addRow(new Object[]{id,numeroHabitacion,tipoHabitacion,capacidad,tarifa,estadoHabitaion,detallesHabitacion});
        }
        
    }
    private void rellenarDatosTabla2() throws SQLException{
        DefaultTableModel modeloTabla = (DefaultTableModel)habitacionTable2.getModel();
        modeloTabla.setRowCount(0);
        ResultSet resultadosConsulta;
        HabitacionDAO habitaciones = new HabitacionDAO();
        resultadosConsulta=habitaciones.obtenerDatosHabitaciones();
        while(resultadosConsulta.next()){
            int id=resultadosConsulta.getInt("Id_habitacion");
            String numeroHabitacion=resultadosConsulta.getString("Numero_habitacion");
            String tipoHabitacion=resultadosConsulta.getString("Tipo_habitacion");
            int capacidad=resultadosConsulta.getInt("Capacidad");
            double tarifa=resultadosConsulta.getDouble("Tarifa_habitacion");
            String estadoHabitaion=resultadosConsulta.getString("Estado_habitacion");
            String detallesHabitacion=resultadosConsulta.getString("Detalles_habitacion");
            
            modeloTabla.addRow(new Object[]{id,numeroHabitacion,tipoHabitacion,capacidad,tarifa,estadoHabitaion,detallesHabitacion});
        }
        
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
            java.util.logging.Logger.getLogger(MODIFICARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MODIFICARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MODIFICARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MODIFICARHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICARHABITACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacidadTextField;
    private javax.swing.JTextArea detallesHabitacionTextArea;
    private javax.swing.JComboBox<String> estadoTextField;
    private javax.swing.JTextField estadoTextField1;
    private javax.swing.JTable habitacionTabla1;
    private javax.swing.JTable habitacionTable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tarifaTextField;
    // End of variables declaration//GEN-END:variables
private int id_habitacion;}
