package  MVC.Controller;

import MVC.View.cancelAppointment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.cancelConsulDAO;


public class cancelConsulController implements ActionListener {

    cancelConsulDAO delcondao = new cancelConsulDAO();
    cancelAppointment view = new cancelAppointment();

    public cancelConsulController(cancelAppointment view, cancelConsulDAO delcondao) {
        this.view = view;
        this.delcondao = delcondao;
        
        this.view.btncancelApp.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btncancelApp){
            delcondao.deleteConsul(Integer.parseInt(view.txtidConsultation.getText()));
        }
    }
}
