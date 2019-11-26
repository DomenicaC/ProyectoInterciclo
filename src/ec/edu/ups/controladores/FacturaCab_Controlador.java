/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Boleto;
import ec.edu.ups.modelo.Factura_Cabecera;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class FacturaCab_Controlador {

    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public FacturaCab_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }
    
    /*
    tabla Factura_Cabecera
    Columnas
    fCab_ruc
    fCab_fecha
    fCab_subtotal
    fCab_iva
    fCab_total
    */
    
    public void createFacCab(Factura_Cabecera facCab) {

        String sql = "INSERT INTO \"Factura_Cabecera\" VALUES(" + facCab.getRuc()+ "," + facCab.getFecha() + "," + facCab.getSubtotal() + "," + facCab.getIva()+"," + facCab.getTotal()+");";

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
    
    public Factura_Cabecera BuscarFacCab(int ruc) {

        Factura_Cabecera facCab = new Factura_Cabecera();

        try {

            String sql = "SELECT * FROM \"Factura_Cabecera\"WHERE\"fCab_ruc\"= " + ruc + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                facCab.setRuc(ruc);
                facCab.setFecha(res.getDate("fCab_fecha"));
                facCab.setSubtotal(res.getDouble("fCab_subtotal"));
                facCab.setIva(res.getDouble("fCab_iva"));
                facCab.setTotal(res.getDouble("fCab_total"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return facCab;

    }
    
    public void updateFacCab(Factura_Cabecera facCab) {

        String sql = "UPDATE\"Factura_Cabecera\" SET \"fCab_ruc\" = "
                + facCab.getRuc()+ ",\"fCab_fecha\" = "
                + facCab.getFecha()+ ",\fCab_subtotal\" = "
                + facCab.getSubtotal()+ ",\fCab_iva\" = "
                + facCab.getIva()+ ",\fCab_total\" = "
                + facCab.getTotal() + " WHERE \"fCab_ruc\" = " + facCab.getRuc() + ";";
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
    
    public void deleteFacCab(int ruc) {

        String sql = "DELETE FROM \"Factura_Cabecera \"WHERE \"fCab_ruc \" = " + ruc + ";";
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
    
    public Set printFacCab() {

        Set<Factura_Cabecera> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Factura_Cabecera\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Factura_Cabecera facCab = new Factura_Cabecera();
                facCab.setRuc(res.getInt("fCab_ruc"));
                facCab.setFecha(res.getDate("fCab_fecha"));
                facCab.setSubtotal(res.getDouble("fCab_subtotal"));
                facCab.setIva(res.getDouble("fCab_iva"));
                facCab.setTotal(res.getDouble("fCab_total"));

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
