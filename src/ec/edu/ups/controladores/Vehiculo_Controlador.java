/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Vehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class Vehiculo_Controlador {

    /*
    
     tabla Vehiculo
     vehi_codigo int
     vehi_modelo String
     vehi_color String
     vehi_asiento  String
    
     */
    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public Vehiculo_Controlador(String url, String user, String password) {

        MiBaseDatos = new BaseDatos(url, user, password);

    }

    public void createVehi(Vehiculo vehi) {

        String sql = "INSERT INTO \"Vehiculo\" VALUES('" + vehi.getModelo() + "','" + vehi.getColor() + "'," + vehi.getAsiento() + "'," + vehi.getCodigo() + "');";

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

    public Vehiculo BuscarVehi(int codigo) {

        Vehiculo vehi = new Vehiculo();

        try {

            String sql = "SELECT * FROM \"Vehiculo\"WHERE\"codigo\"= " + codigo + ";";
            System.out.println("BASE" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                vehi.setCodigo(codigo);
                vehi.setModelo(res.getString("modelo"));
                vehi.setColor(res.getString("color"));
                vehi.setAsiento(res.getInt("asiento"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return vehi;

    }
    
    public void updateVehi(Vehiculo vehi) {

        String sql = "UPDATE\"Vehiculo\" SET \",\"modelo\" = '"
                + vehi.getModelo() + "',\"color\" = '"
                + vehi.getColor() + "',\"asiento\" = "
                + vehi.getAsiento() + "codigo\" = "
                + vehi.getCodigo() + "' WHERE \"codigo\" = " + vehi.getCodigo() + ";";
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
    
    public void deleteVehi(int codigo) {

        String sql = "DELETE FROM \"Vehiculo \"WHERE \"codigo \" = " + codigo + ";";
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

        Set<Vehiculo> lista = new HashSet<>();

        try {

            String sql = "SELECT * FROM \"Vehiculo\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Vehiculo vehi = new Vehiculo();
                vehi.setCodigo(res.getInt("codigo"));
                vehi.setModelo(res.getString("modelo"));
                vehi.setColor(res.getString("color"));
                vehi.setAsiento(res.getInt("asiento"));

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
