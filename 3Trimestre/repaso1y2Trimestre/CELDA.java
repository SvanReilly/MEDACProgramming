package repaso1y2Trimestre;

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


