/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Domenica Cañizares
 */
public class Usuario extends Persona {

    private int codigo;
    private String usuario;
    private String password;
    private Byte foto;
    private String tarjeta_credito;
    
    //clase
    private Preferencia pre;

    public Usuario() {
    }

    public Usuario(int codigo, String usuario, String password,String tarjeta_credito) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.password = password;
        this.tarjeta_credito = tarjeta_credito;
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getFoto() {
        return foto;
    }

    public void setFoto(Byte foto) {
        this.foto = foto;
    }

    public Preferencia getPre() {
        return pre;
    }

    public void setPre(Preferencia pre) {
        this.pre = pre;
    }

    public String getTarjeta_credito() {
        return tarjeta_credito;
    }

    public void setTarjeta_credito(String tarjeta_credito) {
        this.tarjeta_credito = tarjeta_credito;
    }

    
    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", usuario=" + usuario + ", password=" + password + ", foto=" + foto + ", pre=" + pre + '}';
    }

    
    
}
