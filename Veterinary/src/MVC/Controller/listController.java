package MVC.Controller;

import MVC.Model.listConsulDAO;
import MVC.Model.medical_consultations;
import MVC.View.viewAppointment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class listController implements ActionListener {
    medical_consultations consul = new medical_consultations();
    listConsulDAO listcondao = new listConsulDAO();    
    viewAppointment view = new viewAppointment();
    DefaultTableModel modelo = new DefaultTableModel();

    public listController(viewAppointment view, listConsulDAO listcondao, medical_consultations consul) {
        this.view = view;
        this.listcondao = listcondao;        
        this.consul = consul;
        this.view.btnList.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == view.btnList){
            list(view.table);
        }
    }
    
    public void list (JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        List<medical_consultations> lyst =  listcondao.getAllvaccines(Integer.parseInt(view.txtVeterinary.getText()));
        Object[] object = new Object[5];
        for (int i = 0; i < lyst.size(); i++) {
            object[0] = lyst.get(i).getId_consultation();
            object[1] = lyst.get(i).getId_pet();
            object[2] = lyst.get(i).getId_owner();
            object[3] = lyst.get(i).getDate_time();
            object[4] = lyst.get(i).getStatus_consul();            
            modelo.addRow(object);
        }
        view.table.setModel(modelo);
    }

}
