/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.Date;

/**
 *
 * @author Domenica Cañizares
 */
public class Boleto {
    
    private String codigo;
    private Date fecha_compra;
    private boolean estado;
    private double valor;
    private int cantidad;

    public Boleto() {
    }

    public Boleto(String codigo, Date fecha_compra, boolean estado, double valor, int cantidad) {
        this.codigo = codigo;
        this.fecha_compra = fecha_compra;
        this.estado = estado;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
}
