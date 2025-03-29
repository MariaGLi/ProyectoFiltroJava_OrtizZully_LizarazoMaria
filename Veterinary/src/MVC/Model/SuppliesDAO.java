
package MVC.Model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class SuppliesDAO extends Conexion{
    
    public boolean InsertSupplies(supplies su){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Supplies (nameSupply,quantity_in_stock,quantity_entered,expiration_date,id_supplier) VALUES (?, ?, ?, ?, ?);";
        
        try{
            ps = conec.prepareStatement(sql); 
            ps.setString(1, su.getNameSupply());
            ps.setInt(2,su.getQuantity_in_stock());
            ps.setInt(3, su.getQuantity_entered());
            ps.setString(4, su.getExpiration_date());
            ps.setInt(5, su.getId_supplier());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateSupplies(supplies su){
        
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Supplies SET nameSupply = ?,quantity_in_stock = ?,quantity_entered = ?,expiration_date = ?,id_supplier = ? WHERE id_supply = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, su.getNameSupply());
            ps.setInt(2,su.getQuantity_in_stock());
            ps.setInt(3, su.getQuantity_entered());
            ps.setString(4, su.getExpiration_date());
            ps.setInt(5, su.getId_supplier());
            ps.setInt(6, su.getId_supply());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    
    public boolean DeleteSupplies(supplies su){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Supplies Where id_supply = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, su.getId_supply());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<supplies> SearchSupplies(){
        List<supplies> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Supplies ";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                supplies su = new supplies();
                su.setId_supply(rs.getInt("id_supply"));
                su.setNameSupply(rs.getString("nameSupply"));
                su.setQuantity_in_stock(Integer.parseInt(rs.getString("quantity_in_stock")));
                su.setQuantity_entered(Integer.parseInt(rs.getString("quantity_entered")));
                su.setExpiration_date(rs.getString("expiration_date"));
                su.setId_supplier(rs.getInt("id_supplier"));
                list.add(su);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
}
