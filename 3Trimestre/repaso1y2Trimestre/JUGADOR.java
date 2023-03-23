package repaso1y2Trimestre;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
 * 
 * @param name nombre asociado al jugador
 * @param markup simbolo que asocia la casilla al jugador
 * 
 */
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
