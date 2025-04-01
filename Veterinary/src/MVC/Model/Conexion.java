
package MVC.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conec = null; 
    
    private String URL = "jdbc:mysql://localhost:3306/Veterinary";
    private String USER = "root";
<<<<<<< HEAD
    private String PASSWORD = "1092528097";
=======
    private String PASSWORD = "marializarazo";
>>>>>>> a106f51f61514091384a2cffd08c654f0b585acd
    
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
