/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author omara
 */
public class Empleado {
    private int id_empleado;
    private String nombre;
    private String apellido;
    private String rol;
    private String password;
    private Date fechaContratacion;
    private String numeroTelefono;
    private String correo;

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public Empleado(int id_empleado, String nombre, String apellido, String correo, String passwrod,String numero, Date fechaContratacion, String rol) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password=passwrod;
        this.numeroTelefono = numero;
        this.fechaContratacion = fechaContratacion;
        this.rol = rol;
    }

    public Empleado(int id_empleado, String nombre, String apellido, String rol, String correo,String password,String numero) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.correo=correo;
        this.password = password;
        this.numeroTelefono=numero;
    }

    public Empleado(int id_empleado, String nombre, String apellido) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }
    
//    public Empleado obtenerEmpleadoBuscado(ArrayList<Empleado> listaEmpleados){
//        for(Empleado emp: listaEmpleados){
//            if(emp.nombre==)
//        }
//    }
    
    
}
