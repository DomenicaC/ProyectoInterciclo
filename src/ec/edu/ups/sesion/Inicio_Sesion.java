/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.sesion;

import ec.edu.ups.vista.MenuPrincipal;
import static ec.edu.ups.vista.MenuPrincipal.desktopPane;
import ec.edu.ups.vista.usuario.CrearUsuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class Inicio_Sesion extends javax.swing.JFrame {
 
 
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";
    private Registro1 registro1;
    
    /**
     * Creates new form Inicio_Sesion
     */
    public Inicio_Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(("src/ec/edu/ups/imagenes/final.png")).getImage());
        this.setTitle("***** BLABLABLA.ES *****");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel = new javax.swing.JDesktopPane();
        nombre2 = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();
        titulo2 = new javax.swing.JTextField();
        botoningresar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        labelcontraseña = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        nombre2.setEditable(false);
        nombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre2.setText("Doménica Vintimilla");
        nombre2.setEnabled(false);
        panel.add(nombre2);
        nombre2.setBounds(210, 520, 130, 24);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/minilogo.png"))); // NOI18N
        imagen.setToolTipText("");
        panel.add(imagen);
        imagen.setBounds(30, 30, 361, 202);

        titulo2.setEditable(false);
        titulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo2.setText("Desarrollado por:");
        titulo2.setEnabled(false);
        panel.add(titulo2);
        titulo2.setBounds(100, 480, 225, 30);

        botoningresar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botoningresar.setText("Ingresar");
        botoningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoningresarMouseClicked(evt);
            }
        });
        botoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoningresarActionPerformed(evt);
            }
        });
        panel.add(botoningresar);
        botoningresar.setBounds(70, 320, 112, 40);
        panel.add(txtusuario);
        txtusuario.setBounds(190, 230, 195, 28);
        panel.add(txtcontraseña);
        txtcontraseña.setBounds(190, 280, 195, 30);

        labelcontraseña.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelcontraseña.setText("Contraseña:");
        panel.add(labelcontraseña);
        labelcontraseña.setBounds(20, 280, 107, 22);

        labelusuario.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelusuario.setText("Usuario:");
        panel.add(labelusuario);
        labelusuario.setBounds(50, 240, 73, 22);

        nombre1.setEditable(false);
        nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre1.setText("Byron Vásquez");
        nombre1.setEnabled(false);
        panel.add(nombre1);
        nombre1.setBounds(100, 520, 100, 24);

        btnRegistrar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panel.add(btnRegistrar);
        btnRegistrar.setBounds(140, 440, 138, 40);

        botonsalir.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });
        panel.add(botonsalir);
        botonsalir.setBounds(230, 320, 114, 40);

        texto.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        texto.setText("Si no posee una cuenta registrese aqui:");
        panel.add(texto);
        texto.setBounds(40, 370, 341, 22);

        jLabel1.setText("..");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panel.add(jLabel1);
        jLabel1.setBounds(310, 390, 10, 16);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoningresarActionPerformed
        // TODO add your handling code here:
        String Usuario = "admin";
        String Contraseña = "admin";
        String Pass = new String(txtcontraseña.getPassword());
        if (txtusuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            MenuPrincipal si = new MenuPrincipal();
            si.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña Incorrecta");
        }

    }//GEN-LAST:event_botoningresarActionPerformed

    private void botoningresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoningresarMouseClicked

        String Usuario = "admin";
        String Contraseña = "admin";
        String Pass = new String(txtcontraseña.getPassword());
        if (txtusuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            MenuPrincipal si = new MenuPrincipal();
            si.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña Incorrecta");
        }
    }//GEN-LAST:event_botoningresarMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
        String x = Registro1.x;
        try {
            if (x == null) {
                if (registro1 == null || registro1.isVisible() == false) {
                    registro1 = new Registro1(url, user, password);
                    panel.add(registro1);
                    txtcontraseña.setVisible(false);
                    txtusuario.setVisible(false);
                    labelcontraseña.setVisible(false);
                    labelusuario.setVisible(false);
                    imagen.setVisible(false);
                    texto.setVisible(false);
                    titulo2.setVisible(false);
                    nombre1.setVisible(false);
                    nombre2.setVisible(false);
                    botoningresar.setVisible(false);
                    botonsalir.setVisible(false);
                    btnRegistrar.setVisible(false);
                    
                    
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonsalirActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        txtcontraseña.setVisible(true);
                    txtusuario.setVisible(true);
                    labelcontraseña.setVisible(true);
                    labelusuario.setVisible(true);
                    imagen.setVisible(true);
                    texto.setVisible(true);
                    titulo2.setVisible(true);
                    nombre1.setVisible(true);
                    nombre2.setVisible(true);
                    botoningresar.setVisible(true);
                    botonsalir.setVisible(true);
                    btnRegistrar.setVisible(true);
                    
        
    }//GEN-LAST:event_jLabel1MouseClicked
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoningresar;
    private javax.swing.JButton botonsalir;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel imagen;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelcontraseña;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    public static javax.swing.JDesktopPane panel;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField titulo2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
