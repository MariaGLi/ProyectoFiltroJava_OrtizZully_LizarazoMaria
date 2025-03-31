package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class additionalServicesDAO extends Conexion{

    // Add a service additional
    public boolean add(additional_services addServ) {
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO additional_services (id_pet, service_type, descriptionServices, date_time) VALUES (?,?,?,?)";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, addServ.getId_pet());
            ps.setString(2, addServ.getService_type());
            ps.setString(3, addServ.getDescriptionServices());
            ps.setString(4, addServ.getDate_time());
            ps.executeUpdate();
            System.out.println("Service additional add.");
            return true;
        } catch (SQLException e){
            System.err.println(e);
            System.out.println("Error, service additional not add." + e);
            return false;
        }
    }

    // see all service additional
    public List<additional_services> getAll() {
        List<additional_services> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Additional_Services";
        
        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new additional_services(
                        rs.getInt("id_service"),
                        rs.getInt("id_pet"),
                        rs.getString("service_type"),
                        rs.getString("descriptionServices"),
                        rs.getString("date_time")
                ));
            }
        } catch (SQLException e){
            System.err.println(e);
        }
        return list;
    }

    // delete service additional
    public boolean deleteService(int id){   
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Additional_Services WHERE id_pet = ?";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Service additional delete.");
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
}
