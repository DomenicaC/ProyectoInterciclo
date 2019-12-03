/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.baseDatos.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Domenica Cañizares
 */
public class Persona_Controlador {

    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";
    SimpleDateFormat formato;

    /*
    
    tabla Persona
    Columnas
    per_codigo
    per_cedula
    per_nombre
    per_apellido
    per_fecha_nac
    
    */
    
    public Persona_Controlador(String url, String user, String password) {
        MiBaseDatos = new BaseDatos(url, user, password);
        formato = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    
    public void create(Persona persona) throws SQLException {
        String fechaBD = formato.format(persona.getFechaNac());
        String sql = "INSERT INTO \"Persona\" VALUES('"+persona.getCodigo()
                +"','"+ persona.getCedula()
                +"','"+ persona.getNombre()
                +"','"+ persona.getApellido()
                +"','"+ fechaBD
                +  "');";

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
    
    
    
}
