/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinary;

import MVC.Controller.ctrlLogin;
import MVC.Model.Login;
import MVC.Model.LoginDAO;
import MVC.View.LoginView;
import MVC.View.MenuAdmi;
import MVC.View.crudOwner;
import MVC.View.crudSuppliers;
import MVC.View.crudUsers;


public class Veterinary {

    
    
    public static void main(String[] args) {
        
        LoginDAO dao = new LoginDAO();
        Login login = new Login();
        LoginView logView = new LoginView();
        ctrlLogin control = new ctrlLogin(login,dao,logView);
        control.start();
        //new MenuAdmi().setVisible(true);
        new crudOwner().setVisible(true);
        new crudSuppliers().setVisible(true);
        new crudUsers().setVisible(true);
        
    }
    
    
}
