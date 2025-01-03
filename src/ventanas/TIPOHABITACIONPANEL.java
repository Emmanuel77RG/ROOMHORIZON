/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import conexion.HabitacionDAO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omara
 */
public class TIPOHABITACIONPANEL extends javax.swing.JPanel {

    private HABITACIONESDISPONIBILIDAD actualizarTabla;
    /**
     * Creates new form TIPOHABITACIONPANEL
     */
    public TIPOHABITACIONPANEL(HABITACIONESDISPONIBILIDAD actualizarTABLA) throws SQLException {
        this.actualizarTabla=actualizarTABLA;
        initComponents();
        configurarOpciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buscarTipoHabButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(190, 186, 176));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        jLabel1.setText("Tipo de habitacion");

        buscarTipoHabButton.setText("Buscar");
        buscarTipoHabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTipoHabButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, 0, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscarTipoHabButton)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTipoHabButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarTipoHabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTipoHabButtonActionPerformed
        try {
            // TODO add your handling code here:
            actualizarTabla.actualizarTablaPorTipo((String)jComboBox1.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(TIPOHABITACIONPANEL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarTipoHabButtonActionPerformed


    private void configurarOpciones() throws SQLException{
        HabitacionDAO habitacionesTipo=new HabitacionDAO();
        ResultSet resultados;
        resultados=habitacionesTipo.obtenerTiposHabitacion();
        while(resultados.next()){
            String tipo=resultados.getString("Tipo_habitacion");
            jComboBox1.addItem(tipo);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarTipoHabButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
