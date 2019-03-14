/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
/**
 *
 * @author Alex Eliezer
 */
public class Tabla_Numeros_Exponenciales 
{
   private final char arreglo[][]=
   {    
        {' ' ,'d','+','-','.','e','F'  },
        {'0' ,'2','1','1','E','E','E'  },
        {'1' ,'2','E','E','E','E','E'  },
        {'2' ,'2','E','E','3','E','A'  },
        {'3' ,'4','E','E','E','E','E'  },
        {'4' ,'4','E','E','E','5','A'  },
        {'5' ,'7','6','6','E','E','E'  },
        {'6' ,'7','E','E','E','E','E'  },
        {'7' ,'7','E','E','E','E','A'  }
   };
   
   /**
    * Este metodo busca el estado o la validación de un simbolo a partir de
    * un estado previo.
    * @param Estado es el estado actual del analisis.
    * @param Entrada es el simbolo que se analiza.
    * @return la validación o el estado en el que se encuentra la cadena en
    * determinado simbolo proporcionado.
    */
   public char obtenerEstado_O_Validacion(char Estado, char Entrada){
      
       //Variable del numero de la fila
       int PosicionF = 0;
       //Variable del numero de la columna
       int PosicionC = 0;
       
       for (int j = 0; j < arreglo.length; j++) {
           //Se mantiene constante el numero de columna y se recorren las filas
           //(0,0), (1,0),(2,0),(3,0),(4,0)... al final se obtiene la coordenada
           //y o numero de fila
           if(arreglo[j][0] == Estado){
               PosicionF = j;
           }
       }
       for (int i = 0; i < arreglo[0].length; i++) {
           //Se mantiene constante el numero de fila y se recorren las columnas
           //(0,0), (0,1),(0,2),(0,3),(0,4)... al final se obtiene la coordenada
           //x o numero de columna
           if(arreglo[0][i] == Entrada){
              PosicionC = i;
           }
       }
       System.out.println("Estado/Validacion: "+arreglo[PosicionF][PosicionC]);
       return arreglo[PosicionF][PosicionC];  
   }
}
