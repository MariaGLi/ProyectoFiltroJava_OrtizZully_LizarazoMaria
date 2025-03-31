package MVC.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PetsDAO extends Conexion{
    
    // Add a animal
    public boolean add(pets animal) {
        PreparedStatement ps = null;
        Connection conec = getConexion();
        String sql = "INSERT INTO pets (fullName, species, breed, age, birth_date, gender, allergies, conditions, weight, microchip, photo, emergy_contact, id_owner) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, animal.getFullName());
            ps.setString(2, animal.getSpecies());
            ps.setString(3, animal.getBreed());
            ps.setInt(4, animal.getAge());
            ps.setString(5, animal.getBirth_date());
            ps.setString(6, animal.getGender());
            ps.setString(7, animal.getAllergies());
            ps.setString(8, animal.getConditions());
            ps.setFloat(9, animal.getWeight());
            ps.setString(10, animal.getMicrochip());
            ps.setString(11, animal.getPhoto());
            ps.setString(12, animal.getEmergy_contact());
            ps.setInt(13, animal.getId_owner());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean update(pets animal){
        
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Pets SET age = ?, allergies = ?, conditions = ?, weight = ?, photo = ?, emergy_contact = ?, id_owner = ? WHERE id_pet = ?";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, animal.getAge());
            ps.setString(2, animal.getAllergies());
            ps.setString(3, animal.getConditions());
            ps.setFloat(4, animal.getWeight());
            ps.setString(5, animal.getPhoto());
            ps.setString(6, animal.getEmergy_contact());
            ps.setInt(7, animal.getId_owner());
            ps.setInt(8, animal.getId_pet());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }

    // see all animals
    public List<pets> getAll() {
        List<pets> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Pets";
        
        try {
            ps = conec.prepareStatement(sql); 
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new pets(
                        rs.getInt("id_pet"),
                        rs.getString("fullName"),
                        rs.getString("species"),
                        rs.getString("breed"),
                        rs.getInt("age"),
                        rs.getString("birth_date"),
                        rs.getString("gender"),
                        rs.getString("allergies"),
                        rs.getString("conditions"),
                        rs.getFloat("weight"),
                        rs.getString("microchip"),
                        rs.getString("photo"),
                        rs.getString("emergy_contact"),
                        rs.getInt("id_owner")
                ));
            }
        } catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
    public boolean  deletePets(int id){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Pets WHERE id_pet = ?";
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Pet delete.");
            return true;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error when deleting the mascot" + e);
            return false;
        }
    }

}
