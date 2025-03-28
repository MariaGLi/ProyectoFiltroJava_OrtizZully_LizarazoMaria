package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.additionalServicesDAO;
import modelo.additional_services;
import vista.aditionalServices;

public class addiServicesController implements ActionListener {

    additionalServicesDAO addiservdao = new additionalServicesDAO();
    additional_services addiserv = new additional_services();
    aditionalServices see = new aditionalServices();
    
    public addiServicesController(aditionalServices see, additionalServicesDAO addiservdao, additional_services addiserv){
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
    }
    
    public static void main(String[] args) {
        aditionalServices see = new aditionalServices();
        additionalServicesDAO addiservdao = new additionalServicesDAO();
        additional_services addiserv = new additional_services();
        addiServicesController asc = new addiServicesController(see, addiservdao, addiserv);
        //aditionalServices.setVisible(true);
        //aditionalServices.setLocationRelativeTo(see);
    }
}
