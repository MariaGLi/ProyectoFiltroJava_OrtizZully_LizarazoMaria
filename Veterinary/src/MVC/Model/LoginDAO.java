package MVC.Model;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class LoginDAO extends Conexion {
    
    public boolean getUsers(Login login){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT l.username, l.pass, u.rol FROM Login l JOIN Users u ON l.id_user = u.id_user WHERE l.username=? AND l.pass=?";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPass());
            rs = ps.executeQuery();
            
            if(rs.next()){
                login.setUsername(rs.getString("username"));
                login.setPass(rs.getString("pass"));
                login.setRole(rs.getString("rol"));
                return true;
            }
            return false;
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    /*
    public List<String[]> ListUsers(){
        List<String[]> users = new ArrayList<>();
        PreparedState
    }*/
  
}
