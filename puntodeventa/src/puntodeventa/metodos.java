
package puntodeventa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class metodos {
    conexion db=new conexion();
    
        // METODOS DE CLIENTES //
        // METODOS DE CLIENTES //
        // METODOS DE CLIENTES //
    
    public void consultaCliente(){        
        try {
            db.conectar(); 
            String NombreDB = "sistemadeventa";            
            String Query = "SELECT * FROM cliente" ;           
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query); 
            while (db.registro.next()) {                
                System.out.println("ID_CLIENTE: " + db.registro.getString(1) + 
                        "\nNOMBRE: " + db.registro.getString(2) +
                        "\nRFC: " + db.registro.getString(3));                
                System.out.println("------------------------------------------");
            }
        } catch (SQLException ex) {
            
        }    
    }
    
    public void agregarCliente(datos datos)throws SQLException{        
        try {
            String Query = "";
            db.conectar(); 
            String NombreDB = "sistemadeventa";                
            Statement sentencia = db.conectar().createStatement();
            Query = "INSERT INTO cliente(nombre, rfc)"+ "VALUES ('" +datos.getNombre()+ "', '" + datos.getRfc()+"');";           
                      
            if (sentencia.executeUpdate(Query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }

        System.out.println(Query);
        sentencia.close();
        db.conexion.close();
        } catch (SQLException ex) {
            
        }  
    }
        
        public void eliminarCliente(int idcliente)throws SQLException {
        String query = "";
        conexion BaseDatos = new conexion();
            try {
                query = "DELETE FROM cliente WHERE id_cliente = '" + idcliente+ "';"; 
                PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
                sentenciaP.executeUpdate();

                sentenciaP.execute();
                System.out.println("El registro se eliminó exitosamente.");
                sentenciaP.close();
                BaseDatos.conexion.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    
        public void actualizarCliente(datos datos,int id) {
        String query = "";
        try {
        conexion BaseDatos = new conexion();
            query = "UPDATE cliente SET nombre='" + datos.getNombre()+ "',rfc='" + datos.getRfc()+ "' WHERE id_cliente = '" + id+ "';"; 
            PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
            //sentenciaP.setString(1);
            sentenciaP.executeUpdate();
            System.out.println("El registro se actualizó exitosamente.");
            sentenciaP.close();
            BaseDatos.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        
    // METODOS DE PRODUCTOS //
    // METODOS DE PRODUCTOS //
    // METODOS DE PRODUCTOS //
        
        
    public void consultaProducto(){        
        try {
            db.conectar(); 
            String NombreDB = "sistemadeventa";            
            String Query = "SELECT * FROM producto" ;           
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query); 
            while (db.registro.next()) {                
                System.out.println("ID_PRODUCTO: " + db.registro.getString(1) + 
                        "\nDESCRIPCION: " + db.registro.getString(2) +
                        "\nPRECIO: " + db.registro.getString(3));                
                System.out.println("------------------------------------------");
            }
        } catch (SQLException ex) {
            
        }    
    }
    
    
    public void agregarProducto(producto producto)throws SQLException{        
        try {
            String Query = "";
            db.conectar(); 
            String NombreDB = "sistemadeventa";                
            Statement sentencia = db.conectar().createStatement();
            Query = "INSERT INTO producto(descripcion, precio)"+ "VALUES ('" + producto.getDescripcion()+ "', '" + producto.getPrecio()+"');";           
                      
            if (sentencia.executeUpdate(Query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }

        System.out.println(Query);
        sentencia.close();
        db.conexion.close();
        } catch (SQLException ex) {
            
        }  
    }
    
    public void eliminarProducto(int idproducto)throws SQLException {
        String query = "";
        conexion BaseDatos = new conexion();
            try {
                query = "DELETE FROM producto WHERE id_producto = '" + idproducto+ "';"; 
                PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
                sentenciaP.executeUpdate();

                sentenciaP.execute();
                System.out.println("El registro se eliminó exitosamente.");
                sentenciaP.close();
                BaseDatos.conexion.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    
    public void actualizarProducto(producto producto,int id_producto) {
        String query = "";
        try {
        conexion BaseDatos = new conexion();
            query = "UPDATE producto SET descripcion='" + producto.getDescripcion()+ "',precio='" + producto.getPrecio()+ "' WHERE id_producto = '" + id_producto+ "';"; 
            PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
            //sentenciaP.setString(1);
            sentenciaP.executeUpdate();
            System.out.println("El registro se actualizó exitosamente.");
            sentenciaP.close();
            BaseDatos.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // METODOS DE VENTA //
    // METODOS DE VENTA //
    // METODOS DE VENTA //
        public void consultaVenta(){        
        try {
            db.conectar(); 
            String NombreDB = "sistemadeventa";            
            String Query = "SELECT * FROM venta" ;           
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query); 
            while (db.registro.next()) {                
                System.out.println("ID_VENTA: " + db.registro.getString(1) + 
                        "\nCANTIDAD: " + db.registro.getString(2) +
                        "\nDESCUENTO: " + db.registro.getString(3) +
                        "\nFECHA: " + db.registro.getString(4));                
                System.out.println("------------------------------------------");
            }
        } catch (SQLException ex) {
            
        }    
    }
        
        public void agregarVenta(venta venta)throws SQLException{        
        try {
            String Query = "";
            db.conectar(); 
            String NombreDB = "sistemadeventa";                
            Statement sentencia = db.conectar().createStatement();
            Query = "INSERT INTO venta(id_producto,id_cliente,cantidad,descuento,fecha)"+ 
                    "VALUES ('" +venta.getId_producto()+ "','" + venta.getId_cliente()+
                    "','"+venta.getCantidad() +"','"+venta.getDescuento()+"','"+venta.getFecha()+"');";         
            if (sentencia.executeUpdate(Query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }

        System.out.println(Query);
        sentencia.close();
        db.conexion.close();
        } catch (SQLException ex) {
            
        }  
    }
        
        
        public void eliminarVenta(int idventa )throws SQLException {
        String query = "";
        conexion BaseDatos = new conexion();
            try {
                query = "DELETE FROM venta WHERE id_venta = '" + idventa+ "';"; 
                PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
                sentenciaP.executeUpdate();

                sentenciaP.execute();
                System.out.println("El registro se eliminó exitosamente.");
                sentenciaP.close();
                BaseDatos.conexion.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

          public void actualizarVenta(venta venta,int id_venta) {
        String query = "";
        try {
        conexion BaseDatos = new conexion();
            query = "UPDATE venta SET cantidad='" + venta.getCantidad()+ "',descuento='" + venta.getDescuento()+ "' WHERE id_venta = '" + id_venta+ "';"; 
            PreparedStatement sentenciaP = BaseDatos.conectar().prepareStatement(query);
            //sentenciaP.setString(1);
            sentenciaP.executeUpdate();
            System.out.println("El registro se actualizó exitosamente.");
            sentenciaP.close();
            BaseDatos.conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
}
    

