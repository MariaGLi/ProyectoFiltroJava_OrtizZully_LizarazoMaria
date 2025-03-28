
package MVC.Controller;

import MVC.Model.AppointDAO;
import MVC.Model.medical_consultations;
import MVC.View.crudAppoint;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerAppoint implements ActionListener{
    
    medical_consultations mc = new medical_consultations();
    AppointDAO dao = new AppointDAO();
    crudAppoint viewAppoint = new crudAppoint();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerAppoint(medical_consultations mc,AppointDAO dao, crudAppoint viewAppoint) {
        this.viewAppoint = viewAppoint;
        this.mc = mc;
        this.dao = dao;
        
        this.viewAppoint.bntListAppoin.addActionListener(this);
        this.viewAppoint.btnDeleteAppoin.addActionListener(this);
        this.viewAppoint.btnInsertAppoint.addActionListener(this);
        this.viewAppoint.btnUpdateAppoin.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == viewAppoint.btnInsertAppoint){
            mc.setDate_time(viewAppoint.txtDaTIAppoint.getText());
            mc.setId_veterinarian(Integer.parseInt(viewAppoint.txtIdVetSup.getText()));
            mc.setId_pet(Integer.parseInt(viewAppoint.txtPetAppoin.getText()));
            mc.setId_owner(Integer.parseInt(viewAppoint.txtOwnerAppoin.getText()));
            mc.setReason(viewAppoint.txtReasonAppoin.getText());
            mc.setDiagnosis(viewAppoint.txtDiagAppoin.getText());
            mc.setRecommendations(viewAppoint.txtRecoAppoin.getText());
            mc.setPrescription(viewAppoint.txtPresAppoin.getText());
            mc.setRequired_precedures(viewAppoint.txtRequiAppoin.getText());
            mc.setStatus_consul((String)viewAppoint.cbStatuAppoin.getSelectedItem());
            
            if(dao.InsertAppoint(mc)){
                JOptionPane.showMessageDialog(null, "Appointment add");
            }else{
                JOptionPane.showMessageDialog(null, "Appointment not add");
            }
        }
        
        if(e.getSource() == viewAppoint.btnUpdateAppoin){
            mc.setId_consultation(Integer.parseInt(viewAppoint.txtIdAppoint.getText()));
            mc.setDate_time(viewAppoint.txtDaTIAppoint.getText());
            mc.setId_veterinarian(Integer.parseInt(viewAppoint.txtIdVetSup.getText()));
            mc.setId_pet(Integer.parseInt(viewAppoint.txtPetAppoin.getText()));
            mc.setId_owner(Integer.parseInt(viewAppoint.txtOwnerAppoin.getText()));
            mc.setReason(viewAppoint.txtReasonAppoin.getText());
            mc.setDiagnosis(viewAppoint.txtDiagAppoin.getText());
            mc.setRecommendations(viewAppoint.txtRecoAppoin.getText());
            mc.setPrescription(viewAppoint.txtPresAppoin.getText());
            mc.setRequired_precedures(viewAppoint.txtRequiAppoin.getText());
            mc.setStatus_consul((String)viewAppoint.cbStatuAppoin.getSelectedItem());
            
            if(dao.UpdateAppoint(mc)){
                JOptionPane.showMessageDialog(null, "Appointment update");
            }else{
                JOptionPane.showMessageDialog(null, "Appointment not update");
            }
        }
        
        if(e.getSource() == viewAppoint.btnDeleteAppoin){
            mc.setId_consultation(Integer.parseInt(viewAppoint.txtIdAppoint.getText()));
            if(dao.DeleteAppoin(mc)){
                JOptionPane.showMessageDialog(null, "Appointment delete");
            }else{
                JOptionPane.showMessageDialog(null, "Appointment not delete");
            }
        }
        
        if(e.getSource() == viewAppoint.bntListAppoin){
            ListAppoint(viewAppoint.TableAppoin);
        }
        
       
    }
     private void ListAppoint(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<medical_consultations> consul = new ArrayList<>();
        
        try{
            consul = dao.SearchAppoin();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Appoint not list");
        }
        
        Object[] object = new Object[11];
        for(int i = 0; i<consul.size(); i++){
            object[0] = consul.get(i).getId_consultation();
            object[1] = consul.get(i).getDate_time();
            object[2] = consul.get(i).getId_veterinarian();
            object[3] = consul.get(i).getId_pet();
            object[4] = consul.get(i).getId_owner();
            object[5] = consul.get(i).getReason();
            object[6] = consul.get(i).getDiagnosis();
            object[7] = consul.get(i).getRecommendations();
            object[8] = consul.get(i).getPrescription();
            object[9] = consul.get(i).getRequired_precedures();
            object[10] = consul.get(i).getStatus_consul();
            model.addRow(object);
        }
        viewAppoint.TableAppoin.setModel(model);
     }
    
}
