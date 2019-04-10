/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import GUI.MenuGUI;
import GUI.productosGUI;
import GUI.proyecto2GUI;
import algoritmos.algoritmoMaquinaDulces;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelos.modeloVenta;

/**
 *
 * @author Dizan
 */
public class proyecto2ControladorGUI implements Runnable {

    proyecto2GUI proyecto2GUI;
    MenuGUI menuGui;
    modeloVenta modeloVenta = new modeloVenta();

    algoritmoMaquinaDulces algoritmoMaquina = new algoritmoMaquinaDulces();
    boolean valido;

    Thread retirarSaldo;

    public proyecto2ControladorGUI(proyecto2GUI proyecto2GUI) {
        this.proyecto2GUI = proyecto2GUI;
        IniciarEventosBotones();

        //Modificar la apariencia del JOptionPane
        UIManager.put("OptionPane.background", new Color(0, 32, 96));
        UIManager.put("OptionPane.foreground", new Color(255, 255, 255));
        UIManager.put("Panel.background", new Color(46, 117, 182));

        proyecto2GUI.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }

    private void close() {
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?",
                "¿?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        menuGui = new MenuGUI();
        MenuGUIControlador menuGUIControlador = new MenuGUIControlador(menuGui);
    }

    private void IniciarEventosBotones() {
        proyecto2GUI.botonElegirProducto.addActionListener(this::botonElegirProducto);
        proyecto2GUI.botonUnPeso.addActionListener(this::botonUnPeso);
        proyecto2GUI.botonDosPesos.addActionListener(this::botonDosPesos);
        proyecto2GUI.botonCincoPesos.addActionListener(this::botonCincoPesos);
        proyecto2GUI.botonDiezPesos.addActionListener(this::botonDiezPesos);
        proyecto2GUI.botonVeintePesos.addActionListener(this::botonVeintePesos);
        proyecto2GUI.botonValidar.addActionListener(this::botonValidar);
        proyecto2GUI.botonRetirarSaldo.addActionListener(this::botonRetirarSaldo);
    }

    private void botonElegirProducto(ActionEvent e) {
        if (algoritmoMaquina.isValidar()) {
            productosGUI productosGUI = new productosGUI(proyecto2GUI, true);
            productosGUIControlador productosGUIControlador = new productosGUIControlador(productosGUI,
                    modeloVenta,
                    proyecto2GUI,
                    algoritmoMaquina);
            productosGUI.setVisible(true);
        }
    }

    private void botonUnPeso(ActionEvent e) {
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();

        if (saldo == 0) {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(saldo, String.valueOf(1)));
        } else {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(modeloVenta.getEstado(), String.valueOf(1)));
        }
        proyecto2GUI.botonDesicion.setText("Estado: " + modeloVenta.getEstado());

        saldo = saldo + 1;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText("" + saldo);

        if (algoritmoMaquina.isValidar()) {
            proyecto2GUI.botonValidar.setText("Valido");
        } else {
            proyecto2GUI.botonValidar.setText("Invalido");
        }
        System.out.println("Validez = " + algoritmoMaquina.isValidar());
    }

    private void botonDosPesos(ActionEvent e) {
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();

        if (saldo == 0) {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(saldo, String.valueOf(2)));
        } else {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(modeloVenta.getEstado(), String.valueOf(2)));
        }
        proyecto2GUI.botonDesicion.setText("Estado: " + modeloVenta.getEstado());

        saldo = saldo + 2;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText("" + saldo);

        if (algoritmoMaquina.isValidar()) {
            proyecto2GUI.botonValidar.setText("Valido");
        } else {
            proyecto2GUI.botonValidar.setText("Invalido");
        }
        System.out.println("Validez = " + algoritmoMaquina.isValidar());
    }

    private void botonCincoPesos(ActionEvent e) {
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();

        if (saldo == 0) {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(saldo, String.valueOf(5)));
        } else {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(modeloVenta.getEstado(), String.valueOf(5)));
        }
        proyecto2GUI.botonDesicion.setText("Estado: " + modeloVenta.getEstado());

        saldo = saldo + 5;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText("" + saldo);

        if (algoritmoMaquina.isValidar()) {
            proyecto2GUI.botonValidar.setText("Valido");
        } else {
            proyecto2GUI.botonValidar.setText("Invalido");
        }
    }

    private void botonDiezPesos(ActionEvent e) {
        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();

        if (saldo == 0) {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(saldo, String.valueOf(10)));
        } else {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(modeloVenta.getEstado(), String.valueOf(10)));
        }
        proyecto2GUI.botonDesicion.setText("Estado: " + modeloVenta.getEstado());

        saldo = saldo + 10;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText("" + saldo);

        if (algoritmoMaquina.isValidar()) {
            proyecto2GUI.botonValidar.setText("Valido");
        } else {
            proyecto2GUI.botonValidar.setText("Invalido");
        }
    }

    private void botonVeintePesos(ActionEvent e) {

        proyecto2GUI.fieldCambio.setText("00");
        int saldo = modeloVenta.getSaldo();

        if (saldo == 0) {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(saldo, String.valueOf(20)));
        } else {
            modeloVenta.setEstado(algoritmoMaquina.Proceso(modeloVenta.getEstado(), String.valueOf(20)));
        }
        proyecto2GUI.botonDesicion.setText("Estado: " + modeloVenta.getEstado());

        saldo = saldo + 20;
        modeloVenta.setSaldo(saldo);
        proyecto2GUI.fieldSaldo.setText("" + saldo);

        if (algoritmoMaquina.isValidar()) {
            proyecto2GUI.botonValidar.setText("Valido");
        } else {
            proyecto2GUI.botonValidar.setText("Invalido");
        }
        System.out.println("Validez = " + algoritmoMaquina.isValidar());
    }

    private void botonValidar(ActionEvent e) {

    }

    private void botonRetirarSaldo(ActionEvent e) {
        if (retirarSaldo == null) {
            retirarSaldo = new Thread(this);
            retirarSaldo.start();
        }
    }

    @Override
    public void run() {
        //Obtiene el estado del hilo.
        Thread thisThread = Thread.currentThread();
        int estado = 25;

        while (retirarSaldo == thisThread) {
            int saldo = modeloVenta.getSaldo();
            while (saldo > 0) {
                saldo = saldo - 1;
                if (saldo <= 25) {
                    estado = saldo;
                }

                if (saldo > 9) {
                    proyecto2GUI.fieldSaldo.setText(("" + saldo));
                    modeloVenta.setSaldo(saldo);
                    System.out.println(saldo);
                }
                if (saldo < 10) {
                    proyecto2GUI.fieldSaldo.setText(("0" + saldo));
                    modeloVenta.setSaldo(saldo);
                    System.out.println(saldo);
                }
                modeloVenta.setEstado(saldo);
                proyecto2GUI.botonDesicion.setText("Estado: " + estado);

                try {
                    Thread.sleep(80);
                } catch (InterruptedException ex) {
                }
            }
            retirarSaldo = null;
        }
    }
}
