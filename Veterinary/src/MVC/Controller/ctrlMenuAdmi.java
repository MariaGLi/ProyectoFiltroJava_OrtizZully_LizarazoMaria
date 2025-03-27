/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.CRUDuser;
import MVC.Model.LoginDAO;
import MVC.Model.User;
import MVC.View.MenuAdmi;
import MVC.View.crudUsers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author const
 */
public class ctrlMenuAdmi {
    private User modelUser;
    private MenuAdmi admiMenu;
    private CRUDuser queryUser;
    private crudUsers viewUser;

    public ctrlMenuAdmi(User modelUser, MenuAdmi admiMenu, CRUDuser queryUser, crudUsers viewUser) {
        this.modelUser = modelUser;
        this.admiMenu = admiMenu;
        this.queryUser = queryUser;
        this.viewUser = viewUser;
        //this.viewUser.btnAddUser.addActionListener(this);
        //this.viewUser.
    }

    

    
    
    public void start(){
        admiMenu.setVisible(true);
    }
}

