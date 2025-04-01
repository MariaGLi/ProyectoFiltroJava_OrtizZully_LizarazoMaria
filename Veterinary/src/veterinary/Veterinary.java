package veterinary;

import MVC.Controller.ctrlLogin;
import MVC.Model.Login;
import MVC.Model.LoginDAO;
import MVC.View.LoginView;


public class Veterinary {
    
    public static void main(String[] args) {
        
        LoginDAO dao = new LoginDAO();
        Login login = new Login();
        LoginView logView = new LoginView();
        ctrlLogin control = new ctrlLogin(login,dao,logView);
        control.start();     
        
    }
}
