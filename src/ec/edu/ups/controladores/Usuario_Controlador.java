/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.baseDatos.BaseDatos;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.MenuPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class Usuario_Controlador {

    private BaseDatos MiBaseDatos;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";
    
    /*
    
    tabla Usuario
    usu_codigo  int
    usu_usuario  String
    usu_password  String
    
    */

    public Usuario_Controlador(String url, String user, String password) { 
         MiBaseDatos = new BaseDatos(url,user,password);
    }

  
    public void create(Usuario usuario) {
        String sql = "INSERT INTO \"Usuario\" VALUES('"+usuario.getUsuario()
                +"','"+ usuario.getPassword()+"','"+ usuario.getCodigo() 
                +"','"+ usuario.getTarjeta_credito()
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
    
    
    
    public Usuario BuscarUsuario(String usuario,String password) throws SQLException{
        Usuario usuario1 = new Usuario();
        try{
            String sql = "SELECT * FROM \"Usuario\" WHERE\"usuario\"='"+usuario+ "' AND \"password\"='"+password+"';";
            System.out.println("Base "+ sql);
            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);
            while(res.next()){
                usuario1.setUsuario("usuario");
                usuario1.setPassword("password");           
            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();
            
        }catch (SQLException error) {

            error.printStackTrace();
        }
        
        
    return usuario1;
    }
    
    /*public Usuario BuscarAuto(String cedula) {

        Usuario usuario = new Usuario();
        try {

            String sql = "SELECT * FROM \"AUTO\"WHERE\"AUT_PLACA\"='" + cedula + "';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                usuario.setCedula(cedula);
                //usuario.setCodigo(codigo);
                usuario.setNombre(url);
                usuario.setApellido(sql);
                usuario.setUsuario(user);
                usuario.setContraseña(cedula);
                usuario.setFechaNac(null);
                usuario.setFoto(Byte.MIN_VALUE);
                //usuario.setValidar(sql);

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return usuario;
    }


 /*   
    public void updateAuto(Usuario usuario) {

        String sql = "UPDATE\"AUTO\" SET \"AUT_MODELO\" = '"
                + usuario.getModelo() + "',\"AUT_COLOR\" = '"
                + usuario.getColor() + "',\"AUT_AÑO\" = "
                + usuario.getAño() + ",\"PER_CEDULA\" = '"
                + usuario.getPerCedula() + "' WHERE \"AUT_PLACA\" = '" + auto.getPlaca() + "';";
        System.out.println("Base de datos " + sql);

        MiBaseDatos.conectar();
        try {

            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public void deleteAuto(String usuario) {

        String sql = "DELETE FROM \"AUTO \"WHERE \"AUT_PLACA \"='" + usuario + "';";
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

    public Set printUsuario() {

        Set<Usuario> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"usuario\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Usuario usuario = new Usuario();
                usuario.setPlaca(res.getString("AUT_PLACA"));
                usuario.setModelo(res.getString("AUT_MODELO"));
                usuario.setColor(res.getString("AUT_COLOR"));
                usuario.setAño(res.getInt("AUT_AÑO"));
                usuario.setPerCedula(res.getString("PER_CEDULA"));
                lista.add(usuario);

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

        return lista;

    }*/
}
