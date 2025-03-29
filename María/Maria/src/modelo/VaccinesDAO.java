package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VaccinesDAO {
    
    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "marializarazo";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
    
    // Add a vaccines
    public void add(vaccines vaccine) {
        String sql = "INSERT INTO vaccines (vaccine_type, manufacturer, lot, administration_date, expiration_date, entry_date, next_dose_date, quantity_in_stock, quantity_entered, id_pet) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, vaccine.getVaccine_type());
            ps.setString(2, vaccine.getManufacturer());
            ps.setString(3, vaccine.getLot());
            ps.setString(4, vaccine.getAdministration_date());
            ps.setString(5, vaccine.getExpiration_date());
            ps.setString(6, vaccine.getEntry_date());
            ps.setString(7, vaccine.getNext_dose_date());
            ps.setInt(8, vaccine.getQuantity_in_stock());
            ps.setInt(9, vaccine.getQuantity_entered());
            ps.setInt(10, vaccine.getId_pet());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vaccine add.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "¡Error!, vaccine not add.");
        }
    }
    
    public List<vaccines> getAll() {
        List<vaccines> list = new ArrayList<>();
        String sql = "SELECT * FROM Vaccines";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new vaccines(
                        rs.getInt("id_vaccine"),
                        rs.getString("vaccine_type"),
                        rs.getString("manufacturer"),
                        rs.getString("lot"),
                        rs.getString("administration_date"),
                        rs.getString("expiration_date"),
                        rs.getString("entry_date"),
                        rs.getString("next_dose_date"),
                        rs.getInt("quantity_in_stock"),
                        rs.getInt("quantity_entered"),
                        rs.getInt("id_pet")                        
                ));
            }
            System.out.println("Esta listando");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void deleteVaccines(int id){
        String sql = "DELETE FROM Vaccines WHERE id_vaccine = ?";
        try(Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "The vaccine has been eliminated.");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error when deleting the mascot" + e);
        }
    }
}
