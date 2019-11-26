/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Tipo_Geografia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class TipoGeog_Controlador {
    
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public TipoGeog_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }
    
    /*
    tabla Tipo_Geografia
    Columnas
    tiGeo_codigo
    tiGeo_nombre
    */
    
    public void createTiGeo(Tipo_Geografia tiGeo) {

        String sql = "INSERT INTO \"Tipo_Geografia\" VALUES(" + tiGeo.getCodigo() + ",'" + tiGeo.getNombre() + "');";

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
    
    public Tipo_Geografia BuscarTiGeo(int codigo) {

        Tipo_Geografia tiGeo = new Tipo_Geografia();

        try {

            String sql = "SELECT * FROM \"Tipo_Geografia\"WHERE\"tiGeo_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                tiGeo.setCodigo(codigo);
                tiGeo.setNombre(res.getString("tiGeo_nombre"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return tiGeo;

    }
    
    public void updateTiGeo(Tipo_Geografia tiGeo) {

        String sql = "UPDATE\"Tipo_Geografia\" SET \"tiGeo_codigo\" = "
                + tiGeo.getCodigo() + ",\"tiGeo_nombre\" = "
                + tiGeo.getNombre()+  " WHERE \"tiGeo_codigo\" = " + tiGeo.getCodigo() + ";";
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
    
    public void deleteTiGeo(int codigo) {

        String sql = "DELETE FROM \"Tipo_Geografia \"WHERE \"tiGeo_codigo \" = " + codigo + ";";
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

        Set<Tipo_Geografia> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Tipo_Geografia\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Tipo_Geografia tiGeo = new Tipo_Geografia();
                tiGeo.setCodigo(res.getInt("tiGeo_codigo"));
                tiGeo.setNombre(res.getString("tiGeo_nombre"));

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
