package vista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

public class RegistrarDevolucion extends javax.swing.JInternalFrame {
    
    AlmacenProducto almacenProd;
    Devolucion devolucion;
    Permisos permisos;
    DevolucionProducto devolucionProducto;
    Conexion conexion = new Conexion();
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarDevolucion(Permisos p, Devolucion d, AlmacenProducto ap, DevolucionProducto devolucionProducto) {
        this.permisos = p;
        this.devolucion = d;
        this.almacenProd = ap;
        this.devolucionProducto=devolucionProducto;
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFolioDevolucion = new javax.swing.JTextField();
        lblFolioDevolucion = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegCliente = new com.toedter.calendar.JDateChooser();
        btnLimpiarDevolucion = new javax.swing.JButton();
        btnCancelarDevolucion = new javax.swing.JButton();
        btnGenerarDevolucion = new javax.swing.JButton();
        PanelDetallesDevolucion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        spnCantidadDevolver = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtNombreAlmacen = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboFolioVenta = new javax.swing.JComboBox<>();
        txtIdAlmacen = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadVendida = new javax.swing.JTextField();
        txtMedidaProducto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        PanelDetalleSaldo = new javax.swing.JPanel();
        lblIvaVenta = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        lblSubtotalVenta = new javax.swing.JLabel();
        txtSubtotalDevolucion = new javax.swing.JLabel();
        lblSignoDinero = new javax.swing.JLabel();
        txtIvaDevolucion = new javax.swing.JLabel();
        lblSignoDinero1 = new javax.swing.JLabel();
        txtTotalDevolucion = new javax.swing.JLabel();
        lblSignoDinero2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR DEVOLUCIÓN");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        txtFolioDevolucion.setEditable(false);

        lblFolioDevolucion.setText("FOLIO DEVOLUCIÓN");

        lblFechaReg.setText("FECHA REGISTRO");

        DateChooserFechaRegCliente.setEnabled(false);

        btnLimpiarDevolucion.setText("LIMPIAR");
        btnLimpiarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDevolucionActionPerformed(evt);
            }
        });

        btnCancelarDevolucion.setText("CANCELAR");
        btnCancelarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDevolucionActionPerformed(evt);
            }
        });

        btnGenerarDevolucion.setText("GENERAR");
        btnGenerarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarDevolucionActionPerformed(evt);
            }
        });

        PanelDetallesDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Devolución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDetallesDevolucion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID ALMACÉN ORIGEN");
        PanelDetallesDevolucion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ID DE CLIENTE");
        PanelDetallesDevolucion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 99, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ID DE PRODUCTO");
        PanelDetallesDevolucion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 109, -1));

        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(comboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 84, -1));

        spnCantidadDevolver.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spnCantidadDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnCantidadDevolverMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spnCantidadDevolverMousePressed(evt);
            }
        });
        PanelDetallesDevolucion.add(spnCantidadDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 216, 58, -1));

        jLabel7.setText("CANTIDAD");
        PanelDetallesDevolucion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 180, -1, -1));

        txtNombreAlmacen.setEditable(false);
        txtNombreAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlmacenActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(txtNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 192, -1));

        txtNombreCliente.setEditable(false);
        PanelDetallesDevolucion.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 192, -1));

        txtNombreProducto.setEditable(false);
        PanelDetallesDevolucion.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 192, -1));

        jLabel6.setText("PRECIO DE VENTA");
        PanelDetallesDevolucion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 184, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("FOLIO DE VENTA NUM");
        PanelDetallesDevolucion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        comboFolioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboFolioVentaMouseReleased(evt);
            }
        });
        comboFolioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFolioVentaActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(comboFolioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, -1));

        txtIdAlmacen.setEditable(false);
        txtIdAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlmacenActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 84, -1));

        txtIdCliente.setEditable(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 84, -1));

        jLabel9.setText("A DEVOLVER");
        PanelDetallesDevolucion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 195, -1, -1));

        txtPrecioUnitario.setEditable(false);
        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 182, 84, -1));

        jLabel10.setText("CANTIDAD VENDIDA");
        PanelDetallesDevolucion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 218, -1, -1));

        txtCantidadVendida.setEditable(false);
        txtCantidadVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVendidaActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(txtCantidadVendida, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 216, 84, -1));
        PanelDetallesDevolucion.add(txtMedidaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 216, 38, 20));

        jButton1.setText("$");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelDetallesDevolucion.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 26));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVA", "CANCELADA" }));
        comboStatus.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Estatus");

        PanelDetalleSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblIvaVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIvaVenta.setText("IVA");

        lblTotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalVenta.setText("TOTAL");

        lblSubtotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSubtotalVenta.setText("SUBTOTAL");

        lblSignoDinero.setText("$");

        lblSignoDinero1.setText("$");

        lblSignoDinero2.setText("$");

        javax.swing.GroupLayout PanelDetalleSaldoLayout = new javax.swing.GroupLayout(PanelDetalleSaldo);
        PanelDetalleSaldo.setLayout(PanelDetalleSaldoLayout);
        PanelDetalleSaldoLayout.setHorizontalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIvaVenta)
                            .addComponent(lblSubtotalVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero)
                                .addGap(0, 0, 0)
                                .addComponent(txtSubtotalDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero1)
                                .addGap(0, 0, 0)
                                .addComponent(txtIvaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addComponent(lblTotalVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSignoDinero2)
                        .addGap(0, 0, 0)
                        .addComponent(txtTotalDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelDetalleSaldoLayout.setVerticalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSignoDinero)
                                .addComponent(lblSubtotalVenta))
                            .addComponent(txtSubtotalDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIvaVenta))
                    .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSignoDinero1)
                        .addComponent(txtIvaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSignoDinero2)
                        .addComponent(txtTotalDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarDevolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarDevolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarDevolucion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(PanelDetallesDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(lblFolioDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(txtFolioDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(lblFechaReg)
                                        .addGap(6, 6, 6)
                                        .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFolioDevolucion)
                                .addComponent(txtFolioDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaReg)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarDevolucion)
                            .addComponent(btnCancelarDevolucion)
                            .addComponent(btnGenerarDevolucion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelDetallesDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public boolean camposCompletos () {
        int cantidadSpinner = Integer.parseInt(spnCantidadDevolver.getValue().toString());
        if (!txtTotalDevolucion.getText().isEmpty() && comboFolioVenta.getSelectedIndex()!=-1 && comboProductos.getSelectedIndex()!=-1 && cantidadSpinner !=0) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    private void btnGenerarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarDevolucionActionPerformed
           if (camposCompletos()) {
                try {
                    devolucion.setSubtotal(Double.parseDouble(txtSubtotalDevolucion.getText()));
                    devolucion.setIva(Double.parseDouble(txtIvaDevolucion.getText()));
                    devolucion.setTotal(Double.parseDouble(txtTotalDevolucion.getText()));
                    devolucion.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
                    devolucion.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
                    devolucion.setEstatus("ACTIVA");
                    devolucion.registrarDevolucion();
                    //movimientos tabla almacen - producto
                    almacenProd.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
                    almacenProd.setIdProducto(Integer.parseInt(comboProductos.getSelectedItem().toString()));
                    almacenProd.setCantidad(Double.parseDouble(spnCantidadDevolver.getValue().toString()));
                    almacenProd.registarAltaProducto();
                    /*Registro en devolucion_producto*/
                    devolucionProducto.setFolioDev(Integer.parseInt(txtFolioDevolucion.getText()));
                    System.out.println(devolucionProducto.getFolioDev());
                    devolucionProducto.setIdProducto(Integer.parseInt(comboProductos.getSelectedItem().toString()));
                    devolucionProducto.setCantidad(Double.parseDouble(spnCantidadDevolver.getValue().toString()));
                    devolucionProducto.setPrecio(Double.parseDouble(txtPrecioUnitario.getText()));
                    devolucionProducto.registrarDevolucionProd();
                    JOptionPane.showMessageDialog(null,"Devolucion Exitosa");
                    ll.agregarAccion(date.toString(),"Registro de Devolucion");
                    this.dispose();
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }
        
    }//GEN-LAST:event_btnGenerarDevolucionActionPerformed

    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegCliente.setDate(new Date());    //al iniciar setear la fecha actual
        txtFolioDevolucion.setText(String.valueOf(devolucion.obtenerFolio()));    //
        cargarComboFoliosVenta();
    }//GEN-LAST:event_formInternalFrameOpened

    public void cargarComboFoliosVenta() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select folioVenta from venta order by folioVenta");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboFolioVenta.addItem(String.valueOf(rs.getInt(1)));           
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
        
    public int regresarIdAlma () {
        int idAlma=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        int folioVenta = Integer.parseInt(comboFolioVenta.getSelectedItem().toString());
        int IdProducto = Integer.parseInt(comboProductos.getSelectedItem().toString());
        try{
        comando = conexion.getConexion().prepareStatement(" select ap.idAlmacen from venta v join venta_producto vp on v.folioVenta = vp.folioVenta join almacen_producto ap on vp.idProducto = ap.idProducto where v.folioVenta = ? and vp.idProducto = ? ");
        comando.setInt(1, folioVenta);
        comando.setInt(2, IdProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            idAlma = rs.getInt(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idAlma;   
    }
      
    public int regresarIdCli () {
        int idCliente=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        int folioVenta = Integer.parseInt(comboFolioVenta.getSelectedItem().toString());
        try{
        comando = conexion.getConexion().prepareStatement("select idCliente from vistaDevoluciones where folioVenta = ?");
        comando.setInt(1, folioVenta);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      

            idCliente = rs.getInt(1);      
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idCliente;   
    }
    
    public void cargarComboProductos() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        int folioVenta = Integer.parseInt(comboFolioVenta.getSelectedItem().toString());
        try
        {
        comando = conexion.getConexion().prepareStatement("select idProducto from vistaDevoluciones where folioVenta = ?");
        comando.setInt(1, folioVenta);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboProductos.addItem(String.valueOf(rs.getInt(1)));           
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
    
    public double regresarPrecioUnitario () { 
        double precioUnitario=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        int folioVenta = Integer.parseInt(comboFolioVenta.getSelectedItem().toString());
        int idProducto = Integer.parseInt(comboProductos.getSelectedItem().toString());
        try{
        comando = conexion.getConexion().prepareStatement("exec regresarPrecioUnidad ?,? ");
        comando.setInt(1, folioVenta);
        comando.setInt(2, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){
            precioUnitario = rs.getDouble(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return precioUnitario;   
    }
    
    public double regresarCantidadVendida () {
        double cantidadVendida=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        int folioVenta = Integer.parseInt(comboFolioVenta.getSelectedItem().toString());
        int idProducto = Integer.parseInt(comboProductos.getSelectedItem().toString());
        try{
        comando = conexion.getConexion().prepareStatement("select cantidad from vistaDevoluciones where folioVenta = ? and idProducto = ?");
        comando.setInt(1, folioVenta);
        comando.setInt(2, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){
            cantidadVendida = rs.getDouble(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return cantidadVendida;   
        
    }
    
    public String regresarMedidaProducto () {
        String medidaProd=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String idProducto = comboProductos.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement(" select medida from producto where idProducto = ?");
        comando.setString(1, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            medidaProd = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return medidaProd;   
    }
    
    public String regresarNombreCli () {
        String nombre=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        //String folioVenta = comboFolioVenta.getSelectedItem().toString();
        String idC = txtIdCliente.getText();
        try{
        comando = conexion.getConexion().prepareStatement("select nombre from cliente where idCliente = ?");
        comando.setString(1, idC);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            nombre = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return nombre;   
    }
    
    public String regresarNombreAlma () {
        String nombre=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        //String folioVenta = comboFolioVenta.getSelectedItem().toString();
        String idAlma = txtIdAlmacen.getText();
        try{
        comando = conexion.getConexion().prepareStatement("select nombreA from almacen where idAlmacen = ?");
        comando.setString(1, idAlma);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            nombre = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return nombre;   
    }
    
    public String regresarNombreProd () {
        String nombre=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        //String folioVenta = comboFolioVenta.getSelectedItem().toString();
        String idProd = comboProductos.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select nombre from producto where idProducto = ?");
        comando.setString(1, idProd);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            nombre = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return nombre;   
    
    }
    
    private void txtNombreAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlmacenActionPerformed

    private void comboFolioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFolioVentaActionPerformed
        
        try {
            txtIdCliente.setText(String.valueOf(regresarIdCli()));
            txtNombreCliente.setText(String.valueOf(regresarNombreCli()));
            comboProductos.removeAllItems();
            cargarComboProductos();
        }catch (Exception e) {}
        
    }//GEN-LAST:event_comboFolioVentaActionPerformed

    private void comboFolioVentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboFolioVentaMouseReleased
    }//GEN-LAST:event_comboFolioVentaMouseReleased

    private void txtIdAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlmacenActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void txtCantidadVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVendidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVendidaActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed

        if (comboProductos.getSelectedIndex()!=-1) {
            txtPrecioUnitario.setText(String.valueOf(regresarPrecioUnitario()));
            txtCantidadVendida.setText(String.valueOf(regresarCantidadVendida()));
            txtMedidaProducto.setText(regresarMedidaProducto());
            txtNombreProducto.setText(String.valueOf(regresarNombreProd()));
            txtIdAlmacen.setText(String.valueOf(regresarIdAlma()));
            txtNombreAlmacen.setText(String.valueOf(regresarNombreAlma()));
        }
        
        else {
        }
    }//GEN-LAST:event_comboProductosActionPerformed

    private void spnCantidadDevolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCantidadDevolverMouseClicked

    }//GEN-LAST:event_spnCantidadDevolverMouseClicked

    private void spnCantidadDevolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCantidadDevolverMousePressed

    }//GEN-LAST:event_spnCantidadDevolverMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtPrecioUnitario.getText().isEmpty() && Integer.parseInt(spnCantidadDevolver.getValue().toString()) !=0 ) {
        try {
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
            double cantidadDevuelta = Double.parseDouble(spnCantidadDevolver.getValue().toString());
            double subtotalArt = precioUnitario * cantidadDevuelta;
            double totalArt = (subtotalArt * .16)+subtotalArt;
            txtIvaDevolucion.setText(String.valueOf((subtotalArt * .16)));
            txtSubtotalDevolucion.setText(String.valueOf(subtotalArt));
            txtTotalDevolucion.setText(String.valueOf(totalArt));
        }catch (Exception e) {JOptionPane.showMessageDialog(null, "Ingrese una cantidad y un precio valido");}
        
        } else {JOptionPane.showMessageDialog(null, "Ingrese una cantidad y un precio valido");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDevolucionActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarDevolucionActionPerformed

    private void btnLimpiarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDevolucionActionPerformed
        txtIdAlmacen.setText(null);
        txtNombreAlmacen.setText(null);
        txtIdCliente.setText(null);
        txtNombreCliente.setText(null);
        txtNombreProducto.setText(null);
        txtPrecioUnitario.setText(null);
        txtCantidadVendida.setText(null);
        spnCantidadDevolver.setValue(0);
        txtSubtotalDevolucion.setText(null);
        txtIvaDevolucion.setText(null);
        txtTotalDevolucion.setText(null);
        comboProductos.setSelectedIndex(-1);
        comboFolioVenta.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLimpiarDevolucionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegCliente;
    private javax.swing.JPanel PanelDetalleSaldo;
    private javax.swing.JPanel PanelDetallesDevolucion;
    private javax.swing.JButton btnCancelarDevolucion;
    private javax.swing.JButton btnGenerarDevolucion;
    private javax.swing.JButton btnLimpiarDevolucion;
    private javax.swing.JComboBox<String> comboFolioVenta;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblFolioDevolucion;
    private javax.swing.JLabel lblIvaVenta;
    private javax.swing.JLabel lblSignoDinero;
    private javax.swing.JLabel lblSignoDinero1;
    private javax.swing.JLabel lblSignoDinero2;
    private javax.swing.JLabel lblSubtotalVenta;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JSpinner spnCantidadDevolver;
    private javax.swing.JTextField txtCantidadVendida;
    private javax.swing.JTextField txtFolioDevolucion;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JLabel txtIvaDevolucion;
    private javax.swing.JLabel txtMedidaProducto;
    private javax.swing.JTextField txtNombreAlmacen;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JLabel txtSubtotalDevolucion;
    private javax.swing.JLabel txtTotalDevolucion;
    // End of variables declaration//GEN-END:variables
}
