
package MVC.Model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class SupplierDAO extends Conexion{
    
    public boolean InsertSu(suppliers su){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Suppliers (full_name, identification, email, order_name, id_administrator) VALUES (?, ?, ?, ?, ?);";
        
        try{
            ps = conec.prepareStatement(sql); 
            ps.setString(1, su.getFull_name());
            ps.setString(2,su.getIdentification());
            ps.setString(3, su.getEmail());
            ps.setString(4, su.getOrder_name());
            ps.setInt(5, su.getId_administrator());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateSu(suppliers su){
        
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Suppliers SET full_name = ?, identification = ?, email = ?, order_name = ?, id_administrator = ? WHERE id_supplier = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, su.getFull_name());
            ps.setString(2,su.getIdentification());
            ps.setString(3, su.getEmail());
            ps.setString(4, su.getOrder_name());
            ps.setInt(5, su.getId_administrator());
            ps.setInt(6, su.getId_supplier());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    
    public boolean DeleteSu(suppliers su){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Suppliers Where id_supplier = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, su.getId_supplier());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<suppliers> SearchSu(){
        List<suppliers> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Suppliers ";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                suppliers su = new suppliers();
                su.setId_supplier(rs.getInt("id_supplier"));
                su.setFull_name(rs.getString("full_name"));
                su.setIdentification(rs.getString("identification"));
                su.setEmail(rs.getString("email"));
                su.setOrder_name(rs.getString("order_name"));
                su.setId_administrator(rs.getInt("id_administrator"));
                list.add(su);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
    public boolean existsAdministrator(int idAdmin){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT id_user FROM Users WHERE id_user = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, idAdmin);
            rs = ps.executeQuery();
            return rs.next(); 
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
}
