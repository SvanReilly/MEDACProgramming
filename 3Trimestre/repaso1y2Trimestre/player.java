package repaso1y2Trimestre;

public class player {

	private char markup;

	public player() {
		this.markup = 'X';
	}

	public player(char markup) {
		this.markup = markup;
	}

	public char getMarkup() {
		return markup;
	}

	public boolean setMarkup(player player) {
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
