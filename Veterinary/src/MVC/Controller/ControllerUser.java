/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.User;
import MVC.Model.UserDAO;
import MVC.View.crudUsers;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControllerUser implements ActionListener{
    
    UserDAO dao = new UserDAO();
    User user = new User();
    crudUsers viewUser = new crudUsers();
    DefaultTableModel model = new DefaultTableModel();

    public ControllerUser(UserDAO dao,User user, crudUsers viewUser ) {
        this.viewUser = viewUser;
        this.dao = dao;
        this.user = user;
        
        this.viewUser.btnListUser.addActionListener(this);
        this.viewUser.btnAddUser.addActionListener(this);
        this.viewUser.btnUpdateUser.addActionListener(this);
        this.viewUser.btnDeleteUser.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewUser.btnAddUser){
            user.setFull_name(viewUser.txtNameUser.getText());
            user.setIdentification(viewUser.txtIdenUser.getText());
            user.setAddres(viewUser.txtAddressUser.getText());
            user.setPhone(viewUser.txtPhoneUser.getText());
            user.setEmail(viewUser.txtEmailUser.getText());
            user.setRole((String) viewUser.CbRoleUser.getSelectedItem());
            if(dao.InsertUser(user)){
                JOptionPane.showMessageDialog(null, "User add");
            }else{
                JOptionPane.showMessageDialog(null, "User not add");
            }
        }
        
        if(e.getSource() == viewUser.btnUpdateUser){
            System.out.println("Ejecutando");
            user.setId_user(Integer.parseInt(viewUser.txtIdUser.getText()));
            user.setFull_name(viewUser.txtNameUser.getText());
            user.setIdentification(viewUser.txtIdenUser.getText());
            user.setAddres(viewUser.txtAddressUser.getText());
            user.setPhone(viewUser.txtPhoneUser.getText());
            user.setEmail(viewUser.txtEmailUser.getText());
            user.setRole((String) viewUser.CbRoleUser.getSelectedItem());
            
            if(dao.UpdateUser(user)){
                JOptionPane.showMessageDialog(null, "User update");
            }else{
                JOptionPane.showMessageDialog(null, "User not update");
            }
        }
        
        if(e.getSource() == viewUser.btnDeleteUser){
            user.setId_user(Integer.parseInt(viewUser.txtIdUser.getText()));
            
            if(dao.DeleteUser(user)){
                JOptionPane.showMessageDialog(null, "User delete");
            } else {
                JOptionPane.showMessageDialog(null, "User not delete");
            }
        }
        
        if(e.getSource() == viewUser.btnListUser){
            ListUsers(viewUser.TableUser);
        }
    }
    
    private void ListUsers(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<User> users = new ArrayList<>();
        
        try{
            users = dao.SearchUser();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "User not list");
        }
        
        Object[] object = new Object[7];
        for(int i = 0; i<users.size(); i++){
            object[0] = users.get(i).getId_user();
            object[1] = users.get(i).getFull_name();
            object[2] = users.get(i).getIdentification();
            object[3] = users.get(i).getAddres();
            object[4] = users.get(i).getPhone();
            object[5] = users.get(i).getEmail();
            object[6] = users.get(i).getRole();
            model.addRow(object);
        }
        viewUser.TableUser.setModel(model);
    }
    
    
}
