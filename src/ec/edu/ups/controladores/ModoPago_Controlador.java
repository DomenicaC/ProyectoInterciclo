/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Modo_Pago;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ModoPago_Controlador {
    
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public ModoPago_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }
    
    /*
    tabla Modo_Pago
    Columnas
    modPa_codigo
    modPa_descripcion
    */
    
    public void createModPa(Modo_Pago modPa) {

        String sql = "INSERT INTO \"Modo_Pago\" VALUES(" + modPa.getCodigo() + ",'" + modPa.getDescripcion()+ "');";

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
    
    public Modo_Pago BuscarModPa(int codigo) {

        Modo_Pago modPa = new Modo_Pago();

        try {

            String sql = "SELECT * FROM \"Modo_Pago\"WHERE\"modPa_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                modPa.setCodigo(codigo);
                modPa.setDescripcion(res.getString("modPa_descripcion"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return modPa;

    }
    
    public void updateModPa(Modo_Pago modPa) {

        String sql = "UPDATE\"Modo_Pago\" SET \"modPa_codigo\" = "
                + modPa.getCodigo() + ",\"ModPa_descripcion\" = '"
                + modPa.getDescripcion()+  "' WHERE \"modPa_codigo\" = " + modPa.getCodigo() + ";";
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
    
    public void deleteModPa(int codigo) {

        String sql = "DELETE FROM \"Modo_Pago \"WHERE \"modPa_codigo \" = " + codigo + ";";
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

        Set<Modo_Pago> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Modo_Pago\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Modo_Pago modPa = new Modo_Pago();
                modPa.setCodigo(res.getInt("modPa_codigo"));
                modPa.setDescripcion(res.getString("modPa_descripcion"));

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
