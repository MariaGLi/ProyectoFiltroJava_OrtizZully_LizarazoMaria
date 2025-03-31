
package MVC.Controller;

import javax.swing.JTable;
import MVC.Model.BillingDAO;
import MVC.Model.billing;
import MVC.View.crudBillings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;




public class ControllerBilling implements ActionListener{

    private BillingDAO dao;
    private billing bill;
    private crudBillings viewBill;
    private DefaultTableModel model;

    public ControllerBilling(BillingDAO dao, billing bill, crudBillings viewBill) {
        this.dao = dao;
        this.bill = bill;
        this.viewBill = viewBill;
        
        this.viewBill.btnDeleteBi.addActionListener(this);
        this.viewBill.btnInsertBi.addActionListener(this);
        this.viewBill.btnListBi.addActionListener(this);
        this.viewBill.btnUpdateBi.addActionListener(this);
        
        
    }
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewBill.btnInsertBi) {
            System.out.println("Boton insertar presionado");
            bill.setId_veterinarian(Integer.parseInt(viewBill.txtIdVetBi.getText()));
            bill.setId_owner(Integer.parseInt(viewBill.txtIdOwBil.getText()));
            bill.setId_consultation(Integer.parseInt(viewBill.txtIdConBil.getText()));
            bill.setIssue_date(viewBill.txtDateBi.getText());
            bill.setDescription(viewBill.txtDescipBi.getText());
            bill.setQuantity(Integer.parseInt(viewBill.txtQuantityBi.getText()));
            bill.setUnit_value(Float.parseFloat(viewBill.txtUnitBi.getText()));
            bill.setSubtotal(bill.getQuantity() * bill.getUnit_value());
            bill.setTax(Float.parseFloat(viewBill.txtTaxBi.getText()));
            bill.setTotal(bill.getSubtotal() + bill.getTax());
            bill.setStatusBill((String)viewBill.cbStatuBi.getSelectedItem());
            if(dao.InsertBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing added");
                ListBilling(viewBill.TableBi);
            } else {
                JOptionPane.showMessageDialog(null, "Billing not added");
            }
            
        }
        
        if (e.getSource() == viewBill.btnUpdateBi) {
            System.out.println("si sirvo");
            bill.setId_bill(Integer.parseInt(viewBill.txtIdBi.getText()));
            bill.setId_veterinarian(Integer.parseInt(viewBill.txtIdVetBi.getText()));
            bill.setId_owner(Integer.parseInt(viewBill.txtIdOwBil.getText()));
            bill.setId_consultation(Integer.parseInt(viewBill.txtIdConBil.getText()));
            bill.setIssue_date(viewBill.txtDateBi.getText());
            bill.setDescription(viewBill.txtDescipBi.getText());
            bill.setQuantity(Integer.parseInt(viewBill.txtQuantityBi.getText()));
            bill.setUnit_value(Float.parseFloat(viewBill.txtUnitBi.getText()));
            bill.setSubtotal(bill.getQuantity() * bill.getUnit_value());
            bill.setTax(Float.parseFloat(viewBill.txtTaxBi.getText()));
            bill.setTotal(bill.getSubtotal() + bill.getTax());
            bill.setStatusBill((String)viewBill.cbStatuBi.getSelectedItem());
            if (dao.UpdateBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing update");
                
            } else {
                JOptionPane.showMessageDialog(null, "Billing not update");
            }
            
        }
        
        if (e.getSource() == viewBill.btnDeleteBi) {
            System.out.println("sirvo");
            bill.setId_bill(Integer.parseInt(viewBill.txtIdBi.getText()));
            if (dao.DeleteBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing delete");
                
            } else {
                JOptionPane.showMessageDialog(null, "Billing not delete");
            }
            
        }
        
        if (e.getSource() == viewBill.btnListBi) {
            System.out.println("Sirvo");
            ListBilling(viewBill.TableBi);
        }

    }
    
    private void ListBilling(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<billing> bills = dao.ListBilling();
        
        
        Object[] object = new Object[12];
        for(int i = 0; i<bills.size(); i++){
            object[0] = bills.get(i).getId_bill();
            object[1] = bills.get(i).getId_veterinarian();
            object[2] = bills.get(i).getId_owner();
            object[3] = bills.get(i).getId_consultation();
            object[4] = bills.get(i).getIssue_date();
            object[5] = bills.get(i).getDescription();
            object[6] = bills.get(i).getQuantity();
            object[7] = bills.get(i).getUnit_value();
            object[8] = bills.get(i).getSubtotal();
            object[9] = bills.get(i).getTax();
            object[10] = bills.get(i).getTotal();
            object[11] = bills.get(i).getStatusBill();
            
            model.addRow(object);
        }
        viewBill.TableBi.setModel(model);
    }
   
    public

}

