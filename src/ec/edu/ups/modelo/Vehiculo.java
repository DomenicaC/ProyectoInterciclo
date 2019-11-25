/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Domenica Cañizares
 */
public class Vehiculo {
    
    private String codigo;
    private String modelo;
    private String color;
    private String asiento;
    
    //clases 
    private Conductor cond;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, String modelo, String color, String asiento, Conductor cond) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.color = color;
        this.asiento = asiento;
        this.cond = cond;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Conductor getCond() {
        return cond;
    }

    public void setCond(Conductor cond) {
        this.cond = cond;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", modelo=" + modelo + ", color=" + color + ", asiento=" + asiento + ", cond=" + cond + '}';
    }
    
}
