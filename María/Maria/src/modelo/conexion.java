package modelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    public Connection getConnection(){
        
        String url = "jdbc:mysql://localhost:3306/Veterinary";
        String user = "root";
        String pass = "marializarazo";
        
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
}

