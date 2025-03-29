package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class additionalServicesDAO {

    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "marializarazo";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    // Add a service additional
    public void add(additional_services addServ) {
        String sql = "INSERT INTO additional_services (id_pet, service_type, descriptionServices, date_time) VALUES (?,?,?,?)";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, addServ.getId_pet());
            ps.setString(2, addServ.getService_type());
            ps.setString(3, addServ.getDescriptionServices());
            ps.setString(4, addServ.getDate_time());
            ps.executeUpdate();
            System.out.println("Service additional add.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error, service additional not add." + e);
        }
    }

    // see all service additional
    public List<additional_services> getAll() {
        List<additional_services> list = new ArrayList<>();
        String sql = "SELECT * FROM Additional_Services";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new additional_services(
                        rs.getInt("id_service"),
                        rs.getInt("id_pet"),
                        rs.getString("service_type"),
                        rs.getString("descriptionServices"),
                        rs.getString("date_time")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // delete service additional
    public void deleteService(int id){    
        String sql = "DELETE FROM Additional_Services WHERE id_pet = ?";
        try(Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Service additional delete.");
        }
        catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error deleting the service" + e);
        }
    }
}
