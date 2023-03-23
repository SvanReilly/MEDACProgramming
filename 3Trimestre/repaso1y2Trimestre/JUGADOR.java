package repaso1y2Trimestre;

public class JUGADOR {

	private char markup;

	public JUGADOR() {
		this.markup = 'N';
	}

	public JUGADOR(char markup) {
		this.markup = markup;
	}

	public char getMarkup() {
		return markup;
	}

	public boolean setMarkup(JUGADOR player) {
		boolean correcto;
		if (player.getMarkup() == 'X') {
			markup = '0';
			correcto = true;
		} else {
			this.markup = 'X';
			correcto = false;
		}
		return correcto;
	}

	public void putMarkupOnBoard() {
		
	}
}
