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
public class Notificacion {
    
    private int codigo;
    private String titulo;
    private String descripcion;
    private Date faecha;
    private boolean estado;

    public Notificacion() {
    }

    public Notificacion(int codigo, String titulo, String descripcion, Date faecha, boolean estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.faecha = faecha;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFaecha() {
        return faecha;
    }

    public void setFaecha(Date faecha) {
        this.faecha = faecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Notificacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", descripcion=" + descripcion + ", faecha=" + faecha + ", estado=" + estado + '}';
    }
    
}
