/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Eliezer
 */
public class AlgoritmoMaDu 
{
String Entrada="",Estado="",S="";
Tabla_Maquina_Dulces objeto = new     Tabla_Maquina_Dulces();

public String Leer_Simbolo()
{
  return JOptionPane.showInputDialog(null,"Inserte Una Moneda: ");
}

public void Proceso()
{
    Estado="0";
    
   do
   {
        S=Leer_Simbolo();
   switch(S)
   {
       case "5":
           Entrada="5";
           break;
       case "10":
           Entrada="10";
           break;
       case "20":
           Entrada="20";
           break;
       case "Fdc":
           Entrada="Fdc";
           break;
       default:
           Error();
   }
   System.out.printf("%5s %5s %5s\n", Estado,S,Entrada);  
       Estado=objeto.F(Estado, Entrada);
       
   }while(Estado!="E" && Estado!="A");
    
   if(Estado=="A")
               {
       System.out.println("Aceptado");
       
   }
   else
           {
               System.out.println("No Valido");
           }
}

public void Error()
{
    JOptionPane.showMessageDialog(null,"Error", "Valor No Valido", JOptionPane.ERROR_MESSAGE);
}
    
    public static void main(String[] args) 
    {
        AlgoritmoMaDu o= new AlgoritmoMaDu();
        System.out.println("Estado Simbolo Entrada ");
        o.Proceso();
    }
}
