/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class personalizarFuentes {

    private Font font = null;
    Font fuente = null; 
    InputStream myStream = null;

    public personalizarFuentes() {
        try {
            //Se carga la fuente
            myStream = new BufferedInputStream(new FileInputStream("src/fuentes/DS-DIGIB.TTF"));
            font = Font.createFont(Font.TRUETYPE_FONT,  myStream);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(" No se cargo la fuente");
            font = new Font("Tahoma", Font.PLAIN, 18);            
        }
  }

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
    * tamanio = float
    */
    public Font miFuente( int estilo, float tamanio)
    {
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }

}
