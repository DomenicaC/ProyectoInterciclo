/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.Factura;

import ec.edu.ups.controladores.Usuario_Controlador;

/**
 *
 * @author Domenica Cañizares
 */
public class CrearFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearFactura
     */
    public CrearFactura() {
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

        lblTitulo = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblCedC = new javax.swing.JLabel();
        txtCedC = new javax.swing.JTextField();
        btnBuscarCF = new javax.swing.JButton();
        lblCodC = new javax.swing.JLabel();
        txtCodC = new javax.swing.JTextField();
        lblNomC = new javax.swing.JLabel();
        txtNomC = new javax.swing.JTextField();
        lblTelC = new javax.swing.JLabel();
        txtTelC = new javax.swing.JTextField();
        txtApeC = new javax.swing.JTextField();
        lblApeC = new javax.swing.JLabel();
        lblDirC = new javax.swing.JLabel();
        txtDirC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServF = new javax.swing.JTable();
        txtIva = new javax.swing.JTextField();
        lblTot = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnCancelarF = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblSub = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblIva = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNomV = new javax.swing.JLabel();
        txtNomV = new javax.swing.JTextField();
        lblApeV = new javax.swing.JLabel();
        txtApeV = new javax.swing.JTextField();
        lblCedV = new javax.swing.JLabel();
        txtCodR = new javax.swing.JTextField();
        btnBuscarVF = new javax.swing.JButton();
        lblCodV = new javax.swing.JLabel();
        txtCallPrin = new javax.swing.JTextField();
        lblNomV1 = new javax.swing.JLabel();
        txtNomV1 = new javax.swing.JTextField();
        lblCodV1 = new javax.swing.JLabel();
        txtCallPrin1 = new javax.swing.JTextField();
        btnBuscarVF1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        lblTitulo.setText("Crear Factura");

        lblRuc.setBackground(new java.awt.Color(255, 255, 255));
        lblRuc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblRuc.setText("RUC Factura");

        txtRuc.setEditable(false);
        txtRuc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtRuc.setEnabled(false);

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtFecha.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCedC.setBackground(new java.awt.Color(255, 255, 255));
        lblCedC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCedC.setText("Cedula Cliente");

        txtCedC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        btnBuscarCF.setText("Buscar");
        btnBuscarCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCFActionPerformed(evt);
            }
        });

        lblCodC.setBackground(new java.awt.Color(255, 255, 255));
        lblCodC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodC.setText("Codigo Cliente");

        txtCodC.setEditable(false);
        txtCodC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCodC.setEnabled(false);

        lblNomC.setBackground(new java.awt.Color(255, 255, 255));
        lblNomC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomC.setText("Nombre Cliente");

        txtNomC.setEditable(false);
        txtNomC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomC.setEnabled(false);

        lblTelC.setBackground(new java.awt.Color(255, 255, 255));
        lblTelC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTelC.setText("Telefono Cliente");

        txtTelC.setEditable(false);
        txtTelC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTelC.setEnabled(false);

        txtApeC.setEditable(false);
        txtApeC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeC.setEnabled(false);

        lblApeC.setBackground(new java.awt.Color(255, 255, 255));
        lblApeC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeC.setText("Apellido Cliente");

        lblDirC.setBackground(new java.awt.Color(255, 255, 255));
        lblDirC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblDirC.setText("Direccion Cliente");

        txtDirC.setEditable(false);
        txtDirC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtDirC.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTelC)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomC)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCedC)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarCF)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodC)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblApeC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDirC)
                            .addGap(18, 18, 18)
                            .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedC)
                    .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCF)
                    .addComponent(lblCodC)
                    .addComponent(txtCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApeC)
                        .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomC)
                        .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDirC)
                        .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelC)
                        .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblServF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "0", null, null, null}
            },
            new String [] {
                "codigo", "cantidad", "nombre", "precio u", "totalCP"
            }
        ));
        tblServF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServFKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblServF);

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtIva.setEnabled(false);

        lblTot.setBackground(new java.awt.Color(255, 255, 255));
        lblTot.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTot.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTotal.setEnabled(false);

        btnCancelarF.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btnCancelarF.setText("Cancelar");
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblSub.setBackground(new java.awt.Color(255, 255, 255));
        lblSub.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblSub.setText("Subtotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtSubtotal.setEnabled(false);

        lblIva.setBackground(new java.awt.Color(255, 255, 255));
        lblIva.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblIva.setText("I.V.A");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNomV.setBackground(new java.awt.Color(255, 255, 255));
        lblNomV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomV.setText("Calle Secundaria");

        txtNomV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblApeV.setBackground(new java.awt.Color(255, 255, 255));
        lblApeV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeV.setText("Número");

        txtApeV.setEditable(false);
        txtApeV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeV.setEnabled(false);

        lblCedV.setBackground(new java.awt.Color(255, 255, 255));
        lblCedV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCedV.setText("Código");

        txtCodR.setEditable(false);
        txtCodR.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCodR.setEnabled(false);

        btnBuscarVF.setText("Buscar");
        btnBuscarVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVFActionPerformed(evt);
            }
        });

        lblCodV.setBackground(new java.awt.Color(255, 255, 255));
        lblCodV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodV.setText("Calle Principal");

        txtCallPrin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblNomV1.setBackground(new java.awt.Color(255, 255, 255));
        lblNomV1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomV1.setText("Descripción");

        txtNomV1.setEditable(false);
        txtNomV1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomV1.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCedV)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCodV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCallPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnBuscarVF)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblApeV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApeV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNomV1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomV1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodV)
                    .addComponent(txtCallPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVF)
                    .addComponent(lblNomV)
                    .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeV)
                    .addComponent(txtApeV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedV)
                    .addComponent(txtCodR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomV1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(lblNomV1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCodV1.setBackground(new java.awt.Color(255, 255, 255));
        lblCodV1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodV1.setText("Tarjeta de credito");

        txtCallPrin1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        btnBuscarVF1.setText("Validar");
        btnBuscarVF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRuc)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFecha)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblTitulo)))
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addGap(34, 34, 34)
                                .addComponent(btnCancelarF)
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSub)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblIva)
                                                .addGap(16, 16, 16)
                                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTot)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCodV1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCallPrin1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVF1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRuc)
                            .addComponent(lblFecha))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodV1)
                    .addComponent(txtCallPrin1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVF1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblSub))
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIva)
                        .addComponent(btnCrear)
                        .addComponent(btnCancelarF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTot))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCFActionPerformed
