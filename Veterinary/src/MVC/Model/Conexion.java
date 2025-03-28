
package MVC.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conec = null; 
    
    private String URL = "jdbc:mysql://127.0.0.1:3306/Veterinary";
    private String USER = "root";
    private String PASSWORD = "1092528097";
    
    public Connection getConexion(){
        try{
            conec = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("The database connection was successful.");
        }catch(SQLException e){
            System.out.println("Error connecting to the database" + e.getMessage());
        }
        return conec;
    }
}
