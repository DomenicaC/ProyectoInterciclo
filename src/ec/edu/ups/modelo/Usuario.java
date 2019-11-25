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

   //private int codigo;
    private String usuario;
    private String contraseña;
    private Byte foto;
    
    //clase
    private Preferencia pre;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, Byte foto, Preferencia pre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.foto = foto;
        this.pre = pre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", foto=" + foto + ", pre=" + pre + '}';
    }
}
