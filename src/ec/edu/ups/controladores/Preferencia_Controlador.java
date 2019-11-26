/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Preferencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class Preferencia_Controlador {
    
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public Preferencia_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }
    
    /*
    tabla Preferencia
    Columnas
    pre_codigo
    pre_descripcion
    */
    
    public void createPre(Preferencia pre) {

        String sql = "INSERT INTO \"Preferencia\" VALUES(" + pre.getCodigo() + ",'" + pre.getDescripcion()+ "');";

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
    
    public Preferencia BuscarPre(int codigo) {

        Preferencia pre = new Preferencia();

        try {

            String sql = "SELECT * FROM \"Preferencia\"WHERE\"pre_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                pre.setCodigo(codigo);
                pre.setDescripcion(res.getString("pre_descripcion"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return pre;

    }
    
    public void updatePre(Preferencia pre) {

        String sql = "UPDATE\"Preferencia\" SET \"pre_codigo\" = "
                + pre.getCodigo() + ",\"pre_descripcion\" = "
                + pre.getDescripcion()+  " WHERE \"geo_codigo\" = " + pre.getCodigo() + ";";
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
    
    public void deletePre(int codigo) {

        String sql = "DELETE FROM \"Preferencia \"WHERE \"pre_codigo \" = " + codigo + ";";
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
    
    public Set printPre() {

        Set<Preferencia> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Preferencia\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Preferencia pre = new Preferencia();
                pre.setCodigo(res.getInt("pre_codigo"));
                pre.setDescripcion(res.getString("pre_descripcion"));

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
