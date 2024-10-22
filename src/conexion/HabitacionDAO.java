/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocioLogica;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omara
 */
public class HabitacionDAO {
    private Connection conectionDB;
    
    public HabitacionDAO(){
        try {
            this.conectionDB=ConexionBaseDatos.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void crearHabitacion(String numeroHabitacion,String tipoHabitacion,int capcidad,double tarifa,String estadoHabitacion,String detallesHabitacion){
        String query = "Insert Into hotel.habitaciones(Numero_habitacion,Tipo_habitacion,Capacidad,Tarifa_habitacion,Estado_habitacion,Detalles_habitacion)Values(?,?,?,?,?,?)";
        try {
            PreparedStatement statement=conectionDB.prepareStatement(query);
            statement.setString(1, numeroHabitacion);
            statement.setString(2, tipoHabitacion);
            statement.setInt(3, capcidad);
            statement.setDouble(4, tarifa);
            statement.setString(5, estadoHabitacion);
            statement.setString(6, detallesHabitacion);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modificarHabitacion(int idHabitacion){
        String query=("Delete from hotel.habitaciones where Id_habitacion=?");
    }
    
    public void eliminarHabitacion(int idHabitacion){
        String query=("Delete from hotel.habitaciones where Id_habitacion=?");
        try {
            PreparedStatement statement=conectionDB.prepareStatement(query);
            statement.setInt(1, idHabitacion);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
