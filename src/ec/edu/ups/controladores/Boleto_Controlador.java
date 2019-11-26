/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import java.util.Set;
import ec.edu.ups.modelo.Boleto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author Domenica Cañizares
 */
public class Boleto_Controlador {

    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public Boleto_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }

    /*
     tabla Boleto 
     columnas
     bol_codigo
     bol_fecha_compra
     bol_valor
        
     */
    public void createBol(Boleto boleto) {

        String sql = "INSERT INTO \"Boleto\" VALUES(" + boleto.getCodigo() + "," + boleto.getFecha_compra() + "," + boleto.getValor() + ");";

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

    public Boleto BuscarBoleto(int codigo) {

        Boleto boleto = new Boleto();

        try {

            String sql = "SELECT * FROM \"Boleto\"WHERE\"bol_codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                boleto.setCodigo(codigo);
                boleto.setFecha_compra(res.getDate("bol_fecha_compra"));
                boleto.setValor(res.getDouble("bol_valor"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return boleto;

    }

    public void updateBoleto(Boleto boleto) {

        String sql = "UPDATE\"Boleto\" SET \"bol_codigo\" = "
                + boleto.getCodigo() + ",\"bol_fecha_compra\" = "
                + boleto.getFecha_compra() + ",\bol_valor\" = "
                + boleto.getValor() + " WHERE \"bol_codigo\" = " + boleto.getCodigo() + ";";
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

    public void deleteBoleto(int codigo) {

        String sql = "DELETE FROM \"Boleto \"WHERE \"bol_codigo \" = " + codigo + ";";
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

        Set<Boleto> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Boleto\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Boleto boleto = new Boleto();
                boleto.setCodigo(res.getInt("Bol_codigo"));
                boleto.setFecha_compra(res.getDate("bol_fecha_compra"));
                boleto.setValor(res.getDouble("bol_valor"));

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
