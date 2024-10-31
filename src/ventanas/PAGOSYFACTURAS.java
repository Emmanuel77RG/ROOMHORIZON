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
import conexion.ReservasDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PAGOSYFACTURAS extends javax.swing.JFrame {

    /**
     * Creates new form CREARFACTURAS
     */
    public PAGOSYFACTURAS (Empleado empleado) throws SQLException {
        initComponents();
        this.empleado=empleado;
        rellenarTabla();
        setSize(1119, 627); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);
    
    }
    public void actionPerformed(ActionEvent e) {
        int[] selectedRows = reservasTable.getSelectedRows();
            if (selectedRows.length > 0) {
                realizarPago(selectedRows);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una o más reservas para realizar el pago.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    private void realizarPago(int[] selectedRows) {

        // Campos de entrada para los datos del pago
        REALIZARP.add(new JLabel("Nombre:"));
        StringBuilder clientes = new StringBuilder();
        for (int row : selectedRows) {
            clientes.append(reservasTable.getValueAt(row, 0).toString()).append(", ");
        }
        JTextField clienteField = new JTextField(clientes.substring(0, clientes.length() - 2));
        clienteField.setEditable(false);
        reservasTable.add(clienteField);

        REALIZARP.add(new JLabel("Monto Total a Pagar:"));
        double montoTotalGeneral = 0;
        for (int row : selectedRows) {
            double tarifa = Double.parseDouble(reservasTable.getValueAt(row, 3).toString());
            String fechaEntrada = reservasTable.getValueAt(row, 4).toString();
            String fechaSalida = reservasTable.getValueAt(row, 5).toString();
            LocalDate entradaDate = LocalDate.parse(fechaEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate salidaDate = LocalDate.parse(fechaSalida, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            long diasEstancia = ChronoUnit.DAYS.between(entradaDate, salidaDate) + 1;
            montoTotalGeneral += diasEstancia * tarifa;
        }
        JTextField montoTotalField = new JTextField(String.format("$%.2f", montoTotalGeneral));
        montoTotalField.setEditable(false);
        REALIZARP.add(montoTotalField);

        REALIZARP.add(new JLabel("Efectivo Recibido:"));
        JTextField efectivoField = new JTextField();
        REALIZARP.add(efectivoField);

        REALIZARP.add(new JLabel("Cambio:"));
        JTextField cambioField = new JTextField();
        cambioField.setEditable(false);
        REALIZARP.add(cambioField);

        // Listener para calcular el cambio
        efectivoField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    double efectivo = Double.parseDouble(efectivoField.getText());
                    double montoTotal = Double.parseDouble(montoTotalField.getText().replace("$", ""));
                    double cambio = efectivo - montoTotal;
                    cambioField.setText(String.format("$%.2f", cambio));
                } catch (NumberFormatException ex) {
                    cambioField.setText("");
                }
            }
        });
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservasTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        REALIZARP = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 213, 193));

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

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel9.setText("REGISTRO DE PAGOS");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO4.png"))); // NOI18N

        REALIZARP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/4.png"))); // NOI18N
        REALIZARP.setText("Realizar pago ");
        REALIZARP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REALIZARPActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(REALIZARP, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REALIZARP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rellenarTabla() throws SQLException {
        listaReservas = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) reservasTable.getModel();
        modelo.setRowCount(0);
        reservasDAO = new ReservasDAO();
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
    private void reservasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservasTableMouseClicked
       
    }//GEN-LAST:event_reservasTableMouseClicked

    private void REALIZARPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REALIZARPActionPerformed
        new PAGOS().setVisible(true);
    }//GEN-LAST:event_REALIZARPActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(PAGOSYFACTURAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAGOSYFACTURAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAGOSYFACTURAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAGOSYFACTURAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAGOSYFACTURAS().setVisible(true);
            }
        });
        
    }*/
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
    private javax.swing.JButton REALIZARP;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reservasTable;
    // End of variables declaration//GEN-END:variables
}
