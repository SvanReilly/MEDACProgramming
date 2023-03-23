package repaso1y2Trimestre;

public class JUGADOR {

	private String name;
	private char markup;

	public JUGADOR() {
		this.setName("");
		this.markup = 'N';
	}

	public JUGADOR(char markup) {
		this.setName("");
		this.markup = markup;
	}

	public JUGADOR(String name, char markup) {
		this.setName(name);
		this.markup = markup;
	}

	public char getMarkup() {
		return markup;
	}

	public boolean setMarkup(JUGADOR player) {
		boolean correcto;
		if (player.getMarkup() == 'X') {
			markup = 'O';
			correcto = true;
		} else {
			this.markup = 'X';
			correcto = false;
		}
		return correcto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
