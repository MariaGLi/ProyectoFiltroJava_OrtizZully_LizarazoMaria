package MVC.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class listConsulDAO extends Conexion{

    //List medical consultations
    public List<medical_consultations> getAllvaccines(int id) {
        List<medical_consultations> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT id_consultation, id_pet, id_owner, date_time, status_consul FROM medical_consultations WHERE id_veterinarian = ?";
        
        try { 
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new medical_consultations(
                        rs.getInt("id_consultation"),
                        rs.getString("date_time"),
                        rs.getInt("id_pet"),
                        rs.getInt("id_owner"),
                        rs.getString("status_consul")
                ));
            }
            System.out.println("Esta listando");
        } catch (SQLException e){
            System.err.println(e);
        }
        return list;
    }   
}
