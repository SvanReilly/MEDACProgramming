package Ajedrez;

class PiezaPeon extends PiezaAjedrez { // RETOCAR

	public PiezaPeon(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Peon");
		this.color=color;
		this.casilla=casilla;
	}

	public boolean mover(PiezaCelda destino) {
		boolean esMovimientoValido = false;
		int diferenciaFila = destino.getFila() - this.casilla.getFila();
		int diferenciaCol = destino.getCol() - this.casilla.getCol();

		if (color) { // Peón Blanco
			if (diferenciaFila == -1 && diferenciaCol == 0) {
				esMovimientoValido = true;
			} else if (this.casilla.getFila() == 2 && diferenciaFila == -2 && diferenciaCol == 0) {
				esMovimientoValido = true;
			} else if (diferenciaCol == 1 || diferenciaCol == -1) {
				esMovimientoValido = true;
			}
		} else { // Peón Negro
			if (diferenciaFila == 1 && diferenciaCol == 0) {
				esMovimientoValido = true;
			} else if (this.casilla.getFila() == 7 && diferenciaFila == 2 && diferenciaCol == 0) {
				esMovimientoValido = true;
			} else if (diferenciaCol == 1 || diferenciaCol == -1) {
				esMovimientoValido = true;
			}
		}

		if (esMovimientoValido) {
			this.casilla = destino;
		}
		return esMovimientoValido;
	}
	
    public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
        int diferenciaFila = destino.getFila() - this.casilla.getFila();
        int diferenciaCol = destino.getCol() - this.casilla.getCol();
        if(color) { // Peón Blanco
            if (diferenciaFila == -1 && (diferenciaCol == 1 || diferenciaCol == -1)) {
                piezaAComer.setCasilla(null);
                this.casilla = destino;
                return true;
            }
        }else { // Peón Negro
            if (diferenciaFila == 1 && (diferenciaCol == 1 || diferenciaCol == -1)) {
                piezaAComer.setCasilla(null);
                this.casilla = destino;
                return true;
            }
        }
        return false;
    }


	public boolean promover(PiezaAjedrez nuevaPieza) {
		if (this.color) {
			if (this.casilla.getFila() == 8) {
				this.nombrePieza = nuevaPieza.getNombrePieza();
				return true;
			}
		} else {
			if (this.casilla.getFila() == 1) {
				this.nombrePieza = nuevaPieza.getNombrePieza();
				return true;
			}
		}
		return false;
	}
}