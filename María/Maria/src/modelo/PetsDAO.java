package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetsDAO {

    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "campus2023";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    // Add a animal
    public void add(pets animal){
        String sql = "INSERT INTO pets (fullName, species, breed, age, birth_date, gender, allergies, conditions, weight, microchip, photo, emergy_contact, id_owner ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)){
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
            ps.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // see all animals
    public List<pets> getAll() {
        List<pets> list = new ArrayList<>();
        String sql = "SELECT * FROM Veterinary";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
