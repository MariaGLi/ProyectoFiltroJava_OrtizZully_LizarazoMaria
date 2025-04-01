
package MVC.Controller;

import MVC.Model.InventoryDAO;
import MVC.Model.medications;
import MVC.View.ViewInventary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import MVC.Model.supplies;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ControllerInventory  implements ActionListener{
    
    private InventoryDAO dao;
    private ViewInventary view;
    private medications medi;
    private supplies su;
    DefaultTableModel model = new DefaultTableModel();

    public ControllerInventory(InventoryDAO dao, ViewInventary view, medications medi, supplies su) {
        this.dao = dao;
        this.view = view;
        this.medi = medi;
        this.su = su;
        
        view.btnSearchMedi.addActionListener(this);
        view.btnSearchSup.addActionListener(this);
        view.btnListMedi.addActionListener(this);
        view.btnListSup.addActionListener(this);
    }
    
    private void searchMedi(){
        DefaultTableModel model = (DefaultTableModel) view.TableMedication.getModel();
        model.setRowCount(0); // Clear the table
        int id = Integer.parseInt(view.txtIDmedi.getText());
        medications medi = dao.getMediId(id);
        if (medi != null){
            Object[] row = {
                medi.getId_medication(),
                medi.getNameMedication(),
                medi.getTypeMedication(),
                medi.getManufacturer(),
                medi.getQuantity_in_stock(),
                medi.getExpiration_date(),
                medi.getQuantity_entered(),
                medi.getId_supplier()
            };
            model.addRow(row);
        }
    }
    
    private void searchSupply(){
        DefaultTableModel model = (DefaultTableModel) view.TableSupplies.getModel();
        model.setRowCount(0); // Clear the table
        int id = Integer.parseInt(view.txtIDSup.getText());
        supplies su = dao.getSupId(id);
        if (su != null){
            Object[] row = {
                su.getId_supply(),
                su.getNameSupply(),
                su.getQuantity_in_stock(),
                su.getQuantity_entered(),
                su.getExpiration_date(),
                su.getId_supplier()
            };
            model.addRow(row);
        }
    }
    
    private void ListMedication(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<medications> medi = new ArrayList<>();
        
        try{
            medi = dao.SearchMedi();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Medication not list");
        }
        
        Object[] object = new Object[8];
        for(int i = 0; i<medi.size(); i++){
            object[0] = medi.get(i).getId_medication();
            object[1] = medi.get(i).getNameMedication();
            object[2] = medi.get(i).getTypeMedication();
            object[3] = medi.get(i).getManufacturer();
            object[4] = medi.get(i).getQuantity_in_stock();
            object[5] = medi.get(i).getExpiration_date();
            object[6] = medi.get(i).getQuantity_entered();
            object[7] = medi.get(i).getId_supplier();
            
            model.addRow(object);
        }
        view.TableMedication.setModel(model);
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
        view.TableSupplies.setModel(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.btnSearchMedi){
            searchMedi();
        }
        
        if(e.getSource() == view.btnSearchSup){
            searchSupply();
        }
        
        if(e.getSource() == view.btnListMedi){
            ListMedication(view.TableMedication);
        }
        
        if(e.getSource() == view.btnListSup){
            ListSupplies(view.TableSupplies);
        }
    }
    
}
