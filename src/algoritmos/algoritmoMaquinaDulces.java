/*
 * Esta clase contiene el algorimo para validar 
   las cadenas o simbolos de la maquina de dulces 
 */
package algoritmos;
import javax.swing.JOptionPane;
/**
 *
 * @author Eliezer
 */
public class algoritmoMaquinaDulces {

    public int Acum = 0;
    private int Estado = 0;
    private boolean validar = false;
    String S = " ";

    public int Proceso(int Estado, String Simbolo) {

        this.setEstado(Estado);
        this.S = Simbolo;

        if (!"Fdc".equals(Simbolo) && Estado != -1) {
            //S=LeerSimbolo();

            if (!"Fdc".equals(Simbolo)) {

                Acum = Acum + Integer.parseInt(Simbolo);

                switch (Estado) {

                    case 0:
                        switch (Simbolo) {
                            case "1":
                                Estado = 1;                                
                                break;
                            case "2":
                                Estado = 2;                               
                                break;
                            case "5":
                                Estado = 5;
                                break;
                            case "10":
                                Estado = 10;
                                break;
                            case "20":
                                Estado = 20;
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 1:
                        switch (Simbolo) {
                            case "1":
                                Estado = 2;
                                break;
                            case "2":
                                Estado = 3;
                                break;
                            case "5":
                                Estado = 6;
                                break;
                            case "10":
                                Estado = 11;
                                break;
                            case "20":
                                Estado = 21;
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 2:
                        switch (Simbolo) {
                            case "1":
                                Estado = 3;
                                break;
                            case "2":
                                Estado = 4;
                                break;
                            case "5":
                                Estado = 7;
                                break;
                            case "10":
                                Estado = 12;
                                break;
                            case "20":
                                Estado = 22;
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 3:
                        switch (Simbolo) {
                            case "1":
                                Estado = 4;
                                break;
                            case "2":
                                Estado = 5;
                                break;
                            case "5":
                                Estado = 8;
                                break;
                            case "10":
                                Estado = 13;
                                break;
                            case "20":
                                Estado = 23;
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 4:
                        switch (Simbolo) {
                            case "1":
                                Estado = 5;
                                break;
                            case "2":
                                Estado = 6;
                                break;
                            case "5":
                                Estado = 9;
                                break;
                            case "10":
                                Estado = 14;
                                break;
                            case "20":
                                Estado = 24;
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 5:
                        switch (Simbolo) {
                            case "1":
                                Estado = 6;
                                break;
                            case "2":
                                Estado = 7;
                                break;
                            case "5":
                                Estado = 10;
                                break;
                            case "10":
                                Estado = 15;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 6:
                        switch (Simbolo) {
                            case "1":
                                Estado = 7;
                                break;
                            case "2":
                                Estado = 8;
                                break;
                            case "5":
                                Estado = 11;
                                break;
                            case "10":
                                Estado = 16;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 7:
                        switch (Simbolo) {
                            case "1":
                                Estado = 8;
                                break;
                            case "2":
                                Estado = 9;
                                break;
                            case "5":
                                Estado = 12;
                                break;
                            case "10":
                                Estado = 17;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 8:
                        switch (Simbolo) {
                            case "1":
                                Estado = 9;
                                break;
                            case "2":
                                Estado = 10;
                                break;
                            case "5":
                                Estado = 13;
                                break;
                            case "10":
                                Estado = 18;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 9:
                        switch (Simbolo) {
                            case "1":
                                Estado = 10;
                                break;
                            case "2":
                                Estado = 11;
                                break;
                            case "5":
                                Estado = 14;
                                break;
                            case "10":
                                Estado = 19;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 10:
                        switch (Simbolo) {
                            case "1":
                                Estado = 11;
                                break;
                            case "2":
                                Estado = 12;
                                break;
                            case "5":
                                Estado = 15;
                                break;
                            case "10":
                                Estado = 20;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 11:
                        switch (Simbolo) {
                            case "1":
                                Estado = 12;
                                break;
                            case "2":
                                Estado = 13;
                                break;
                            case "5":
                                Estado = 16;
                                break;
                            case "10":
                                Estado = 21;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 12:
                        switch (Simbolo) {
                            case "1":
                                Estado = 13;
                                break;
                            case "2":
                                Estado = 14;
                                break;
                            case "5":
                                Estado = 17;
                                break;
                            case "10":
                                Estado = 22;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 13:
                        switch (Simbolo) {
                            case "1":
                                Estado = 14;
                                break;
                            case "2":
                                Estado = 15;
                                break;
                            case "5":
                                Estado = 18;
                                break;
                            case "10":
                                Estado = 23;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 14:
                        switch (Simbolo) {
                            case "1":
                                Estado = 15;
                                break;
                            case "2":
                                Estado = 16;
                                break;
                            case "5":
                                Estado = 19;
                                break;
                            case "10":
                                Estado = 24;
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 15:
                        switch (Simbolo) {
                            case "1":
                                Estado = 16;
                                break;
                            case "2":
                                Estado = 17;
                                break;
                            case "5":
                                Estado = 20;
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 16:
                        switch (Simbolo) {
                            case "1":
                                Estado = 17;
                                break;
                            case "2":
                                Estado = 18;
                                break;
                            case "5":
                                Estado = 21;
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 17:
                        switch (Simbolo) {
                            case "1":
                                Estado = 18;
                                break;
                            case "2":
                                Estado = 19;
                                break;
                            case "5":
                                Estado = 22;
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 18:
                        switch (Simbolo) {
                            case "1":
                                Estado = 19;
                                break;
                            case "2":
                                Estado = 20;
                                break;
                            case "5":
                                Estado = 23;
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 19:
                        switch (Simbolo) {
                            case "1":
                                Estado = 20;
                                break;
                            case "2":
                                Estado = 21;
                                break;
                            case "5":
                                Estado = 24;
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 20:
                        switch (Simbolo) {
                            case "1":
                                Estado = 21;
                                break;
                            case "2":
                                Estado = 22;
                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 21:
                        switch (Simbolo) {
                            case "1":
                                Estado = 22;
                                break;
                            case "2":
                                Estado = 23;
                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 22:
                        switch (Simbolo) {
                            case "1":
                                Estado = 23;
                                break;
                            case "2":
                                Estado = 24;
                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 23:
                        switch (Simbolo) {
                            case "1":
                                Estado = 24;
                                break;
                            case "2":
                                Estado = 25;
                                setValidar(true);

                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 24:
                        switch (Simbolo) {
                            case "1":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "2":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;

                    case 25:
                        switch (Simbolo) {
                            case "1":
                                Estado = 25;
                                setValidar(true);

                                break;
                            case "2":
                                Estado = 25;
                                setValidar(true);

                                break;
                            case "5":
                                Estado = 25;
                                setValidar(true);

                                break;
                            case "10":
                                Estado = 25;
                                setValidar(true);
                                break;
                            case "20":
                                Estado = 25;
                                setValidar(true);
                                break;
                            default:
                                Error();
                        }
                        break;
                    default:
                        Simbolo = "Fdc";
                        Estado = (-1);

                }
                System.out.println("Estado: " + Estado);
                System.out.println("Simbolo: " + Simbolo);
            }
        }
        return Estado;
    }

    public void Error() {
        JOptionPane.showMessageDialog(null, "Error", "Simbolo No Valido", JOptionPane.ERROR_MESSAGE);
    }

    public String LeerSimbolo() {
        return JOptionPane.showInputDialog(null, "Ingrese El Simbolo:");
    }

    public static void main(String[] args) {
        algoritmoMaquinaDulces o = new algoritmoMaquinaDulces();
        //o.Proceso();
    }

    /**
     * @return the Estado
     */
    public int getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the validar
     */
    public boolean isValidar() {
        return validar;
    }

    /**
     * @param validar the validar to set
     */
    public void setValidar(boolean validar) {
        this.validar = validar;
    }
}
