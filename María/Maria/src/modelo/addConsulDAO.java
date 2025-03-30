package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addConsulDAO {
    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "marializarazo";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
    
    // Add a vaccines
    public void add(medical_consultations medicon) {
        String sql = "INSERT INTO medical_consultations (date_time, id_veterinarian, id_pet, id_owner, reason, diagnosis, recommendations, prescription, required_precedures, status_consul) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "¡Error!, Medical consultation not added.");
        }
    }
}
