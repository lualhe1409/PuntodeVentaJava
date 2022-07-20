/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
    private final String url = "jdbc:mysql://localhost:3306/"; // Ubicación de la BD.
    private final String db = "sistemadeventa"; // Nombre de la BD.
    private final String user = "root";
    private final String pass = "";
    
    public Statement comando = null;
    public ResultSet registro;

    public Connection conexion = null;

   
    public Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url + db, user, pass);
            if (conexion != null) {
               System.out.println("¡Conexión Exitosa!");
            }
        } catch (Exception e) {
           
            System.out.println("¡Error al conectar!");
        } finally {
            return conexion;
        }
    }
    
   
}
