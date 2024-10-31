/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Empleado;
import conexion.EmpleadoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;



public class INCIARREP extends javax.swing.JFrame {

    public INCIARREP() {
        initComponents();
        setSize(1038, 597); //tamaño de la interfaz
        setResizable(false);
        setLocationRelativeTo(null);

        this.OCULTAR.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    public Image getIconImage (){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("C:\\Users\\HP\\Pictures\\UNI NAD\\QUINTO SEMESTRE\\ANALISIS Y DISEÑO\\LOGO3.png"));
        return retValue;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtcorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcon = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();
        VER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 104, 215, 40));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel3.setText("CLICK HASTA EL ULTIMO HUESPED\" ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 68, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 171, -1, -1));
        jPanel2.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 165, 215, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CORREO  ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 113, -1, -1));

        entrar.setText("INGRESAR");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel2.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 210, 40));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel7.setText("\"FACILITANDO CADA RESERVA DESDE EL PRIMER");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 14, -1, 48));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar-ojo.png"))); // NOI18N
        OCULTAR.setText("jLabel9");
        OCULTAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OCULTAR.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });
        jPanel2.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 40, 30));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/leer.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        jPanel2.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 26));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 460, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2024-10-19 at 6.12.39 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String password = txtcon.getText();
        String correo = txtcorreo.getText();

        try {
            consultaEmpleado = new EmpleadoDAO();
            empleado = consultaEmpleado.buscarEmpleadoBase(correo, password);
            if (empleado != null) {
                // Iniciar la sesión con el objeto Empleado
                new PRINCIPAL(empleado).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de conexión", "Error", JOptionPane.ERROR_MESSAGE);

        }
       
    }//GEN-LAST:event_entrarActionPerformed

    private void OCULTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMouseClicked
        VER.setVisible(true);
        OCULTAR.setVisible(false);
        txtcon.setEchoChar('●');

    }//GEN-LAST:event_OCULTARMouseClicked

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        VER.setVisible(false);
        OCULTAR.setVisible(true);
        txtcon.setEchoChar((char)0);

    }//GEN-LAST:event_VERMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        int a =JOptionPane.YES_NO_OPTION;
        int resultado=JOptionPane.showConfirmDialog(this,"¿ DESEA SALIR ?","SALIR",a);
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_cerrarMouseClicked


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
            java.util.logging.Logger.getLogger(INCIARREP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INCIARREP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INCIARREP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INCIARREP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INCIARREP().setVisible(true);
            }
        });
    }

    private EmpleadoDAO consultaEmpleado;
    private Empleado empleado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JLabel VER;
    private javax.swing.JLabel cerrar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtcon;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
