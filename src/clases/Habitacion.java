/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omara
 */
public class Habitacion {
    // Atributos correspondientes a las columnas de la tabla SQL
    private int idHabitacion;
    private String numeroHabitacion;
    private String tipoHabitacion;
    private int capacidad;
    private double tarifaHabitacion;
    private String estadoHabitacion;
    private String detallesHabitacion;

    

    // Constructor con todos los atributos
    public Habitacion(int idHabitacion, String numeroHabitacion, String tipoHabitacion, int capacidad, double tarifaHabitacion, String estadoHabitacion, String detallesHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.capacidad = capacidad;
        this.tarifaHabitacion = tarifaHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.detallesHabitacion = detallesHabitacion;
    }

    public Habitacion(int idHabitacion, String numeroHabitacion, String tipoHabitacion, double tarifaHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.tarifaHabitacion = tarifaHabitacion;
    }

    public Habitacion(int idHabitacion, String numeroHabitacion, String tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    

    // Getters y Setters
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getTarifaHabitacion() {
        return tarifaHabitacion;
    }

    public void setTarifaHabitacion(double tarifaHabitacion) {
        this.tarifaHabitacion = tarifaHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public String getDetallesHabitacion() {
        return detallesHabitacion;
    }

    public void setDetallesHabitacion(String detallesHabitacion) {
        this.detallesHabitacion = detallesHabitacion;
    }

}
