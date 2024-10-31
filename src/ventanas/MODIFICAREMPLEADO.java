/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Empleado;
import conexion.EmpleadoDAO;
import conexion.HabitacionDAO;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author HP
 */
public class MODIFICAREMPLEADO extends javax.swing.JFrame {

    /**
     * Creates new form MODIFICAREMPLEADO
     */
    public MODIFICAREMPLEADO(Empleado empleado) throws SQLException {
        this.empleado=empleado;
        initComponents();
        agregarBotonEliminar();
        rellenarDatosTabla1();
        rellenarDatosTabla2();
        
        setSize(11102, 646); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);
        this.OCULTAR.setVisible(false);
    }
   private void rellenarDatosTabla1() throws SQLException{
        DefaultTableModel modeloTabla = (DefaultTableModel)empleadosTable1.getModel();
        modeloTabla.setRowCount(0);
        
        empleadosRegistrados = new EmpleadoDAO();
        listaEmpleados=empleadosRegistrados.obtenerEmpleados();
        for (Empleado emp: listaEmpleados){
            Object [] fila={
                emp.getNombre(),
                emp.getApellido(),
                emp.getRol(),
                emp.getPassword(),
                emp.getCorreo(),
                emp.getNumeroTelefono()
                
            };
            modeloTabla.addRow(fila);
        }
    }
    private void rellenarDatosTabla2() throws SQLException{
        DefaultTableModel modeloTabla = (DefaultTableModel)empleadosTable2.getModel();
        modeloTabla.setRowCount(0);
        
        empleadosRegistrados = new EmpleadoDAO();
        listaEmpleados=empleadosRegistrados.obtenerEmpleados();
        for (Empleado emp: listaEmpleados){
            Object [] fila={
                emp.getNombre(),
                emp.getApellido(),
                emp.getRol(),
                emp.getFechaContratacion(),
                emp.getNumeroTelefono(),
                emp.getCorreo(),
                emp.getPassword()
                
  
            };
            modeloTabla.addRow(fila);
        }
    }

    private void agregarBotonEliminar() {
        //DefaultTableModel model = (DefaultTableModel) empleadosTable2.getModel();

        // Verificar si la columna "Eliminar" ya existe para evitar duplicarla
        boolean columnaEliminarExiste = false;
        for (int i = 0; i < empleadosTable2.getColumnCount(); i++) {
            if (empleadosTable2.getColumnName(i).equals("Eliminar")) {
                columnaEliminarExiste = true;
                break;
            }
        }

        // Si no existe, agrega la columna "Eliminar"
        if (!columnaEliminarExiste) {
            DefaultTableModel model = (DefaultTableModel) empleadosTable2.getModel();
            model.addColumn("Eliminar");
        }

        // Configurar el renderizador y el editor de la columna "Eliminar"
        empleadosTable2.getColumn("Eliminar").setCellRenderer(new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JButton button = new JButton("Eliminar");
                button.setIcon(new ImageIcon("ruta/a/icono.png")); // Coloca aquí la ruta a tu icono
                return button;
            }
        });

        empleadosTable2.getColumn("Eliminar").setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                JButton button = new JButton("Eliminar");

                // Acción al hacer clic en el botón
                button.addActionListener(e -> {
                    int confirmar = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                    if (confirmar == JOptionPane.YES_OPTION) {

                        try {
                            Object contrasena = empleadosTable2.getValueAt(row, 6);
                            Object correo = empleadosTable2.getValueAt(row, 5);
                            String correoEmp = correo.toString();
                            String contrasenaEmp = contrasena.toString();
                            empleadosRegistrados = new EmpleadoDAO();
                            if (empleadosRegistrados.buscarIdEmpleadoBase(correoEmp, contrasenaEmp) != 0) {
                                int IDEMPLEADO=empleadosRegistrados.buscarIdEmpleadoBase(correoEmp, contrasenaEmp);
                                empleadosRegistrados.eliminarEmpleadoPorId(IDEMPLEADO);
                                JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado con éxito!");
                                ((DefaultTableModel) empleadosTable2.getModel()).removeRow(row); // Elimina la fila
                                rellenarDatosTabla1();
                                rellenarDatosTabla2();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txcon = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empleadosTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        nombreEmpleadoFieldBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        mostrarTablaButton = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        telefonoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();
        VER = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empleadosTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 243, 217));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel10.setText("MODIFICAR EMPLEADOS");

        jLabel1.setText("Nombre");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        jLabel6.setText("Rol");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Administrador" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/actualizacion-de-sistema.png"))); // NOI18N
        jButton1.setText("Actualizar datos ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(230, 213, 193));

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("ELIMINAR EMPLEADOS");

        empleadosTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Rol", "Fecha contratacion", "Telefono", "Correo", "Contraseña"
            }
        ));
        jScrollPane2.setViewportView(empleadosTable2);

        jLabel5.setText("Buscar :");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        mostrarTablaButton.setText("Volver a mostrar tabla");
        mostrarTablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreEmpleadoFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarTablaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(nombreEmpleadoFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrarTablaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        REGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/flecha-izquierda.png"))); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        telefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono");

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar-ojo.png"))); // NOI18N
        OCULTAR.setText("jLabel9");
        OCULTAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OCULTAR.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/leer.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });

        empleadosTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Rol", "Contraseña", "Correo", "Numero"
            }
        ));
        empleadosTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empleadosTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txcon, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VER)
                                    .addComponent(OCULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6)
                                .addGap(72, 72, 72)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(OCULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Capturar valores de los campos
        String nombre = jTextField1.getText().trim();
        String apellido = jTextField2.getText().trim();
        String correo = jTextField4.getText().trim();
        String contrasena = new String(txcon.getPassword()).trim();
        String telefono = telefonoField.getText().trim();
        String rol = (String) jComboBox1.getSelectedItem();

        // Validaciones
        // Validar que el nombre no esté vacío
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo 'Nombre' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el apellido no esté vacío
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo 'Apellido' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El correo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validar que el correo tenga un formato válido
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

         while (true) {
            if (contrasena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (contrasena.length() < 6 || contrasena.length() > 12) {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 6 y 12 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            // Expresión regular para validar la contraseña
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#\\$%\\^&\\*])[A-Za-z\\d!@#\\$%\\^&\\*]{6,12}$";
            if (!contrasena.matches(regex)) {
                JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula, una letra minúscula, un número y un símbolo.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            // Si la contraseña cumple con todos los requisitos, rompemos el bucle
            break;
        }


        // Validar que el teléfono contenga solo números y tenga una longitud mínima de 10 dígitos
        String telefonoRegex = "^\\+?[0-9]{1,3} ?[0-9]{6,14}$";
        if (!telefono.matches(telefonoRegex)) {
            JOptionPane.showMessageDialog(null, "El teléfono ingresado no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el rol esté seleccionado
        if (rol == null || rol.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un rol.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        try {
            // TODO add your handling code here:
            //ACTUALIZAR DATOS
            EmpleadoDAO empleados = new EmpleadoDAO();
            empleados.modificarDatosEmpleado(empleadoModifcar.getId_empleado(), nombre, apellido, rol, contrasena, correo, telefono);
            JOptionPane.showMessageDialog(null, "Los datos han sido actualizados con éxito!");
            rellenarDatosTabla1();
            rellenarDatosTabla2();
        } catch (SQLException ex) {
            Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed

        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void mostrarTablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) empleadosTable2.getModel();
        model.setRowCount(0);
        try {
            rellenarDatosTabla2();
        } catch (SQLException ex) {
            Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostrarTablaButtonActionPerformed
    private void establecerEmpleadoModifcar(Empleado empleado){
        if(empleado!=null){
            this.empleadoModifcar=empleado;
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nombreEmpleado = nombreEmpleadoFieldBuscar.getText().trim().toLowerCase();

        // Verificar que el campo de búsqueda no esté vacío
        if (nombreEmpleado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el nombre del empleado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modeloOriginal = (DefaultTableModel) empleadosTable2.getModel();
        DefaultTableModel modeloFiltrado = new DefaultTableModel();

        // Copiar las columnas del modelo original al modelo filtrado, incluyendo la columna "Eliminar"
        for (int i = 0; i < modeloOriginal.getColumnCount(); i++) {
            modeloFiltrado.addColumn(modeloOriginal.getColumnName(i));
        }

        boolean hayCoincidencias = false;

        // Recorrer cada fila en el modelo original
        for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
            // Obtener el valor de la celda en la columna "Nombre" (columna 0)
            String nombreFila = modeloOriginal.getValueAt(i, 0).toString().toLowerCase();

            // Verificar si el nombre de la fila contiene el texto ingresado
            if (nombreFila.contains(nombreEmpleado)) {
                Object[] fila = new Object[modeloOriginal.getColumnCount()];
                for (int j = 0; j < modeloOriginal.getColumnCount(); j++) {
                    fila[j] = modeloOriginal.getValueAt(i, j);
                }
                modeloFiltrado.addRow(fila);
                hayCoincidencias = true;
            }
        }

        // Actualizar la tabla con el modelo filtrado o mostrar mensaje de "sin coincidencias"
        if (hayCoincidencias) {
            empleadosTable2.setModel(modeloFiltrado);
            agregarBotonEliminar(); // Asegurar que el botón "Eliminar" se configure nuevamente después de filtrar
        } else {
            JOptionPane.showMessageDialog(null, "No existe el empleado", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

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

    private void empleadosTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) empleadosTable1.getModel();
        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) empleadosTable1.getModel();

        // Obtener los valores de la fila seleccionada
        int selectedRow = empleadosTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Nombre
            Object nombreObj = modeloTabla.getValueAt(selectedRow, 0);
            String nombre = String.valueOf(nombreObj).trim();
            jTextField1.setText(nombre);

            // Apellido
            Object apellidoObj = modeloTabla.getValueAt(selectedRow, 1);
            String apellido = String.valueOf(apellidoObj).trim();
            jTextField2.setText(apellido);

            // Rol
            Object rolObj = modeloTabla.getValueAt(selectedRow, 2);
            String rol = String.valueOf(rolObj).trim();
            jComboBox1.setSelectedItem(rol);

            // Contraseña
            Object passwordObj = modeloTabla.getValueAt(selectedRow, 3);
            String password = String.valueOf(passwordObj).trim();
            txcon.setText(password);

            // Correo
            Object correoObj = modeloTabla.getValueAt(selectedRow, 4);
            String correo = String.valueOf(correoObj).trim();
            jTextField4.setText(correo);

            // Número de teléfono
            Object numeroTelefonoObj = modeloTabla.getValueAt(selectedRow, 5);
            String numeroTelefono = String.valueOf(numeroTelefonoObj).trim();
            telefonoField.setText(numeroTelefono);

            try {
                empleadosRegistrados= new EmpleadoDAO();
                establecerEmpleadoModifcar(empleadosRegistrados.buscarEmpleadoBase(correo, password));
            } catch (SQLException ex) {
                Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_empleadosTable1MouseClicked

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
            java.util.logging.Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MODIFICAREMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICAREMPLEADO().setVisible(true);
            }
        });
    }*/
private Empleado empleado;
    private Empleado empleadoModifcar;
    private EmpleadoDAO empleadosRegistrados;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel VER;
    private javax.swing.JTable empleadosTable1;
    private javax.swing.JTable empleadosTable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton mostrarTablaButton;
    private javax.swing.JTextField nombreEmpleadoFieldBuscar;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JPasswordField txcon;
    // End of variables declaration//GEN-END:variables
}
