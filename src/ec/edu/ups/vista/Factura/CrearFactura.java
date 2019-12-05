/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.Factura;

import ec.edu.ups.controladores.Boleto_Controlador;
import ec.edu.ups.controladores.FacturaCab_Controlador;
import ec.edu.ups.controladores.ModoPago_Controlador;
import ec.edu.ups.controladores.Persona_Controlador;
import ec.edu.ups.controladores.Ruta_Controlador;
import ec.edu.ups.controladores.Usuario_Controlador;
import ec.edu.ups.controladores.Vehiculo_Controlador;
import ec.edu.ups.controladores.Viaje_Controlador;
import ec.edu.ups.modelo.Boleto;
import ec.edu.ups.modelo.Factura_Cabecera;
import ec.edu.ups.modelo.Factura_Detalle;
import ec.edu.ups.modelo.Modo_Pago;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Ruta;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.modelo.Viaje;
import ec.edu.ups.vista.MenuPrincipal;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Domenica Cañizares
 */
public class CrearFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearFactura
     */
    private Boleto_Controlador bolCon;
    private FacturaCab_Controlador fCabCon;
    private ModoPago_Controlador modCon;
    private Persona_Controlador perCon;
    private Ruta_Controlador rutCon;
    private Vehiculo_Controlador vehiCon;
    private Viaje_Controlador viaCon;

    private Boleto bol;
    private Factura_Cabecera fCab;
    private Factura_Detalle fDet;
    private Modo_Pago modPa;
    private Persona per;
    private Ruta rut;
    private Vehiculo vehi;
    private Viaje via;

    private Date fecha;
    
    private SimpleDateFormat formato;

    private int contador;
    private double totalCP, subtotal, iva, total;
    private DefaultTableModel tablaF;

    public static String x;
    
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Interciclo";
    String user = "postgres";
    String password = "QLJPikrq7833";

    public CrearFactura(String url, String user, String password) {
        initComponents();
        this.bolCon = bolCon;
        this.fCab = fCab;
        this.modCon = modCon;
        this.perCon = perCon;
        this.rutCon = rutCon;
        this.vehiCon = vehiCon;
        this.viaCon = viaCon;
        
        

        this.fCab = new Factura_Cabecera();

        totalCP = 0;
        subtotal = 0;
        iva = 0;
        total = 0;
        tablaF = null;
        bol = null;
        contador = 0;

        //centrar pantalla
        x = "x";

        int a = MenuPrincipal.desktopPane.getWidth() - this.getWidth();
        int b = MenuPrincipal.desktopPane.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
        setVisible(true);
        
        formato = new SimpleDateFormat("yyyy-MM-dd");

        txtTarjeta.setVisible(false);
        btnVal.setVisible(false);

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
        txtApeC = new javax.swing.JTextField();
        lblApeC = new javax.swing.JLabel();
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
        btnVal = new javax.swing.JButton();
        cboMet = new javax.swing.JComboBox<String>();
        txtTarjeta = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        lblTitulo.setText("Crear Factura");

        lblRuc.setBackground(new java.awt.Color(255, 255, 255));
        lblRuc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblRuc.setText("RUC Factura");

        txtRuc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

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

        txtApeC.setEditable(false);
        txtApeC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeC.setEnabled(false);

        lblApeC.setBackground(new java.awt.Color(255, 255, 255));
        lblApeC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeC.setText("Apellido Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblApeC)
                        .addGap(30, 30, 30)
                        .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        lblNomV.setText("Ciudad Llegada");

        txtNomV.setEditable(false);
        txtNomV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblApeV.setBackground(new java.awt.Color(255, 255, 255));
        lblApeV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeV.setText("Costo");

        txtApeV.setEditable(false);
        txtApeV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeV.setEnabled(false);

        lblCedV.setBackground(new java.awt.Color(255, 255, 255));
        lblCedV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCedV.setText("Código");

        txtCodR.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        btnBuscarVF.setText("Buscar");
        btnBuscarVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVFActionPerformed(evt);
            }
        });

        lblCodV.setBackground(new java.awt.Color(255, 255, 255));
        lblCodV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodV.setText("Ciudad Salida");

        txtCallPrin.setEditable(false);
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
                .addContainerGap(60, Short.MAX_VALUE)
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(lblNomV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarVF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(lblNomV)
                    .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeV)
                    .addComponent(txtApeV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedV)
                    .addComponent(txtCodR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomV1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(lblNomV1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCodV1.setBackground(new java.awt.Color(255, 255, 255));
        lblCodV1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodV1.setText("Método de Pago");

        btnVal.setText("Validar");
        btnVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValActionPerformed(evt);
            }
        });

        cboMet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Opciones", "Efectivo", "Tarjeta Credito" }));
        cboMet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMetActionPerformed(evt);
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
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                                .addGap(34, 34, 34))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCodV1)
                .addGap(18, 18, 18)
                .addComponent(cboMet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTarjeta)
                .addGap(18, 18, 18)
                .addComponent(btnVal)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodV1)
                    .addComponent(btnVal)
                    .addComponent(cboMet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
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
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTot)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCFActionPerformed

        String cedula = txtCedC.getText();
        per = perCon.BuscarPer(cedula);

        if (per == null) {
            JOptionPane.showMessageDialog(null, "Cedula no Existe");
        } else {

            txtCodC.setText(Integer.toString(per.getCodigo()));
            txtNomC.setText(per.getNombre());
            txtApeC.setText(per.getApellido());

        }
    }//GEN-LAST:event_btnBuscarCFActionPerformed

    private void tblServFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServFKeyReleased
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            int fila = tblServF.getSelectedRow();
            int columna = tblServF.getSelectedColumn();
            int codigoBol = 0;

            Object[] datos1 = {"", 0, "", "", ""};

            if (columna == 0) {
                codigoBol = Integer.parseInt(tblServF.getValueAt(fila, columna).toString());
                bol = bolCon.BuscarBoleto(codigoBol);

                int cant = Integer.parseInt(tblServF.getValueAt(fila, 1).toString());

                tablaF = (DefaultTableModel) tblServF.getModel();
                tablaF.removeRow(fila);
                totalCP = cant * bol.getValor();

                Object[] datos = {codigoBol,
                    cant,
                    bol.getCodigo(),
                    bol.getValor(),
                    totalCP
                };

                tablaF.addRow(datos);
                tablaF.addRow(datos1);
            } else if (columna == 1) {

                codigoBol = Integer.parseInt(tblServF.getValueAt(fila, columna - 1).toString());
                int cant = Integer.parseInt(tblServF.getValueAt(fila, columna).toString());
                tablaF.removeRow(fila);
                tablaF.removeRow(tblServF.getRowCount() - 1);

                totalCP = cant * bol.getValor();

                Object[] datos = {codigoBol,
                    cant,
                    bol.getCodigo(),
                    bol.getValor(),
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

        }
    }//GEN-LAST:event_tblServFKeyReleased

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed

        x = null;
        this.dispose();

    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //obtener fecha
        fecha = new Date();

        //obtener clases
        String cedulaC = txtCedC.getText();
        per = perCon.BuscarPer(cedulaC);

        //agregarDatos
        fCab.setFecha(fecha);

        //clases
        fCab.setPer(per);

        //facDetalle
        for (int i = 0; i < tblServF.getRowCount() - 1; i++) {
            System.out.println("i " + i);
            fDet = new Factura_Detalle();

            double cant = Integer.parseInt(tblServF.getValueAt(i, 1).toString());
            int cant1 = (int) cant;
            fDet.setCantidad(cant1);

            //facDet.setCodigo(Integer.parseInt(tblServF.getValueAt(i, 0).toString()));
            //int codigoS = ;
            //facDet.setServ(controladorServicio.read(Integer.parseInt(tblServF.getValueAt(i, 0).toString())));
            fDet.setBoleto(bolCon.BuscarBoleto(Integer.parseInt(tblServF.getValueAt(i, 0).toString())));
            fCab.añadirFacDetalle(fDet);
            //            controladorFDetalle.create(facDet);

        }

        llenarDatos();
        //factura
        fCab.setSubtotal(subtotal);
        fCab.setIva(iva);
        fCab.setTotal(total);

        fCabCon.createFacCab(fCab);
        JOptionPane.showMessageDialog(this, "Factura Creada");
        System.out.println("factura \n" + fCab.toString());

    }//GEN-LAST:event_btnCrearActionPerformed

    public void llenarDatos() {
        DefaultTableModel modeloP = (DefaultTableModel) tblServF.getModel();
        List<Factura_Detalle> lista = fCab.getDetalle();

        while (contador < lista.size()) {
            Object[] datos2 = {fCab.getDetalle().get(contador).getCodigo(),
                lista.get(contador).getCantidad(),
                lista.get(contador).getBoleto().getCodigo(),
                lista.get(contador).getBoleto().getValor(),
                lista.get(contador).getTotalCP()
            };
            modeloP.addRow(datos2);
            contador++;
        }

    }

    public void calcularSubtotal() {
        double sub = 0;
        for (int i = 0; i < fCab.getDetalle().size(); i++) {
            sub += fCab.getDetalle().get(i).getTotalCP();
        }
        fCab.setSubtotal(sub);
    }

    public void calcularTotal() {
        double tot = fCab.getSubtotal() + fCab.getIva();
        fCab.setTotal(tot);
    }

    public void vaciarDatos() {

        txtApeC.setText("");
        txtApeV.setText("");
        txtCedC.setText("");
        txtCodC.setText("");
        txtFecha.setText("");
        txtIva.setText("");
        txtNomC.setText("");
        txtNomV.setText("");
        txtSubtotal.setText("");
        txtTotal.setText("");

    }

    private void btnBuscarVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVFActionPerformed


    }//GEN-LAST:event_btnBuscarVFActionPerformed

    private void btnValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValActionPerformed

    private void cboMetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMetActionPerformed

        if (cboMet.getSelectedItem() == "Efectivo") {

            JOptionPane.showConfirmDialog(this, "A elegido la opcion 'Efectivo'");

        } else if (cboMet.getSelectedItem() == "Efectivo") {

            txtTarjeta.setVisible(true);
            btnVal.setVisible(true);

        }

    }//GEN-LAST:event_cboMetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCF;
    private javax.swing.JButton btnBuscarVF;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVal;
    private javax.swing.JComboBox<String> cboMet;
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
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNomC;
    private javax.swing.JLabel lblNomV;
    private javax.swing.JLabel lblNomV1;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTot;
    private javax.swing.JTable tblServF;
    private javax.swing.JTextField txtApeC;
    private javax.swing.JTextField txtApeV;
    private javax.swing.JTextField txtCallPrin;
    private javax.swing.JTextField txtCedC;
    private javax.swing.JTextField txtCodC;
    private javax.swing.JTextField txtCodR;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNomC;
    private javax.swing.JTextField txtNomV;
    private javax.swing.JTextField txtNomV1;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
