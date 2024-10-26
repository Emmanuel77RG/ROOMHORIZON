/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Habitacion;
import conexion.HabitacionDAO;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class HABITACIONESDISPONIBILIDAD extends javax.swing.JFrame {

    private CREARESERVAS crearReserva;
    /**
     * Creates new form HABITACIONESDISPONIBILIDAD
     */
    public HABITACIONESDISPONIBILIDAD(CREARESERVAS crearReserva) throws SQLException {
        initComponents();
        this.crearReserva=crearReserva;
        rellenarTabla();
        configComponents();
    }
    public HABITACIONESDISPONIBILIDAD() throws SQLException {
        initComponents();
        rellenarTabla();
        configComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelExterno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        habitacionesTable = new javax.swing.JTable();
        fechasButton = new javax.swing.JButton();
        numeroHabButton = new javax.swing.JButton();
        tipoHabButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta Disponibilidad de Habitaciones");

        jLabel2.setText("Seleccione un criterio");

        panelExterno.setLayout(new java.awt.CardLayout());

        habitacionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id habitacion", "Numero habitacion", "Tipo habitacion", "Capacidad", "Tarifa habitacion", "Estado", "Detalles"
            }
        ));
        jScrollPane1.setViewportView(habitacionesTable);

        fechasButton.setText("Fechas");
        buttonGroup1.add(fechasButton);
        fechasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechasButtonActionPerformed(evt);
            }
        });

        numeroHabButton.setText("Numero habitacion");
        buttonGroup1.add(numeroHabButton);

        tipoHabButton.setText("Tipo habitacion");
        buttonGroup1.add(tipoHabButton);

        jButton1.setText("Asignar habitacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fechasButton)
                                        .addGap(4, 4, 4)
                                        .addComponent(numeroHabButton))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoHabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechasButton)
                    .addComponent(numeroHabButton)
                    .addComponent(tipoHabButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechasButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = habitacionesTable.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una habitacion", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Obtener los datos de la fila seleccionada y realizar conversiones de tipos
        int idHabitacion = (int) habitacionesTable.getValueAt(filaSeleccionada, 0);
        String numeroHabitacion = habitacionesTable.getValueAt(filaSeleccionada, 1).toString();
        String tipoHabitacion = habitacionesTable.getValueAt(filaSeleccionada, 2).toString();
        int capacidad = Integer.parseInt(habitacionesTable.getValueAt(filaSeleccionada, 3).toString());
        double tarifaHabitacion = Double.parseDouble(habitacionesTable.getValueAt(filaSeleccionada, 4).toString());
        String estadoHabitacion = habitacionesTable.getValueAt(filaSeleccionada, 5).toString();
        String detallesHabitacion = habitacionesTable.getValueAt(filaSeleccionada, 6).toString();
        if(estadoHabitacion.equals("Ocupada") || estadoHabitacion.equals("En mantemiento")){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una habitacion disponible", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Crear el objeto Habitacion
        Habitacion habitacionSeleccionada = new Habitacion(idHabitacion, numeroHabitacion, tipoHabitacion, capacidad, tarifaHabitacion, estadoHabitacion, detallesHabitacion);
        crearReserva.setHabitacionSeleccionada(habitacionSeleccionada);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void rellenarTabla() throws SQLException{
        DefaultTableModel modeloTabla = (DefaultTableModel)habitacionesTable.getModel();
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
    private void configComponents() throws SQLException{
        cardlayout=(CardLayout) panelExterno.getLayout();
        TIPOHABITACIONPANEL habitacionPanel = new TIPOHABITACIONPANEL(this);
        NUMEROHABITACIONPANEL numerohabPanel= new NUMEROHABITACIONPANEL(this);
        FECHASBUSQUEDAPANEL fechasPanel = new FECHASBUSQUEDAPANEL(this);
        
        JPanel panelVacio = new JPanel();
    
        // Añadir los paneles al panelExterno con nombres únicos
        panelExterno.add(panelVacio, "vacio");  // Añadir el panel vacío
        panelExterno.add(habitacionPanel,"tipoHabitacion");
        panelExterno.add(numerohabPanel,"numeroHabitacion");
        panelExterno.add(fechasPanel,"fechasHabitacion");
        
        cardlayout.show(panelExterno, "vacio");
        tipoHabButton.addActionListener(e -> cardlayout.show(panelExterno, "tipoHabitacion"));
        numeroHabButton.addActionListener(e -> cardlayout.show(panelExterno, "numeroHabitacion"));
        fechasButton.addActionListener(e -> cardlayout.show(panelExterno, "fechasHabitacion"));
        
        
    }
    public void actualizarTablaPorFechas(String fechaInicio, String fechaFin) throws SQLException {
        DefaultTableModel modeloTabla = (DefaultTableModel) habitacionesTable.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla actual

        HabitacionDAO habitaciones = new HabitacionDAO();
        ResultSet resultadosConsulta = habitaciones.obtenerHabitacionesDisponiblesFechas(fechaInicio, fechaFin);

        while (resultadosConsulta.next()) {
            int id = resultadosConsulta.getInt("Id_habitacion");
            String numeroHabitacion = resultadosConsulta.getString("Numero_habitacion");
            String tipoHabitacion = resultadosConsulta.getString("Tipo_habitacion");
            int capacidad = resultadosConsulta.getInt("Capacidad");
            double tarifa = resultadosConsulta.getDouble("Tarifa_habitacion");
            String estadoHabitacion = resultadosConsulta.getString("Estado_habitacion");
            String detallesHabitacion = resultadosConsulta.getString("Detalles_habitacion");

            modeloTabla.addRow(new Object[]{id, numeroHabitacion, tipoHabitacion, capacidad, tarifa, estadoHabitacion, detallesHabitacion});
        }

    }

    public void actualizarTablaPorNumero(String numeroHab) throws SQLException {
        DefaultTableModel modeloTabla = (DefaultTableModel) habitacionesTable.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla actual

        HabitacionDAO habitaciones = new HabitacionDAO();
        ResultSet resultadosConsulta = habitaciones.habitacionesDisponiblesNumeroHab(numeroHab);
        while (resultadosConsulta.next()) {
            int id = resultadosConsulta.getInt("Id_habitacion");
            String numeroHabitacion = resultadosConsulta.getString("Numero_habitacion");
            String tipoHabitacion = resultadosConsulta.getString("Tipo_habitacion");
            int capacidad = resultadosConsulta.getInt("Capacidad");
            double tarifa = resultadosConsulta.getDouble("Tarifa_habitacion");
            String estadoHabitacion = resultadosConsulta.getString("Estado_habitacion");
            String detallesHabitacion = resultadosConsulta.getString("Detalles_habitacion");
            

            modeloTabla.addRow(new Object[]{id, numeroHabitacion, tipoHabitacion, capacidad, tarifa, estadoHabitacion, detallesHabitacion});
        }

    }
    public void actualizarTablaPorTipo(String tipoHab) throws SQLException {
        DefaultTableModel modeloTabla = (DefaultTableModel) habitacionesTable.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla actual

        HabitacionDAO habitaciones = new HabitacionDAO();
        ResultSet resultadosConsulta = habitaciones.habitacionesDisponiblesTipo(tipoHab);
        while (resultadosConsulta.next()) {
            int id = resultadosConsulta.getInt("Id_habitacion");
            String numeroHabitacion = resultadosConsulta.getString("Numero_habitacion");
            String tipoHabitacion = resultadosConsulta.getString("Tipo_habitacion");
            int capacidad = resultadosConsulta.getInt("Capacidad");
            double tarifa = resultadosConsulta.getDouble("Tarifa_habitacion");
            String estadoHabitacion = resultadosConsulta.getString("Estado_habitacion");
            String detallesHabitacion = resultadosConsulta.getString("Detalles_habitacion");
            

            modeloTabla.addRow(new Object[]{id, numeroHabitacion, tipoHabitacion, capacidad, tarifa, estadoHabitacion, detallesHabitacion});
        }

    }

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
            java.util.logging.Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HABITACIONESDISPONIBILIDAD().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HABITACIONESDISPONIBILIDAD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private CardLayout cardlayout;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton fechasButton;
    private javax.swing.JTable habitacionesTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton numeroHabButton;
    private javax.swing.JPanel panelExterno;
    private javax.swing.JButton tipoHabButton;
    // End of variables declaration//GEN-END:variables
}
