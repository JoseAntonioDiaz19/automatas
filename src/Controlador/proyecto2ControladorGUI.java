/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import GUI.MenuGUI;
import GUI.productosGUI;
import GUI.proyecto2GUI;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dizan
 */
public class proyecto2ControladorGUI {
    
    proyecto2GUI proyecto2GUI;
    MenuGUI menuGui;

    public proyecto2ControladorGUI(proyecto2GUI proyecto2GUI) {
        this.proyecto2GUI = proyecto2GUI;
        IniciarEventosBotones();
      
         proyecto2GUI.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });  
    }  
    
    private void close(){       
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?",
                "¿?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
       
        menuGui = new MenuGUI();
        MenuGUIControlador menuGUIControlador = new MenuGUIControlador(menuGui);   
    } 
    
    private void IniciarEventosBotones(){
        proyecto2GUI.botonElegirProducto.addActionListener(this::botonElegirProducto);
    }
    
    private void botonElegirProducto(ActionEvent e){
            productosGUI productosGUI = new productosGUI(proyecto2GUI, true );
            productosGUI.setVisible(true);
    }
}
