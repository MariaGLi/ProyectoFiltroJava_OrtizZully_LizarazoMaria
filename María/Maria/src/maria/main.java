package maria;

import java.sql.*;
import modelo.cancelConsulDAO;

/**
 *@author Maria Lizarazo
 */
public class main {

    public static void main(String[] args) {
        cancelConsulDAO dao = new cancelConsulDAO();
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
