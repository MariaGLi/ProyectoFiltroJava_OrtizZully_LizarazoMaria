package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PetsDAO;
import modelo.pets;
import vista.Vista;

public class petsController implements ActionListener {

    PetsDAO petdao = new PetsDAO();
    pets pet = new pets();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();

    public petsController(Vista v) {
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListar) {
            list(vista.table);
        }
        if(e.getSource() == vista.btnGuardar){
            Add();
        }
    }

    //Add pet
    public void Add() {
        String fullName = vista.txtfullName.getText();
        String species = vista.txtSpecie.getText();
        String breed = vista.txtBreed.getText();
        String birth_date = vista.txtbirthDate.getText();
        String gender = vista.txtGender.getText();
        String allergies = vista.txtAllergies.getText();
        String conditions = vista.txtConditions.getText();
        String microchip = vista.txtmicroChip.getText();
        String photo = vista.txtPhoto.getText();
        String emergy_contact = vista.txtemergyContact.getText();

        int ages = 0;
        float weight = 0.0f;
        int id_owner = 0;

        try {
            ages = Integer.parseInt(vista.txtAge.getText());
            weight = Float.parseFloat(vista.txtWeight.getText());
            id_owner = Integer.parseInt(vista.txtidOwner.getText());
        } catch (NumberFormatException e) {
            System.err.println("Error de conversión numérica: " + e.getMessage());
            return;
        }

        pet.setFullName(fullName);
        pet.setSpecies(species);
        pet.setBreed(breed);
        pet.setAge(ages);
        pet.setBirth_date(birth_date);
        pet.setGender(gender);
        pet.setAllergies(allergies);
        pet.setConditions(conditions);
        pet.setWeight(weight);
        pet.setMicrochip(microchip);
        pet.setPhoto(photo);
        pet.setEmergy_contact(emergy_contact);
        pet.setId_owner(id_owner);
        
        petdao.add(pet);
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
        Vista v = new Vista();
        petsController pc = new petsController(v);
        v.setVisible(true);
        v.setLocationRelativeTo(v);
    }
}
