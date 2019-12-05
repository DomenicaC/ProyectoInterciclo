/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class Factura_Cabecera {
    
    private int ruc;
    private Date fecha;
    private double Subtotal;
    private double iva;
    private double total;
    private List<Factura_Detalle> detalle;
    
    //clases 
    private Persona per;
    private Factura_Detalle facDet;
    private Modo_Pago modPago;
    private Viaje viaje;

    public Factura_Cabecera() {
    }

    public Factura_Cabecera(int ruc, Date fecha, double Subtotal, double iva, double total, Persona per, Factura_Detalle facDet, Modo_Pago modPago, Viaje viaje) {
        this.ruc = ruc;
        this.fecha = fecha;
        this.Subtotal = Subtotal;
        this.iva = iva;
        this.total = total;
        this.per = per;
        this.facDet = facDet;
        this.modPago = modPago;
        this.viaje = viaje;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public Factura_Detalle getFacDet() {
        return facDet;
    }

    public void setFacDet(Factura_Detalle facDet) {
        this.facDet = facDet;
    }

    public Modo_Pago getModPago() {
        return modPago;
    }

    public void setModPago(Modo_Pago modPago) {
        this.modPago = modPago;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public List<Factura_Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Factura_Detalle> detalle) {
        this.detalle = detalle;
    }
    
    public void añadirFacDetalle(Factura_Detalle facturaDetalle){
        detalle.add(facturaDetalle);
    }

    @Override
    public String toString() {
        return "Factura_Cabecera{" + "ruc=" + ruc + ", fecha=" + fecha + ", Subtotal=" + Subtotal + ", iva=" + iva + ", total=" + total + ", per=" + per + ", facDet=" + facDet + ", modPago=" + modPago + ", viaje=" + viaje + '}';
    }
    
}
