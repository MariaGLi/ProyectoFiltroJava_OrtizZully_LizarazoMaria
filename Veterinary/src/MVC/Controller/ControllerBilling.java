
package MVC.Controller;

import MVC.Model.AppointDAO;
import MVC.Model.BillingDAO;
import MVC.Model.UserDAO;
import MVC.Model.billing;
import MVC.View.crudBillings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ControllerBilling implements ActionListener{

    private BillingDAO dao;
    private billing bill;
    private crudBillings viewBill;
    private DefaultTableModel model;

    public ControllerBilling(BillingDAO dao, billing bill, crudBillings viewBill, DefaultTableModel model) {
        this.dao = dao;
        this.bill = bill;
        this.viewBill = viewBill;
        this.model = model;
        
        this.viewBill.btnDeleteBi.addActionListener(this);
        this.viewBill.btnInsertBi.addActionListener(this);
        this.viewBill.btnListBi.addActionListener(this);
        this.viewBill.btnUpdateBi.addActionListener(this);
        
        fillComboBoxes();
        listBilling();
    }
    
    private void fillComboBoxes(){
        UserDAO userDAO = new UserDAO ();
        AppointDAO consulDAO  = new AppointDAO();
        
        List<String> owners = userDAO.getUserByRole("owner");
        for(String owner : owners){
            viewBill.cbOwnerBi.addItem(owner);
        }
        
        List<String> vets = userDAO.getUserByRole("veterinarian");
        for(String vet : vets){
            viewBill.cbVetBi.addItem(vet);
        }
        
        List<String> consultations = consulDAO.getConsultations();
        for(String consultation : consultations){
            viewBill.cbConsulBi.addItem(consultation);
        }
    }
    
    private void listBilling(){
        model.setRowCount(0);
        List<billing> bills = dao.ListBilling();
        for(billing bill : bills){
            Object[] object = new Object[12];
            object[0] = bill.getId_bill();
            object[1] = bill.getId_veterinarian();
            object[2] = bill.getId_owner();
            object[3] = bill.getId_consultation();
            object[4] = bill.getIssue_date();
            object[5] = bill.getDescription();
            object[6] = bill.getQuantity();
            object[7] = bill.getUnit_value();
            object[8] = bill.getSubtotal();
            object[9] = bill.getTax();
            object[10] = bill.getTotal();
            object[11] = bill.getStatusBill();
            model.addRow(object);
        }
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewBill.btnInsertBi) {
            if(dao.InsertBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Factura agregada exitosamente");
                listBilling();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar factura");
            }
            
        }
        
        if (e.getSource() == viewBill.btnUpdateBi) {
                setBillingData();
            if (dao.UpdateBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Factura actualizada exitosamente");
                listBilling();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar factura");
            }
            
        }
        
        if (e.getSource() == viewBill.btnDeleteBi) {
            if (dao.DeleteBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Factura eliminada exitosamente");
                listBilling();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar factura");
            }
            
        }
        
        if (e.getSource() == viewBill.btnListBi) {
            listBilling();
        }

    }
    
    private void setBillingData() {
        bill.setId_veterinarian(Integer.parseInt(viewBill.cbVetBi.getSelectedItem().toString().split(" - ")[0]));
        bill.setId_owner(Integer.parseInt(viewBill.cbOwnerBi.getSelectedItem().toString().split(" - ")[0]));
        bill.setId_consultation(Integer.parseInt(viewBill.cbConsulBi.getSelectedItem().toString().split(" - ")[0]));
        bill.setIssue_date(viewBill.txtDateBi.getText());
        bill.setDescription(viewBill.txtDescipBi.getText());
        bill.setQuantity(Integer.parseInt(viewBill.txtQuantityBi.getText()));
        bill.setUnit_value(Float.parseFloat(viewBill.txtUnitBi.getText()));
        bill.setSubtotal(bill.getQuantity() * bill.getUnit_value());
        bill.setTax(Float.parseFloat(viewBill.txtTaxBi.getText()));
        bill.setTotal(bill.getSubtotal() + bill.getTax());
        bill.setStatusBill(viewBill.cbStatuBi.getSelectedItem().toString());
        
        viewBill.txtSubtoBi.setText(String.valueOf(bill.getSubtotal()));
        viewBill.txtTotalBill.setText(String.valueOf(bill.getTotal()));
    }

    private void setComboBoxSelection(JComboBox<String> comboBox, String id) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            String item = comboBox.getItemAt(i);
            if (item.startsWith(id + " - ")) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    private void clearFields() {
        viewBill.txtIdBi.setText("");
        viewBill.txtDateBi.setText("");
        viewBill.txtDescipBi.setText("");
        viewBill.txtQuantityBi.setText("");
        viewBill.txtUnitBi.setText("");
        viewBill.txtSubtoBi.setText("");
        viewBill.txtTaxBi.setText("");
        viewBill.txtTotalBill.setText("");
        viewBill.cbOwnerBi.setSelectedIndex(0);
        viewBill.cbVetBi.setSelectedIndex(0);
        viewBill.cbConsulBi.setSelectedIndex(0);
        viewBill.cbStatuBi.setSelectedIndex(0);
    }

}
