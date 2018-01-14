/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitec;

import InterfazGrafica.*;
import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Angel Moya
 */
public class DataBase<T> {

    //la conexion propiamente dicha
    private static java.sql.Connection conn;
    /*
    Se deben especificar esta informacion que detalla el usuario, la contraseña y la informacion del servidor (ip , puerto, y nombre de la base de datos).
    
     */

    private static final String driver = "com.mysql.jdbc.Driver"; //driver (se queda siempre igual, si se usa mysql)
    private static final String usuario = "root"; //usuario de la base de datos
    private static final String contrasenna = "dean"; //contraseña del usuario
    private static final String url = "jdbc:mysql://localhost:3306/servitec"; //basicamnete es la informacion del servidor de la base deatos y es jdbc:mysql://(direccionIp):(puerto)/(nombreDeLaBaseDeDatos)

    /*
    Este metodo es el constructor del metodo Conexion y se hace de esta forma normalmente
    
     */
    public DataBase() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, contrasenna);
            if (conn != null) {
                System.out.println("se ha realizado una conexion exitosa!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ha sucecido un problema");
        }
    }

    //Obtiene el objeto Connection que es el que se instancia para hacer los querys
    public java.sql.Connection getConnection() {
        return this.conn;
    }

    //cierra la conexion con la base de datos 
    public void cerrarConexion() throws SQLException {
        conn.close();
    }

    public static boolean verificarUser(java.sql.Connection instanciaConexion, JTextField usuario, JPasswordField contra) {
        boolean b = false;
        String usuar = usuario.getText();
        String contr = String.valueOf(contra.getPassword());
        try {
            String sql = " SELECT user , contraseña FROM empleado where user='" + usuar + "' and contraseña='" + contr + "'";
            Statement stmt = instanciaConexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException e) {
            System.out.println("ha sucecido un problema");
        }
        return b;
    }

    /*public static empleadoClass BusquedaEmpleado(java.sql.Connection instanciaConexion,JTextField cedula) {
        empleadoClass empleado=null;
        try {
            String sq2 = "SELECT * FROM empleado WHERE cedula='"+ cedula.getText() +"' ";
            Statement stmt = instanciaConexion.createStatement();
            ResultSet rs = stmt.executeQuery(sq2);
            if (rs.next()) {
                empleado=new empleadoClass(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), Float.valueOf(rs.getString(8)), rs.getString(9), rs.getString(10), rs.getString(11));  
            }else{
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();
        }
        return empleado;
    }
    public static clienteClass BusquedaCliente(java.sql.Connection instanciaConexion,JTextField cedula) {
        clienteClass cliente=null;
        try {
            String sq3 = "SELECT * FROM cliente WHERE cedula='"+ cedula.getText() +"' ";
            Statement stmt = instanciaConexion.createStatement();
            ResultSet rs = stmt.executeQuery(sq3);
            if (rs.next()) {
                cliente=new clienteClass(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));  
            }else{
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();
        }
        return cliente;
    }*/
    /**
     * Metodo para buscar 1.empleado,2.clientes, 3. distribuidora
     * 4.FacturaServitecClass
     *
     * @param instanciaConexion
     * @param identificador
     * @param tipo
     * @return
     */
    public T Busqueda(java.sql.Connection instanciaConexion, JTextField identificador, int tipo) {
        T objeto = null;
        try {
            Statement stmt = instanciaConexion.createStatement();

            switch (tipo) {
                //Busqueda de empleado
                case (1):
                    String sq1 = "SELECT * FROM empleado WHERE cedula=" + identificador.getText() + " ";
                    ResultSet rs1 = stmt.executeQuery(sq1);
                    if (rs1.next()) {
                        objeto = (T) new empleadoClass(rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7), Float.valueOf(rs1.getString(8)), rs1.getString(9), rs1.getString(10), rs1.getString(11));
                    } else {
                        return null;
                    }
                    break;
                //busqueda de cliente
                case (2):
                    String sq2 = "SELECT * FROM cliente WHERE cedula='" + identificador.getText() + "' ";
                    ResultSet rs2 = stmt.executeQuery(sq2);
                    if (rs2.next()) {
                        objeto = (T) new clienteClass(rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getString(5), rs2.getString(6));
                    } else {
                        return null;
                    }
                    break;
                //Distribuidora
                case (3):
                    String sq3 = "SELECT * FROM distribuidora WHERE idDistribuidora='" + identificador.getText() + "' ";
                    ResultSet rs3 = stmt.executeQuery(sq3);
                    if (rs3.next()) {
                        objeto = (T) new DistribuidoraClass(rs3.getString(1), rs3.getString(2), rs3.getString(3), rs3.getString(4), rs3.getString(5));
                    } else {
                        return null;
                    }
                    break;
                // Articulo
                case (4):
                    String sq4 = "SELECT * FROM articulo WHERE codigoArticulo='" + identificador.getText() + "' ";
                    ResultSet rs4 = stmt.executeQuery(sq4);
                    if (rs4.next()) {
                        objeto = (T) new ArticuloClass(rs4.getString(1), rs4.getString(2));
                    } else {
                        return null;
                    }
                    break;
                //Trabajo
                case (5):
                    String sq5 = "SELECT * FROM trabajo WHERE noTrabajo='" + identificador.getText() + "' ";
                    ResultSet rs5 = stmt.executeQuery(sq5);
                    if (rs5.next()) {
                        objeto = (T) new TrabajoClass(rs5.getString(1), Date.valueOf(rs5.getString(2)), Date.valueOf(rs5.getString(5)), Float.valueOf(rs5.getString(6)), "001", rs5.getString(4), " ", rs5.getString(3));
                    } else {
                        return null;
                    }
                    break;
                //Factura servitec class
                case (6):
                    String sq6 = "select * from facturaservitec where noFactura='" + identificador.getText() + "' ";
                    ResultSet rs6 = stmt.executeQuery(sq6);
                    if (rs6.next()) {
                        objeto = (T) new FacturaServitecClass(rs6.getString(1), rs6.getDate(2), rs6.getString(3), Double.valueOf(rs6.getString(4)), Double.valueOf(rs6.getString(5)), Double.valueOf(rs6.getString(6)));
                    } else {
                        return null;
                    }
                    break;
            }
        } catch (SQLException e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();

        }
        return objeto;
    }

    /**
     * Metodo para insertar datos 1.empleado,2.clientes, 3. distribuidora 4.
     * Articulo
     *
     * @param instanciaConexion
     * @param tipo
     * @param r
     */
    public static void Insertar(java.sql.Connection instanciaConexion, int tipo, Object clase) {
        try {
            switch (tipo) {
                //empleado
                case (1):
                    try {
                        Empleado claseEmpleado = (Empleado) clase;
                        String sql = "INSERT INTO empleado VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement stmt = instanciaConexion.prepareStatement(sql);
                        stmt.setString(1, claseEmpleado.getTxtCedula().getText());
                        stmt.setString(2, claseEmpleado.getTxTNombre().getText());
                        stmt.setString(3, claseEmpleado.getTxtApellido().getText());
                        stmt.setString(4, claseEmpleado.getTxtCorreo().getText());
                        stmt.setString(5, claseEmpleado.getTxtDireccion().getText());
                        stmt.setString(6, claseEmpleado.getTxttelefono().getText());
                        stmt.setString(7, claseEmpleado.getTxtCargo().getText());
                        if (claseEmpleado.getTxtSalario().getText().isEmpty()) {
                            stmt.setDouble(8, 0.0);
                        } else {
                            stmt.setDouble(8, Double.valueOf(claseEmpleado.getTxtSalario().getText()));
                        }
                        stmt.setString(9, claseEmpleado.getTxtUser().getText());
                        stmt.setString(10, claseEmpleado.getTxtContra().getText());
                        if (claseEmpleado.getTxtIdSupervisor().getText().isEmpty() || claseEmpleado.getTxtIdSupervisor().getText().equalsIgnoreCase("null")) {
                            stmt.setString(11, null);
                        } else {
                            stmt.setString(11, claseEmpleado.getTxtIdSupervisor().getText());
                        }
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "empleado " + claseEmpleado.getTxTNombre().getText() + " " + claseEmpleado.getTxtApellido().getText() + " fue ingresado con exito", "Ingreso completo", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException | SQLException ex) {
                        ex.printStackTrace();
                    }

                    break;
                //cliente
                case (2):
                    try {
                        Cliente claseCliente = (Cliente) clase;
                        String sql = "INSERT INTO cliente VALUES (?,?,?,?,?,?)";
                        PreparedStatement stmt = instanciaConexion.prepareStatement(sql);
                        stmt.setString(1, claseCliente.getTxtCedula().getText());
                        stmt.setString(2, claseCliente.getTxTNombre().getText());
                        stmt.setString(3, claseCliente.getTxtApellido().getText());
                        stmt.setString(4, claseCliente.getTxtCorreo().getText());
                        stmt.setString(5, claseCliente.getTxtDireccion().getText());
                        stmt.setString(6, claseCliente.getTxttelefono().getText());
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Cliente " + claseCliente.getTxTNombre().getText() + " " + claseCliente.getTxtApellido().getText() + " fue ingresado con exito", "Ingreso completo", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                // Distribuidora
                case (3):
                    try {
                        Distribuidora claseDistribuidora = (Distribuidora) clase;
                        String sql = "INSERT INTO distribuidora  VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = instanciaConexion.prepareStatement(sql);
                        stmt.setString(1, claseDistribuidora.getTxtid().getText());
                        stmt.setString(2, claseDistribuidora.getTxTNombre().getText());
                        stmt.setString(3, claseDistribuidora.getTxtDireccion().getText());
                        stmt.setString(4, claseDistribuidora.getTxtCorreo().getText());
                        stmt.setString(5, claseDistribuidora.getTxttelefono().getText());
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Distribuidora " + claseDistribuidora.getTxTNombre().getText() + " fue ingresado con exito", "Ingreso completo", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                // Articulo
                case (4):
                    try {
                        Articulo claseArticulo = (Articulo) clase;
                        String sql = "INSERT INTO articulo  VALUES (?,?)";
                        PreparedStatement stmt = instanciaConexion.prepareStatement(sql);
                        stmt.setString(1, claseArticulo.getTxtCodigo().getText());
                        stmt.setString(2, claseArticulo.getTxtDescri().getText());
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, claseArticulo.getTxtCodigo().getText() + " " + claseArticulo.getTxtDescri().getText() + " fue ingresado con exito", "Ingreso completo", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
            }

        } catch (Exception e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();
        }

    }

    /**
     * Metodo para insertar datos 1.empleado,2.clientes, 3. distribuidora 4.
     * @param instanciaConexion
     * @param tipo
     * @param clase
     */
    public static void actualizar(java.sql.Connection instanciaConexion, int tipo, Object clase) {
        try {
            switch (tipo) {
                case (1):
                    Empleado claseEmpleado = (Empleado) clase;

                    if (VerificarCedulaEmpleado(instanciaConexion, claseEmpleado)) {
                        String sql;
                        if (claseEmpleado.getTxtIdSupervisor().getText().isEmpty() || claseEmpleado.getTxtIdSupervisor().getText().equalsIgnoreCase("null")) {
                            sql = "UPDATE empleado SET nombre='" + claseEmpleado.getTxTNombre().getText() + "', apellido='" + claseEmpleado.getTxtApellido().getText() + "', correo='" + claseEmpleado.getTxtCorreo().getText() + "', direccion='" + claseEmpleado.getTxtDireccion().getText() + "', telefono='" + claseEmpleado.getTxttelefono().getText() + "', cargo='" + claseEmpleado.getTxtCargo().getText() + "', salarioMensual='" + Double.valueOf(claseEmpleado.getTxtSalario().getText()) + "', user='" + claseEmpleado.getTxtUser().getText() + "', contraseña='" + claseEmpleado.getTxtContra().getText() + "', idSupervisor= null" + " where cedula='" + claseEmpleado.getTxtCedula().getText() + "'";
                        } else {
                            sql = "UPDATE empleado SET nombre='" + claseEmpleado.getTxTNombre().getText() + "', apellido='" + claseEmpleado.getTxtApellido().getText() + "', correo='" + claseEmpleado.getTxtCorreo().getText() + "', direccion='" + claseEmpleado.getTxtDireccion().getText() + "', telefono='" + claseEmpleado.getTxttelefono().getText() + "', cargo='" + claseEmpleado.getTxtCargo().getText() + "', salarioMensual='" + Double.valueOf(claseEmpleado.getTxtSalario().getText()) + "', user='" + claseEmpleado.getTxtUser().getText() + "', contraseña='" + claseEmpleado.getTxtContra().getText() + "', idSupervisor='" + claseEmpleado.getTxtIdSupervisor().getText() + "' where cedula='" + claseEmpleado.getTxtCedula().getText() + "'";
                        }
                        PreparedStatement stmt = instanciaConexion.prepareStatement(sql);
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, claseEmpleado.getTxTNombre().getText() + " fue Actualizado con exito", "Actualizacion completa", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,  "Supervisor no existe en la base de datos", "Actualizacion completa", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                case (2):
                    Distribuidora claseDistribuidora = (Distribuidora) clase;
                    String sq2 = "UPDATE distribuidora SET nombre='" + claseDistribuidora.getTxTNombre().getText() + "', direccion='" + claseDistribuidora.getTxtDireccion().getText()+ "', correo='" + claseDistribuidora.getTxtCorreo().getText() + "', telefono='" + claseDistribuidora.getTxttelefono().getText() + "' where idDistribuidora='" + claseDistribuidora.getTxtid().getText() + "'";
                    PreparedStatement stmt = instanciaConexion.prepareStatement(sq2);
                    stmt.executeUpdate(sq2);
                    JOptionPane.showMessageDialog(null, "Actualizacion lograda con exito", "Actualizacion completa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();
        }
    }

    public static boolean VerificarCedulaEmpleado(Connection instanciaConexion, Empleado e) {
        boolean bandera = false;
        try {
            String sql = "SELECT cedula FROM empleado;";
            Statement stmt = instanciaConexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                do {
                    if (rs.getString(1).equalsIgnoreCase(e.getTxtIdSupervisor().getText())) {
                        return true;
                    }
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.println("ha sucecido un problema");
            ex.printStackTrace();
        }
        return bandera;
    }

    public static void eliminar(java.sql.Connection instanciaConexion, int tipo, Object clase) {
        try {
            switch (tipo) {
                case (1):
                    Empleado claseEmpleado = (Empleado) clase;
                    String sq1 = "DELETE FROM empleado WHERE cedula='" + claseEmpleado.getTxtCedula().getText() + "'";
                    PreparedStatement stmt1 = instanciaConexion.prepareStatement(sq1);
                    stmt1.executeUpdate(sq1);
                    JOptionPane.showMessageDialog(null, "empleado eliminado con exito", "Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                //cliente
                case (2):
                    Cliente claseCliente = (Cliente) clase;
                    String sq2 = "DELETE FROM cliente WHERE cedula='" + claseCliente.getTxtCedula().getText() + "'";
                    PreparedStatement stmt2 = instanciaConexion.prepareStatement(sq2);
                    stmt2.executeUpdate(sq2);
                    JOptionPane.showMessageDialog(null, "cliente eliminado con exito", "Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                //Distribuidora
                case (3):
                    Distribuidora claseDistribuidora = (Distribuidora) clase;
                    String sq3 = "DELETE FROM distribuidora WHERE idDistribuidora='" + claseDistribuidora.getTxtid().getText() + "'";
                    PreparedStatement stmt3 = instanciaConexion.prepareStatement(sq3);
                    stmt3.executeUpdate(sq3);
                    JOptionPane.showMessageDialog(null, "Distribuidora eliminado con exito", "Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case (4):
                    Articulo claseArticulo = (Articulo) clase;
                    String sq4 = "DELETE FROM articulo WHERE codigoArticulo='" + claseArticulo.getTxtCodigo().getText() + "'";
                    PreparedStatement stmt4 = instanciaConexion.prepareStatement(sq4);
                    stmt4.executeUpdate(sq4);
                    JOptionPane.showMessageDialog(null, "Articulo eliminado con exito", "Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } catch (SQLException e) {
            System.out.println("ha sucecido un problema");
            e.printStackTrace();
        }
    }

}
