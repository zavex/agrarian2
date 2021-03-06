
package vista;

import com.toedter.calendar.JCalendar;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Pago;

/**
 * Éste es el formulario para registrar pagos.
 * @author Iván Iñiguez
 */

public class frmRegistrarPago extends javax.swing.JFrame {
    ConsultarVenta cVenta;
    ConsultarCompra cCompra;
    Pago p;
    int op = -1;
    Conexion conexion;
    boolean pagoRegistrado;
    
    DefaultComboBoxModel bancos1;
    DefaultComboBoxModel bancos2;
    
    DefaultTableModel pagos;
    
    /**
     * Constructor sobrecargado del formulario de registro de pago, este se usa cuando se quiere registrar un pago a una venta 
     * @param cV Instancia del formulario consultar venta, es necesario para aplicar un pago.
     * @param opcion Determina si se está registrando un pago a proveedor o un pago de un cliente.
     * @param datos Recibe el folio y la fecha del movimiento.
     */
    public frmRegistrarPago(ConsultarVenta cV,int opcion, int[] datos) {
        initComponents();
        this.cVenta = cV;
        this.op = opcion;
        crearVentana(opcion);
        creaComboBanco();
        this.pagoRegistrado = false;
        
        this.p = new Pago(datos, opcion);
        this.p.llenarFormulario(txtFolio, tfFechaVenta, txtNombreC, txtMonto, txtIVA, txtTotal, txtEstatus,txtSaldo);
    }
    /**
     * Constructor sobrecargado del formulario de registro de pago, este se usa cuando se quiere registrar un pago a una compra
     * @param cC Instancia del formulario consultar compra, es necesario para aplicar un pago.
     * @param opcion Determina si se está registrando un pago a proveedor o un pago de un cliente.
     * @param datos Recibe el folio y la fecha del movimiento.
     */
    public frmRegistrarPago(ConsultarCompra cC, int opcion, int[] datos){
        initComponents();
        this.cCompra = cC;
        this.op = opcion;
        crearVentana(opcion);
        creaComboBanco();
        
        this.pagoRegistrado = false;
        this.p = new Pago(datos, opcion);
        this.p.llenarFormulario(txtFolio, tfFechaVenta, txtNombreC, txtMonto, txtIVA, txtTotal, txtEstatus,txtSaldo);
    }
    
    /**
     * Método para cargar bancos a la lista desplegable.
     */
    public void creaComboBanco(){
        String[] listaBancos = {"Banamex","Santander","Bancomer","IXE","Banorte","HSBC","Inbursa","Afirme","Scotiabank"};
        bancos1 = new DefaultComboBoxModel();
        bancos2 = new DefaultComboBoxModel();
        for (int i=0; i < listaBancos.length;i++) {
                bancos1.addElement(listaBancos[i]);
                bancos2.addElement(listaBancos[i]);
        }
        menuBDestino.setModel(bancos1);
        menuBOrigen.setModel(bancos2);
        menuBDestino.setSelectedIndex(-1);
        menuBOrigen.setSelectedIndex(-1);
    }

    /**
     * Le da formato a la ventana dependiendo de si es pago a proveedor o pago de cliente.
     * @param x recibe la opción que creo el formulario.
     * @see frmRegistrarPago
     */
    public void crearVentana(int x){
        this.setTitle("Registro de pagos");
        switch(x){
            case 1: //Venta
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la venta"));
                lblFolio.setText("Folio de Venta");
                lbfechaV.setText("Fecha de Venta");
                lbNombreC.setText("Nombre del Cliente");
                menuBOrigen.setEnabled(false);
                break;
            case 2:
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la compra"));
                lblFolio.setText("Folio de Compra");
                lbfechaV.setText("Fecha de Compra");
                lbNombreC.setText("Nombre del empleado");
                break;
        }
        
    }
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capturaPago = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        panBotonera = new javax.swing.JPanel();
        btnSalirDialog = new javax.swing.JButton();
        btnLimpiarDialog = new javax.swing.JButton();
        btnGuardarDialog = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblBOrigen = new javax.swing.JLabel();
        menuBOrigen = new javax.swing.JComboBox<String>();
        lblBDestino = new javax.swing.JLabel();
        menuBDestino = new javax.swing.JComboBox<String>();
        jPanel7 = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidadAbonada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Pago = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfFechaActual = new com.toedter.calendar.JDateChooser();
        lbFechaActual = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbfechaV = new javax.swing.JLabel();
        tfFechaVenta = new com.toedter.calendar.JDateChooser();
        lbNombreC = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lbIVA = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        lbSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();
        btnEliminarPago = new javax.swing.JButton();
        btnRegistrarPago = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNulo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        capturaPago.setTitle("Captura de pago");
        capturaPago.setAlwaysOnTop(true);
        capturaPago.setModal(true);
        capturaPago.setUndecorated(true);
        capturaPago.setResizable(false);
        capturaPago.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panBotonera.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panBotonera.setLayout(new java.awt.GridLayout(1, 0));