/*
        String cedula = txtCedC.getText();
        cliente = Usuario_Controlador.read1(cedula);

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cedula no Existe");
        } else {
            //txtCodC.setText(Integer.toString(cliente.getCodigo()));
            txtNomC.setText(cliente.getNombre());
            txtApeC.setText(cliente.getApellido());
            txtDirC.setText(cliente.getDireccion());
            txtTelC.setText(cliente.getTelefono());
        }*/
    }//GEN-LAST:event_btnBuscarCFActionPerformed

    private void tblServFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServFKeyReleased
       /* int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            int fila = tblServF.getSelectedRow();
            int columna = tblServF.getSelectedColumn();
            int codigoServ = 0;

            Object[] datos1 = {"", 0, "", "", ""};

            if (columna == 0) {
                codigoServ = Integer.parseInt(tblServF.getValueAt(fila, columna).toString());
                servicio = controladorServicio.read(codigoServ);

                int cant = Integer.parseInt(tblServF.getValueAt(fila, 1).toString());

                tablaF = (DefaultTableModel) tblServF.getModel();
                tablaF.removeRow(fila);
                totalCP = cant * servicio.getPrecio();

                Object[] datos = {codigoServ,
                    cant,
                    servicio.getNombreservicio(),
                    servicio.getPrecio(),
                    totalCP
                };

                tablaF.addRow(datos);
                tablaF.addRow(datos1);
            } else if (columna == 1) {

                codigoServ = Integer.parseInt(tblServF.getValueAt(fila, columna - 1).toString());
                int cant = Integer.parseInt(tblServF.getValueAt(fila, columna).toString());
                tablaF.removeRow(fila);
                tablaF.removeRow(tblServF.getRowCount() - 1);

                totalCP = cant * servicio.getPrecio();

                Object[] datos = {codigoServ,
                    cant,
                    servicio.getNombreservicio(),
                    servicio.getPrecio(),
                    totalCP
                };

                tablaF.addRow(datos);
                tablaF.addRow(datos1);

            }

            subtotal = subtotal + totalCP;
            txtSubtotal.setText(String.valueOf(subtotal));

            iva = subtotal * 0.12;
            txtIva.setText(String.valueOf(iva));

            total = subtotal + iva;
            txtTotal.setText(String.valueOf(total));

        }*/
    }//GEN-LAST:event_tblServFKeyReleased

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        // TODO add your handling code here:
/*        x = null;
        this.dispose();*/
    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
       /* //obtener fecha
        fecha = new Date();

        //obtener clases
        String cedulaC = txtCedC.getText();
        cliente = controladorCliente.readCedula(cedulaC);

        String cedulaV = txtCodR.getText();
        veterinario = controladorVeterinario.readCedula(cedulaV);

        int codigoM = Integer.parseInt(txtCodM.getText());
        mascota = controladorMascota.read(codigoM);

        //agregarDatos
        factura.setFecha(fecha);

        //clases
        factura.setVet(veterinario);
        factura.setCli(cliente);
        factura.setMasc(mascota);

        //facDetalle
        for (int i = 0; i < tblServF.getRowCount() - 1; i++) {
            System.out.println("i " + i);
            facDet = new FDetalle();

            double cant = Integer.parseInt(tblServF.getValueAt(i, 1).toString());
            int cant1 = (int) cant;
            facDet.setCantidad(cant1);

            //facDet.setCodigo(Integer.parseInt(tblServF.getValueAt(i, 0).toString()));
            //int codigoS = ;
            //facDet.setServ(controladorServicio.read(Integer.parseInt(tblServF.getValueAt(i, 0).toString())));
            facDet.setServ(controladorServicio.read(Integer.parseInt(tblServF.getValueAt(i, 0).toString())));
            factura.añadirFacDetalle(facDet);
            //            controladorFDetalle.create(facDet);

        }

        llenarDatos();
        //factura
        factura.setSubtotal(subtotal);
        factura.setIva(iva);
        factura.setTotal(total);

        controladorFactura.create(factura);
        JOptionPane.showMessageDialog(this, "Factura Creada");
        System.out.println("factura \n" + factura.toString());
        /*
        txtRuc.setText(Integer.toString(controladorFactura.getCodigo()));
        factura.setRuc(Integer.parseInt(txtRuc.getText()));*/

        /*int ruc = this.controladorFactura.getCodigo() + 1;
        txtRuc.setText(String.valueOf(ruc));
        txtFecha.setText(controladorFactura.getFecha());

        contador = 0;

        vaciarDatos();
        vaciarTabla();*/
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVFActionPerformed

        
    }//GEN-LAST:event_btnBuscarVFActionPerformed

    private void btnBuscarVF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarVF1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCF;
    private javax.swing.JButton btnBuscarVF;
    private javax.swing.JButton btnBuscarVF1;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApeC;
    private javax.swing.JLabel lblApeV;
    private javax.swing.JLabel lblCedC;
    private javax.swing.JLabel lblCedV;
    private javax.swing.JLabel lblCodC;
    private javax.swing.JLabel lblCodV;
    private javax.swing.JLabel lblCodV1;
    private javax.swing.JLabel lblDirC;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNomC;
    private javax.swing.JLabel lblNomV;
    private javax.swing.JLabel lblNomV1;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTot;
    private javax.swing.JTable tblServF;
    private javax.swing.JTextField txtApeC;
    private javax.swing.JTextField txtApeV;
    private javax.swing.JTextField txtCallPrin;
    private javax.swing.JTextField txtCallPrin1;
    private javax.swing.JTextField txtCedC;
    private javax.swing.JTextField txtCodC;
    private javax.swing.JTextField txtCodR;
    private javax.swing.JTextField txtDirC;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNomC;
    private javax.swing.JTextField txtNomV;
    private javax.swing.JTextField txtNomV1;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelC;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
