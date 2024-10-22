package conexion;



import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoDAO {
    private Connection conexion;
    
    public EmpleadoDAO() throws SQLException{
        this.conexion=ConexionBaseDatos.getConexion();
    }
    public ResultSet buscarEmpleadoPorId(int id) throws SQLException {
        String query = "SELECT * FROM hotel.empleados WHERE id_empleado = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id);
        return statement.executeQuery();
    }
    public void crearEmpleado(String nombre,String apellido, String numero, String password, String correo,String fechaContratacion) throws SQLException{
        String query = "INSERT INTO hotel.empleados (Nombre,Apellido,Rol,Numero_telefono,Contrasena,Correo,Fecha_contratacion Values (?,?,?,?,?,?.?)";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, numero);
        statement.setString(4, password);
        statement.setString(5, correo);
        statement.setString(6, fechaContratacion);
        statement.executeQuery();
    }
    public void eliminarEmpleadoPorId(int idEmpleado) throws SQLException {
        String query = "Delete from hotel.empelados WHERE Id_empleado = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, idEmpleado);
        statement.executeQuery();
    }
}
