/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Byron PC
 */
public class BaseDatos {
     private Connection conexionBD;
     Connection conn= null;
    
    public BaseDatos(String usl ,String user, String password) {        
    }
    
    public Connection getConexionBD() {
        return conexionBD;
    }

    public void setConexionBD(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }

    public void conectar(){

        String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
        String user = "postgres";
        String password = "QLJPikrq7833";
        

        try {
            conexionBD = DriverManager.getConnection(url, user, password);
            if(conexionBD.isValid(5000)){
                System.out.println("Conexion exitosa");
        }
        } catch (SQLException error) {
            System.out.println("Error de conexion\n " + error.toString());
        }
    }

    public void desconectar() {
        try {
            if (!conexionBD.isClosed()) {

                conexionBD.close();
                System.out.println("Conexion Cerrada");

            }
        } catch (SQLException error) {

            error.printStackTrace();

        }
    }
    
   
}

