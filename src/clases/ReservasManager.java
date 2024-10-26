/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omara
 */
import java.util.ArrayList;

public class ReservasManager {
    private static ReservasManager instance;
    private ArrayList<Reservas> listaReservas;

    // Constructor privado para evitar instancias desde fuera
    private ReservasManager() {
        listaReservas = new ArrayList<>();
    }

    // Método para obtener la única instancia de ReservasManager
    public static ReservasManager getInstance() {
        if (instance == null) {
            instance = new ReservasManager();
        }
        return instance;
    }

    // Métodos para manejar la lista de reservas
    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reservas> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void addReserva(Reservas reserva) {
        this.listaReservas.add(reserva);
    }

    public Reservas buscarReserva(int idRes,String nombre, String apellido, String numeroHab) {
        for (Reservas res : listaReservas) {
            if (idRes==res.getIdReserva() && nombre.equalsIgnoreCase(res.getCliente().getNombre()) &&
                apellido.equalsIgnoreCase(res.getCliente().getApellido()) &&
                numeroHab.equalsIgnoreCase(res.getHabitacion().getNumeroHabitacion())) {
                return res;
            }
        }
        return null;
    }
}
