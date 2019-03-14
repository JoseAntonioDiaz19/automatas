/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Dizan
 */
public class modeloProcedimiento {
    
    private char estado;
    private char S;
    private char Entrada;

    public modeloProcedimiento(char estado, char S, char Entrada) {
        this.estado = estado;
        this.S = S;
        this.Entrada = Entrada;
    }

    /**
     * @return the estado
     */
    public char getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(char estado) {
        this.estado = estado;
    }

    /**
     * @return the S
     */
    public char getS() {
        return S;
    }

    /**
     * @param S the S to set
     */
    public void setS(char S) {
        this.S = S;
    }

    /**
     * @return the Entrada
     */
    public char getEntrada() {
        return Entrada;
    }

    /**
     * @param Entrada the Entrada to set
     */
    public void setEntrada(char Entrada) {
        this.Entrada = Entrada;
    }

    
}
