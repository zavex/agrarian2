package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Este formulario se encarga de mostrar la ventana de registro de Clientes.
 * @author Save Soto
 */
public class RegistrarProveedor extends javax.swing.JInternalFrame {
    
    Proveedor proveedor;
    Permisos permisos;
    Log ll = new Log();
    Date date = new Date ();
    
    /**
     * Constructor de la vista de registro de Clientes.
     * @param p     Recibe la instancia de la clase Permisos.
     * @param pp    Recibe la instancia de la clase Proveedor. 
     */
    public RegistrarProveedor(Permisos p, Proveedor pp) {
        this.permisos = p;
        this.proveedor = pp;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIdProveedor = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegProveedor = new com.toedter.calendar.JDateChooser();
        image = new javax.swing.JLabel();
        PanelDatosContacto = new javax.swing.JPanel();
        lblNombreProveedor = new javax.swing.JLabel();
        lblRfcProveedor = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtRfcProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        lblTelefonoProveedor = new javax.swing.JLabel();
        lblCorreoProveedor = new javax.swing.JLabel();
        txtCorreoProveedor = new javax.swing.JTextField();
        lblContactoProveedor = new javax.swing.JLabel();
        txtContactoProveedor = new javax.swing.JTextField();
        PanelDatosDemograficos = new javax.swing.JPanel();
        lblCpProveedor = new javax.swing.JLabel();
        lblMunicipioProveedor = new javax.swing.JLabel();
        txtCpProveedor = new javax.swing.JTextField();
        txtMunicipioProveedor = new javax.swing.JTextField();
        lblDireccionProveedor = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JTextField();
        lblEstadoProveedor = new javax.swing.JLabel();
        txtEstadoProveedor = new javax.swing.JTextField();
        btnLimpiarProveedor = new javax.swing.JButton();
        btnCancelarProveedor = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Proveedor");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIdProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblIdProveedor.setText("Id Proveedor");

        txtIdProveedor.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegProveedor.setEnabled(false);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDatosContacto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreProveedor.setText("Nombre");
        PanelDatosContacto.add(lblNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 33, 52, -1));

        lblRfcProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRfcProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblRfcProveedor.setText("RFC");
        PanelDatosContacto.add(lblRfcProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 71, 52, -1));

        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, -1));

        txtRfcProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcProveedorActionPerformed(evt);
            }
        });
        txtRfcProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcProveedorKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtRfcProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, -1));

        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 30, 200, -1));

        lblTelefonoProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoProveedor.setText("Teléfono");
        PanelDatosContacto.add(lblTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 33, -1, -1));

        lblCorreoProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblCorreoProveedor.setText("Correo");
        PanelDatosContacto.add(lblCorreoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 71, 62, -1));

        txtCorreoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoProveedorKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCorreoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 68, 200, -1));

        lblContactoProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContactoProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblContactoProveedor.setText("Contacto");
        PanelDatosContacto.add(lblContactoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtContactoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoProveedorKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtContactoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 490, -1));

        PanelDatosDemograficos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosDemograficos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Demográficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosDemograficos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCpProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCpProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblCpProveedor.setText("CP");
        PanelDatosDemograficos.add(lblCpProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 25, -1));

        lblMunicipioProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMunicipioProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblMunicipioProveedor.setText("Municipio");
        PanelDatosDemograficos.add(lblMunicipioProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 71, 63, -1));

        txtCpProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpProveedorActionPerformed(evt);
            }
        });
        txtCpProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpProveedorKeyTyped(evt);
            }
        });
        PanelDatosDemograficos.add(txtCpProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 62, -1));

        txtMunicipioProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioProveedorKeyTyped(evt);
            }
        });
        PanelDatosDemograficos.add(txtMunicipioProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 71, 200, -1));

        lblDireccionProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblDireccionProveedor.setText("Dirección");
        PanelDatosDemograficos.add(lblDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 44, -1, -1));

        txtDireccionProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionProveedorKeyTyped(evt);
            }
        });
        PanelDatosDemograficos.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 42, 470, -1));

        lblEstadoProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstadoProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblEstadoProveedor.setText("Estado");
        PanelDatosDemograficos.add(lblEstadoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 52, -1));

        txtEstadoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoProveedorKeyTyped(evt);
            }
        });
        PanelDatosDemograficos.add(txtEstadoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 100, -1));

        btnLimpiarProveedor.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor.setText("Limpiar");
        btnLimpiarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedorActionPerformed(evt);
            }
        });

        btnCancelarProveedor.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProveedor.setText("Cancelar");
        btnCancelarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProveedorActionPerformed(evt);
            }
        });

        btnRegistrarProveedor.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedor.setText("Registrar");
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDatosContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(btnLimpiarProveedor)
                                .addGap(10, 10, 10)
                                .addComponent(btnCancelarProveedor)
                                .addGap(6, 6, 6)
                                .addComponent(btnRegistrarProveedor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(lblFechaReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateChooserFechaRegProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(image)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdProveedor)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaReg)))
                    .addComponent(DateChooserFechaRegProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarProveedor)
                    .addComponent(btnCancelarProveedor)
                    .addComponent(btnRegistrarProveedor))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Verifica que toda la información haya sido introducida al formulario.
     * @return Regresa un valor booleano para indicar si se completado información.  
     */
    public boolean camposCompletos () {
        if (!txtNombreProveedor.getText().isEmpty() && !txtTelefonoProveedor.getText().isEmpty() && !txtRfcProveedor.getText().isEmpty() && 
                !txtCorreoProveedor.getText().isEmpty() && !txtContactoProveedor.getText().isEmpty() && !txtDireccionProveedor.getText().isEmpty() && !txtMunicipioProveedor.getText().isEmpty() && !txtCpProveedor.getText().isEmpty() && !txtEstadoProveedor.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    
    /**
     * Método para convertir fecha de tipo java.util.date a un formato compatible con SQL.
     * @param date  fecha de tipo java date.
     * @return regresa un dato de tipo sql date.
     */
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    /**
     * Recopila la información cargada en la vista y la envía al método alojado en la clase de Proveedor para su respectiva actualización en la base de datos.
     * @param evt  
     */
    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
            if (camposCompletos()) {
                try {
                    proveedor.setNombre(txtNombreProveedor.getText());
                    proveedor.setRfc(txtRfcProveedor.getText());
                    proveedor.setDireccion(txtDireccionProveedor.getText());
                    proveedor.setTelefono(txtTelefonoProveedor.getText());
                    proveedor.setCp(txtCpProveedor.getText());
                    proveedor.setMunicipio(txtMunicipioProveedor.getText());
                    proveedor.setEstado(txtEstadoProveedor.getText());
                    proveedor.setCorreo(txtCorreoProveedor.getText());
                    proveedor.setContacto(txtContactoProveedor.getText());
                    proveedor.registrarProveedor();
                    limpiarCajas();
                    txtIdProveedor.setText(String.valueOf(proveedor.obtenerNoId()));
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    ll.agregarAccion(date.toString(),"Registro de Proveedor");
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }    
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    /**
     * Método obsoleto o no usado.
     * @param evt 
     */
    private void txtRfcProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcProveedorActionPerformed

    /**
     * Método obsoleto o no usado.
     * @param evt 
     */
    private void txtCpProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpProveedorActionPerformed

    /**
     * Método de apertura, se encarga de cargar la fecha y el id generado por la base de datos para su registro.
     * @param evt 
     */
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegProveedor.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdProveedor.setText(String.valueOf(proveedor.obtenerNoId()));    

    }//GEN-LAST:event_formInternalFrameOpened

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 60 caracteres.
     * @param evt 
     */
    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreProveedor.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>59) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 13 caracteres.
     * @param evt 
     */
    private void txtRfcProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcProveedorKeyTyped
        String rfc = txtRfcProveedor.getText();
        if (rfc.length()>12) {
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtRfcProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 50 caracteres.
     * @param evt 
     */
    private void txtContactoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoProveedorKeyTyped
        char c=evt.getKeyChar(); 
        String contacto = txtContactoProveedor.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (contacto.length()>49) {
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtContactoProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras y solo permite ingresar hasta 12 caracteres.
     * @param evt 
     */
    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        char c = evt.getKeyChar();
        String telefono = txtTelefonoProveedor.getText();
        
        if(telefono.length()>11){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
        
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
    private void txtCorreoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProveedorKeyTyped
        String correo = txtCorreoProveedor.getText();
        if (correo.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCorreoProveedorKeyTyped

    /**
     * alida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 50 caracteres.
     * @param evt 
     */
    private void txtDireccionProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionProveedorKeyTyped
        
        String direccion = txtDireccionProveedor.getText();
        if (direccion.length()>49) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDireccionProveedorKeyTyped

    /**
     * alida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
    private void txtMunicipioProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioProveedorKeyTyped
        char c=evt.getKeyChar(); 
        String municipio = txtMunicipioProveedor.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (municipio.length()>29) {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_txtMunicipioProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras y solo permite ingresar hasta 5 caracteres.
     * @param evt 
     */
    private void txtCpProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpProveedorKeyTyped
        char c = evt.getKeyChar();
        String cp = txtCpProveedor.getText();
        
        if(cp.length()>4){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
    }//GEN-LAST:event_txtCpProveedorKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
    private void txtEstadoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoProveedorKeyTyped
        char c=evt.getKeyChar(); 
        String estado = txtEstadoProveedor.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (estado.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtEstadoProveedorKeyTyped

    /**
     * Invoca el método para limpiar las casillas del formulario
     * @param evt 
     * @see limpiarCajas()
     */
    private void btnLimpiarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedorActionPerformed
        
      limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarProveedorActionPerformed

    /**
     * Limpia las casillas de texto del formulario.
     */
    public void limpiarCajas() {
        
        txtTelefonoProveedor.setText(null);
        txtRfcProveedor.setText(null);
        txtNombreProveedor.setText(null);
        txtMunicipioProveedor.setText(null);
        txtEstadoProveedor.setText(null);
        txtDireccionProveedor.setText(null);
        txtCpProveedor.setText(null);
        txtCorreoProveedor.setText(null);
        txtContactoProveedor.setText(null);
        
    }
    
    /**
     * Se encarga de cerrar la ventana de registro.
     * @param evt 
     */
    private void btnCancelarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProveedorActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegProveedor;
    private javax.swing.JPanel PanelDatosContacto;
    private javax.swing.JPanel PanelDatosDemograficos;
    private javax.swing.JButton btnCancelarProveedor;
    private javax.swing.JButton btnLimpiarProveedor;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContactoProveedor;
    private javax.swing.JLabel lblCorreoProveedor;
    private javax.swing.JLabel lblCpProveedor;
    private javax.swing.JLabel lblDireccionProveedor;
    private javax.swing.JLabel lblEstadoProveedor;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdProveedor;
    private javax.swing.JLabel lblMunicipioProveedor;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JLabel lblRfcProveedor;
    private javax.swing.JLabel lblTelefonoProveedor;
    private javax.swing.JTextField txtContactoProveedor;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtCpProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtEstadoProveedor;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMunicipioProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRfcProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
