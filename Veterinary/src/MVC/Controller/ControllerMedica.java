/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.MedicationDAO;
import MVC.Model.medications;
import MVC.View.crudMedication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerMedica implements ActionListener{
    
    medications medi = new medications();
    MedicationDAO dao = new MedicationDAO();
    crudMedication view = new crudMedication();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerMedica(medications medi,MedicationDAO dao,crudMedication view ) {
        this.medi = medi;
        this.dao = dao;
        this.view = view;
        
        this.view.btnDeleteMedi.addActionListener(this);
        this.view.btnInsertMedi.addActionListener(this);
        this.view.btnListarMedi.addActionListener(this);
        this.view.btnUpdateMedi.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.btnInsertMedi){
            medi.setNameMedication(view.txtNameMedi.getText());
            medi.setTypeMedication(view.txtTypeMedi.getText());
            medi.setManufacturer(view.txtManuMedi.getText());
            medi.setQuantity_in_stock(Integer.parseInt(view.txtStockMedi.getText()));
            medi.setExpiration_date(view.txtExpiMedi.getText());
            medi.setQuantity_entered(Integer.parseInt(view.txtEntereMedi.getText()));
            medi.setId_supplier(Integer.parseInt(view.txtSupMedi.getText()));
            if(dao.InsertMedi(medi)){
                JOptionPane.showMessageDialog(null, "User add");
            }else{
                JOptionPane.showMessageDialog(null, "User not add");
            }
        }
        
    }
    
}
