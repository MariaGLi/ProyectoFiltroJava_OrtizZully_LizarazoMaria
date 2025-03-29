
package MVC.Controller;

import MVC.Model.SuppliesDAO;
import MVC.Model.supplies;
import MVC.View.crudSupplies;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerSupplies implements ActionListener{
    
    SuppliesDAO dao = new SuppliesDAO();
    supplies su = new supplies();
    crudSupplies viewSu = new crudSupplies();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerSupplies(SuppliesDAO dao,supplies su, crudSupplies viewSu) {
        this.dao = dao;
        this.su = su;
        this.viewSu = viewSu;
        
        this.viewSu.btnDeleteSup.addActionListener(this);
        this.viewSu.btnInsertSup.addActionListener(this);
        this.viewSu.btnListSup.addActionListener(this);
        this.viewSu.btnUpdateSup.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewSu.btnInsertSup){
            su.setNameSupply(viewSu.txtNameSup.getText());
            su.setQuantity_in_stock(Integer.parseInt(viewSu.txtStockSup.getText()));
            su.setQuantity_entered(Integer.parseInt(viewSu.txtEnteredSup.getText()));
            su.setExpiration_date(viewSu.txtExpiSup.getText());
            su.setId_supplier(Integer.parseInt(viewSu.txtIdSupplierSup.getText()));
            
            if(dao.InsertSupplies(su)){
                JOptionPane.showMessageDialog(null, "Supplies add");
            }else{
                JOptionPane.showMessageDialog(null, "Supplies not add");
            }
        }
        
        if(e.getSource() == viewSu.btnUpdateSup){
            su.setId_supply(Integer.parseInt(viewSu.txtIDSup.getText()));
            su.setNameSupply(viewSu.txtNameSup.getText());
            su.setQuantity_in_stock(Integer.parseInt(viewSu.txtStockSup.getText()));
            su.setQuantity_entered(Integer.parseInt(viewSu.txtEnteredSup.getText()));
            su.setExpiration_date(viewSu.txtExpiSup.getText());
            su.setId_supplier(Integer.parseInt(viewSu.txtIdSupplierSup.getText()));
            if(dao.UpdateSupplies(su)){
                JOptionPane.showMessageDialog(null, "Supplies update");
            }else{
                JOptionPane.showMessageDialog(null, "Supplies not update");
            }
        }
        
        if(e.getSource() == viewSu.btnDeleteSup){
            su.setId_supply(Integer.parseInt(viewSu.txtIDSup.getText()));
            
            if(dao.DeleteSupplies(su)){
                JOptionPane.showMessageDialog(null, "Supplies delete");
            } else {
                JOptionPane.showMessageDialog(null, "Supplies not delete");
            }
        }
        if(e.getSource() == viewSu.btnListSup){
            ListSupplies(viewSu.TableSup);
        }
        
    }
    private void ListSupplies(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<supplies> su = new ArrayList<>();
        
        try{
            su = dao.SearchSupplies();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Supplies not list");
        }
        
        Object[] object = new Object[6];
        for(int i = 0; i<su.size(); i++){
            object[0] = su.get(i).getId_supply();
            object[1] = su.get(i).getNameSupply();
            object[2] = su.get(i).getQuantity_in_stock();
            object[3] = su.get(i).getQuantity_entered();
            object[4] = su.get(i).getExpiration_date();
            object[5] = su.get(i).getId_supplier();
            model.addRow(object);
        }
        viewSu.TableSup.setModel(model);
    }
}
