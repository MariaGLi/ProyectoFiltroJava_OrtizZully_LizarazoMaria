package maria;

import modelo.PetsDAO;
import java.sql.*;

/**
 *@author Maria Lizarazo
 */
public class main {

    public static void main(String[] args) {
        PetsDAO dao = new PetsDAO();
        try {
            Connection con = dao.conection();
            if(con!= null){
                System.out.println("Conexion lista");
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
