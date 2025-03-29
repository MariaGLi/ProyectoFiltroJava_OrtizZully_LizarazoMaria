/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.SupplierDAO;
import MVC.Model.suppliers;
import MVC.View.crudSuppliers;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerSuppliers implements ActionListener{
    SupplierDAO dao = new SupplierDAO();
    suppliers su = new suppliers();
    crudSuppliers viewSu = new crudSuppliers();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerSuppliers(SupplierDAO dao,suppliers su, crudSuppliers viewSu ) {
        this.dao = dao;
        this.su = su;
        this.viewSu = viewSu;
        
        this.viewSu.btnInsertSu.addActionListener(this);
        this.viewSu.btnUpdateSu.addActionListener(this);
        this.viewSu.btnListSu.addActionListener(this);
        this.viewSu.btnDeleteSu.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewSu.btnInsertSu){
            su.setFull_name(viewSu.txtNameSu.getText());
            su.setIdentification(viewSu.txtIdenSu.getText());
            su.setEmail(viewSu.txtEmailSu.getText());
            su.setOrder_name(viewSu.txtOrderSu.getText());
            int idAdmin = Integer.parseInt(viewSu.txtIdAdmin.getText());
            su.setId_administrator(idAdmin);
            
            // Here will check if the id_administrator exists in Users
            if (dao.existsAdministrator(idAdmin)){
                if(dao.InsertSu(su)){
                JOptionPane.showMessageDialog(null, "Supplier added");
                }else{
                    JOptionPane.showMessageDialog(null, "Supplier not added");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid administrator ID:" + idAdmin + "doesn't exist");
            }
            
        }
        
        if(e.getSource() == viewSu.btnUpdateSu){
            su.setId_supplier(Integer.parseInt(viewSu.txtIdSu.getText()));
            su.setFull_name(viewSu.txtNameSu.getText());
            su.setIdentification(viewSu.txtIdenSu.getText());
            su.setEmail(viewSu.txtEmailSu.getText());
            su.setOrder_name(viewSu.txtOrderSu.getText());
            su.setId_administrator(Integer.parseInt(viewSu.txtIdAdmin.getText()));
            if(dao.UpdateSu(su)){
                JOptionPane.showMessageDialog(null, "Supplier update");
            }else{
                JOptionPane.showMessageDialog(null, "Supplier not update");
            }
        }
        
        if(e.getSource() == viewSu.btnDeleteSu){
            su.setId_supplier(Integer.parseInt(viewSu.txtIdSu.getText()));
            
            if(dao.DeleteSu(su)){
                JOptionPane.showMessageDialog(null, "Supplier delete");
            } else {
                JOptionPane.showMessageDialog(null, "Supplier not delete");
            }
        }
        
        if(e.getSource() == viewSu.btnListSu){
            ListSu(viewSu.TableSu);
        }
    }
    
    
    
    private void ListSu(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<suppliers> su = new ArrayList<>();
        
        try{
            su = dao.SearchSu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Supplier not list");
        }
        
        Object[] object = new Object[6];
        for(int i = 0; i<su.size(); i++){
            object[0] = su.get(i).getId_supplier();
            object[1] = su.get(i).getFull_name();
            object[2] = su.get(i).getIdentification();
            object[3] = su.get(i).getEmail();
            object[4] = su.get(i).getOrder_name();
            object[5] = su.get(i).getIdentification();
            model.addRow(object);
        }
        viewSu.TableSu.setModel(model);
    }
    
}
