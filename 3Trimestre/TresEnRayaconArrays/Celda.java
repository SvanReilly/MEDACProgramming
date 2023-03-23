package TresEnRayaconArrays;

public class Celda {
    private char simbolo;
    private boolean ocupada;
    
    public Celda() {
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


