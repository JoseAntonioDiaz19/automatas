/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import GUI.MenuGUI;
import GUI.proyecto1GUI;
import java.awt.event.ActionEvent;
/**
 *
 * @author Dizan
 */
public class MenuGUIControlador {
    
    MenuGUI menuGui;
    
    public MenuGUIControlador(MenuGUI menuGui) {
        this.menuGui = menuGui;
        botones();
    }
    
    private void botones(){
        menuGui.botonProyecto1.addActionListener(this::botonProyecto1);
    }
    
    private void botonProyecto1(ActionEvent e){
        proyecto1GUI proyecto1GUI = new proyecto1GUI();  
        proyecto1ControladorGUI controladorProyecto1 = new proyecto1ControladorGUI(proyecto1GUI, menuGui); 
        menuGui.dispose();
    }  
}
