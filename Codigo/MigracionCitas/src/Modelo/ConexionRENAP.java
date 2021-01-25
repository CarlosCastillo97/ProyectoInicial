package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
//realizado por Carlos Castillo (CarlosCastillo97)
 */
public class ConexionRENAP {
 public String driver = "com.mysql.jdbc.Driver";
 public String database = "RENAP";
 public String hostname = "localhost";
 public String port = "3306";
 public String url = "";
 public String username = "root";
 public String password = "";
 
 public Connection getConectar() {
     Connection conn = null;
     
     try {
         url= "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
         
         Class.forName(driver);
         conn = DriverManager.getConnection(url, username, password);
     } catch (ClassNotFoundException | SQLException e) {
         System.out.println(e);
     }
             return conn;

 }
}

