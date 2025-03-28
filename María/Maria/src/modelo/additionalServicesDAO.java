package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class additionalServicesDAO {
    
    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "campus2023";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
    
    // Add a animal
    public void add(additional_services addServ) {
        String sql = "INSERT INTO additional_services (id_pet, service_type, descriptionServices, date_time) VALUES (?,?,?,?)";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, addServ.getId_pet());
            ps.setString(2, addServ.getService_type());
            ps.setString(3, addServ.getDescriptionServices());
            ps.setString(4, addServ.getDate_time());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
