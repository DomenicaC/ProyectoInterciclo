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

   private String usuario;
   private String password;


    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        
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



    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.usuario);
        hash = 11 * hash + Objects.hashCode(this.password);
       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + '}';
    }

 
}
