/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
import javax.swing.JOptionPane;
/**
 *
 * @author Eliezer
 */
public class algoritmoMaquinaDulces 
{

        public int Acum = 0;
        int Estado = 0;
        public boolean validar = false;
        String S = " ";
        
    public int  Proceso( int Estado, String S )
    {
        
        this.Estado=Estado;
        this.S = S;
        
        if(!"Fdc".equals(S) && Estado!= -1)
        {
            //S=LeerSimbolo();
            
            if(!"Fdc".equals(S))
            {
                
            Acum = Acum + Integer.parseInt(S);
            
    switch(Estado){
                
            case 0:
                    switch(S)
                    {
                        case "1":
                            Estado=1;
                            validar = false;
                            break;
                        case "2":
                            Estado=2;
                            validar = false;
                            break;
                        case "5":
                            Estado=5;
                            validar = false;
                            break;
                        case "10":
                            Estado=10;
                            validar = false;
                            break;
                        case "20":
                            Estado=20;
                            validar = false;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 1:
                switch(S)
                    {
                        case "1":
                            Estado = 2;
                            validar = false;
                            break;
                        case "2":
                            Estado=3;
                            validar = false;
                            break;
                        case "5":
                            Estado=6;
                            validar = false;
                            break;
                        case "10":
                            Estado=11;
                            validar = false;
                            break;
                        case "20":
                            Estado=21;
                            validar = false;
                            break;
                        default:
                            Error();
                    }
                    break; 
                case 2:
                switch(S)
                    {
                        case "1":
                            Estado=3;
                            validar = false;
                            break;
                        case "2":
                            Estado=4;
                            validar = false;
                            break;
                        case "5":
                            Estado=7;
                            validar = false;
                            break;
                        case "10":
                            Estado=12;
                            validar = false;
                            break;
                        case "20":
                            Estado=22;
                            validar = false;
                            break;
                        default:
                            Error();
                    }
                    break;    
               case 3:
                switch(S)
                    {
                        case "1":
                            Estado=4;
                            validar = false;
                            break;
                        case "2":
                            Estado=5;
                            validar = false;
                            break;
                        case "5":
                            Estado=8;
                            validar = false;
                            break;
                        case "10":
                            Estado=13;
                            validar = false;
                            break;
                        case "20":
                            Estado=23;
                            validar = false;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 4:
                switch(S)
                    {
                        case "1":
                            Estado=5;
                            validar = false;
                            break;
                        case "2":
                            Estado=6;
                            validar = false;
                            break;
                        case "5":
                            Estado=9;
                            validar = false;
                            break;
                        case "10":
                            Estado=14;
                            validar = false;
                            break;
                        case "20":
                            Estado=24;
                            validar = false;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 5:
                switch(S)
                    {
                        case "1":
                            Estado=6;
                            validar = false;
                            break;
                        case "2":
                            Estado=7;
                            validar = false;
                            break;
                        case "5":
                            Estado=10;
                            validar = false;
                            break;
                        case "10":
                            Estado=15;
                            validar = false;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break; 
                case 6:
                switch(S)
                    {
                        case "1":
                            Estado=7;
                            validar = false;
                            break;
                        case "2":
                            Estado=8;
                            validar = false;
                            break;
                        case "5":
                            Estado=11;
                            validar = false;
                            break;
                        case "10":
                            Estado=16;
                            validar = false;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;    
                case 7:
                switch(S)
                    {
                        case "1":
                            Estado=8;
                            validar = false;
                            break;
                        case "2":
                            Estado=9;
                            validar = false;
                            break;
                        case "5":
                            Estado=12;
                            validar = false;
                            break;
                        case "10":
                            Estado=17;
                            validar = false;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 8:
                switch(S)
                    {
                        case "1":
                            Estado=9;
                            validar = false;
                            break;
                        case "2":
                            Estado=10;
                            validar = false;
                            break;
                        case "5":
                            Estado=13;
                            validar = false;
                            break;
                        case "10":
                            Estado=18;
                            validar = false;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 9:
                switch(S)
                    {
                        case "1":
                            Estado = 10;
                            validar = false;
                            break;
                        case "2":
                            Estado = 11;
                            validar = false;
                            break;
                        case "5":
                            Estado = 14;
                            validar = false;
                            break;
                        case "10":
                            Estado = 19;
                            validar = false;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 10:
                switch(S)
                    {
                        case "1":
                            Estado = 11;
                            validar = false;
                            break;
                        case "2":
                            Estado = 12;
                            validar = false;
                            break;
                        case "5":
                            Estado = 15;
                            validar = false;
                            break;
                        case "10":
                            Estado = 20;
                            validar = false;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                
                case 11:
                switch(S)
                    {
                        case "1":
                            Estado=12;
                            validar = false;
                            break;
                        case "2":
                            Estado=13;
                            validar = false;
                            break;
                        case "5":
                            Estado=16;
                            validar = false;
                            break;
                        case "10":
                            Estado=21;
                            validar = false;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                
                case 12:
                switch(S)
                    {
                        case "1":
                            Estado = 13;
                            validar = false;
                            break;
                        case "2":
                            Estado = 14;
                            validar = false;
                            break;
                        case "5":
                            Estado = 17;
                            validar = false;
                            break;
                        case "10":
                            Estado = 22;
                            validar = false;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                case 13:
                switch(S)
                    {
                        case "1":
                            Estado = 14;
                            validar = false;
                            break;
                        case "2":
                            Estado = 15;
                            validar = false;
                            break;
                        case "5":
                            Estado = 18;
                            validar = false;
                            break;
                        case "10":
                            Estado = 23;
                            validar = false;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;    
                case 14:
                switch(S)
                    {
                        case "1":
                            Estado=15;
                            validar = false;
                            break;
                        case "2":
                            Estado=16;
                            validar = false;
                            break;
                        case "5":
                            Estado=19;
                            validar = false;
                            break;
                        case "10":
                            Estado=24;
                            validar = false;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;    
                case 15:
                switch(S)
                    {
                        case "1":
                            Estado=16;
                            validar = true;
                            break;
                        case "2":
                            Estado=17;
                            validar = false;
                            break;
                        case "5":
                            Estado=20;
                            validar = false;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;    
                case 16:
                switch(S)
                    {
                        case "1":
                            Estado=17;
                            validar = false;
                            break;
                        case "2":
                            Estado=18;
                            validar = false;
                            break;
                        case "5":
                            Estado=21;
                            validar = false;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                    
                case 17:
                switch(S)
                    {
                        case "1":
                            Estado=18;
                            validar = false;
                            break;
                        case "2":
                            Estado=19;
                            validar = false;
                            break;
                        case "5":
                            Estado=22;
                            validar = false;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;
                    
                case 18:
                switch(S)
                    {
                        case "1":
                            Estado=19;
                            validar = false;
                            break;
                        case "2":
                            Estado=20;
                            validar = false;
                            break;
                        case "5":
                            Estado=23;
                            validar = false;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break; 
                    
                
                case 19:
                switch(S)
                    {
                        case "1":
                            Estado=20;
                            validar = false;
                            break;
                        case "2":
                            Estado=21;
                            validar = false;
                            break;
                        case "5":
                            Estado=24;
                            validar = false;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;        
                    
                
                case 20:
                switch(S)
                    {
                        case "1":
                            Estado=21;
                            validar = false;
                            break;
                        case "2":
                            Estado=22;
                            validar = false;
                            break;
                        case "5":
                            Estado=25;
                            validar = true;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;            
               
                case 21:
                switch(S)
                    {
                        case "1":
                            Estado=22;
                            validar = false;
                            break;
                        case "2":
                            Estado=23;
                            validar = false;
                            break;
                        case "5":
                            Estado=25;
                            validar = true;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;            
                
                case 22:
                switch(S)
                    {
                        case "1":
                            Estado=23;
                            validar = false;
                            break;
                        case "2":
                            Estado=24;
                            validar = false;
                            break;
                        case "5":
                            Estado=25;
                            validar = true;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;            
                
                case 23:
                switch(S)
                    {
                        case "1":
                            Estado = 24;
                            validar = false;
                            break;
                        case "2":
                            Estado = 25;
                            validar = true;
                           
                            break;
                        case "5":
                            Estado = 25;
                            validar = true;                          
                            break;
                        case "10":
                            Estado = 25;
                            validar = true;
                            break;
                        case "20":
                            Estado = 25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;            
                
                case 24:
                switch(S)
                    {
                        case "1":
                            Estado=25;
                            validar = true;
                            break;
                        case "2":
                            Estado=25;
                            validar = true;
                            break;
                        case "5":
                            Estado=25;
                            validar = true;
                            break;
                        case "10":
                            Estado=25;
                            validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;            
        
                case 25:
                switch(S)
                    {
                        case "1":
                            Estado=25;
                            validar = true;
                           
                            break;
                        case "2":
                            Estado=25;
                            validar = true;
                          
                            break;
                        case "5":
                            Estado=25;
                            validar = true;
                         
                            break;
                        case "10":
                            Estado=25;
                           validar = true;
                            break;
                        case "20":
                            Estado=25;
                            validar = true;
                            break;
                        default:
                            Error();
                    }
                    break;               
                default:
                    S="Fdc";
                    Estado=(-1);
                    
            }
            System.out.println("Estado: "+Estado);
            System.out.println("Simbolo: "+S);
    
            }
                 
    }
        
        return Estado;
    }
    
    
    
    public int [] Validar( int e)
    {
        
        int arreglo[]= new int[2];
        if(e==25)
        {
            JOptionPane.showMessageDialog(null,"Cantidad Valida");
            System.out.println("Numero De Dulces A Elegir: "+(Acum/25));
            arreglo[0]=Acum/25;
            System.out.println("Cambio: "+(Acum%25));
            arreglo[1]=Acum%25;
        }else
        {
            JOptionPane.showMessageDialog(null,"Error","No Hay Suficiente Credito",JOptionPane.ERROR_MESSAGE);
            System.out.println("Numero De Dulces A Elegir: "+(Acum/25));
            arreglo[0]=Acum/25;
            System.out.println("Cambio: "+(Acum%25));
            arreglo[1]=Acum%25;
            
        }
        
        return arreglo;
    }
    public void Error()
    {
        JOptionPane.showMessageDialog(null,"Error","Simbolo No Valido", JOptionPane.ERROR_MESSAGE);
    }
    
    public String LeerSimbolo()
    {
        return JOptionPane.showInputDialog(null,"Ingrese El Simbolo:");
    }

public static void main(String[] args)
    {
        algoritmoMaquinaDulces o= new algoritmoMaquinaDulces();
        //o.Proceso();
    }


}
