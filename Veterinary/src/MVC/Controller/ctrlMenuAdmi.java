
package MVC.Controller;
 

 import MVC.View.MenuAdmi;

 public class ctrlMenuAdmi {
    
    private MenuAdmi admiMenu;

    public ctrlMenuAdmi(MenuAdmi admiMenu) {
        this.admiMenu = admiMenu;
    }

    public void start(){
        admiMenu.setVisible(true);
        admiMenu.setLocationRelativeTo(null);
    }
}
    


