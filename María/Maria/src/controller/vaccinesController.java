package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.VaccinesDAO;
import modelo.vaccines;
import vista.vistaVaccines;

public class vaccinesController implements ActionListener {

    VaccinesDAO vacdao = new VaccinesDAO();
    vaccines vac = new vaccines();
    vistaVaccines view = new vistaVaccines();
    DefaultTableModel modelo = new DefaultTableModel();

    public vaccinesController(vistaVaccines view, VaccinesDAO vacdao, vaccines vac) {
        this.view = view;
        this.vacdao = vacdao;
        this.vac = vac;
        
        this.view.btnSave.addActionListener(this);
        this.view.btnList.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSave){
            vac.setVaccine_type(view.txtvaccineType.getText());
            vac.setManufacturer(view.txtManufacturer.getText());
            vac.setLot(view.txtLot.getText());
            vac.setAdministration_date(view.txtadminDate.getText());
            vac.setExpiration_date(view.txtexpDate.getText());
            vac.setEntry_date(view.txtentryDate.getText());
            vac.setNext_dose_date(view.txtnextDose.getText());
            vac.setQuantity_in_stock(Integer.parseInt(view.txtquantStock.getText()));
            vac.setQuantity_entered(Integer.parseInt(view.txtquantEntered.getText()));
            vac.setId_pet(Integer.parseInt(view.txtidPet.getText()));
            vacdao.add(vac);
            list(view.table);
        }
        
        if (e.getSource() == view.btnList){
            list(view.table);
        }
        
        if (e.getSource() == view.btnDelete){
            vacdao.deleteVaccines(Integer.parseInt(view.txtidVaccine.getText()));
        }
    }
    
    public void list (JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        List<vaccines> lyst =  vacdao.getAll();
        Object[] object = new Object[11];
        for (int i = 0; i < lyst.size(); i++) {
            object[0] = lyst.get(i).getId_vaccine();
            object[1] = lyst.get(i).getVaccine_type();
            object[2] = lyst.get(i).getManufacturer();
            object[3] = lyst.get(i).getLot();
            object[4] = lyst.get(i).getAdministration_date();
            object[5] = lyst.get(i).getExpiration_date();
            object[6] = lyst.get(i).getEntry_date();
            object[7] = lyst.get(i).getNext_dose_date();
            object[8] = lyst.get(i).getQuantity_in_stock();
            object[9] = lyst.get(i).getQuantity_entered();
            object[10] = lyst.get(i).getId_pet();
            modelo.addRow(object);
        }
        view.table.setModel(modelo);
    }

    public static void main(String[] args) {
        vistaVaccines view = new vistaVaccines();
        VaccinesDAO vacdao = new VaccinesDAO();
        vaccines vac = new vaccines();
        vaccinesController vc = new vaccinesController(view, vacdao, vac);
        view.setVisible(true);
        view.setLocationRelativeTo(view);
    }
}
