package repaso1y2Trimestre;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
 * @param CELDA[][] es un array bidimensional de la clase CELDA 
 * para representar una matriz para el tablero de juego
 * @see repaso1y2Trimestre.CELDA;
 */
public class TABLERO {
	
	private CELDA[][] tableroDeJuego;

	public TABLERO() {
		this.tableroDeJuego = new CELDA[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.tableroDeJuego[i][j] = new CELDA();
			}
		}
	}

	public CELDA getCelda(int fila, int columna) {
		return tableroDeJuego[fila][columna];
	}

	public void setCelda(int fila, int columna, char simbolo) {
		this.tableroDeJuego[fila][columna].setSimbolo(simbolo);
		this.tableroDeJuego[fila][columna].setOcupada(true);
	}
	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param DeployedBoard es un String inicializado vacío
	 * @return Imprimirá el tablero vacío del 3 en raya.
	 */
	public String toString() {
		String DeployedBoard = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				DeployedBoard += "[" + this.tableroDeJuego[i][j] + "]";
			}
			DeployedBoard += "\n";
		}
		return DeployedBoard;

	}
}
