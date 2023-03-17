package Ajedrez;

public class PiezaAlfil extends PiezaAjedrez{

	public PiezaAlfil(boolean color, PiezaCelda casilla) {
		super(color, casilla, "Alfil");
		this.color = color;
		this.casilla = casilla;
	}
	// TODO Auto-generated constructor stub

    public boolean mover(PiezaCelda destino) {
        int diferenciaFila = Math.abs(this.casilla.getFila() - destino.getFila());
        int diferenciaCol = Math.abs(this.casilla.getCol() - destino.getCol());
        if (diferenciaFila == diferenciaCol) {
            this.casilla = destino;
            return true;
        }
        return false;
    }
    public boolean comer(PiezaAjedrez piezaAComer, PiezaCelda destino) {
        int diferenciaFila = Math.abs(destino.getFila() - this.casilla.getFila());
        int diferenciaCol = Math.abs(destino.getCol() - this.casilla.getCol());
        if (diferenciaFila == diferenciaCol) {
            piezaAComer.setCasilla(null);
            this.casilla = destino;
            return true;
        }
        return false;
    }
}
   
	