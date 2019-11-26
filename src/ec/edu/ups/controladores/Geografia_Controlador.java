/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Geografia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class Geografia_Controlador {
    
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public Geografia_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }
    
    /*
    tabla Geografia
    Columnas
    geo_codigo
    geo_nombre
    */
    
    public void createGeo(Geografia geo) {

        String sql = "INSERT INTO \"Geografia\" VALUES(" + geo.getCodigo() + ",'" + geo.getNombre() + "');";

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
    
    public Geografia BuscarGeo(int codigo) {

        Geografia geo = new Geografia();

        try {

            String sql = "SELECT * FROM \"Geografia\"WHERE\"geo_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                geo.setCodigo(codigo);
                geo.setNombre(res.getString("geo_nombre"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return geo;

    }
    
    public void updateGeo(Geografia geo) {

        String sql = "UPDATE\"Geografia\" SET \"geo_codigo\" = "
                + geo.getCodigo() + ",\"geo_nombre\" = '"
                + geo.getNombre()+  "' WHERE \"geo_codigo\" = " + geo.getCodigo() + ";";
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
    
    public void deleteGeo(int codigo) {

        String sql = "DELETE FROM \"Geografia \"WHERE \"geo_codigo \" = " + codigo + ";";
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
    
    public Set printGeo() {

        Set<Geografia> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Geografia\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Geografia geo = new Geografia();
                geo.setCodigo(res.getInt("geo_codigo"));
                geo.setNombre(res.getString("geo_nombre"));

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
