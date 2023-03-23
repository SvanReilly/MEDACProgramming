package repaso1y2Trimestre;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
 * 
 * creacion de la clase celda que contiene un simbolo 
 * 
 * @param simbolo char del simbolo a usar dentro de la celda
 * @param ocupada booleano para ver si esta ocupada esa celda o no
 * 6
 */
 
public class CELDA {
    private char simbolo;
    private boolean ocupada;
    
    
    public CELDA() {
        this.simbolo = ' ';
        this.ocupada = false;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
    
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }
    
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    public String toString() {
        return String.valueOf(simbolo);
    }
}


