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


//TRABAJADA POR: CARLOS

public class ConexionRENAP {
<<<<<<< HEAD
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

=======
    private final String base = "RENAP";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306" + base;
    private Connection con = null;
    
    public Connection getConexion() 
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            
            
        } catch(SQLException e)
        {
                System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionRENAP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
>>>>>>> 6b9ded804188c16e0180b25b021f9e14e3e2da1e
