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
    
    private int codigo;
    private String modelo;
    private String color;
    private int asiento;
    
    //clases 
    private Conductor cond;

    public Vehiculo() {
    }

    public Vehiculo(int codigo, String modelo, String color, int asiento, Conductor cond) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.color = color;
        this.asiento = asiento;
        this.cond = cond;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
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
