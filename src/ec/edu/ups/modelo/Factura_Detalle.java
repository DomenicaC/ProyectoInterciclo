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
public class Factura_Detalle {
 
    private int codigo;
    private int cantidad;
    private int totalCP;

    //clase
    private Boleto boleto;

    public Factura_Detalle() {
    }

    public Factura_Detalle(int codigo, int cantidad, int totalCP, Boleto boleto) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.totalCP = totalCP;
        this.boleto = boleto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotalCP() {
        return totalCP;
    }

    public void setTotalCP(int totalCP) {
        this.totalCP = totalCP;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    @Override
    public String toString() {
        return "Factura_Detalle{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", totalCP=" + totalCP + ", boleto=" + boleto + '}';
    }
    
}
