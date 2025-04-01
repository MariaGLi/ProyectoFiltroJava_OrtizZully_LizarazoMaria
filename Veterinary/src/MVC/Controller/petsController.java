package MVC.controller;

import MVC.Model.PetsDAO;
import MVC.Model.pets;
import MVC.View.MenuAdmi;
import MVC.View.MenuOwner;
import MVC.View.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class petsController implements ActionListener {
    private PetsDAO petdao;
    private pets pet ;
    private Vista vista;
    private DefaultTableModel modelo;
    private String userRole;
    

    public petsController(Vista vista, PetsDAO petdao, pets pet, String userRole) {
        this.vista = vista;
        this.petdao = petdao;
        this.pet = pet;
        this.userRole = userRole;
        this.modelo = new DefaultTableModel();

        this.vista.btnListar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnBackPet.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListar) {
            list(vista.table);
        }

        if (e.getSource() == vista.btnGuardar) {
            pet.setFullName(vista.txtfullName.getText());
            pet.setSpecies(vista.txtSpecie.getText());
            pet.setBreed(vista.txtBreed.getText());
            pet.setAge(Integer.parseInt(vista.txtAge.getText()));
            pet.setBirth_date(vista.txtbirthDate.getText());
            pet.setGender(vista.txtGender.getText());
            pet.setAllergies(vista.txtAllergies.getText());
            pet.setConditions(vista.txtConditions.getText());
            pet.setWeight(Float.parseFloat(vista.txtWeight.getText()));
            pet.setMicrochip(vista.txtmicroChip.getText());
            pet.setPhoto(vista.txtPhoto.getText());
            pet.setEmergy_contact(vista.txtemergyContact.getText());
            pet.setId_owner(Integer.parseInt(vista.txtidOwner.getText()));
            petdao.add(pet);
            modelo.setRowCount(0);
            list(vista.table);
        }

        if (e.getSource() == vista.btnEliminar) {
            petdao.deletePets(Integer.parseInt(vista.txtID.getText()));
            modelo.setRowCount(0);
            list(vista.table);
        }
        
        if (e.getSource() == vista.btnEditar){
            pet.setAge(Integer.parseInt(vista.txtAge.getText()));
            pet.setAllergies(vista.txtAllergies.getText());
            pet.setConditions(vista.txtConditions.getText());
            pet.setWeight(Float.parseFloat(vista.txtWeight.getText()));
            pet.setPhoto(vista.txtPhoto.getText());
            pet.setEmergy_contact(vista.txtemergyContact.getText());
            pet.setId_pet(Integer.parseInt(vista.txtID.getText()));
            pet.setId_owner(Integer.parseInt(vista.txtidOwner.getText()));
            petdao.update(pet);
            modelo.setRowCount(0);
            list(vista.table);
        }
        
        if(e.getSource() == vista.btnBackPet){
            System.out.println("User role " + userRole);
            vista.dispose();// Close actual view
            
            if("administrator".equals(userRole)){
                MenuAdmi ma = new MenuAdmi();
                ma.setVisible(true);
                ma.setLocationRelativeTo(null);
            } else if("owner".equals(userRole)){
                MenuOwner mo = new MenuOwner();
                mo.setVisible(true);
                mo.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "Unknown User role");
            }
        }
    }

    //List pet
    public void list(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<pets> lyst = petdao.getAll();
        Object[] object = new Object[14];
        for (int i = 0; i < lyst.size(); i++) {
            object[0] = lyst.get(i).getId_pet();
            object[1] = lyst.get(i).getFullName();
            object[2] = lyst.get(i).getSpecies();
            object[3] = lyst.get(i).getBreed();
            object[4] = lyst.get(i).getAge();
            object[5] = lyst.get(i).getBirth_date();
            object[6] = lyst.get(i).getGender();
            object[7] = lyst.get(i).getAllergies();
            object[8] = lyst.get(i).getConditions();
            object[9] = lyst.get(i).getWeight();
            object[10] = lyst.get(i).getMicrochip();
            object[11] = lyst.get(i).getPhoto();
            object[12] = lyst.get(i).getEmergy_contact();
            object[13] = lyst.get(i).getId_owner();
            modelo.addRow(object);
        }
        vista.table.setModel(modelo);
    }

    public static void main(String[] args) {
        Vista vista = new Vista();
        PetsDAO petdao = new PetsDAO();
        pets pet = new pets();
        petsController pc = new petsController(vista, petdao, pet,"administrator");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
       
    }
}
/*
  Vista abrir = new Vista();
  abrir.setVisible(true);
  this.setVisible(false);
*/
