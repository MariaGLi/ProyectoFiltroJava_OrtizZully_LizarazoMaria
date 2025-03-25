package modelo;

import java.sql.*;
import java.util.ArrayList;

/*public class PetsDAO {
    conexion conectar = new conexion();
    Connection conection = new Connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // Ver todos los animales
    public java.util.List<pets> obtenerTodos() {
        java.util.List<pets> list = new ArrayList<>();
        String sql = "SELECT * FROM Veterinary";
        try (java.sql.Connection con = conection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new pets(rs.getInt("id_pet"), rs.getString("fullName"), rs.getString("species"), rs.getString("breed"), rs.getInt("age"), rs.getString("birth_date"), rs.getString("gender"), rs.getString("allergies"), rs.getString("conditions"), rs.getFloat("weight"), rs.getString("microchip"), rs.getString("photo"), rs.getString("emergy_contact"), rs.getInt("id_owner")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}*/
