package MVC.Controller;

import MVC.Model.Login;
import MVC.Model.LoginDAO;
import MVC.Model.User;
import MVC.View.LoginView;
import MVC.View.MenuAdmi;
import MVC.View.MenuOwner;
import MVC.View.MenuVet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrlLogin implements ActionListener {

    private Login login;
    private LoginDAO dao;
    private LoginView logView;

    public ctrlLogin(Login login, LoginDAO dao, LoginView logView) {
        this.login = login;
        this.dao = dao;
        this.logView = logView;
        this.logView.enter.addActionListener(this);
    }

    // Method to show the login window
    public void start() {
        logView.setTitle("LOGIN = HAPPY FEET");
        logView.setLocationRelativeTo(null);
        logView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logView.enter) {
            // get the user and password 
            login.setUsername(logView.imputUser.getText());
            login.setPass(new String(logView.InputPass.getPassword()));

            /*if (dao.getUsers(login)) {
                JOptionPane.showMessageDialog(null, "Correct login!! Role: " + login.getRole());

                if (login.getRole().equals("administrator")) {
                    MenuAdmi admiMenu = new MenuAdmi();
                    ctrlMenuAdmi admiCtrl = new ctrlMenuAdmi(admiMenu);
                    admiCtrl.start();
                } else if (login.getRole().equals("owner")) {
                    MenuOwner ownerMenu = new MenuOwner();
                    ctrlMenuOwner ownerCtrl = new ctrlMenuOwner(ownerMenu);
                    ownerCtrl.start();
                } else if (login.getRole().equals("veterinarian")) {
                    MenuVet vetMenu = new MenuVet();
                    ctrlMenuVet vetCtrl = new ctrlMenuVet(vetMenu);
                    vetCtrl.start();
                }
                logView.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong user or password");
            }*/
        }
    }

}
