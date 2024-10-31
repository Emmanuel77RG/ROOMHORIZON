/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Cliente;
import clases.Empleado;
import clases.Habitacion;
import clases.Reservas;
import clases.ReservasManager;
import com.toedter.calendar.JDateChooser;
import conexion.ClienteDAO;
import conexion.ReservasDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CREARESERVAS extends javax.swing.JFrame {

    /**
     * Creates new form CREARESERVAS
     */
    public CREARESERVAS(Empleado empleado) throws SQLException {
        initComponents();
        crearComponentesExtra1();
        crearComponentesExtra2();
        this.empleado=empleado;
        rellenarTabla();
        
        setSize(1295, 580); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);
    }
//    public CREARESERVAS() {
//        initComponents();
//        crearComponentesExtra1();
//        crearComponentesExtra2();
//    }
    
    private void crearComponentesExtra1() {
        calendario1 = new JDateChooser();
        calendario1.setVisible(true);

        jPanel5.setLayout(new java.awt.GridLayout(1, 5));
        // Añadir el calendario a jPanel2
        jPanel5.add(calendario1);

        jPanel5.revalidate();
        jPanel5.repaint();
        calendario1.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                // Obtener la fecha seleccionada después de que el usuario haya interactuado
                Date fechaSeleccionada = calendario1.getDate();

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
    private void crearComponentesExtra2() {
        calendario2 = new JDateChooser();
        calendario2.setVisible(true);

        jPanel6.setLayout(new java.awt.GridLayout(1, 5));
        // Añadir el calendario a jPanel2
        jPanel6.add(calendario2);

        jPanel6.revalidate();
        jPanel6.repaint();
        calendario2.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                // Obtener la fecha seleccionada después de que el usuario haya interactuado
                Date fechaSeleccionada = calendario2.getDate();

                // Verificar si se ha seleccionado una fecha
                if (fechaSeleccionada != null) {
                    // Corregir el formato de MySQL
                    SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd"); // Cambiar 'DD' a 'dd'
                    String formatoFechaMySQL = formatoMySQL.format(fechaSeleccionada);
                    System.out.println("Calendariom2");
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
        HabitacionTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClienteTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        numPersonasTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notasTextArea = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        estadoReservaCombo = new javax.swing.JComboBox<>();
        REGRESAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservasTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        nombreClienteField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        mostrarTablaOriginalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 213, 193));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("CREAR RESERVAS");

        jLabel1.setText("Numero habitación");

        jLabel2.setText("Cliente : ");

        ClienteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado reserva");

        jLabel4.setText("Número de personas:");

        jPanel5.setBackground(new java.awt.Color(230, 213, 193));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jLabel12.setText("Fecha de Salida :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Notas: ");

        notasTextArea.setColumns(20);
        notasTextArea.setRows(5);
        jScrollPane1.setViewportView(notasTextArea);

        jLabel20.setText("Fecha de Entrada :");

        jPanel6.setBackground(new java.awt.Color(230, 213, 193));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/1.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (1).png"))); // NOI18N
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        estadoReservaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmada", "En estancia", "Finalizada", "No show", "Cancelada" }));

        REGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/flecha-izquierda.png"))); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(estadoReservaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(numPersonasTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel12))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21))))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(56, 56, 56)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6))
                            .addComponent(ClienteTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(HabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoReservaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPersonasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        jPanel2.setBackground(new java.awt.Color(247, 243, 217));

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/12.png"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/6.png"))); // NOI18N
        cancelar.setText("Cancelar ");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        reservasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. reserva", "Nombre", "Apellido", "Correo", "Telefono", "Fecha entrada", "Fecha salida", "Estado", "Numero personas", "Notas", "Numero habitacion", "Tipo habitacion", "Tarifa"
            }
        ));
        reservasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservasTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reservasTable);

        jLabel7.setText("Buscar : ");

        nombreClienteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteFieldActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        mostrarTablaOriginalButton.setText("Volver a mostrar tabla");
        mostrarTablaOriginalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTablaOriginalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addComponent(nombreClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(mostrarTablaOriginalButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nombreClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarTablaOriginalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 910, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       if (objetoReferencia != null) {
            int response = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la reservar? Los cambios no pueden deshacerse", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                // Lógica para cancelar la reserva
                try {
                    reservasDAO = new ReservasDAO();
                    reservasDAO.cancelarReserva(objetoReferencia.getHabitacion().getIdHabitacion(), objetoReferencia.getIdReserva(), objetoReferencia.getCliente().getId_cliente(), objetoReferencia.getEmpleado().getId_empleado());
                    JOptionPane.showMessageDialog(null, "Reserva cancelada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    rellenarTabla();
                } catch (SQLException ex) {
                    Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
                }
                //dispose(); // Cerrar la ventana
                // Si deseas limpiar los campos en lugar de cerrar la ventana, usa lo siguiente:
                // limpiarCampos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Asegurese de seleccionar una reserva", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
      
    }//GEN-LAST:event_cancelarActionPerformed

    private void ClienteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ResultSet resultadosConsulta;
        try {
            // TODO add your handling code here:
            //Boton para obtener clientes
            ClienteDAO clientes = new ClienteDAO();
            resultadosConsulta = clientes.obtenerClientes();
            new LISTAEMPLEADOS(resultadosConsulta, this).setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreClienteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            new HABITACIONESDISPONIBILIDAD(this).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //CREAR RESERVA LOGICA

        //CREAR RESERVA LOGICA
        if (cliente != null) {
            // Validaciones para campos vacíos
            if (ClienteTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Cliente no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (HabitacionTextField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Número de Habitación no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jPanel5.getComponentCount() == 0 || jPanel6.getComponentCount() == 0) {
                JOptionPane.showMessageDialog(null, "Las fechas de entrada y salida no pueden estar vacías.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Capturar fechas
            JDateChooser fechaEntradaChooser = (JDateChooser) jPanel6.getComponent(0);
            JDateChooser fechaSalidaChooser = (JDateChooser) jPanel5.getComponent(0);
            Date fechaEntrada = fechaEntradaChooser.getDate();
            Date fechaSalida = fechaSalidaChooser.getDate();

            if (fechaEntrada == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (fechaSalida == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de salida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Formato de fechas para MySQL
            SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
            String fechaEntradaMySQL = formatoMySQL.format(fechaEntrada);
            String fechaSalidaMySQL = formatoMySQL.format(fechaSalida);

            // Validar número de personas
            String numeroPersonasReserva = numPersonasTextField.getText();
            if (!esNumeroEnteroValido(numeroPersonasReserva)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int capacidad = Integer.parseInt(numeroPersonasReserva);
            String estadoreserva = String.valueOf(estadoReservaCombo.getSelectedItem());

            // Continuar con la lógica de crear reserva
            String notasReserva = notasTextArea.getText();
            reserva = new Reservas(habitacion, cliente, empleado, fechaEntrada, fechaSalida, estadoreserva, capacidad, notasReserva);
            try {
                reservasDAO = new ReservasDAO();
                // Crear la reserva en la base de datos
                reservasDAO.crearReservaDB(reserva.getCliente().getId_cliente(), reserva.getEmpleado().getId_empleado(), fechaEntradaMySQL, fechaSalidaMySQL, estadoreserva);

                // Obtener el ID de la reserva del cliente mas reciente
                int idReserva = reservasDAO.obtenerReservaCliente(reserva.getCliente().getId_cliente());
                reserva.setIdReserva(idReserva);
                // Crear los detalles de la reserva
                reservasDAO.crearReservaDetallesReserva(reserva.getIdReserva(), reserva.getHabitacion().getIdHabitacion(), capacidad, notasReserva);

                // Actualizar el estado de la habitación
                reservasDAO.actualizarHabitacion(reserva.getHabitacion().getIdHabitacion());

                JOptionPane.showMessageDialog(null, "Reserva creada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                reserva = null;
                cliente = null;
                habitacion = null;
            } catch (SQLException ex) {
                Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Ocurrió un error al crear la reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            try {
                rellenarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Asegurese de asignar un cliente desde la tabla clientes", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nombreCliente = nombreClienteField.getText().trim().toLowerCase();

        // Verificar que el campo de búsqueda no esté vacío
        if (nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el nombre del cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modeloOriginal = (DefaultTableModel) reservasTable.getModel();
        DefaultTableModel modeloFiltrado = new DefaultTableModel();

        // Copiar las columnas del modelo original al modelo filtrado
        for (int i = 0; i < modeloOriginal.getColumnCount(); i++) {
            modeloFiltrado.addColumn(modeloOriginal.getColumnName(i));
        }

        boolean hayCoincidencias = false;

        // Recorrer cada fila en el modelo original
        for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
            // Obtener el valor de la celda en la columna "Nombre" (columna 1)
            String nombreFila = modeloOriginal.getValueAt(i, 1).toString().toLowerCase();

            // Verificar si el nombre de la fila contiene el texto ingresado
            if (nombreFila.contains(nombreCliente)) {
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
            reservasTable.setModel(modeloFiltrado);
        } else {
            JOptionPane.showMessageDialog(null, "No hay reservas asociadas a tal cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void reservasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) reservasTable.getModel();

        Object idRESERVA = modelo.getValueAt(reservasTable.getSelectedRow(), 0);
        int idResCli = Integer.parseInt(String.valueOf(idRESERVA));
        
        Object nombreCli = modelo.getValueAt(reservasTable.getSelectedRow(), 1);
        String nombre = String.valueOf(nombreCli);

        Object apellidoCli = modelo.getValueAt(reservasTable.getSelectedRow(), 2);
        String apellido = String.valueOf(apellidoCli);

        Object numeroHAB = modelo.getValueAt(reservasTable.getSelectedRow(), 10);
        String numeroHab = String.valueOf(numeroHAB);

        reserva = ReservasManager.getInstance().buscarReserva(idResCli,nombre, apellido, numeroHab);
        if (reserva != null) {
            objetoReferencia = reserva;
            //habitacion=objetoReferencia.getHabitacion();
//            if (habitacion == null) {
//                JOptionPane.showMessageDialog(null, "La habitacion no se ha iniciado", "Error", JOptionPane.ERROR_MESSAGE);
//            }
            ClienteTextField.setText(reserva.getCliente().getNombre());
            HabitacionTextField.setText(reserva.getHabitacion().getNumeroHabitacion());
            numPersonasTextField.setText(String.valueOf(reserva.getCantidadPersonas()));
            notasTextArea.setText(reserva.getNotas());
            estadoReservaCombo.setSelectedItem(reserva.getEstadoReserva());
            calendario2.setDate(reserva.getFechaEntrada());
            calendario1.setDate(reserva.getFechaSalida());
            estadoReservaCombo.setSelectedItem(reserva.getEstadoReserva());
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la reserva seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reservasTableMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        //CODIGO para modifcar la habitacion;
        if (ClienteTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Cliente no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (HabitacionTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Número de Habitación no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jPanel5.getComponentCount() == 0 || jPanel6.getComponentCount() == 0) {
            JOptionPane.showMessageDialog(null, "Las fechas de entrada y salida no pueden estar vacías.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Capturar fechas
        JDateChooser fechaEntradaChooser = (JDateChooser) jPanel6.getComponent(0);
        JDateChooser fechaSalidaChooser = (JDateChooser) jPanel5.getComponent(0);
        Date fechaEntrada = fechaEntradaChooser.getDate();
        Date fechaSalida = fechaSalidaChooser.getDate();

        if (fechaEntrada == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fechaSalida == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la fecha de salida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Formato de fechas para MySQL
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
        String fechaEntradaMySQL = formatoMySQL.format(fechaEntrada);
        String fechaSalidaMySQL = formatoMySQL.format(fechaSalida);

        // Capturar fecha y hora actual para MySQL
        SimpleDateFormat formatoDateTimeMySQL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaHoraActualMySQL = formatoDateTimeMySQL.format(new Date());
        // Validar número de personas
        String numeroPersonasReserva = numPersonasTextField.getText();
        if (!esNumeroEnteroValido(numeroPersonasReserva)) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int capacidad = Integer.parseInt(numeroPersonasReserva);
        String estadoreserva = String.valueOf(estadoReservaCombo.getSelectedItem());

        // Continuar con la lógica de crear reserva
        String notasReserva = notasTextArea.getText();
//        if(objetoReferencia.getHabitacion()==null){
//            System.out.println("La haabitacion no se ha inciiado");
//            
//            return;
//        }
        try {
            reservasDAO = new ReservasDAO();

            // Verificar si la habitación ha cambiado
            if (habitacion != null) {
                // Escenario 1: Se seleccionó una nueva habitación
                reservasDAO.modificarReservas(objetoReferencia.getIdReserva(), objetoReferencia.getEmpleado().getId_empleado(), estadoreserva, fechaEntradaMySQL, fechaSalidaMySQL, fechaHoraActualMySQL);
                reservasDAO.modificarReservaConCambioDeHabitacion(objetoReferencia.getIdReserva(), objetoReferencia.getHabitacion().getIdHabitacion(), habitacion.getIdHabitacion(), capacidad, notasReserva);
            } else {
                // Escenario 2: No se seleccionó una nueva habitación
                reservasDAO.modificarReservas(objetoReferencia.getIdReserva(), objetoReferencia.getEmpleado().getId_empleado(), estadoreserva, fechaEntradaMySQL, fechaSalidaMySQL, fechaHoraActualMySQL);
                reservasDAO.modificarReservaSinCambioDeHabitacion(objetoReferencia.getIdReserva(), objetoReferencia.getHabitacion().getIdHabitacion(), capacidad, notasReserva);
            }

            JOptionPane.showMessageDialog(null, "Reserva modificada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Actualizar la tabla de reservas después de la modificación
            rellenarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(CREARESERVAS.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocurrió un error al modificar la reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_ModificarActionPerformed
     public void actionPerformed(java.awt.event.ActionEvent evt) {
        REGRESARActionPerformed(evt);
    }
    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
         this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void mostrarTablaOriginalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTablaOriginalButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)reservasTable.getModel();
        model.setRowCount(0);
        try {
            rellenarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostrarTablaOriginalButtonActionPerformed

    
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
    public void setClienteSeleccionado(Cliente cliente) {
        this.cliente = cliente;
        ClienteTextField.setText(cliente.getNombre());  // Asigna el nombre al textFieldCliente
    }
    public void setHabitacionSeleccionada(Habitacion habitacion) {
        this.habitacion=habitacion;
        HabitacionTextField.setText(habitacion.getNumeroHabitacion());
    }
    
    
    private void rellenarTabla() throws SQLException{
        listaReservas = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel)reservasTable.getModel();
        modelo.setRowCount(0);
        reservasDAO= new ReservasDAO();
        listaReservas = reservasDAO.obtenerReservas(empleado);
        for (Reservas res : listaReservas) {
            Object[] fila = {
                res.getIdReserva(),
                res.getCliente().getNombre(),
                res.getCliente().getApellido(),
                res.getCliente().getCorreo(),
                res.getCliente().getNumero(),
                res.getFechaEntrada(),
                res.getFechaSalida(),
                res.getEstadoReserva(),
                res.getCantidadPersonas(),
                res.getNotas(),
                res.getHabitacion().getNumeroHabitacion(),
                res.getHabitacion().getTipoHabitacion(),
                res.getHabitacion().getTarifaHabitacion()
            };
            modelo.addRow(fila);
        }
    }

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
//            java.util.logging.Logger.getLogger(CREARESERVAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CREARESERVAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CREARESERVAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CREARESERVAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CREARESERVAS().setVisible(true);
//            }
//        });
//    }
    private ArrayList<Reservas> listaReservas;
    private ReservasDAO reservasDAO;
    private Reservas reserva;
    private Reservas objetoReferencia;
    private Cliente cliente;
    private Habitacion habitacion;
    private Empleado empleado;
    private JDateChooser calendario1;
    private JDateChooser calendario2;
    private int idReservaCliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClienteTextField;
    private javax.swing.JTextField HabitacionTextField;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> estadoReservaCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrarTablaOriginalButton;
    private javax.swing.JTextField nombreClienteField;
    private javax.swing.JTextArea notasTextArea;
    private javax.swing.JTextField numPersonasTextField;
    private javax.swing.JTable reservasTable;
    // End of variables declaration//GEN-END:variables
}
