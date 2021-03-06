package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Almacen {
    
    private int idAlmacen;
    private String nombreA;
    private Date fechaReg;
    private String direccion;
    private String telefono;
    private String capacidad;
    private int idEmpleado;
    private Conexion conexion;
    
    public Almacen (Conexion conexion) {
      idAlmacen = -1;
      nombreA = null;
      fechaReg = null;
      direccion = null;
      telefono = null;
      capacidad = null;      
      idEmpleado = -1;
      this.conexion = conexion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
     public int obtenerNoId(){
        
        int valor=0;
        
        conexion.conexionSQL();
        PreparedStatement comando = null;
        
        try {
            comando = conexion.getConexion().prepareStatement("SELECT idAlmacen FROM almacen");
            comando.executeQuery();
            ResultSet rs = comando.executeQuery();
        
            while(rs.next()){
                valor = rs.getInt(1);
            }
        
        } catch (SQLException e) {}
    
        valor++;
    
        return valor;
    
    }

    public void registrarAlmacen() {
        
        conexion.conexionSQL();
        
        PreparedStatement comand = null;
        
        try {
            
            comand = conexion.getConexion().prepareStatement("exec ingresa_almacen ?,?,?,?,?,?");
            comand.setInt(1, this.idAlmacen);
            comand.setString(2, this.nombreA);
            comand.setString(3, this.direccion);
            comand.setString(4, this.telefono);
            comand.setString(5, this.capacidad);
            comand.setInt(6, this.idEmpleado);
            comand.executeUpdate();
            conexion.desconectarSQL();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public DefaultTableModel consultarAlmacenTotales () {
        DefaultTableModel ProvTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("select "+query+" from almacen");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ProvTable.addColumn(rsm.getColumnLabel(1));
            ProvTable.addColumn(rsm.getColumnLabel(2));
            ProvTable.addColumn(rsm.getColumnLabel(3));
            ProvTable.addColumn(rsm.getColumnLabel(4));
            ProvTable.addColumn(rsm.getColumnLabel(5));
            ProvTable.addColumn(rsm.getColumnLabel(6));
            ProvTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                ProvTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return ProvTable;
    }
    
    public DefaultTableModel consultarAlmacenId () {
        String id = String.valueOf(this.idAlmacen);
        id = id.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
       try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE idAlmacen LIKE ? ESCAPE '!'");
            comando.setString(1,id + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;   
    }
    
    public DefaultTableModel consultarAlmacenNombre () {
        String nombree = this.nombreA.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE nombreA LIKE ? ESCAPE "
                    + "'!'");
            comando.setString(1,nombree + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila); 
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    
    }
    
    public DefaultTableModel consultarAlmacenDireccion () {
        String direccionn = this.direccion.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
         try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE direccion LIKE ? ESCAPE '!'");
            comando.setString(1,direccionn + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            
            while (rs.next()) {
                
                Vector fila = new Vector ();
                
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarAlmacenTelefono () {
        String telefonoo = this.telefono.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE telefono LIKE ? ESCAPE '!'");
            comando.setString(1,telefonoo + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
    
    public DefaultTableModel consultarAlmacenCapacidad () {
        String capacidadd = this.capacidad.replace("!", "!!").replace("%", "!%").replace("_", "!_").replace("[", "![");
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");        
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE capacidad LIKE ? ESCAPE '!'");
            comando.setString(1, capacidadd + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return empTable;    
    }
    
    public DefaultTableModel consultarIdEmpleado () {
        DefaultTableModel empTable = new DefaultTableModel ();
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try {
            String query = ("idAlmacen as \"Id Almacén\", fechaReg as \"Fecha Registro\", nombreA as Almacén, direccion as Dirección, telefono as Teléfono, capacidad as Capacidad, idEmpleado as \"Id Empleado\"");
            comando = conexion.getConexion().prepareStatement("SELECT "+query+" FROM almacen WHERE idEmpleado LIKE ? ESCAPE '!'");
            comando.setString(1, this.idEmpleado + "%");
            ResultSet rs = comando.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            empTable.addColumn(rsm.getColumnLabel(1));
            empTable.addColumn(rsm.getColumnLabel(2));
            empTable.addColumn(rsm.getColumnLabel(3));
            empTable.addColumn(rsm.getColumnLabel(4));
            empTable.addColumn(rsm.getColumnLabel(5));
            empTable.addColumn(rsm.getColumnLabel(6));
            empTable.addColumn(rsm.getColumnLabel(7));
            while (rs.next()) {
                Vector fila = new Vector ();
                fila.addElement(rs.getInt(1));
                fila.addElement(rs.getDate(2));
                fila.addElement(rs.getString(3));
                fila.addElement(rs.getString(4));
                fila.addElement(rs.getString(5));
                fila.addElement(rs.getString(6));
                fila.addElement(rs.getString(7));
                empTable.addRow(fila);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();        
        return empTable;
    }
     
    public void modificarAlmacen () {
        conexion.conexionSQL();
        PreparedStatement ps = null;
        try {
            ps = conexion.getConexion().prepareStatement("exec ingresa_almacen ?,?,?,?,?,?");
            ps.setInt(1, this.idAlmacen);
            ps.setString(2, this.nombreA);
            ps.setString(3, this.direccion);
            ps.setString(4, this.telefono);
            ps.setString(5, this.capacidad);
            ps.setInt(6, this.idEmpleado);
            ps.executeUpdate();
           
            conexion.desconectarSQL();
        
        }catch (Exception e) {
        
            System.out.println("error en conexion");
        
        }
    }
    
    public boolean buscarAlmacen(int buscar) {
        
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
        String query = "SELECT "
                + "idAlmacen AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombreA AS 'Almacen', "
                + "direccion AS 'Dirección', "
                + "telefono AS 'Telefono', "
                + "capacidad AS 'Capacidad', "
                + "idEmpleado AS 'ID_Emp' "
                + "FROM almacen "
                + "WHERE idAlmacen = " + buscar;

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idAlmacen = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombreA = rs.getString(3);
                direccion = rs.getString(4);
                telefono = rs.getString(5);
                capacidad = rs.getString(6);
                idEmpleado = rs.getInt(7);
                completado = true;
            } else {
               
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            
            }
        
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        
        }

        conexion.desconectarSQL();
        return completado;

    }
    
    public boolean buscarAlmacenN(String buscar) {
        boolean completado = false;
        conexion.conexionSQL();

        // Instrucción
         String query = "SELECT "
                + "idAlmacen AS 'ID', "
                + "fechaReg AS 'Fecha de registro', "
                + "nombreA AS 'Almacen', "
                + "direccion AS 'Dirección', "
                + "telefono AS 'Telefono', "
                + "capacidad AS 'Capacidad', "
                + "idEmpleado AS 'ID_Emp' "
                + "FROM almacen "
                + "WHERE nombreA LIKE '%" + buscar + "%'";

        try {
            PreparedStatement consulta = conexion.getConexion().prepareStatement(query);
            ResultSet rs = consulta.executeQuery();

            // Ciclo para llenar filas
            if (rs.first()) {
                idAlmacen = rs.getInt(1);
                fechaReg = rs.getDate(2);
                nombreA = rs.getString(3);
                direccion = rs.getString(4);
                telefono = rs.getString(5);
                capacidad = rs.getString(6);
                idEmpleado = rs.getInt(7);
                completado = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con esos datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error de busqueda", JOptionPane.ERROR_MESSAGE);
        }

        conexion.desconectarSQL();
        return completado;
    }
    
    public void cargarComboAlmacenes(JComboBox combo) {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombreA from almacen");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             combo.addItem(rs.getString(1));          
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        combo.setSelectedIndex(-1);
    }
    
    public void aplicarTraspaso(Vector informacion){
        try {
            //exec generarTraspaso 'NombreAlmOrigen',idProd,fechaReg,cantidad,'NombreAlmDestino'
            PreparedStatement ps = conexion.conexionSQL().prepareStatement("exec generarTraspaso ?,?,?,?,?");
            ps.setString(1,informacion.get(0).toString());
            ps.setInt(2,(int) informacion.get(1));
            ps.setDate(3, Fecha_Java_A_SQL((java.util.Date) informacion.get(2)));
            ps.setDouble(4, (double)informacion.get(3));
            ps.setString(5,informacion.get(4).toString());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public java.sql.Date Fecha_Java_A_SQL(java.util.Date date) {
            return new java.sql.Date(date.getTime());
    }
}
