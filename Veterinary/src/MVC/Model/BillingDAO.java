/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillingDAO extends Conexion{
    
    // This is for check if there is a owner 
    public boolean existsOwner(int id_owner){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT id_user FROM Users WHERE id_user = ? AND rol = 'owner'";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id_owner);
            rs = ps.executeQuery();
            return rs.next(); 
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    // This is for check if there is a veterinarian 
    public boolean existsVeterinarian(int id_veterinarian){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT id_user FROM Users WHERE id_user = ? AND rol = 'veterinarian'";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id_veterinarian);
            rs = ps.executeQuery();
            return rs.next(); 
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    // This is for check if there is a consultation
    public boolean existsConsultation(int id_consultation){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT id_consultation FROM Medical_consultations WHERE id_consultation = ? ";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id_consultation);
            rs = ps.executeQuery();
            return rs.next(); 
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean InsertBilling(billing bill){
        if(!existsOwner(bill.getId_owner())){
            System.err.println("Sorry this not id of an owner ");
            return false;
        }
        if(!existsVeterinarian(bill.getId_veterinarian())){
            System.err.println("Sorry this not id of a Vet ");
            return false;
        }
        if(!existsConsultation(bill.getId_consultation())){
            System.err.println("Sorry this not id of a consultation  ");
            return false;
        }
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Billing (id_veterinarian, id_owner, id_consultation, issue_date,description, quantity, unit_value, subtotal, tax, total, statusBill ) VALUES (?, ?, ?, ?, ?,?,?,?,?,?,?);";
        
        try{
            ps = conec.prepareStatement(sql); 
            ps.setInt(1, bill.getId_veterinarian());
            ps.setInt(2, bill.getId_owner());
            ps.setInt(3, bill.getId_consultation());
            ps.setString(4, bill.getIssue_date());
            ps.setString(5, bill.getDescription());
            ps.setInt(6, bill.getQuantity());
            ps.setFloat(7, bill.getUnit_value());
            ps.setFloat(8, bill.getSubtotal());
            ps.setFloat(9, bill.getTax());
            ps.setFloat(10, bill.getTotal());
            ps.setString(11, bill.getStatusBill());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateBilling(billing bill){
        if(!existsOwner(bill.getId_owner())){
            System.err.println("Sorry this not id of an owner ");
            return false;
        }
        if(!existsVeterinarian(bill.getId_veterinarian())){
            System.err.println("Sorry this not id of a Vet ");
            return false;
        }
        if(!existsConsultation(bill.getId_consultation())){
            System.err.println("Sorry this not id of a consultation  ");
            return false;
        }
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Billing SET id_veterinarian = ?, id_owner = ?, id_consultation = ?, issue_date = ?,description = ? , quantity = ? , unit_value = ?, subtotal = ? , tax = ?, total = ? , statusBill = ?  WHERE id_bill = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, bill.getId_veterinarian());
            ps.setInt(2, bill.getId_owner());
            ps.setInt(3, bill.getId_consultation());
            ps.setString(4, bill.getIssue_date());
            ps.setString(5, bill.getDescription());
            ps.setInt(6, bill.getQuantity());
            ps.setFloat(7, bill.getUnit_value());
            ps.setFloat(8, bill.getSubtotal());
            ps.setFloat(9, bill.getTax());
            ps.setFloat(10, bill.getTotal());
            ps.setString(11, bill.getStatusBill());
            ps.setInt(12, bill.getId_bill());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean DeleteBilling(billing bill){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Billing Where id_bill = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, bill.getId_bill());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<billing> ListBilling(){
        List<billing> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Billing";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                billing bill = new billing();
                bill.setId_bill(rs.getInt("id_bill"));
                bill.setId_veterinarian(rs.getInt("id_veterinarian"));
                bill.setId_owner(rs.getInt("id_owner"));
                bill.setId_consultation(rs.getInt("id_consultation"));
                bill.setIssue_date(rs.getString("issue_date"));
                bill.setDescription(rs.getString("description"));
                bill.setQuantity(rs.getInt("quantity"));
                bill.setUnit_value(rs.getFloat("unit_value"));
                bill.setSubtotal(rs.getFloat("subtotal"));
                bill.setTax(rs.getFloat("tax"));
                bill.setTotal(rs.getFloat("total"));
                bill.setStatusBill(rs.getString("statusBill"));
                list.add(bill);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
}
