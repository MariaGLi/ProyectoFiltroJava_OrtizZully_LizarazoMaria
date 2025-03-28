/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.OwnerDAO;
import MVC.Model.User;
import MVC.View.crudOwner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerOwner implements ActionListener {
    OwnerDAO dao = new OwnerDAO();
    User user = new User();
    crudOwner viewOwner = new crudOwner();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerOwner(OwnerDAO dao, User user, crudOwner viewOwner) {
        this.dao = dao;
        this.user = user;
        this.viewOwner = viewOwner;
        
        this.viewOwner.btnListOwner.addActionListener(this);
        this.viewOwner.btnUpdateOwner.addActionListener(this);
        this.viewOwner.btnDeleteOwner.addActionListener(this);
        this.viewOwner.btnListOwner.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewOwner.btnUpdateOwner){
            user.setFull_name(viewOwner.txtNameOwner.getText());
            user.setIdentification(viewOwner.txtIdenOwner.getText());
            user.setAddres(viewOwner.txtAddressOwner.getText());
            user.setPhone(viewOwner.txtPhoneOwner.getText());
            user.setEmail(viewOwner.txtEmailOwner.getText());
            if(dao.UpdateOwner(user)){
                JOptionPane.showMessageDialog(null, "Update owner");
            }else{
                JOptionPane.showMessageDialog(null, "Update owner");
            }
        }
        
        if(e.getSource() == viewOwner.btnDeleteOwner){
            user.setId_user(Integer.parseInt(viewOwner.txtIdOwner.getText()));
            
            if(dao.DeleteOwner(user)){
                JOptionPane.showMessageDialog(null, "Owner delete");
            } else {
                JOptionPane.showMessageDialog(null, "Owner not delete");
            }
        }
        
        if(e.getSource() == viewOwner.btnListOwner){
            ListOwner(viewOwner.TableOwner);
        }
    }
    private void ListOwner(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<User> users = new ArrayList<>();
        
        try{
            users = dao.SearchOwner();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Owner not list");
        }
        
        Object[] object = new Object[6];
        for(int i = 0; i<users.size(); i++){
            object[0] = users.get(i).getId_user();
            object[1] = users.get(i).getFull_name();
            object[2] = users.get(i).getIdentification();
            object[3] = users.get(i).getAddres();
            object[4] = users.get(i).getPhone();
            object[5] = users.get(i).getEmail();
            model.addRow(object);
        }
        viewOwner.TableOwner.setModel(model);
    }
}
