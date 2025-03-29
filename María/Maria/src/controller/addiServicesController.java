package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.additionalServicesDAO;
import modelo.additional_services;
import vista.additionalServices;

public class addiServicesController implements ActionListener {

    additionalServicesDAO addiservdao = new additionalServicesDAO();
    additional_services addiserv = new additional_services();
    additionalServices see = new additionalServices();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public addiServicesController(additionalServices see, additionalServicesDAO addiservdao, additional_services addiserv){
        this.see = see;
        this.addiservdao = addiservdao;
        this.addiserv = addiserv;
        
        this.see.btnAdd.addActionListener(this);
        this.see.btnCancel.addActionListener(this);
        this.see.btnList.addActionListener(this);        
    }
       
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == see.btnAdd){
            addiserv.setId_pet(Integer.parseInt(see.txtidPet.getText()));
            addiserv.setService_type(see.txtServType.getText());
            addiserv.setDescriptionServices(see.txtdescServ.getText());
            addiserv.setDate_time(see.txtdateTime.getText());
            addiservdao.add(addiserv);
        }
        
        if (e.getSource() == see.btnList){
            list(see.table);
        }
        
        if (e.getSource() == see.btnCancel){
            addiservdao.deleteService(Integer.parseInt(see.txtidPet.getText()));
        }
    }
    
    //List pet
    public void list(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<additional_services> lyst = addiservdao.getAll();
        Object[] object = new Object[5];
        for (int i = 0; i < lyst.size(); i++) {
            object[0] = lyst.get(i).getId_service();
            object[1] = lyst.get(i).getId_pet();
            object[2] = lyst.get(i).getService_type();
            object[3] = lyst.get(i).getDescriptionServices();
            object[4] = lyst.get(i).getDate_time();
            modelo.addRow(object);
        }
        see.table.setModel(modelo);
    }
    
    public static void main(String[] args) {
        additionalServices see = new additionalServices();
        additionalServicesDAO addiservdao = new additionalServicesDAO();
        additional_services addiserv = new additional_services();
        addiServicesController asc = new addiServicesController(see, addiservdao, addiserv);
        see.setVisible(true);
        see.setLocationRelativeTo(see);
    }

}
