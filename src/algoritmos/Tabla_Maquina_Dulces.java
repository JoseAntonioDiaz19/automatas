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
public class Tabla_Maquina_Dulces 
{
String [][] arreglo=
{
    {null,"5","10","20","Fdc"},
    {"0" , "5","10","20","E"},
    {"5" ,"10","15","25","E"},
    {"10","15","20","25","E"},
    {"15","20","25","25","E"},
    {"20","25","25","25","E"},
    {"25","25","25","25","A"}    
};

public String F(String Estado,String Entrada){
        int PosicionF=0, PosicionC=0;

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
}


