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
   char arreglo[][]=
   {    {' ' ,'d','+','-','.','e','F'  },
        {'0' ,'2','1','1','E','E','E'  },
        {'1' ,'2','E','E','E','E','E'  },
        {'2' ,'2','E','E','3','E','A'  },
        {'3' ,'4','E','E','E','E','E'  },
        {'4' ,'4','E','E','E','5','A'  },
        {'5' ,'7','6','6','E','E','E'  },
        {'6' ,'7','E','E','E','E','E'  },
        {'7' ,'7','E','E','E','E','A'  }
   };
   
   
   public char F(char Estado, char Entrada)
   {
       int PosicionF=0;
       int PosicionC=0;
       for (int i = 0; i < arreglo[0].length; i++) 
       {
           if(arreglo[0][i]==Entrada)
           {
              PosicionC=i;
           }
       }
       for (int j = 0; j < arreglo.length; j++) 
       {
           if(arreglo[j][0]==Estado)
           {
               PosicionF=j;
           }
       }
       return arreglo[PosicionF][PosicionC];
       
   }
   
    public static void main(String[] args) 
    {
    Tabla_Numeros_Exponenciales objeto= new Tabla_Numeros_Exponenciales();
        System.out.println("Estado: "+objeto.F('7','.'));
    }
}
