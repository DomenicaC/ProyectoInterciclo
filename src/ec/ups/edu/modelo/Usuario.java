/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author Domenica Cañizares
 */
public class Usuario extends Persona {

    private String codigo;
    private String usuario;
    private String contraseña;
    private Byte foto;
    private boolean validar;

    public Usuario() {
    }

    public Usuario(String codigo, String usuario, String contraseña, Byte foto, boolean validar) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.foto = foto;
        this.validar = validar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public boolean isValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", foto=" + foto + ", validar=" + validar + '}';
    }

}
