package maria;

import java.sql.*;
import modelo.additionalServicesDAO;

/**
 *@author Maria Lizarazo
 */
public class main {

    public static void main(String[] args) {
        additionalServicesDAO dao = new additionalServicesDAO();
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
