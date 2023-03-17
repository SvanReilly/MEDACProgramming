package Ajedrez;

public class PiezaRey extends PiezaAjedrez {

	public PiezaRey(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Rey");
		this.color = color;
		this.casilla = casilla;
	}

	public boolean mover(PiezaCelda destino) {
		int diferenciaFila = Math.abs(this.casilla.getFila() - destino.getFila());
		int diferenciaCol = Math.abs(this.casilla.getCol() - destino.getCol());
		if (diferenciaFila <= 1 && diferenciaCol <= 1) {
			this.casilla = destino;
			return true;
		}
		return false;
	}

	public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
		int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
		int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
		if (diferenciaFila <= 1 && diferenciaCol <= 1) {
			piezaAComer.setCasilla(null);
			this.casilla = destino;
			return true;
		}
		return false;
	}

/*	@Override
	public boolean puedeCapturar(PiezaAjedrez pieza, PiezaCelda destino) {
		// TODO Auto-generated method stub
		return false;
	} */
}


/*public boolean puedeMoverse(PiezaCelda destino, PiezaAjedrez[] piezas) {
int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
if (diferenciaFila > 1 || diferenciaCol > 1) {
    return false;
}

//check if the king would be in check after moving
PiezaCelda casillaTemp = this.casilla;
this.casilla = destino;
boolean estaEnJaque = estaEnJaque(piezas);
this.casilla = casillaTemp;

return !estaEnJaque;
}


private boolean estaEnJaque(PiezaAjedrez[] piezas) {
for (PiezaAjedrez pieza : piezas) {
    if (pieza.getCasilla() != null && pieza.isColor() != this.color) {
        if (pieza.puedeCapturar(this.casilla)) {
            return true;
        }
    }
}
return false;
} */
