/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import clases.Cliente;
import clases.Empleado;
import clases.Habitacion;
import clases.Reservas;
import clases.ReservasManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author omara
 */
public class ReservasDAO {
    private Connection conexion;
    
    public ReservasDAO() throws SQLException{
        this.conexion=ConexionBaseDatos.getConexion();
    }

    public void crearReservaDB(int id_cliente, int id_empleado, String fechaEntrada, String fechaSalida,String estadoReserva) throws SQLException {
        String query = "INSERT INTO hotel.reservas (Id_cliente, Id_empleado, Fecha_entrada, Fecha_salida,Estado_reserva)\n"
                + "VALUES (?, ?, ?, ?, ?);";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id_cliente);
        statement.setInt(2, id_empleado);
        statement.setString(3, fechaEntrada);
        statement.setString(4, fechaSalida);
        statement.setString(5, estadoReserva);
        statement.executeUpdate();
        
        
    }
    public void crearReservaDetallesReserva(int id_reserva, int id_habitacion, int numPersonas, String notasReserva) throws SQLException {
        String query = "INSERT INTO hotel.detalles_reserva (Id_reserva, Id_habitacion, Numero_personas,Notas)\n"
                + "VALUES (?, ?, ?, ?);";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id_reserva);
        statement.setInt(2, id_habitacion);
        statement.setInt(3, numPersonas);
        statement.setString(4, notasReserva);
        statement.executeUpdate();
    }
    public void actualizarHabitacion(int id_habitacion) throws SQLException{
        String query= "Update hotel.habitaciones set Estado_habitacion='Ocupada' where Id_habitacion=?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id_habitacion);
        statement.executeUpdate();
    }

    public int obtenerReservaCliente(int id_cliente) throws SQLException {
        int idcliente = 0;
        String query = "SELECT Id_reserva\n"
                + "FROM hotel.Reservas\n"
                + "WHERE Id_cliente = ? \n"
                + "ORDER BY Fecha_creacion_reserva DESC\n"
                + "LIMIT 1;";
        PreparedStatement statement = conexion.prepareCall(query);
        statement.setInt(1, id_cliente);
        ResultSet resul = statement.executeQuery();
        while(resul.next()){
            idcliente=resul.getInt("Id_reserva");
        }
        return idcliente;
    }

    public ArrayList<Reservas> obtenerReservas(Empleado empleado) throws SQLException {
        ArrayList<Reservas> reservasDB = new ArrayList<>();
        Reservas reservaListar = new Reservas();
        String query = "SELECT c.Id_cliente, c.Nombre, c.Apellido, c.Correo, c.Numero,\n"
                + "       r.Id_reserva, r.Fecha_entrada, r.Fecha_salida, r.Estado_reserva, dr.Numero_personas, dr.Notas,\n"
                + "       h.Id_habitacion, h.Numero_habitacion, h.Tipo_habitacion, h.Tarifa_habitacion\n"
                + "FROM hotel.Clientes c\n"
                + "INNER JOIN hotel.Reservas r ON c.Id_cliente = r.Id_cliente\n"
                + "INNER JOIN hotel.Detalles_reserva dr ON r.Id_reserva = dr.Id_reserva\n"
                + "INNER JOIN hotel.Habitaciones h ON dr.Id_habitacion = h.Id_habitacion ";
                //+ "Where r.Estado_reserva='Confirmada'";
        PreparedStatement statemnet = conexion.prepareStatement(query);
        ResultSet resultados=statemnet.executeQuery();
        while(resultados.next()){
            Cliente cliente = new Cliente(resultados.getInt("Id_cliente"),resultados.getString("Nombre"),resultados.getString("Apellido"),resultados.getString("Correo"),resultados.getString("Numero"));
            Habitacion habitacion=new Habitacion(resultados.getInt("Id_habitacion"),resultados.getString("Numero_habitacion"),resultados.getString("Tipo_habitacion"), resultados.getDouble("Tarifa_habitacion"));
            Reservas reserva=new Reservas(habitacion,cliente,empleado,resultados.getInt("Id_reserva"),resultados.getDate("Fecha_entrada"),resultados.getDate("Fecha_salida"),resultados.getString("Estado_reserva"),resultados.getInt("Numero_personas"),resultados.getString("Notas"));
            reservasDB.add(reserva);
        }
        ReservasManager.getInstance().setListaReservas(reservasDB);
        return reservasDB;
    }
    public void modificarReservas(int idReserva,int Id_empleado,String estadoRes,String fechaIni,String fechaFin,String fechaHoraActual) throws SQLException{
        String query="Update hotel.reservas set Estado_reserva=?,Id_empleado=?,Fecha_entrada=?, Fecha_salida=?,Fecha_modificacion=? where Id_reserva=?";
        PreparedStatement statement=conexion.prepareStatement(query);
        statement.setString(1, estadoRes);
        statement.setInt(2,Id_empleado);
        statement.setString(3, fechaIni);
        statement.setString(4, fechaFin);
        statement.setString(5, fechaHoraActual);
        statement.setInt(6, idReserva);
        statement.executeUpdate();
    }
    public void modificarReservaConCambioDeHabitacion(int idReserva, int Id_habitacion, int nuevoIdHabitacion, int numeroPer, String notas) throws SQLException {
        // Modificación en la tabla detalles_reservas
        String queryDetalle = "UPDATE hotel.Detalles_reserva SET Numero_personas = ?, Notas = ?, Id_habitacion = ? WHERE Id_reserva = ? AND Id_habitacion = ?";
        try (PreparedStatement statementDetalle = conexion.prepareStatement(queryDetalle)) {
            statementDetalle.setInt(1, numeroPer);
            statementDetalle.setString(2, notas);
            statementDetalle.setInt(3, nuevoIdHabitacion);
            statementDetalle.setInt(4, idReserva);
            statementDetalle.setInt(5, Id_habitacion);
            statementDetalle.executeUpdate();
        }

        // Modificación en el estado de las habitaciones
        String queryEstado = "UPDATE hotel.Habitaciones SET Estado_habitacion = CASE "
                + "WHEN Id_habitacion = ? THEN 'Disponible' "
                + "WHEN Id_habitacion = ? THEN 'Ocupada' "
                + "END "
                + "WHERE Id_habitacion IN (?, ?)";
        try (PreparedStatement statementEstado = conexion.prepareStatement(queryEstado)) {
            statementEstado.setInt(1, Id_habitacion);         // Cambiar habitación original a "Disponible"
            statementEstado.setInt(2, nuevoIdHabitacion);     // Cambiar nueva habitación a "Ocupada"
            statementEstado.setInt(3, Id_habitacion);
            statementEstado.setInt(4, nuevoIdHabitacion);
            statementEstado.executeUpdate();
        }
    }
    public void modificarReservaSinCambioDeHabitacion(int idReserva, int idHabitacion, int numeroPer, String notas) throws SQLException {
    // Modificación en la tabla detalles_reservas sin cambiar el ID de habitación
    String queryDetalle = "UPDATE hotel.Detalles_reserva SET Numero_personas = ?, Notas = ? WHERE Id_reserva = ? AND Id_habitacion = ?";
    try (PreparedStatement statementDetalle = conexion.prepareStatement(queryDetalle)) {
        statementDetalle.setInt(1, numeroPer);
        statementDetalle.setString(2, notas);
        statementDetalle.setInt(3, idReserva);
        statementDetalle.setInt(4, idHabitacion);
        statementDetalle.executeUpdate();
    }
}
    
    public void cancelarReserva(int Id_habitacion, int Id_reserva, int Id_cliente, int Id_empleado) throws SQLException {
        // Consulta para actualizar el estado de la reserva a 'Cancelada'
        String queryReserva = "UPDATE hotel.reservas SET Estado_reserva='Cancelada', Id_empleado=? WHERE Id_reserva=? AND Id_cliente=?";
        PreparedStatement statementReserva = conexion.prepareStatement(queryReserva);
        statementReserva.setInt(1, Id_empleado);       // Asignar Id_empleado
        statementReserva.setInt(2, Id_reserva);       // Asignar Id_reserva
        statementReserva.setInt(3, Id_cliente);       // Asignar Id_cliente
        statementReserva.executeUpdate();             // Ejecutar la consulta para cancelar la reserva

        // Consulta para actualizar el estado de la habitación a 'Disponible'
        String queryEstado = "UPDATE hotel.Habitaciones SET Estado_habitacion='Disponible' WHERE Id_habitacion=?";
        PreparedStatement statementHabitacion = conexion.prepareStatement(queryEstado);
        statementHabitacion.setInt(1, Id_habitacion); // Asignar Id_habitacion
        statementHabitacion.executeUpdate();          // Ejecutar la consulta para actualizar el estado de la habitación
    }

}
