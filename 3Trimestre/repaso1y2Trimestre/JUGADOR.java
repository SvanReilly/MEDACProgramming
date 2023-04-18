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
	private String markup;

	public JUGADOR() {
		this.setName("");
		this.markup = "N";
	}

	public JUGADOR(String markup) {
		this.setName("");
		this.markup = markup;
	}

	public JUGADOR(String name, String markup) {
		this.setName(name);
		this.markup = markup;
	}

	public String getMarkup() {
		return markup;
	}

	public void setMarkup(String markup) {
		this.markup=markup;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
