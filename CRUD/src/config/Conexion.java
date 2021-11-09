
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Conexion {
    Connection con;
    public Conexion(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","brian","123456");
        }catch(Exception e){        
        }
    }
    public Connection getConnection(){
        return con;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
