/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import GUI.productosGUI;
import GUI.proyecto2GUI;
import java.awt.event.ActionEvent;
import modelos.modeloVenta;

/**
 *
 * @author Dizan
 */
public class productosGUIControlador {
    
    productosGUI productosGUI;
    proyecto2ControladorGUI proyecto2ControladorGUI;
    modeloVenta modeloVenta;
    proyecto2GUI proyecto2GUI;

    public productosGUIControlador(productosGUI productosGUI,  modeloVenta modeloVenta, proyecto2GUI proyecto2GUI) {
        this.productosGUI = productosGUI;
        this.modeloVenta = modeloVenta;
        this.proyecto2GUI = proyecto2GUI;
        IniciarEventosBotones();
    }   
    
    private void IniciarEventosBotones(){
        productosGUI.botonProducto1.addActionListener(this::botonProducto1);
        productosGUI.botonProducto2.addActionListener(this::botonProducto2);
        productosGUI.botonProducto3.addActionListener(this::botonProducto3);
        productosGUI.botonProducto4.addActionListener(this::botonProducto4);
        productosGUI.botonProducto5.addActionListener(this::botonProducto5);
        productosGUI.botonProducto6.addActionListener(this::botonProducto6);
        productosGUI.botonProducto7.addActionListener(this::botonProducto7);
        productosGUI.botonProducto8.addActionListener(this::botonProducto8);
        productosGUI.botonProducto9.addActionListener(this::botonProducto9);
        productosGUI.botonCancelar.addActionListener(this::botonCancelar);
    }
    
    private void botonProducto1(ActionEvent e){
        System.out.println("boton 1");
        proyecto2GUI.fieldCambio.setText("00");
        descontarCompra(); 
        
    }
    private void botonProducto2(ActionEvent e){
        System.out.println("boton 2");        
        descontarCompra();
    }
    private void botonProducto3(ActionEvent e){
        System.out.println("boton 3");
        descontarCompra();   
    }
    private void botonProducto4(ActionEvent e){
        System.out.println("boton 4");
        descontarCompra();
    }
    private void botonProducto5(ActionEvent e){
        System.out.println("boton 5");
        descontarCompra();
    }
    private void botonProducto6(ActionEvent e){
        System.out.println("boton 6");
        descontarCompra();
    }
    private void botonProducto7(ActionEvent e){
        System.out.println("boton 7");
        descontarCompra();
    }
    private void botonProducto8(ActionEvent e){
         System.out.println("boton 8");
        descontarCompra();
    }
    private void botonProducto9(ActionEvent e){
         System.out.println("boton 9");
        descontarCompra();
    }
    private void descontarCompra(){
        int saldo = modeloVenta.getSaldo();
        saldo = saldo - 25;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText(""+saldo);
        productosGUI.dispose();
        if (saldo < 25) {
            proyecto2GUI.fieldSaldo.setText("00");
            modeloVenta.setSaldo(0);
            proyecto2GUI.fieldCambio.setText(""+saldo);
            modeloVenta.setCambio(saldo);
        }
    }
    
    private void botonCancelar(ActionEvent e){
         productosGUI.dispose();
    }
}
