
package MVC.Model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.sql.Date;

public class AppointDAO extends Conexion{
    
    public boolean InsertAppoint(medical_consultations mc){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Medical_consultations (date_time, id_veterinarian, id_pet, id_owner, reason, diagnosis, recommendations, prescription, required_precedures, status_consul VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            ps = conec.prepareStatement(sql); 
            //ps.setDate()(1,mc.getDate_time());
            ps.setInt(2, mc.getId_veterinarian());
            ps.setInt(3, mc.getId_pet());
            ps.setInt(4, mc.getId_owner());
            ps.setString(5, mc.getReason());
            ps.setString(6, mc.getDiagnosis());
            ps.setString(7, mc.getRecommendations());
            ps.setString(8, mc.getPrescription());
            ps.setString(9, mc.getRequired_precedures());
            ps.setString(10, mc.getStatus_consul());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateAppoint(medical_consultations mc){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Medical_consultations SET date_time = ?, id_veterinarian = ?, id_pet = ?, id_owner = ?, reason = ?, diagnosis = ?, recommendations = ?, prescription = ?, required_precedures = ?, status_consul = ? WHERE id_consultation = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            //ps.setDate()(1,mc.getDate_time());
            ps.setInt(2, mc.getId_veterinarian());
            ps.setInt(3, mc.getId_pet());
            ps.setInt(4, mc.getId_owner());
            ps.setString(5, mc.getReason());
            ps.setString(6, mc.getDiagnosis());
            ps.setString(7, mc.getRecommendations());
            ps.setString(8, mc.getPrescription());
            ps.setString(9, mc.getRequired_precedures());
            ps.setString(10, mc.getStatus_consul());
            ps.setInt(1, mc.getId_consultation());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    
    public boolean DeleteAppoin(medical_consultations mc){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Medical_consultations Where id_consultation = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, mc.getId_consultation());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<medical_consultations> SearchAppoin(){
        List<medical_consultations> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Medical_consultations ";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                medical_consultations mc = new medical_consultations();
                mc.setId_consultation(rs.getInt("id_consultation"));
                //mc.setDate_time(rs.getDate("date_time"));
                mc.setId_veterinarian(rs.getInt("identification"));
                mc.setId_pet(rs.getInt("id_pet"));
                mc.setId_owner(rs.getInt("id_owner"));
                mc.setReason(rs.getString("reason"));
                mc.setDiagnosis(rs.getString("diagnosis"));
                mc.setRecommendations(rs.getString("recommendations"));
                mc.setPrescription(rs.getString("prescription"));
                mc.setRequired_precedures(rs.getString("prequired_precedures"));
                mc.setStatus_consul(rs.getString("status_consul"));
                list.add(mc);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
}
