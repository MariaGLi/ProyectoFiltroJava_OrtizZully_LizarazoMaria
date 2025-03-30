package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class listConsulDAO {

    String url = "jdbc:mysql://localhost:3306/Veterinary";
    String user = "root";
    String pass = "marializarazo";

    public Connection conection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    public List<medical_consultations> getAll(int id) {
        List<medical_consultations> list = new ArrayList<>();
        String sql = "SELECT id_consultations, id_pet, id_owner, date_time, status_consul FROM medical_consultations WHERE id_veterinarian = ?";
        try (Connection con = conection(); PreparedStatement ps = con.prepareStatement(sql)) { 
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new medical_consultations(
                        rs.getInt("id_consultation"),
                        rs.getInt("id_pet"),
                        rs.getInt("id_owner"),
                        rs.getString("date_time"),
                        rs.getString("status_consul")
                ));
            }
            System.out.println("Esta listando");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }   
}
