/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.ruta;

/**
 *
 * @author Domenica Cañizares
 */
public class BuscarRuta extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarRuta
     */
    public BuscarRuta() {
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

        txtCalPrin = new javax.swing.JTextField();
        txtCalSec = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCalPrin.setEditable(false);
        txtCalPrin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(txtCalPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 97, 136, -1));

        txtCalSec.setEditable(false);
        txtCalSec.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(txtCalSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 139, 136, -1));

        txtNum.setEditable(false);
        txtNum.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 185, 136, -1));

        txtDesc.setEditable(false);
        txtDesc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 231, 136, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        jLabel1.setText("Buscar Ruta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 11, 127, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 54, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Ciudad Salida");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("Ciudad Llegada");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 142, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Número:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 188, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setText("Descripción:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 234, -1, -1));

        btnCrear.setText("Buscar");
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        txtCod.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 51, 136, -1));

        jLabel7.setText("Imagen");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 305, 340, 256));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/fondoventabas.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCalPrin;
    private javax.swing.JTextField txtCalSec;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
