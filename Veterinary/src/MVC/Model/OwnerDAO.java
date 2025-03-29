
package MVC.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OwnerDAO extends Conexion{
    
    public boolean UpdateOwner(User use){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Users SET full_name = ?, identification = ?, address = ?, phone = ?,email = ? WHERE id_user = ? AND rol = 'owner'";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, use.getFull_name());
            ps.setString(2,use.getIdentification());
            ps.setString(3, use.getAddres());
            ps.setString(4, use.getPhone());
            ps.setString(5, use.getEmail());
            ps.setInt(6, use.getId_user());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean DeleteOwner(User use){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Users Where id_user = ? AND rol = 'owner'";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, use.getId_user());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.print(e);
            return false;
        }
    }
    
    public List<User> SearchOwner(){
        List<User> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Users WHERE rol = 'owner'";
        
        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                User use = new User();
                use.setId_user(rs.getInt("id_user"));
                use.setFull_name(rs.getString("full_name"));
                use.setIdentification(rs.getString("identification"));
                use.setAddres(rs.getString("address"));
                use.setPhone(rs.getString("phone"));
                use.setEmail(rs.getString("email"));
                list.add(use);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
}
