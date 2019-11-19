/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.util.Set;
import ec.edu.ups.modelo.Boleto;
import java.util.HashSet;

/**
 *
 * @author Domenica Cañizares
 */
public class Boleto_Controlador {
    
    private Set<Boleto> lista;
    private int codigo;
    
    public Set<Boleto> getLista(){
        return lista;
    }

    public Boleto_Controlador() {
    
        lista = new HashSet<>();
        codigo = 1;
        
    }
    
    public void create(Boleto boleto){
        boleto.setCodigo(codigo);
        codigo++;
        lista.add(boleto);
    }
    //buscar el boleto con el codigo
    public Boleto read(int codigo){
        for (Boleto boleto : lista) {
            if(boleto.getCodigo() == codigo){
                return boleto;
            }
        }
        return null;
    }
    
    public void update(Boleto boleto){
        if(lista.contains(boleto)){
            lista.remove(boleto);
            lista.add(boleto);
        }
    }
    
    public void delete(int codigo){
        for (Boleto boleto : lista) {
            if(boleto.getCodigo() == codigo){
                lista.remove(boleto);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Boleto boleto : lista) {
            System.out.println(boleto.getCodigo());
        }
    }
    
}
