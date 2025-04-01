/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.View.MenuVet;


public class ctrlMenuVet {
    
    private MenuVet vetMenu;

    public ctrlMenuVet(MenuVet vetMenu) {
        this.vetMenu = vetMenu;
    }
    
    public void start(){
        vetMenu.setVisible(true);
        vetMenu.setLocationRelativeTo(null);
    }
    
}
