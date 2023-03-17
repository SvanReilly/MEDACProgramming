package Ajedrez;

public abstract class PiezaAjedrez {
	protected boolean color;
	protected PiezaCelda casilla;
	protected String nombrePieza;

	protected PiezaAjedrez(boolean color, PiezaCelda casilla) {
		this.color = color;
		this.casilla = casilla;

	}

	protected PiezaAjedrez(boolean color, PiezaCelda casilla, String nombrePieza) {
		this.color = color;
		this.casilla = casilla;
		this.nombrePieza = nombrePieza;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public PiezaCelda getCasilla() {
		return casilla;
	}

	public void setCasilla(PiezaCelda casilla) {
		this.casilla = casilla;
	}

	public String getNombrePieza() {
		return nombrePieza;
	}

	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}
	
    //public abstract boolean puedeCapturar(PiezaAjedrez pieza, PiezaCelda destino);

	@Override
	public String toString() {
		return this.nombrePieza + " " + this.casilla.toString();
	}

}
