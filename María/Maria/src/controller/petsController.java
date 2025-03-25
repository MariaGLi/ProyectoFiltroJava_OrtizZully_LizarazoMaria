package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PetsDAO;
import modelo.pets;
import vista.Vista;

public class petsController implements ActionListener{

    PetsDAO petdao = new PetsDAO();
    pets pet = new pets();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public petsController (Vista v){
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnListar){
            list(vista.table);
        }
    }
    
    public void list(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<pets> lyst = petdao.getAll();
        Object[] object = new Object[14];
        for (int i = 0; i < lyst.size(); i++) {
            object [0] = lyst.get(i).getId_pet();
            object [1] = lyst.get(i).getFullName();
            object [2] = lyst.get(i).getSpecies();
            object [3] = lyst.get(i).getBreed();
            object [4] = lyst.get(i).getAge();
            object [5] = lyst.get(i).getBirth_date();
            object [6] = lyst.get(i).getGender();
            object [7] = lyst.get(i).getAllergies();
            object [8] = lyst.get(i).getConditions();
            object [9] = lyst.get(i).getWeight();
            object [10] = lyst.get(i).getMicrochip();
            object [11] = lyst.get(i).getPhoto();
            object [12] = lyst.get(i).getEmergy_contact();
            object [13] = lyst.get(i).getId_owner();
            modelo.addRow(object);
        }
        vista.table.setModel(modelo);
    }
    public static void main(String[] args) {
        Vista v = new Vista();
        petsController pc = new petsController(v);
        v.setVisible(true);
        v.setLocationRelativeTo(v);
    }
}
