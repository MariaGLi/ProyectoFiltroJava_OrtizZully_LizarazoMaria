package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class surgeriesDAO extends Conexion{
    
    // Add a surgeries
    public boolean add(surgeries surgery) {
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO surgeries (id_consultation, surgery_type, supplies_used, recovery_time, follow_up, preparatory_info) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, surgery.getId_consultation());
            ps.setString(2, surgery.getSurgery_type());
            ps.setString(3, surgery.getSupplies_used());
            ps.setString(4, surgery.getRecovery_time());
            ps.setString(5, surgery.getFollow_up());
            ps.setString(6, surgery.getPreparatory_info());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Surgery add.");
            return true;
        } catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "¡Error!, surgery not add.");
            return false;
        }
    }
    
    //List surgeries
    public List<surgeries> getAll() {
        List<surgeries> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Surgeries";
        
        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new surgeries(
                        rs.getInt("id_surgery"),
                        rs.getInt("id_consultation"),
                        rs.getString("surgery_type"),
                        rs.getString("supplies_used"),
                        rs.getString("recovery_time"),
                        rs.getString("follow_up"),
                        rs.getString("preparatory_info")
                        
                ));
            }
            System.out.println("Esta listando");
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
    }
    
    //Delete Surgeries
    public boolean deleteSurgeries(int id){
        
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "DELETE FROM Surgeries WHERE id_surgery = ?";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Surgery has been eliminated.");
            return true;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error! surgery has not been eliminated." + e);
            return false;
        }
    }
    
    //Update surgeries
    public boolean updateSurgeries(surgeries surgery){
        
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "UPDATE Surgeries SET surgery_type = ?, supplies_used = ?, recovery_time = ?, follow_up = ?, preparatory_info = ? WHERE id_surgery = ?";
        
        try {
            ps = conec.prepareStatement(sql);
            ps.setString(1, surgery.getSurgery_type());
            ps.setString(2, surgery.getSupplies_used());
            ps.setString(3, surgery.getRecovery_time());
            ps.setString(4, surgery.getFollow_up());
            ps.setString(5, surgery.getPreparatory_info());
            ps.setInt(6, surgery.getId_surgery());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Surgery update.");
            return true;
        } catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "¡Error! surgery not update.");
            return false;
        }
    }
}
