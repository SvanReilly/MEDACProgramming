package Ajedrez;

public class PiezaTorre extends PiezaAjedrez {

	public PiezaTorre(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Torre");
		this.color = color;
		this.casilla = casilla;
	}
	// TODO Auto-generated constructor stub

	public boolean moverse(PiezaCelda c1) {
		boolean mover = true;
		if (((c1.getCol() != this.casilla.getCol()) && (c1.getFila() == this.casilla.getFila()))
				|| ((c1.getCol() == this.casilla.getCol()) && (c1.getFila() != this.casilla.getFila()))) {
			this.casilla = c1;
		} else {
			mover = false;
		}
		return mover;
	}
	public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
	    if(moverse(destino)) {
	        piezaAComer.setCasilla(null);
	        return true;
	    }
	    return false;
	}
}
