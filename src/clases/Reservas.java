/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author omara
 */
public class Reservas {
    private Habitacion habitacion;
    private Cliente cliente;
    private Empleado empleado;
    private int idReserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String estadoReserva;
    private LocalDateTime fechaModificacion;
    private int cantidadPersonas;
    private String notas;
    private ArrayList<Reservas> listaReservas;

    public Reservas(Habitacion habitacion, Cliente cliente, Empleado empleado, Date fechaEntrada, Date fechaSalida, String estadoReserva, int cantidadPersonas, String notas) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.notas = notas;
        listaReservas=new ArrayList<>();

    }

    public Reservas(Habitacion habitacion, Cliente cliente, Empleado empleado, int idReserva, Date fechaEntrada, Date fechaSalida, String estadoReserva, int cantidadPersonas, String notas) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.notas = notas;

    }

    public Reservas(Habitacion habitacion, Cliente cliente, Empleado empleado, int idReserva, Date fechaEntrada, Date fechaSalida, int cantidadPersonas, String notas) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.notas = notas;
        listaReservas=new ArrayList<>();

    }
    public Reservas(){

    }
    

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void setListaReservas(ArrayList<Reservas> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }
    public void agregarAlReservasManager() {
        ReservasManager.getInstance().addReserva(this);
    }
    
}
