package Ajedrez;

public class PiezaReina extends PiezaAjedrez {

    public PiezaReina(boolean color, PiezaCelda casilla) {
        super(color, casilla, "Reina");
        this.color=color;
        this.casilla=casilla;
    }
    
    public boolean mover(PiezaCelda destino) {
        int diferenciaFila = Math.abs(this.casilla.getFila() - destino.getFila());
        int diferenciaCol = Math.abs(this.casilla.getCol() - destino.getCol());
        if ((diferenciaFila == 0 && diferenciaCol != 0) || (diferenciaFila != 0 && diferenciaCol == 0) || (diferenciaFila == diferenciaCol)) {
            this.casilla = destino;
            return true;
        }
        return false;
    }
    
    public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
        int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
        int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
        if ((diferenciaFila == 0 || diferenciaCol == 0) || (diferenciaFila == diferenciaCol)) {
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
        if ((diferenciaFila == 0 || diferenciaCol == 0) || (diferenciaFila == diferenciaCol)) {
            return true;
        }
        return false;
	}*/
}
