package TresEnRayaconArrays;

public class Celda1 {

	private int valor;
	private int fila;
	private int columna;
	private boolean ocupada;

	public Celda1(int valor, int fila, int columna, boolean ocupada) {
		super();
		this.valor = valor;
		this.fila = fila;
		this.columna = columna;
		this.ocupada = ocupada;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	

}
