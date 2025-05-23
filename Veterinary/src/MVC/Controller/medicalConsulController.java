package MVC.Controller;

import MVC.Model.addConsulDAO;
import MVC.Model.medical_consultations;
import MVC.View.addAppointment;
import MVC.View.appointmentManagement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class medicalConsulController implements ActionListener{

    addConsulDAO medicondao = new addConsulDAO();
    medical_consultations medicon = new medical_consultations();
    addAppointment view = new addAppointment();
    

    public medicalConsulController ( addAppointment view, addConsulDAO medicondao, medical_consultations medicon){
        this.view = view;
        this.medicondao = medicondao;
        this.medicon = medicon;
        
        this.view.btnSave.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSave){
            medicon.setDate_time(view.txtdateTime.getText());
            medicon.setId_veterinarian(Integer.parseInt(view.txtVeterinarian.getText()));
            medicon.setId_pet(Integer.parseInt(view.txtidPet.getText()));
            medicon.setId_owner(Integer.parseInt(view.txtidOwner.getText()));
            medicon.setReason(view.txtReason.getText());
            medicon.setDiagnosis(view.txtDiagnosis.getText());
            medicon.setRecommendations(view.txtRecommendation.getText());
            medicon.setPrescription(view.txtPreesc.getText());
            medicon.setRequired_precedures(view.txtreqPrecedures.getText());
            medicon.setStatus_consul((String)view.statusConsul.getSelectedItem());
            medicondao.add(medicon);
        }
    }
    
    public static void main(String[] args) {
        appointmentManagement view = new appointmentManagement();
        view.setVisible(true);
        view.setLocationRelativeTo(view);
    }
}