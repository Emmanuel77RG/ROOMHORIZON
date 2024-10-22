package negocioLogica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class ConexionBaseDatos {
    private static Connection coneccionDB;
    
    public static Connection getConexion()throws SQLException{
        if(coneccionDB==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/hotel";
                String usuario="root";
                String password="";
                coneccionDB=DriverManager.getConnection(url, usuario, password);
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return coneccionDB;
    }
}
