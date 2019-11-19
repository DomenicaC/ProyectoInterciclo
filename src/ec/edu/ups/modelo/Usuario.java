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
public class Usuario extends Persona {

    private int codigo;
    private String usuario;
    private String contraseña;
    private Byte foto;
    private String validar;

    public Usuario() {
    }

    public Usuario(int codigo, String usuario, String contraseña, Byte foto, String validar) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.foto = foto;
        this.validar = validar;
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

    public String getValidar() {
        return validar;
    }

    public void setValidar(String validar) {
        this.validar = validar;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", foto=" + foto + ", validar=" + validar + '}';
    }

 
}
