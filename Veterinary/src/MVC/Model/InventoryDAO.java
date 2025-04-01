
package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InventoryDAO extends Conexion {
    
    public medications getMediId(int id){
        medications medi = null;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Medications WHERE id_medication = ? ";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                medi = new medications();
                medi.setId_medication(rs.getInt("id_medication"));
                medi.setNameMedication(rs.getString("nameMedication"));
                medi.setTypeMedication(rs.getString("typeMedication"));
                medi.setManufacturer(rs.getString("manufacturer"));
                medi.setQuantity_in_stock(rs.getInt("quantity_in_stock"));
                medi.setExpiration_date(rs.getString("expiration_date"));
                medi.setQuantity_entered(rs.getInt("quantity_entered"));
                medi.setId_supplier(rs.getInt("id_supplier"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Sorre that ID does not exists");
            }
        }catch(SQLException e){
            System.err.println(e);
            JOptionPane.showConfirmDialog(null, "Error to llok for medication");
        }
        return medi;
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
    
    public supplies getSupId(int id){
        supplies su = null;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT * FROM Supplies WHERE id_supply = ? ";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                su = new supplies();
                su.setId_supply(rs.getInt("id_supply"));
                su.setNameSupply(rs.getString("nameSupply"));
                su.setQuantity_in_stock(Integer.parseInt(rs.getString("quantity_in_stock")));
                su.setQuantity_entered(Integer.parseInt(rs.getString("quantity_entered")));
                su.setExpiration_date(rs.getString("expiration_date"));
                su.setId_supplier(rs.getInt("id_supplier"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Sorre that ID does not exists");
            }
        }catch(SQLException e){
            System.err.println(e);
            JOptionPane.showConfirmDialog(null, "Error to look ID for supplies");
        }
        return su;
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
