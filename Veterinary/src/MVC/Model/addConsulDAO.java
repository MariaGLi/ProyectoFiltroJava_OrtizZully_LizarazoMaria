package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class addConsulDAO extends Conexion{
    
    // Add a medical consultations
    public boolean add(medical_consultations medicon) {
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO medical_consultations (date_time, id_veterinarian, id_pet, id_owner, reason, diagnosis, recommendations, prescription, required_precedures, status_consul) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, medicon.getDate_time());
            ps.setInt(2, medicon.getId_veterinarian());
            ps.setInt(3, medicon.getId_pet());
            ps.setInt(4, medicon.getId_owner());
            ps.setString(5, medicon.getReason());
            ps.setString(6, medicon.getDiagnosis());
            ps.setString(7, medicon.getRecommendations());
            ps.setString(8, medicon.getPrescription());
            ps.setString(9, medicon.getRequired_precedures());
            ps.setString(10, medicon.getStatus_consul());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medical consultation added.");
            return true;
        } catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "¡Error!, Medical consultation not added.");
            return false;
        }
    }
}
