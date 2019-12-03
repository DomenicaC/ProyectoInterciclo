/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Ruta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class Ruta_Controlador {

    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public Ruta_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }

    /*
     tabla Ruta 
     columnas
     rut_codigo
     rut_calle_prin
     rut_calle_sec
     rut_numero
     rut_descripcion
     
     */
    public void createRuta(Ruta ruta) {

        String sql = "INSERT INTO \"Ruta\" VALUES(" + ruta.getCodigo() + ",'" + ruta.getCalle_prin() + "','" + ruta.getCalle_sec() + "'," + ruta.getNumero() + ",'" + ",'" + ruta.getDescripcion() + "');";

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

    public Ruta BuscarPre(int codigo) {

        Ruta ruta = new Ruta();

        try {

            String sql = "SELECT * FROM \"Ruta\"WHERE\"ruta_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                ruta.setCodigo(codigo);
                ruta.setCalle_prin(res.getString("ruta_calle_prin"));
                ruta.setCalle_sec(res.getString("ruta_calle_sec"));
                ruta.setNumero(res.getInt("ruta_numero"));
                ruta.setDescripcion(res.getString("ruta_descripcion"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return ruta;

    }

    public void updatePre(Ruta ruta) {

        String sql = "UPDATE\"Ruta\" SET \"ruta_codigo\" = "
                + ruta.getCodigo() + ",\"ruta_calle_prin\" = '"
                + ruta.getCalle_prin() + "',\"ruta_calle_prin\" = '"
                + ruta.getCalle_sec() + "',\"ruta_numero\" = "
                + ruta.getNumero() + ",\"pre_descripcion\" = '"
                + ruta.getDescripcion() + "' WHERE \"ruta_codigo\" = " + ruta.getCodigo() + ";";
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

    public void deleteRuta(int codigo) {

        String sql = "DELETE FROM \"Ruta \"WHERE \"ruta_codigo \" = " + codigo + ";";
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

        Set<Ruta> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Ruta\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Ruta ruta = new Ruta();
                ruta.setCodigo(res.getInt("ruta_codigo"));
                ruta.setCalle_prin(res.getString("ruta_calle_prin"));
                ruta.setCalle_sec(res.getString("ruta_calle_sec"));
                ruta.setNumero(res.getInt("ruta_numero"));
                ruta.setDescripcion(res.getString("ruta_descripcion"));

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
