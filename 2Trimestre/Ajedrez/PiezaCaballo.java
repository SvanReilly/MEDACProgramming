package Ajedrez;

class PiezaCaballo extends PiezaAjedrez { // RETOCAR

	public PiezaCaballo(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Caballo");
		this.color = color;
		this.casilla = casilla;
	}

	public boolean mover(PiezaCelda destino) {
		int diferenciaFila = Math.abs(this.casilla.getFila() - destino.getFila());
		int diferenciaCol = Math.abs(this.casilla.getCol() - destino.getCol());
		if ((diferenciaFila == 2 && diferenciaCol == 1) || (diferenciaFila == 1 && diferenciaCol == 2)) {
			this.casilla = destino;
			return true;
		}
		return false;
	}

	public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
		int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
		int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
		if ((diferenciaFila == 2 && diferenciaCol == 1) || (diferenciaFila == 1 && diferenciaCol == 2)) {
			piezaAComer.setCasilla(null);
			this.casilla = destino;
			return true;
		}
		return false;
	}

	/*@Override
	public boolean puedeCapturar(PiezaAjedrez pieza, PiezaCelda destino) {
	    int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
	    int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
	    if ((diferenciaFila == 2 && diferenciaCol == 1) || (diferenciaFila == 1 && diferenciaCol == 2)) {
	        return true;
	    }
	    return false;
	} */
}
