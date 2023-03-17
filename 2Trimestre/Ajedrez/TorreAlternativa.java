package Ajedrez;

public class TorreAlternativa extends PiezaAjedrez{

	public TorreAlternativa(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Torre");
		this.color = color;
		this.casilla = casilla;
	}

	public boolean moverse(PiezaCelda destino) {
		if (((destino.getCol() != this.casilla.getCol()) && (destino.getFila() == this.casilla.getFila()))
				|| ((destino.getCol() == this.casilla.getCol()) && (destino.getFila() != this.casilla.getFila()))) {
			this.casilla = destino;
			return true;
		}
		return false;
	}

	public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
		if (moverse(destino)) {
			piezaAComer.setCasilla(null);
			return true;
		}
		return false;
	}
}