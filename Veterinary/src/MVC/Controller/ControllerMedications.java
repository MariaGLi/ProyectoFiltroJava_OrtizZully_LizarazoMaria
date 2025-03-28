
package MVC.Controller;

import MVC.Model.MedicationsDAO;
import MVC.Model.medications;
import MVC.View.crudMedications;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerMedications implements ActionListener{

    medications medi = new medications();
    MedicationsDAO dao = new MedicationsDAO();
    crudMedications viewMedi = new crudMedications();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerMedications( medications medi, MedicationsDAO dao,crudMedications viewMedi) {
        this.medi = medi;
        this.dao = dao;
        this.viewMedi = viewMedi;
        
        this.viewMedi.btnDeleteMedi.addActionListener(this);
        this.viewMedi.btnInsertMedi.addActionListener(this);
        this.viewMedi.btnListMedi.addActionListener(this);
        this.viewMedi.btnUpdateMedi.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewMedi.btnInsertMedi){
            medi.setNameMedication(viewMedi.txtNameMedi.getText());
            medi.setTypeMedication(viewMedi.txtTypeMedi.getText());
            medi.setManufacturer(viewMedi.txtManuMedi.getText());
            medi.setQuantity_in_stock(Integer.parseInt(viewMedi.txtStockMedi.getText()));
            medi.setExpiration_date(viewMedi.txtExpiMedi.getText());
            medi.setQuantity_entered(Integer.parseInt(viewMedi.txtEnteMedi.getText()));
            if(dao.InsertMedi(medi)){
                JOptionPane.showMessageDialog(null, "Medication add");
            }else{
                JOptionPane.showMessageDialog(null, "Medication not add");
            }
        }
        
        if(e.getSource() == viewMedi.btnUpdateMedi){
            medi.setId_medication(Integer.parseInt(viewMedi.txtIdMedi.getText()));
            medi.setNameMedication(viewMedi.txtNameMedi.getText());
            medi.setTypeMedication(viewMedi.txtTypeMedi.getText());
            medi.setManufacturer(viewMedi.txtManuMedi.getText());
            medi.setQuantity_in_stock(Integer.parseInt(viewMedi.txtStockMedi.getText()));
            medi.setExpiration_date(viewMedi.txtExpiMedi.getText());
            medi.setQuantity_entered(Integer.parseInt(viewMedi.txtEnteMedi.getText()));
            
            if(dao.UpdateMedi(medi)){
                JOptionPane.showMessageDialog(null, "User update");
            }else{
                JOptionPane.showMessageDialog(null, "User not update");
            }
        }
        
        if(e.getSource() == viewMedi.btnDeleteMedi){
            medi.setId_medication(Integer.parseInt(viewMedi.txtIdMedi.getText()));
            
            if(dao.DeleteMedi(medi)){
                JOptionPane.showMessageDialog(null, "Medication delete");
            } else {
                JOptionPane.showMessageDialog(null, "Medication not delete");
            }
        }
        
        if(e.getSource() == viewMedi.btnListMedi){
            ListMedication(viewMedi.TableMedi);
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
        viewMedi.TableMedi.setModel(model);
    }
    
}
