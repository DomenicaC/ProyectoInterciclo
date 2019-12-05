/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import java.util.Set;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Viaje;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author Domenica Cañizares
 */
public class Viaje_Controlador {

    /*
     tabla Viaje
     via_codigo int
     via_fecha_sal
     via_fecha_ret
    
     */
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";
    
    public Viaje_Controlador(String url, String user, String password) {
        
        MiBaseDatos = new BaseDatos(url, user, password);
        
    }
    
    public void createVia(Viaje via) {
        
        String sql = "INSERT INTO \"Viaje\" VALUES('" + via.getFecha_salida() + "','" + via.getFecha_retorno() + "'," + via.getCodigo() + "');";
        
        System.out.println(sql);
        
        MiBaseDatos.conectar();
        try {
            
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public Viaje BuscarVia(int codigo) {
        
        Viaje via = new Viaje();
        
        try {
            
            String sql = "SELECT * FROM \"Viaje\"WHERE\"codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);
            
            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);
            
            while (res.next()) {
                
                via.setCodigo(codigo);
                via.setFecha_retorno(res.getDate("fecha_retorno"));
                via.setFecha_salida(res.getDate("fecha_salida"));
                
            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();
            
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return via;
        
    }
    
    public void updateVia(Viaje via) {
        
        String sql = "UPDATE\"Viaje\" SET \",\"fecha_salida\" = '"
                + via.getFecha_salida() + "',\"fecha_retorno\" = '"
                + via.getFecha_retorno() + "codigo\" = "
                + via.getCodigo() + "' WHERE \"codigo\" = " + via.getCodigo() + ";";
        System.out.println("BASE ACTUALIZADA" + sql);
        
        MiBaseDatos.conectar();
        try {
            
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();
            
        } catch (SQLException error) {
            
            error.printStackTrace();
            
        }
        
    }
    
    public void deleteVia(int codigo) {
        
        String sql = "DELETE FROM \"Viaje \"WHERE \"codigo \" = " + codigo + ";";
        System.out.println("Base eliminada " + sql);
        
        MiBaseDatos.conectar();
        try {
            
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();
            
        } catch (SQLException error) {
            
            error.printStackTrace();
            
        }
        
    }
    
    public Set printBoleto() {
        
        Set<Viaje> lista = new HashSet<>();
        
        try {
            
            String sql = "SELECT * FROM \"Viaje\";";
            System.out.println("Base listar" + sql);
            
            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);
            
            while (res.next()) {
                
                Viaje via = new Viaje();
                via.setCodigo(res.getInt("codigo"));
                via.setFecha_retorno(res.getDate("fecha_retorno"));
                via.setFecha_salida(res.getDate("fecha_salida"));
                
            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();
        } catch (SQLException error) {
            
            error.printStackTrace();
            
        }
        return lista;
    }
    
}
