/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import javax.swing.JOptionPane;
/**
 *
 * @author Alex Eliezer
 */
public class AlgoritmoExponenciales {
    
    private char Entrada;
    private char Estado;
    private char S;
    private Tabla_Numeros_Exponenciales tablaNumerosExponenciales;
    private char[] arregloCadena_a_Char;
    private int i = 0;
    
    /**
     * @return El arregloCadena_a_Char
     */
    public char[] getArregloCadena_a_Char() {
        return arregloCadena_a_Char;
    }

    /**
     * @param arregloCadena_a_Char Establecer arregloCadena_a_Char
     */
    public void setArregloCadena_a_Char(char[] arregloCadena_a_Char) {
        this.arregloCadena_a_Char = arregloCadena_a_Char;
    }

    public void ingresarCadena(String Cadena){
            setArregloCadena_a_Char(Cadena.toCharArray());
    }

    private char Leer_Simbolo(int i){
        return getArregloCadena_a_Char()[i];
    }

    public boolean Proceso(){
        
        tablaNumerosExponenciales = new Tabla_Numeros_Exponenciales();
        i = 0;
        Estado = '0';

        do{
            if(i<getArregloCadena_a_Char().length){

                S = Leer_Simbolo(i);
                S = NumeroSimbolo(S);

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
                        i=getArregloCadena_a_Char().length;
                }

                System.out.printf("%5s %5s %5s\n", Estado, S, Entrada);  
                Estado=tablaNumerosExponenciales.F(Estado, Entrada);
                i++;
           }else{

               Entrada='F';
               System.out.printf("%5s %5s %5s\n", Estado, S, Entrada);  
               Estado=tablaNumerosExponenciales.F(Estado, Entrada);
               i++;
           }
       }while(Estado!= 'E' && Estado!= 'A' && i <= getArregloCadena_a_Char().length);

        if(Estado == 'A'){
               return true;
        }
        else{
               return false;
        }
    }

    public void Error(char Simbolo){

        JOptionPane.showMessageDialog(null,"( "+Simbolo+ " )Simbolo No Valido", "Error",JOptionPane.ERROR_MESSAGE);
    }

    public char NumeroSimbolo(char Simbolo)
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
