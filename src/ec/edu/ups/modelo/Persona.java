/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private Date FechaNac;
    
    public Persona(){
        
    }

    public Persona(String cedula, String nombre, String apellido, Date FechaNac) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNac = FechaNac;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + " cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaNac=" + FechaNac + '}';
    }

}
