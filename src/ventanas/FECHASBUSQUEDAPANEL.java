/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author omara
 */
public class FECHASBUSQUEDAPANEL extends javax.swing.JPanel {

    private HABITACIONESDISPONIBILIDAD actualizarTabla;
    /**
     * Creates new form FECHASBUSQUEDAPANEL
     */
    public FECHASBUSQUEDAPANEL(HABITACIONESDISPONIBILIDAD actualizarTABLA) {
        this.actualizarTabla=actualizarTABLA;
        initComponents();
        crearComponentesExtra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarFechasButton = new javax.swing.JButton();
        panelFecha1 = new javax.swing.JPanel();
        panelFecha2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(190, 186, 176));

        jLabel1.setText("Fecha de inicio:");

        jLabel3.setText("Fecha de fin:");

        buscarFechasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (1).png"))); // NOI18N
        buscarFechasButton.setText("Buscar");
        buscarFechasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFechasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFecha1Layout = new javax.swing.GroupLayout(panelFecha1);
        panelFecha1.setLayout(panelFecha1Layout);
        panelFecha1Layout.setHorizontalGroup(
            panelFecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFecha1Layout.setVerticalGroup(
            panelFecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFecha2Layout = new javax.swing.GroupLayout(panelFecha2);
        panelFecha2.setLayout(panelFecha2Layout);
        panelFecha2Layout.setHorizontalGroup(
            panelFecha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        panelFecha2Layout.setVerticalGroup(
            panelFecha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(buscarFechasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscarFechasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void crearComponentesExtra() {
        // Calendario para panelFecha1 (Fecha de inicio)
        calendario1 = new JDateChooser();
        calendario1.setVisible(true);
        panelFecha1.setLayout(new java.awt.GridLayout(1, 1));
        panelFecha1.add(calendario1);
        panelFecha1.revalidate();
        panelFecha1.repaint();

        // Calendario para panelFecha2 (Fecha de fin)
        calendario2 = new JDateChooser();
        calendario2.setVisible(true);
        panelFecha2.setLayout(new java.awt.GridLayout(1, 1));
        panelFecha2.add(calendario2);
        panelFecha2.revalidate();
        panelFecha2.repaint();

        // Escuchar cambios de fecha en ambos calendarios
        calendario1.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaSeleccionada1 = calendario1.getDate();
                
            }
        });

        calendario2.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaSeleccionada2 = calendario2.getDate();
                
            }
        });
    }

    private void buscarFechasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFechasButtonActionPerformed
        // TODO add your handling code here:
        if (fechaSeleccionada1 != null && fechaSeleccionada2 != null) {
            SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");
            String fechaInicioStr = formatoMySQL.format(fechaSeleccionada1);
            String fechaFinStr = formatoMySQL.format(fechaSeleccionada2);

            // Llamar a un método en HABITACIONESDISPONIBILIDAD para actualizar la tabla

            try {
                actualizarTabla.actualizarTablaPorFechas(fechaInicioStr, fechaFinStr);

            } catch (SQLException ex) {
                Logger.getLogger(FECHASBUSQUEDAPANEL.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione ambas fechas.");
    }

    }//GEN-LAST:event_buscarFechasButtonActionPerformed

    private Date fechaSeleccionada2;
    private Date fechaSeleccionada1;
    private JDateChooser calendario1;
    private JDateChooser calendario2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarFechasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelFecha1;
    private javax.swing.JPanel panelFecha2;
    // End of variables declaration//GEN-END:variables
}
