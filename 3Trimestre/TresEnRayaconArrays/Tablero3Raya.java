package tableGames;

import java.util.HashMap;

public class Tablero3Raya {

	
	private Casilla3Raya casilla;
	private HashMap<?, ?> table;
	

	public Tablero3Raya(Casilla3Raya casilla) {
		this.casilla = casilla;
	}

	public Casilla3Raya getCasilla() {
		return casilla;
	}

	public void setCasilla(Casilla3Raya casilla) {
		this.casilla = casilla;
	}
	
	
}
