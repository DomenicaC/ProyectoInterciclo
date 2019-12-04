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

public class Viaje {
    
    private int codigo;
    private Date fecha_salida;
    private Date fecha_retorno;
    
    //clases 
    private Vehiculo vehi;
    private Ruta ruta;

    public Viaje() {
    }

    public Viaje(int codigo, Date fecha_salida, Date fecha_retorno, Vehiculo vehi, Ruta ruta) {
        this.codigo = codigo;
        this.fecha_salida = fecha_salida;
        this.fecha_retorno = fecha_retorno;
        this.vehi = vehi;
        this.ruta = ruta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_retorno() {
        return fecha_retorno;
    }

    public void setFecha_retorno(Date fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }

    public Vehiculo getVehi() {
        return vehi;
    }

    public void setVehi(Vehiculo vehi) {
        this.vehi = vehi;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", fecha_salida=" + fecha_salida + ", fecha_retorno=" + fecha_retorno + ", vehi=" + vehi + ", ruta=" + ruta + '}';
    }
    
}