        btnSalirDialog.setText("Salir");
        btnSalirDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnSalirDialog);

        btnLimpiarDialog.setText("Limpiar");
        btnLimpiarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnLimpiarDialog);

        btnGuardarDialog.setText("Guardar");
        btnGuardarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnGuardarDialog);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBOrigen.setText("Banco Origen");

        menuBOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBDestino.setText("Banco Destino");

        menuBDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBOrigen)
                    .addComponent(lblBDestino))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuBOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBDestino, lblBOrigen});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBOrigen)
                    .addComponent(menuBOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBDestino)
                    .addComponent(menuBDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBDestino, lblBOrigen, menuBDestino, menuBOrigen});

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantidad.setText("Cantidad");

        txtCantidadAbonada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadAbonadaKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresa la cantidad abonada");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadAbonada)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidadAbonada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblCantidad, txtCantidadAbonada});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        capturaPago.getContentPane().add(jPanel5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de pagos");
        setMinimumSize(new java.awt.Dimension(405, 445));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Pago.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout PagoLayout = new javax.swing.GroupLayout(Pago);
        Pago.setLayout(PagoLayout);
        PagoLayout.setHorizontalGroup(
            PagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PagoLayout.setVerticalGroup(
            PagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbFechaActual.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbFechaActual.setForeground(new java.awt.Color(0, 0, 102));
        lbFechaActual.setText("Fecha de pago");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFechaActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbFechaActual, tfFechaActual});

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lbfechaV.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbfechaV.setForeground(new java.awt.Color(0, 0, 102));
        lbfechaV.setText("Fecha de venta");

        lbNombreC.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNombreC.setForeground(new java.awt.Color(0, 0, 102));
        lbNombreC.setText("Razón social del proveedor");

        lblFolio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(0, 0, 102));
        lblFolio.setText("Folio Venta");

        txtFolio.setEditable(false);
        txtFolio.setFocusable(false);

        lblMonto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(0, 0, 102));
        lblMonto.setText("Monto");

        txtMonto.setEditable(false);
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setFocusable(false);

        lbIVA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbIVA.setForeground(new java.awt.Color(0, 0, 102));
        lbIVA.setText("IVA");

        txtIVA.setEditable(false);
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIVA.setFocusable(false);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 102));
        lblTotal.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setFocusable(false);

        lblEstatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstatus.setForeground(new java.awt.Color(0, 0, 102));
        lblEstatus.setText("Estatus");

        txtEstatus.setEditable(false);
        txtEstatus.setFocusable(false);

        lbSaldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbSaldo.setForeground(new java.awt.Color(0, 0, 102));
        lbSaldo.setText("Saldo pendiente");

        txtSaldo.setEditable(false);
        txtSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaldo.setFocusable(false);

        txtNombreC.setEditable(false);
        txtNombreC.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addComponent(lbIVA)
                            .addComponent(lblMonto))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEstatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstatus)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbSaldo)
                                .addGap(18, 18, 18)
                                .addComponent(txtSaldo)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lbNombreC)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombreC))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFolio)
                                .addGap(18, 18, 18)
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(lbfechaV)
                                .addGap(18, 18, 18)
                                .addComponent(tfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbfechaV)
                        .addComponent(lblFolio)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreC)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstatus))
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIVA)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSaldo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbfechaV, lblFolio, tfFechaVenta, txtFolio});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbNombreC, txtEstatus, txtNombreC, txtSaldo});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbIVA, lbSaldo, lblEstatus, lblMonto, lblTotal, txtIVA, txtMonto, txtTotal});

        tablaPagos.setBackground(new java.awt.Color(255, 255, 255));
        tablaPagos.setForeground(new java.awt.Color(0, 0, 102));
        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPagos);

        btnEliminarPago.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPago.setText("Eliminar pago");
        btnEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPagoActionPerformed(evt);
            }
        });

        btnRegistrarPago.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPago.setText("Registrar pago");
        btnRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagoActionPerformed(evt);
            }
        });

        tablaHistorial.setBackground(new java.awt.Color(255, 255, 255));
        tablaHistorial.setForeground(new java.awt.Color(0, 0, 102));
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaHistorial);

        btnSalir.setBackground(new java.awt.Color(102, 102, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnNulo.setBackground(new java.awt.Color(102, 102, 255));
        btnNulo.setBorderPainted(false);
        btnNulo.setContentAreaFilled(false);
        btnNulo.setEnabled(false);
        btnNulo.setFocusable(false);
        btnNulo.setRequestFocusEnabled(false);
        jPanel2.add(btnNulo);

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setEnabled(false);
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(btnEliminarPago)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarPago))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEliminarPago, btnRegistrarPago});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPago)
                    .addComponent(btnEliminarPago))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminarPago, btnRegistrarPago});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Obtiene la fecha del sistema y la inserta en el cuadro de texto de fecha.
     */
    public void generarFecha(){
        Date fechaActual = new Date();
        tfFechaActual.setDate(fechaActual); 
    }
    
    /**
     * Este evento se ejecuta cuando se abre la ventana, invoca al método generador de fecha y crea la tabla de pagos.
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       generarFecha();
       tablaHistorico();
       if(tablaHistorial.getRowCount()>0){
           double totalFactura = Double.valueOf(txtTotal.getText().substring(2));
           double saldo = 0;
           for(int i=0;i<tablaHistorial.getRowCount();i++){
               saldo = saldo+Double.valueOf(tablaHistorial.getValueAt(i,2).toString().substring(2));
           }
           saldo = totalFactura - saldo;
           txtSaldo.setText("$ "+saldo);
       }
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * Se encarga de mostrar todos los pagos aplicados al registro seleccionado.
     */
    public void tablaHistorico(){
       tablaHistorial.setModel(p.cargarHistorial(op));
       tablaHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       tablaHistorial.getColumnModel().getColumn(0).setMaxWidth(60);
       tablaHistorial.getColumnModel().getColumn(1).setMinWidth(160);
       tablaHistorial.setAutoCreateRowSorter(true);
    }
    
    /**
     * Aplica el pago a la venta seleccionada.
     * @param evt 
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(pagoRegistrado){
            if(tfFechaActual.getDate()!=null){
                System.out.println(tfFechaActual.getDate());
                BigDecimal montoAbontado = new BigDecimal(tablaPagos.getValueAt(0, 0).toString().substring(2)).setScale(2, RoundingMode.HALF_UP);
                String bancoDest;
                String bancoOrigen;
                switch(op){
                    case 1:
                        bancoDest = tablaPagos.getValueAt(0, 1).toString();
                        if(p.grabarPago(tfFechaActual.getDate(), montoAbontado, bancoDest)){
                            JOptionPane.showMessageDialog(this, "Registro de pago exitoso","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }
                        break;
                    case 2:
                        bancoOrigen = tablaPagos.getValueAt(0, 1).toString();
                        bancoDest = tablaPagos.getValueAt(0, 2).toString();
                        if(p.grabarPago(tfFechaActual.getDate(), montoAbontado,bancoOrigen, bancoDest)){
                            JOptionPane.showMessageDialog(this, "Registro de pago exitoso","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay un pago registrado","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    /**
     * Guarda los cambios realizados a la venta seleccionada. 
     * @param evt 
     */
    private void btnRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagoActionPerformed
        double saldo = Double.valueOf(txtSaldo.getText().substring(2));
        if(saldo != 0){
            if(!pagoRegistrado){
            capturaPago.setSize(250, 223);
            capturaPago.setLocationRelativeTo(this);
            capturaPago.setVisible(true);
            
            } else {
                JOptionPane.showMessageDialog(this, "Ya hay un pago registrado","Mensaje",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El monto de esta factura ya fue cubierto","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnRegistrarPagoActionPerformed

    private void btnSalirDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDialogActionPerformed
        capturaPago.dispose();
    }//GEN-LAST:event_btnSalirDialogActionPerformed

    private void btnLimpiarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDialogActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarDialogActionPerformed
    
    /**
     * Guarda la cantidad y el banco emisor/receptor, se encuentra en la ventana emergente capturar pago.
     * @param evt 
     */
    private void btnGuardarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDialogActionPerformed
        Vector columna = new Vector();
        switch(op){
            case 1:
                if(txtCantidadAbonada.getText().length()>0){
                    double saldo = Double.parseDouble(txtSaldo.getText().substring(2));
                    double abono = Double.parseDouble(txtCantidadAbonada.getText());
                    if(abono > saldo){
                        txtCantidadAbonada.setText(String.valueOf(saldo));
                        columna.addElement("$ "+(txtCantidadAbonada.getText()));
                    } else {
                        columna.addElement("$ "+(txtCantidadAbonada.getText()));
                    }
                    
                    if(menuBDestino.getSelectedIndex()!=-1){
                        columna.addElement(menuBDestino.getSelectedItem());
                        crearTabla(columna);
                        limpiar();
                        capturaPago.dispose();
                    } else {
                        menuBDestino.requestFocus();
                    }
                } else {
                    txtCantidadAbonada.requestFocus();
                }
                break;
            case 2:
                if(txtCantidadAbonada.getText().length()>0){
                    double saldo = Double.parseDouble(txtSaldo.getText().substring(2));
                    double abono = Double.parseDouble(txtCantidadAbonada.getText());
                    if(abono > saldo){
                        txtCantidadAbonada.setText(String.valueOf(saldo));
                        columna.addElement("$ "+(txtCantidadAbonada.getText()));
                    } else {
                        columna.addElement("$ "+(txtCantidadAbonada.getText()));
                    }
                    
                    if(menuBOrigen.getSelectedIndex()!=-1){
                        columna.addElement(menuBOrigen.getSelectedItem());
                        
                        if(menuBDestino.getSelectedIndex()!=-1){
                        columna.addElement(menuBDestino.getSelectedItem());
                        crearTabla(columna);
                        limpiar();
                        capturaPago.dispose();
                        } else {
                            menuBDestino.requestFocus();
                        }
                    } else {
                            menuBOrigen.requestFocus();
                    } 
                } else {
                    txtCantidadAbonada.requestFocus();
                }
                break;
        }
    }//GEN-LAST:event_btnGuardarDialogActionPerformed
    
    /**
     * Este método limita los caracteres que puede recibir el cuadro de texto a solo dígitos.
     * @param evt 
     */
    private void txtCantidadAbonadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadAbonadaKeyTyped
        if(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar()=='.'){
            if(evt.getKeyChar()=='.' && txtCantidadAbonada.getText().contains(".")){
                evt.consume();
            }
        } else {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtCantidadAbonadaKeyTyped
    
    /**
     * Elimina el pago seleccionado de la lista previa antes de ser guardado en la base de datos.
     * @param evt 
     */
    private void btnEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPagoActionPerformed
        if(pagoRegistrado){
            pagos.removeRow(0);
            tablaPagos.setModel(pagos);
            this.pagoRegistrado = false;
        }
    }//GEN-LAST:event_btnEliminarPagoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiar(){
        creaComboBanco();
        txtCantidadAbonada.setText("");
    }
    
    /**
     * Consulta y despliega la información de pagos aplicados previamente a la venta seleccionada
     * @param filas Filas de la tabla
     */
    public void crearTabla(Vector filas){
        switch(this.op){
            case 1:
                pagos = new DefaultTableModel(){
                    Class[] tipoColumn = {String.class,String.class};
                    boolean[] editColumn = {false,false};
                    @Override
                    public Class getColumnClass(int indColumn){
                        return tipoColumn[indColumn];
                    }
                    @Override
                    public boolean isCellEditable(int indFila, int indColum){
                        return editColumn[indColum];
                    }
                };
                pagos.addColumn("Cantidad");
                pagos.addColumn("Banco receptor");
                pagos.addRow(filas);
                tablaPagos.setModel(pagos);
                tablaPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                tablaPagos.getColumnModel().getColumn(0).setMaxWidth(80);
                tablaPagos.getColumnModel().getColumn(1).setMinWidth(120);
                tablaPagos.setAutoCreateRowSorter(true);
                this.pagoRegistrado = true;
                break;
            case 2:
                pagos = new DefaultTableModel(){
                    Class[] tipoColumn = {String.class,String.class,String.class};
                    boolean[] editColumn = {false,false};
                    @Override
                    public Class getColumnClass(int indColumn){
                        return tipoColumn[indColumn];
                    }
                    @Override
                    public boolean isCellEditable(int indFila, int indColum){
                        return editColumn[indColum];
                    }
                };
                pagos.addColumn("Cantidad");
                pagos.addColumn("Banco emisor");
                pagos.addColumn("Banco receptor");
                pagos.addRow(filas);
                tablaPagos.setModel(pagos);
                tablaPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                tablaPagos.getColumnModel().getColumn(0).setMinWidth(60);
                tablaPagos.getColumnModel().getColumn(1).setMinWidth(100);
                tablaPagos.getColumnModel().getColumn(2).setMinWidth(100);
                tablaPagos.setAutoCreateRowSorter(true);
                this.pagoRegistrado = true;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pago;
    private javax.swing.JButton btnEliminarPago;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarDialog;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarDialog;
    private javax.swing.JButton btnNulo;
    private javax.swing.JButton btnRegistrarPago;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirDialog;
    private javax.swing.JDialog capturaPago;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFechaActual;
    private javax.swing.JLabel lbIVA;
    private javax.swing.JLabel lbNombreC;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbfechaV;
    private javax.swing.JLabel lblBDestino;
    private javax.swing.JLabel lblBOrigen;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JComboBox<String> menuBDestino;
    private javax.swing.JComboBox<String> menuBOrigen;
    private javax.swing.JPanel panBotonera;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTable tablaPagos;
    private com.toedter.calendar.JDateChooser tfFechaActual;
    private com.toedter.calendar.JDateChooser tfFechaVenta;
    private javax.swing.JTextField txtCantidadAbonada;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
