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
    private String simbolo;
    private int fila;
    private int columna;
    private boolean ocupada;
    
    
    public CELDA() {
        this.simbolo = " ";
        this.fila=0;
        this.columna=0;
        this.ocupada = false;
    }
    
    public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getSimbolo() {
        return simbolo;
    }
    
    public void setSimbolo(String simbolo) {
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


