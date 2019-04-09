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

    public int Proceso(int Estado, String S) {

        this.setEstado(Estado);
        this.S = S;

        if (!"Fdc".equals(S) && Estado != -1) {
            //S=LeerSimbolo();

            if (!"Fdc".equals(S)) {

                Acum = Acum + Integer.parseInt(S);

                switch (Estado) {

                    case 0:
                        switch (S) {
                            case "1":
                                Estado = 1;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 2;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 5;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 10;
                                setValidar(false);
                                break;
                            case "20":
                                Estado = 20;
                                setValidar(false);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 1:
                        switch (S) {
                            case "1":
                                Estado = 2;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 3;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 6;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 11;
                                setValidar(false);
                                break;
                            case "20":
                                Estado = 21;
                                setValidar(false);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 2:
                        switch (S) {
                            case "1":
                                Estado = 3;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 4;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 7;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 12;
                                setValidar(false);
                                break;
                            case "20":
                                Estado = 22;
                                setValidar(false);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 3:
                        switch (S) {
                            case "1":
                                Estado = 4;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 5;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 8;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 13;
                                setValidar(false);
                                break;
                            case "20":
                                Estado = 23;
                                setValidar(false);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 4:
                        switch (S) {
                            case "1":
                                Estado = 5;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 6;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 9;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 14;
                                setValidar(false);
                                break;
                            case "20":
                                Estado = 24;
                                setValidar(false);
                                break;
                            default:
                                Error();
                        }
                        break;
                    case 5:
                        switch (S) {
                            case "1":
                                Estado = 6;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 7;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 10;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 15;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 7;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 8;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 11;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 16;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 8;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 9;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 12;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 17;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 9;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 10;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 13;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 18;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 10;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 11;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 14;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 19;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 11;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 12;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 15;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 20;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 12;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 13;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 16;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 21;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 13;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 14;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 17;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 22;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 14;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 15;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 18;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 23;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 15;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 16;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 19;
                                setValidar(false);
                                break;
                            case "10":
                                Estado = 24;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 16;
                                setValidar(true);
                                break;
                            case "2":
                                Estado = 17;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 20;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 17;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 18;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 21;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 18;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 19;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 22;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 19;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 20;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 23;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 20;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 21;
                                setValidar(false);
                                break;
                            case "5":
                                Estado = 24;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 21;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 22;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 22;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 23;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 23;
                                setValidar(false);
                                break;
                            case "2":
                                Estado = 24;
                                setValidar(false);
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
                        switch (S) {
                            case "1":
                                Estado = 24;
                                setValidar(false);
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
                        switch (S) {
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
                        switch (S) {
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
                        S = "Fdc";
                        Estado = (-1);

                }
                System.out.println("Estado: " + Estado);
                System.out.println("Simbolo: " + S);

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
