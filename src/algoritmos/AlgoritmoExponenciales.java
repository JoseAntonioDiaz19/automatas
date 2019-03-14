/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.modeloProcedimiento;
/**
 *
 * @author Alex Eliezer
 */
public class AlgoritmoExponenciales {
    
    private modeloProcedimiento modeloProcedimiento;
    private ArrayList<modeloProcedimiento> listaProcedimiento = new ArrayList<>();
    private char Entrada;
    private char Estado;
    private char S;
    private Tabla_Numeros_Exponenciales tablaNumerosExponenciales;
    private char[] arregloCadena_a_Char;
    private int i;

     /**
     * @return the listaProcedimiento
     */
    public ArrayList<modeloProcedimiento> getListaProcedimiento() {
        return listaProcedimiento;
    }
    
    /**
     * @return El arregloCadena_a_Char
     */
    public char[] getArregloCadenaChar() {
        return arregloCadena_a_Char;
    }

    /**
     * @param arregloCadena_a_Char Establecer arregloCadena_a_Char
     */
    public void setArregloCadenaChar(char[] arregloCadena_a_Char) {
        this.arregloCadena_a_Char = arregloCadena_a_Char;
    }

    public void ingresarCadena(String Cadena){
            setArregloCadenaChar(Cadena.toCharArray());
    }

    private char Leer_Simbolo(int i){
        return getArregloCadenaChar()[i];
    }
    /**
     * El metodo proceso realiza todo el procedimiento para saber si 
     * la cadena proporcionada por el usuario es válida respecto
     * al alfabeto para numeros reales con exponente.
     * 
     * La variable estado mantiene el estado en el que se encuentra
     * el analisis de la cadena (q0, q1, q2...) en todo momento.
     * 
     * La variable i es el indice del arreglo Tabla_Numeros_Exponenciales
     * en el método sirve para acceder a cada uno de los simbolos de la
     * cadena proporcionada por el usuario.
     * 
     * El arreglo Tabla_Numeros_Exponenciales contiene la tabla sintáctica
     * del automata que valida numeros enteros reales con notacion exponencial
     * para numeros decimales.
     * 
     * @return Un boolean que dice si la cadena es valida o erronea 
     * true and false respectivamente.
     */
    public boolean Proceso(){
        Estado = '0';
        i = 0;
        tablaNumerosExponenciales = new Tabla_Numeros_Exponenciales();
        do{
            if(i < getArregloCadenaChar().length){
                
                //Se asigna a S el simbolo actual para ser analizado 
                S = Leer_Simbolo(i);
                
                //Se comprueba si el simbolo a analizar es un digito
                S = numeroSimbolo(S);

                switch(S){

                    case 'd':
                        Entrada = 'd';
                        break;
                    case '+':
                        Entrada = '+';
                        break;
                    case '-':
                        Entrada = '-';
                        break;
                    case '.':
                        Entrada = '.';
                        break;
                    case 'e':
                        Entrada = 'e';
                        break;

                    default:
                        Error(S);
                        Entrada = S;
                        i = getArregloCadenaChar().length;
                }

                System.out.printf("%5s %5s %5s\n", Estado, S, Entrada);  
                
                if (Estado == '0' ) {
                    listaProcedimiento.add(new modeloProcedimiento(Estado, S, Entrada));
                }
                
                Estado = tablaNumerosExponenciales.obtenerEstado_O_Validacion(Estado, Entrada); 
                listaProcedimiento.add(new modeloProcedimiento(Estado, S, Entrada));
                i++;
                
           }else{
               
               Entrada = 'F';
               System.out.printf("%5s %5s %5s\n", Estado, S, Entrada);  
               Estado = tablaNumerosExponenciales.obtenerEstado_O_Validacion(Estado, Entrada);
               listaProcedimiento.add(new modeloProcedimiento(Estado, S, Entrada));
               
               i++;
           }
            
       }while(Estado!= 'E' && Estado!= 'A' && i <= getArregloCadenaChar().length);

        if(Estado == 'A'){
              return true;
        }
  
        else{
               return false;
        }
    }
    /**
     * El metodo Error envia un mensaje si un simbolo dentro de la cadena 
     * proporcionada por el usuario no se encuentra dentro del alfabeto.
     * @param Simbolo es un caracter de un determinado alfabeto.
     */

    public void Error(char Simbolo){
        JOptionPane.showMessageDialog(null,
                "( "+ Simbolo + " )Simbolo No Valido", 
                "Error",JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * El metodo numeroSimbolo comprueba si el caracter que se analiza 
     * si el simbolo leido de la cadena proporcionada por el usuario corresponde
     * a los numeros naturales (1, 2, 3, 4, 5, 6, 7, 8, 9, 0).
     * @param Simbolo es un caracter de un determinado alfabeto.
     * @return regresa un caracter char "d" si el simbolo analizado es de tipo
     * numérico (numeros naturales) en el caso de que no sea así se retorna 
     * el mismo simbolo recibido.
     */

    public char numeroSimbolo(char Simbolo)
    {
        switch(Simbolo){
            
            case '0':
                return 'd';
            case '1':
                return 'd';
            case '2':
                 return 'd';
            case '3':
                return 'd';
            case '4':
                return 'd';
            case '5':
                return 'd';
            case '6':
                return 'd';
            case '7':
                return 'd';
            case '8':
                return 'd';
            case '9':
                return 'd';
            default:
                return Simbolo; 
        }
    }

   
}
