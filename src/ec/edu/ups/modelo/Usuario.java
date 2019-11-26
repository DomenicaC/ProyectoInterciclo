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
    private String password;
    private Byte foto;
    
    //clase
    private Preferencia pre;

    public Usuario() {
    }

    public Usuario(String usuario, String password, Byte foto, Preferencia pre) {
        this.usuario = usuario;
        this.password = password;
        this.foto = foto;
        this.pre = pre;
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

    public void setPassword(String contraseña) {
        this.password = contraseña;
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
        return "Usuario{" + "usuario=" + usuario + ", Password=" + password + ", foto=" + foto + ", pre=" + pre + '}';
    }
}
