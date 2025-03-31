package  MVC.Controller;

import MVC.Model.cancelConsulDAO;
import MVC.Model.medical_consultations;
import MVC.View.cancelAppointment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class cancelConsulController implements ActionListener {

    cancelConsulDAO dao = new cancelConsulDAO();
    cancelAppointment view = new cancelAppointment();
    medical_consultations medicon = new medical_consultations();

    public cancelConsulController(cancelAppointment view, cancelConsulDAO delcondao, medical_consultations medicon) {
        this.view = view;
        this.dao = delcondao;
        this.medicon = medicon;
        this.view.btncancelApp.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btncancelApp){
            dao.deleteConsul(Integer.parseInt(view.txtidConsultation.getText()));
            if(dao.deleteConsul(medicon)){
                JOptionPane.showMessageDialog(null, "Owner delete");
            } else {
                JOptionPane.showMessageDialog(null, "Owner not delete");
            }
        }
    }
}
