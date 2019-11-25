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
public class Conductor extends Persona{
    
   // private int codigo;
    private Double sueldo;
    private String descripcion;
    private Date fecha_contrato;

    public Conductor() {
    }

    public Conductor(/*int codigo,*/ Double sueldo, String descripcion, Date fecha_contrato) {
        //this.codigo = codigo;
        this.sueldo = sueldo;
        this.descripcion = descripcion;
        this.fecha_contrato = fecha_contrato;
    }

   /* public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }*/
    
    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    @Override
    public String toString() {
        return "Conductor{" + /*"codigo=" + codigo +*/ ", sueldo=" + sueldo + ", descripcion=" + descripcion + ", fecha_contrato=" + fecha_contrato + '}';
    }

}
