package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class cancelConsulDAO {
    
    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "marializarazo";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
    
    public void deleteConsul(int id){
        String sql = "DELETE FROM medical_consultations WHERE id_consultation = ?";
        try(Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Medical consultation has been eliminated.");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! Medical consultation has not been eliminated" + e);
        }
    }
}
