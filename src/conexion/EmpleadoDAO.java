package conexion;



import clases.Empleado;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    public void crearEmpleado(String nombre, String apellido, String numero, String password, String correo, String fechaContratacion, String rol) throws SQLException {
        String query = "INSERT INTO hotel.empleados (Nombre, Apellido, Numero, Contrasena, Correo, Fecha_contratacion, Rol) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, numero);
        statement.setString(4, password);
        statement.setString(5, correo);
        statement.setString(6, fechaContratacion);
        statement.setString(7, rol);
        statement.executeUpdate();
    }
    public ArrayList<Empleado> obtenerEmpleados() throws SQLException{
        String query = "Select * from hotel.empleados";
        PreparedStatement statement = conexion.prepareStatement(query);
        ResultSet resultados;
        resultados=statement.executeQuery();
         ArrayList<Empleado> listaEmpleados = new ArrayList<>();
         while (resultados.next()) {
            int idEmpleado = resultados.getInt("Id_empleado");
            String nombre = resultados.getString("Nombre");
            String apellido = resultados.getString("Apellido");
            String rol = resultados.getString("Rol");
            String numero = resultados.getString("Numero");
            String contrasena = resultados.getString("Contrasena");
            String correo = resultados.getString("Correo");
            Date fechaContratacion = resultados.getDate("Fecha_contratacion");
            //int id_empleado, String nombre, String apellido, String correo, String passwrod,String numero, Date fechaContratacion, String rol)
            Empleado empleado = new Empleado(idEmpleado, nombre, apellido, correo, contrasena, numero, fechaContratacion, rol);
            listaEmpleados.add(empleado);
        }

        return listaEmpleados;
    }
    public void eliminarEmpleadoPorId(int idEmpleado) throws SQLException {
        String query = "Delete from hotel.empleados WHERE Id_empleado = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, idEmpleado);
        statement.executeUpdate();
    }
    
    public void modificarDatosEmpleado(int idEmpleado, String nombre,String apellido,String rol,String password,String correo,String numeroTel) throws SQLException{
        String query ="Update hotel.empleados set Nombre=?,Apellido=?,Rol=?,Contrasena=?,Correo=?,Numero=? where Id_empleado=?";
        PreparedStatement statement =conexion.prepareStatement(query);
        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, rol);
        statement.setString(4, password);
        statement.setString(5, correo);
        statement.setString(6, numeroTel);
        statement.setInt(7, idEmpleado);
        statement.executeUpdate();
    }
    public Empleado buscarEmpleadoBase(String correo,String password) throws SQLException {
        Empleado empleado=null;
        String query = "SELECT * FROM hotel.empleados WHERE Correo=? and Contrasena=?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setString(1, correo);
        statement.setString(2, password);
        ResultSet resultado;
        resultado= statement.executeQuery();
        if(resultado.next()){
            empleado=new Empleado(resultado.getInt("Id_empleado"),resultado.getString("Nombre"),resultado.getString("Apellido"),resultado.getString("Rol"),
            resultado.getString("Correo"),resultado.getString("Contrasena"),resultado.getString("Numero"));
        }
        return empleado;
    }
    public int buscarIdEmpleadoBase(String correo,String password) throws SQLException {
        int idEmpleado=0;
        String query = "SELECT Id_empleado FROM hotel.empleados WHERE Correo=? and Contrasena=? limit 1";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setString(1, correo);
        statement.setString(2, password);
        ResultSet resultado;
        resultado= statement.executeQuery();
        while(resultado.next()){
            idEmpleado=resultado.getInt("Id_empleado");
            
        }
        return idEmpleado;
    }
}
