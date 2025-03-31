package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class cancelConsulDAO extends Conexion{
    
  
    
    public boolean deleteConsul(int id){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM medical_consultations WHERE id_consultation = ?";
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Medical consultation has been eliminated.");
            return true;
        }catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "¡Error! Medical consultation has not been eliminated" );
            return false;
        }
    }

    public boolean deleteConsul(medical_consultations medicon) {
        return deleteConsul(medicon.getId_consultation());
    }
}
