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
public class Ruta {
    
    private int codigo;
    private String calle_prin;
    private String calle_sec;
    private int numero;
    private String descripcion;
    private Byte Mapa;
    
    //clases
    private Geografia geo;

    public Ruta() {
    }

    public Ruta(int codigo, String calle_prin, String calle_sec, int numero, String descripcion, Byte Mapa, Geografia geo) {
        this.codigo = codigo;
        this.calle_prin = calle_prin;
        this.calle_sec = calle_sec;
        this.numero = numero;
        this.descripcion = descripcion;
        this.Mapa = Mapa;
        this.geo = geo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCalle_prin() {
        return calle_prin;
    }

    public void setCalle_prin(String calle_prin) {
        this.calle_prin = calle_prin;
    }

    public String getCalle_sec() {
        return calle_sec;
    }

    public void setCalle_sec(String calle_sec) {
        this.calle_sec = calle_sec;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Byte getMapa() {
        return Mapa;
    }

    public void setMapa(Byte Mapa) {
        this.Mapa = Mapa;
    }

    public Geografia getGeo() {
        return geo;
    }

    public void setGeo(Geografia geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Ruta{" + "codigo=" + codigo + ", calle_prin=" + calle_prin + ", calle_sec=" + calle_sec + ", numero=" + numero + ", descripcion=" + descripcion + ", Mapa=" + Mapa + ", geo=" + geo + '}';
    }
    
}
