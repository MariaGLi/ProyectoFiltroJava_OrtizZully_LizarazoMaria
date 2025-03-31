/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class MedicationDAO extends Conexion{
    
    public boolean InsertMedi (medications medi){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Medications (nameMedication, typeMedication,manufacturer,quantity_in_stock,expiration_date ,quantity_entered,id_supplier) VALUES (?,?,?,?,?,?,?)";
        
        try{
            
            ps = conec.prepareStatement(sql);
            ps.setString(1, medi.getNameMedication());
            ps.setString(2, medi.getTypeMedication());
            ps.setString(3, medi.getManufacturer());
            ps.setInt(4,medi.getQuantity_in_stock());
            ps.setString(5, medi.getExpiration_date());
            ps.setInt(6,medi.getQuantity_entered());
            ps.setInt(7,medi.getId_supplier());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateMedi (medications medi){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Medications SET nameMedication = ? , typeMedication = ? ,manufacturer = ? ,quantity_in_stock = ? ,expiration_date = ?  ,quantity_entered = ? ,id_supplier = ? WHERE id_medication = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, medi.getNameMedication());
            ps.setString(2, medi.getTypeMedication());
            ps.setString(3, medi.getManufacturer());
            ps.setInt(4,medi.getQuantity_in_stock());
            ps.setString(5, medi.getExpiration_date());
            ps.setInt(6,medi.getQuantity_entered());
            ps.setInt(7,medi.getId_supplier());
            ps.setInt(8, medi.getId_medication());
            ps.execute();
            return true;
            
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean DeleteMedi(medications medi){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Medications Where id_medication = ?";
        
        try{
            
            ps = conec.prepareStatement(sql);
            ps.setInt(1, medi.getId_medication());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<medications> SearchMedi(){
        List<medications> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Medications ";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                medications medi = new medications();
                medi.setId_medication(rs.getInt("id_medication"));
                medi.setNameMedication(rs.getString("nameMedication"));
                medi.setTypeMedication(rs.getString("typeMedication"));
                medi.setManufacturer(rs.getString("manufacturer"));
                medi.setQuantity_in_stock(rs.getInt("quantity_in_stock"));
                medi.setExpiration_date(rs.getString("expiration_date"));
                medi.setQuantity_entered(rs.getInt("quantity_entered"));
                medi.setId_supplier(rs.getInt("id_supplier"));
                list.add(medi);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
}
