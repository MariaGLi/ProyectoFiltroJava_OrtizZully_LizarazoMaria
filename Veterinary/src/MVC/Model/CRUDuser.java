package MVC.Model;

import java.sql.*;

public class CRUDuser extends Conexion{
    
    public boolean InsertUser(User use){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Users (full_name, identification, address, phone,email,rol) VALUES (?,?,?,?,?,?)";
        
        try{
            ps = conec.prepareStatement(sql); 
            ps.setString(1, use.getFull_name());
            ps.setString(2,use.getIdentification());
            ps.setString(3, use.getAddres());
            ps.setString(4, use.getPhone());
            ps.setString(5, use.getEmail());
            ps.setString(6, use.getRole());
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public boolean UpdateUser(User use){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Users SET full_name = ?, identification = ?, address = ?, phone = ?,email = ?,rol = ? WHERE id_user = ?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, use.getFull_name());
            ps.setString(2,use.getIdentification());
            ps.setString(3, use.getAddres());
            ps.setString(4, use.getPhone());
            ps.setString(5, use.getEmail());
            ps.setString(6, use.getRole());
            ps.setInt(7, use.getId_user());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    
    public boolean DeleteUser(User use){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Users Where id_user = ?";
        
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
    
    public boolean SearchUser(User use){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Users WHERE id_user ";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, use.getId_user());
            rs = ps.executeQuery();
            
            if(rs.next()){
                use.setId_user(rs.getInt("id_user"));
                use.setFull_name(rs.getString("full_name"));
                use.setIdentification(rs.getString("identification"));
                use.setAddres(rs.getString("address"));
                use.setPhone(rs.getString("phone"));
                use.setEmail(rs.getString("email"));
                use.setRole(rs.getString("rol"));
                return true;
            }
            return false;
        } catch(SQLException e){
            System.err.println(e);
            return false;
        }
        
        
    }
    
}
