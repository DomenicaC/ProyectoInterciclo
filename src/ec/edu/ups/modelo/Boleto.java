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
public class Boleto {

    private int codigo;
    private Date fecha_compra;
    private double valor;

    public Boleto() {
    }

    public Boleto(int codigo, Date fecha_compra, double valor) {
        this.codigo = codigo;
        this.fecha_compra = fecha_compra;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Boleto{" + "codigo=" + codigo + ", fecha_compra=" + fecha_compra + ", valor=" + valor + '}';
    }

}
