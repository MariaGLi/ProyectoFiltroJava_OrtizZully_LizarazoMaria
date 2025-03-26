/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controller;

import MVC.View.MenuOwner;


public class ctrlMenuOwner {
    private MenuOwner ownerMenu;

    public ctrlMenuOwner(MenuOwner ownerMenu) {
        this.ownerMenu = ownerMenu;
    }
    
    public void start(){
        ownerMenu.setVisible(true);
    }
}
