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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelos.modeloProcedimiento;
/**
 *
 * @author Dizan
 */
public class proyecto1ControladorGUI implements Runnable{
    
    proyecto1GUI proyecto1GUI;
    AlgoritmoExponenciales AlgoritmoExponenciales;
    MenuGUI menuGui;
    Thread ingresarTabla;

    public proyecto1ControladorGUI(proyecto1GUI proyecto1GUI, MenuGUI menuGui) {
        this.proyecto1GUI =  proyecto1GUI;
        this.menuGui = menuGui;
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        eventosBotones();
        eventosTeclado();   
        
        //Modificar la apariencia del JOptionPane
        UIManager.put("OptionPane.background", new Color(0, 32, 96));
        UIManager.put("OptionPane.foreground", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(46,117,182));
        //UIManager.put("OptionPane.messageFont", new Font("Tahoma", 0, 14));
        
        proyecto1GUI.addWindowListener(new java.awt.event.WindowAdapter() {
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
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"0");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void numero1(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"1");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
        
    }
    public void numero2(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"2");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void numero3(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"3");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
   
    public void numero4(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"4");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
   
    public void numero5(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"5");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void numero6(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"6");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
   
    public void numero7(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"7");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void numero8(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"8");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    
    public void numero9(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"9"); 
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    
    public void punto(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+".");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void mas(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"+");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    public void menos(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"-");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
  
    public void exponente(ActionEvent e){
        String labelCadena = proyecto1GUI.fieldEntradaSimbolos.getText();
        proyecto1GUI.fieldEntradaSimbolos.setText(labelCadena+"e");
        proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
        proyecto1GUI.fieldEntradaSimbolos.requestFocus();
    }
    
    public void botonBorrar(ActionEvent e){
         proyecto1GUI.fieldEntradaSimbolos.setText("");
         proyecto1GUI.modeloTablaPruebas.setRowCount(0);//Limpiar la tabla 
         proyecto1GUI.fieldEntradaSimbolos.setCaretColor(Color.white);
         proyecto1GUI.fieldEntradaSimbolos.requestFocus();
         
    }
    
    public void botonIniciar(ActionEvent e){
        proyecto1GUI.modeloTablaPruebas.setRowCount(0);//Limpiar la tabla 
        if (ingresarTabla == null) {
             ingresarTabla = new Thread(this);
             ingresarTabla.start();
        }   
    }
    
     public void botonIniciar(){
        proyecto1GUI.modeloTablaPruebas.setRowCount(0);//Limpiar la tabla 
        if (ingresarTabla == null) {
             ingresarTabla = new Thread(this);
             ingresarTabla.start();
        }   
    }
   
    public void editarIngresarFilas(modeloProcedimiento modeloProcedimiento){
        //proyecto1GUI.tablaPruebas.setValueAt(valor, fila, columna);
        proyecto1GUI.modeloTablaPruebas.addRow(new Object[]{"",
                                                            modeloProcedimiento.getEstado(),
                                                            modeloProcedimiento.getS(),
                                                            modeloProcedimiento.getEntrada()});
    }
    
    /*
    Metodo run, ejecuta los hilos o subprocesos del programa
    */

    @Override
    public void run() {
        //Cambia el color del botonDecidir 
        proyecto1GUI.botonDecidir.setBackground(new Color(0,0,0));
        proyecto1GUI.botonDecidir.setText("");
        
        //Obtiene el estado del hilo.
        Thread thisThread = Thread.currentThread();
       
        AlgoritmoExponenciales = new AlgoritmoExponenciales();
        ArrayList <modeloProcedimiento> listaProcedimiento = AlgoritmoExponenciales.getListaProcedimiento();
        String cadena = proyecto1GUI.fieldEntradaSimbolos.getText();       
        AlgoritmoExponenciales.ingresarCadena(cadena);
        boolean decicion = AlgoritmoExponenciales.Proceso();
        System.out.println(decicion);
     
        while(ingresarTabla == thisThread){
            
                for (int i = 0; i < listaProcedimiento.size(); i++) {
                    editarIngresarFilas(listaProcedimiento.get(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        //No se me ocurre hacer algo :D
                    }
            }  
            ingresarTabla = null;
        } 
        
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
    
    /*
    Este metodo procesa los eventos de teclado, solo se ha definido el método 
    keyTyped el cual procesa un evento al precionar la tecla enter.
    */
    
    private void eventosTeclado() {
        proyecto1GUI.fieldEntradaSimbolos.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                   botonIniciar();
                } 
            }
            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        });  
    }    
}
