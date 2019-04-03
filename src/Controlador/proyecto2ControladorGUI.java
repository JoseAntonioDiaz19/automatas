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
import modelos.modeloVenta;
/**
 *
 * @author Dizan
 */
public class proyecto2ControladorGUI {
    
    proyecto2GUI proyecto2GUI;
    MenuGUI menuGui;
    modeloVenta modeloVenta = new modeloVenta();

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
        proyecto2GUI.botonUnPeso.addActionListener(this::botonUnPeso);
        proyecto2GUI.botonDosPesos.addActionListener(this::botonDosPesos);
        proyecto2GUI.botonCincoPesos.addActionListener(this::botonCincoPesos);
        proyecto2GUI.botonDiezPesos.addActionListener(this::botonDiezPesos);
        proyecto2GUI.botonVeintePesos.addActionListener(this::botonVeintePesos);
        proyecto2GUI.botonValidar.addActionListener(this::botonValidar);
        proyecto2GUI.botonRetirarSaldo.addActionListener(this::botonRetirarSaldo);
    }
    
    private void botonElegirProducto(ActionEvent e){
        if (modeloVenta.getSaldo() >= 25) {
            productosGUI productosGUI = new productosGUI(proyecto2GUI, true );
            productosGUIControlador productosGUIControlador = new productosGUIControlador (productosGUI, modeloVenta, proyecto2GUI); 
            productosGUI.setVisible(true);
        }
    }
    
    private void botonUnPeso(ActionEvent e){
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();
        saldo = saldo + 1;    
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
    }
    private void botonDosPesos(ActionEvent e){
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();
        saldo = saldo + 2; 
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
    }
    private void botonCincoPesos(ActionEvent e){
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();
        saldo = saldo + 5; 
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
    }
    private void botonDiezPesos(ActionEvent e){
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();
        saldo = saldo + 10; 
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
    }
    private void botonVeintePesos(ActionEvent e){
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();
        saldo = saldo + 20; 
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
    }
    private void botonValidar(ActionEvent e){
        
    }
    
    private void botonRetirarSaldo(ActionEvent e){
        
    }
}
