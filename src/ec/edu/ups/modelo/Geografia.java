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
public class Geografia {
    
    private String codigo;
    private String nombre;
    
    //clase
    private Tipo_Geografia tipGeo;

    public Geografia() {
    }

    public Geografia(String codigo, String nombre, Tipo_Geografia tipGeo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipGeo = tipGeo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_Geografia getTipGeo() {
        return tipGeo;
    }

    public void setTipGeo(Tipo_Geografia tipGeo) {
        this.tipGeo = tipGeo;
    }

    @Override
    public String toString() {
        return "Geografia{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipGeo=" + tipGeo + '}';
    }

    
}
