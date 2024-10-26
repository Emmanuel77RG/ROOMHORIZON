/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conexion;
    
    public ClienteDAO() throws SQLException{
        this.conexion=ConexionBaseDatos.getConexion();
    }
   
    public void crearCliente(String nombre,String apellido, String numero, String correo) throws SQLException{
        String query = "INSERT INTO hotel.clientes (Nombre,Apellido,Correo, Numero)  Values (?,?,?,?)";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, numero);
        statement.setString(4, correo);
        statement.executeUpdate();
    }
    public ResultSet obtenerClientes() throws SQLException{
        String query = "Select * from hotel.clientes";
        PreparedStatement statement = conexion.prepareStatement(query);
        return statement.executeQuery();
        
    }
}