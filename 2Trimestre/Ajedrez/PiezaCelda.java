package Ajedrez;

public class PiezaCelda {
	private int fila;
	private char col;
	// private Pieza pieza;

	public PiezaCelda(int fila, char col) {
		this.fila = fila;
		this.col = col;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getCol() {
		return col;
	}

	public void setCol(char col) {
		this.col = col;
	}

	@Override
	public String toString() {
		return "Posición (Col/fila):" + col + fila;
	}

}
