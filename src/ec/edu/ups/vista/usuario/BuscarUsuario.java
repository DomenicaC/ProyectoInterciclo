/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.usuario;

import ec.edu.ups.controladores.Persona_Controlador;
import ec.edu.ups.controladores.Usuario_Controlador;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class BuscarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarUsuario
     */
    public BuscarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel5.setText("Buscar Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 180, -1));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 103, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, -1));

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Nacimineto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        btnBuscar.setText("Buscar Usuario");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel9.setText("Codigo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 38, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 99, -1));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 103, -1));

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel10.setText("Usuario:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnVolver.setText("Volver");
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 94, -1));

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel11.setText("Cédula:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/fondoventabas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setUsuario(txtusuario.getText());
        usuario.setPassword(txtcontraseña.getText());
        //Usuario_Controlador.create(usuario);

        Persona persona = new Persona();
        //try {

            persona.setCodigo(Integer.parseInt(txtcodigo.getText()));
            persona.setCedula(txtcedula.getText());
            persona.setNombre(txtnombre.getText());
            persona.setApellido(txtapellido.getText());
            //persona.setFechaNac(formato.parse(txtfecha.getText()));
            //Persona_Controlador.create(persona);
        /*} catch (ParseException ex) {
            Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        JOptionPane.showMessageDialog(this, "Usuaio Creado", "Crear Usuario", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}