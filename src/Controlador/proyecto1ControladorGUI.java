/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import GUI.MenuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import GUI.proyecto1GUI;
import algoritmos.AlgoritmoExponenciales;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Dizan
 */
public class proyecto1ControladorGUI {
    
    proyecto1GUI proyecto1GUI;
    AlgoritmoExponenciales AlgoritmoExponenciales;
    MenuGUI menuGui;

    public proyecto1ControladorGUI(proyecto1GUI proyecto1GUI, MenuGUI menuGui) {
        this.proyecto1GUI =  proyecto1GUI;
        this.menuGui = menuGui;
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        eventosBotones();
        eventosTeclado();   
        
        UIManager.put("OptionPane.background", new Color(0, 32, 96));
        UIManager.put("OptionPane.font.foreground", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(0, 32, 96));
       // UIManager.put("OptionPane.messageFont", new Font("Arial", 0, 16));
        
        proyecto1GUI.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }
    
    private void close(){       
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
       
        menuGui = new MenuGUI();
        MenuGUIControlador menuGUIControlador = new MenuGUIControlador(menuGui); 
        
    } 
    
    private void eventosBotones(){
        
        proyecto1GUI.botonNumero0.addActionListener(this::numero0);
        proyecto1GUI.botonNumero1.addActionListener(this::numero1);
        proyecto1GUI.botonNumero2.addActionListener(this::numero2);
        proyecto1GUI.botonNumero3.addActionListener(this::numero3);
        proyecto1GUI.botonNumero4.addActionListener(this::numero4);
        proyecto1GUI.botonNumero5.addActionListener(this::numero5);
        proyecto1GUI.botonNumero6.addActionListener(this::numero6);
        proyecto1GUI.botonNumero7.addActionListener(this::numero7);
        proyecto1GUI.botonNumero8.addActionListener(this::numero8);
        proyecto1GUI.botonNumero9.addActionListener(this::numero9);
        proyecto1GUI.botonMas.addActionListener(this::mas);
        proyecto1GUI.botonMenos.addActionListener(this::menos);
        proyecto1GUI.botonPunto.addActionListener(this::punto);
        proyecto1GUI.botonExponencial.addActionListener(this::exponente);
        proyecto1GUI.C.addActionListener(this::botonBorrar);
        proyecto1GUI.botonIniciar.addActionListener(this::botonIniciar);
        
    }
    
    public void numero0(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"0");
    }
    public void numero0(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"0");
    }
    public void numero1(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"1");
        
    }
    public void numero1(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"1");
        
    }
    public void numero2(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"2");
    }
    public void numero2(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"2");
    }
    public void numero3(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"3");
    }
    public void numero3(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"3");
    }
    public void numero4(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"4");
    }
    public void numero4(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"4");
    }
    public void numero5(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"5");
    }
    public void numero5(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"5");
    }
    public void numero6(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"6");
    }
     public void numero6(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"6");
    }
    public void numero7(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"7");
    }
    public void numero7(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"7");
    }
    public void numero8(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"8");
    }
    public void numero8(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"8");
    }
    public void numero9(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"9"); 
    }
     public void numero9(){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"9"); 
    }
    public void punto(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+".");
    }
    public void mas(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"+");
    }
    public void menos(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"-");
    }
  
    public void exponente(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        if ("".equals(labelCadena)) {
            labelCadena = "";
        }
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"e");
    }
    
    public void botonBorrar(ActionEvent e){
         proyecto1GUI.fieldEntradaSimbolos.setText("");
         proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
         proyecto1GUI.fieldEntradaSimbolos.requestFocus();
         
    }
    
    public void botonIniciar(ActionEvent e){
       
       String cadena = proyecto1GUI.fieldEntradaSimbolos.getText();       
       AlgoritmoExponenciales = new AlgoritmoExponenciales();
       
       AlgoritmoExponenciales.ingresarCadena(cadena);
       boolean decicion = AlgoritmoExponenciales.Proceso();
       System.out.println(decicion);
        
        if (decicion) {
            proyecto1GUI.botonDecidir.setBackground(new Color(0,102,51));
            proyecto1GUI.botonDecidir.setText("Aceptado!!!!!!");
        }
        else {
            
            proyecto1GUI.botonDecidir.setBackground(new Color(153,0,0));
            proyecto1GUI.botonDecidir.setText("ERROR!!!!!!"); 
        }
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.WHITE);
   
    }
   
    private void eventosTeclado() {
        proyecto1GUI.fieldEntradaSimbolos.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                   
                }
                if (ke.getKeyCode() == KeyEvent.VK_0) {
                    
                }
                if (ke.getKeyCode() == KeyEvent.VK_1) {
                    
                }
                if (ke.getKeyCode() == KeyEvent.VK_2) {
                    
                }
                if (ke.getKeyCode() == KeyEvent.VK_3) {
                   
                }
                if (ke.getKeyCode() == KeyEvent.VK_4) {
                   
                }
                if (ke.getKeyCode() == KeyEvent.VK_5) {
                   
                }
                if (ke.getKeyCode() == KeyEvent.VK_6) {
                   
                }
                if (ke.getKeyCode() == KeyEvent.VK_7) {
                  
                }
                if (ke.getKeyCode() == KeyEvent.VK_8) {
                 
                }
                if (ke.getKeyCode() == KeyEvent.VK_9) {
                   
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        });  
    }
    
    public void editarIngresarFilas(String valor1, String valor2, String valor3){
        //proyecto1GUI.tablaPruebas.setValueAt(valor, fila, columna);
        proyecto1GUI.modeloTablaPruebas.addRow(new Object[]{"",valor1,valor2,valor3});
    }
    
    

    
}
