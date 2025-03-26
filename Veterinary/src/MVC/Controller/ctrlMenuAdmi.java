/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.Model.LoginDAO;
import MVC.View.MenuAdmi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author const
 */
public class ctrlMenuAdmi {
    private MenuAdmi admiMenu;

    public ctrlMenuAdmi(MenuAdmi admiMenu) {
        this.admiMenu = admiMenu;
    }
    
    public void start(){
        admiMenu.setVisible(true);
    }
}

