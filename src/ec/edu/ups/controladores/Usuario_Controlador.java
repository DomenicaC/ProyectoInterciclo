/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Usuario;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class Usuario_Controlador {
    
    private Set<Usuario> lista;
    private int codigo;
    
    public Set<Usuario> getLista(){
        return lista;
    }
    
    public Usuario_Controlador() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    public void create(Usuario usuario){
        usuario.setCodigo(codigo);
        codigo++;
        lista.add(usuario);
    }
    //buscar el usuario con el codigo
    public Usuario read(int codigo){
        for (Usuario usuario : lista) {
            if(usuario.getCodigo() == codigo){
                return usuario;
            }
        }
        return null;
    }
    
    //buscar el usuario con su cedula
    public Usuario readCedula(String cedula){
        for (Usuario usuario : lista) {
            if(usuario.getCedula().equals(cedula)){
                return usuario;
            }
        }
        return null;
    }
    
    public void update(Usuario usuario){
        if(lista.contains(usuario)){
            lista.remove(usuario);
            lista.add(usuario);
        }
    }
    
    public void delete(int codigo){
        for (Usuario usuario : lista) {
            if(usuario.getCodigo() == codigo){
                lista.remove(usuario);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Usuario usuario : lista) {
            System.out.println(usuario.getNombre());
        }
    }
}
