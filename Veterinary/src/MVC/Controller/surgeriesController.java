package MVC.Controller;

import MVC.Model.surgeries;
import MVC.Model.surgeriesDAO;
import MVC.View.vistaManageSurgeries;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class surgeriesController implements ActionListener{

    surgeriesDAO surdao = new surgeriesDAO();
    surgeries sur = new surgeries();
    vistaManageSurgeries view = new vistaManageSurgeries();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public surgeriesController (vistaManageSurgeries view, surgeriesDAO surdao, surgeries sur){
        this.view =  view;
        this.surdao  = surdao;
        this.sur = sur;
        
        this.view.btnSave.addActionListener(this);
        this.view.btnList.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSave){
            sur.setId_consultation(Integer.parseInt(view.txtidConsultation.getText()));
            sur.setSurgery_type(view.txtsurType.getText());
            sur.setSupplies_used(view.txtsuppUsed.getText());
            sur.setRecovery_time(view.txtrecoTime.getText());
            sur.setFollow_up(view.txtfollowUp.getText());
            sur.setPreparatory_info(view.txtprepaInfo.getText());
            surdao.add(sur);
            modelo.setRowCount(0);
            list(view.table);
        }
        
        if (e.getSource() == view.btnList){
            list(view.table);
        }
    
        if (e.getSource() == view.btnDelete){
            surdao.deleteSurgeries(Integer.parseInt(view.txtidSurgery.getText()));
            modelo.setRowCount(0);
            list(view.table);
        }
        
        if (e.getSource() == view.btnUpdate){
            sur.setSurgery_type(view.txtsurType.getText());
            sur.setSupplies_used(view.txtsuppUsed.getText());
            sur.setRecovery_time(view.txtrecoTime.getText());
            sur.setFollow_up(view.txtfollowUp.getText());
            sur.setPreparatory_info(view.txtprepaInfo.getText());
            sur.setId_surgery(Integer.parseInt(view.txtidSurgery.getText()));
            surdao.updateSurgeries(sur);
            modelo.setRowCount(0);
            list(view.table);
        }
    }
    
    public void list (JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        List<surgeries> lyst =  surdao.getAll();
        Object[] object = new Object[7];
        for (int i = 0; i < lyst.size(); i++) {
            object[0] = lyst.get(i).getId_surgery();
            object[1] = lyst.get(i).getId_consultation();
            object[2] = lyst.get(i).getSurgery_type();
            object[3] = lyst.get(i).getSupplies_used();
            object[4] = lyst.get(i).getRecovery_time();
            object[5] = lyst.get(i).getFollow_up();
            object[6] = lyst.get(i).getPreparatory_info();
            modelo.addRow(object);
        }
        view.table.setModel(modelo);
    }
    
    public static void main(String[] args) {
        vistaManageSurgeries view = new vistaManageSurgeries();
        surgeriesDAO surdao = new surgeriesDAO();
        surgeries sur = new surgeries();
        surgeriesController sc = new surgeriesController(view, surdao, sur);
        view.setVisible(true);
        view.setLocationRelativeTo(view);
    }
}
