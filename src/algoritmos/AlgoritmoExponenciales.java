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
public class AlgoritmoExponenciales 
{
char Entrada=' ',Estado=' ',S=' ';

Tabla_Numeros_Exponenciales objeto= new Tabla_Numeros_Exponenciales();

char arreglo[];
int i=0;

public void ingresarCadena(String Cadena)
{
    arreglo=Cadena.toCharArray();
    
}


public char Leer_Simbolo(int i)
{
    return arreglo[i];
}

public boolean Proceso()
{
    i=0;
    Estado='0';
    
   do
   {
       if(i<arreglo.length)
       {
           
       
            S=Leer_Simbolo(i);
            S=NumeroSimbolo(S);

            switch(S)
            {
                case 'd':
                    Entrada='d';
                    break;
                case '+':
                    Entrada='+';
                    break;
                case '-':
                    Entrada='-';
                    break;
                case '.':
                    Entrada='.';
                    break;
                case 'e':
                    Entrada='e';
                    break;

                default:
                    Error(S);
                    Entrada=S;
                    i=arreglo.length;
            }
   
            System.out.printf("%5s %5s %5s\n", Estado,S,Entrada);  
            Estado=objeto.F(Estado, Entrada);
            i++;
       }else
       {
           
           Entrada='F';
           System.out.printf("%5s %5s %5s\n", Estado,S,Entrada);  
           Estado=objeto.F(Estado, Entrada);
           i++;
       }
   }while(Estado!='E' && Estado!='A' && i<=arreglo.length);
    
   if(Estado=='A')
       {
           return true;
       }
   else
       {
           return false;
       }
}

public void Error(char Simbolo)
{
    JOptionPane.showMessageDialog(null,"( "+Simbolo+ " )Simbolo No Valido", "Error",JOptionPane.ERROR_MESSAGE);
}

public char NumeroSimbolo(char Simbolo)
{
    switch(Simbolo)
    {
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

    public static void main(String[] args) 
    {
      AlgoritmoExponenciales objeto= new AlgoritmoExponenciales();
      objeto.ingresarCadena("13j.4e-1");
      System.out.println(objeto.Proceso());
    }
}
