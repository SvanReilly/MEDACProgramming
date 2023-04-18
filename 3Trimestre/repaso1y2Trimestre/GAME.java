package repaso1y2Trimestre;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
 * @param tablero para inicializar el tablero e
 * @see repaso1y2Trimestre.TABLERO;
 * @see repaso1y2Trimestre.JUGADOR;
 */
public class GAME {

	private TABLERO tablero;
	private JUGADOR jugador1;
	private JUGADOR jugador2;
	private JUGADOR jugadorActual;
	private boolean finDePartida;
	private JUGADOR ganador;

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.1
	 * @param jugador1 se inicializa en el constructor vacio con un nombre (Jugador
	 *                 1) y marca por defecto (X).
	 * @param jugador2 se inicializa en el constructor vacio con un nombre (Jugador
	 *                 2) y marca por defecto (O).
	 */
	public GAME() {
		this.tablero = new TABLERO();
		this.jugador1 = new JUGADOR("\u001B[32m" + "Jugador 1" + "\u001B[0m", "X");
		this.jugador2 = new JUGADOR("\u001B[36m" + "Jugador 2" + "\u001B[0m", "O");
		this.jugadorActual = new JUGADOR("Test", "T");
		this.finDePartida = false;
		this.ganador = null;
	}

	public TABLERO getTablero() {
		return tablero;
	}

	public void setTablero(TABLERO tablero) {
		this.tablero = tablero;
	}

	public JUGADOR getJugador1() {
		return jugador1;
	}

	public void setJugador1(JUGADOR jugador1) {
		this.jugador1 = jugador1;
	}

	public JUGADOR getJugador2() {
		return jugador2;
	}

	public void setJugador2(JUGADOR jugador2) {
		this.jugador2 = jugador2;
	}

	public JUGADOR getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(JUGADOR jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	public boolean isFinDePartida() {
		return finDePartida;
	}

	public void setFinDePartida(boolean finDePartida) {
		this.finDePartida = finDePartida;
	}

	public JUGADOR getGanador() {
		return ganador;
	}

	public void setGanador(JUGADOR ganador) {
		this.ganador = ganador;
	}

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param DeployedBoard es un String inicializado vacio
	 * @return Devolvera la coordenada insertada de la fila o la columna
	 * @see repaso1y2Trimestre.TresEnRaya;
	 */
	public boolean comprobarCeldas(String coordenada) {
		boolean correcto = false;
		switch (coordenada.toUpperCase()) {

		case "A":
			correcto = getTablero().getCelda(0, 0).isOcupada();
			break;

		case "B":
			correcto = getTablero().getCelda(0, 1).isOcupada();
			break;

		case "C":
			correcto = getTablero().getCelda(0, 2).isOcupada();
			break;

		case "D":
			correcto = getTablero().getCelda(1, 0).isOcupada();
			break;

		case "E":
			correcto = getTablero().getCelda(1, 1).isOcupada();
			break;

		case "F":
			correcto = getTablero().getCelda(1, 2).isOcupada();
			break;

		case "G":
			correcto = getTablero().getCelda(2, 0).isOcupada();
			break;

		case "H":
			correcto = getTablero().getCelda(2, 1).isOcupada();
			break;

		case "I":
			correcto = getTablero().getCelda(2, 2).isOcupada();
			break;

		default:
			correcto = false;
			break;
		}
		return correcto;

	}

	public void pedirCoordenada(String coordenada, JUGADOR jugadorActual) {


		if (comprobarCeldas(coordenada.toUpperCase())) {

			switch (coordenada.toUpperCase()) {
			case "A":
				getTablero().setCelda(0, 0, jugadorActual.getMarkup());
				break;

			case "B":
				getTablero().setCelda(0, 1, jugadorActual.getMarkup());
				break;

			case "C":
				getTablero().setCelda(0, 2, jugadorActual.getMarkup());
				break;

			case "D":
				getTablero().setCelda(1, 0, jugadorActual.getMarkup());
				break;

			case "E":
				getTablero().setCelda(1, 1, jugadorActual.getMarkup());
				break;

			case "F":
				getTablero().setCelda(1, 2, jugadorActual.getMarkup());
				break;

			case "G":
				getTablero().setCelda(2, 0, jugadorActual.getMarkup());
				break;

			case "H":
				getTablero().setCelda(2, 1, jugadorActual.getMarkup());
				break;

			case "I":
				getTablero().setCelda(2, 2, jugadorActual.getMarkup());
				break;

			default:
				getTablero().setCelda(0, 0, jugadorActual.getMarkup());
				break;
			}
		} 
	}

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param jugadorActual
	 * @return Devolvera al jugador1 o jugador2 dependiendo de cual tenga asignado
	 *         previamente.
	 */
	public void cambiarJugador(JUGADOR jugadorActual) {

		if (this.jugadorActual == this.jugador1) {
			setJugadorActual(this.jugador2);
		} else {
			setJugadorActual(this.jugador1);
		}
	}

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param jugador
	 * @return Devolvera un booleano si la partida ha terminado por victoria de
	 *         algun jugador
	 */
	public boolean comprobarVictoria(JUGADOR jugador) {
		// Comprobar filas
		for (int fila = 0; fila < 3; fila++) {
			if (getTablero().getCelda(fila, 0).getSimbolo() == jugador.getMarkup()
					&& tablero.getCelda(fila, 1).getSimbolo() == jugador.getMarkup()
					&& tablero.getCelda(fila, 2).getSimbolo() == jugador.getMarkup()) {
				setFinDePartida(true);
			}
		}

		// Comprobar columnas
		for (int columna = 0; columna < 3; columna++) {
			if (getTablero().getCelda(0, columna).getSimbolo() == jugador.getMarkup()
					&& tablero.getCelda(1, columna).getSimbolo() == jugador.getMarkup()
					&& tablero.getCelda(2, columna).getSimbolo() == jugador.getMarkup()) {
				setFinDePartida(true);
			}
		}

		// Comprobar diagonales
		if (getTablero().getCelda(0, 0).getSimbolo() == jugador.getMarkup()
				&& tablero.getCelda(1, 1).getSimbolo() == jugador.getMarkup()
				&& tablero.getCelda(2, 2).getSimbolo() == jugador.getMarkup()) {
			setFinDePartida(true);
		}

		if (getTablero().getCelda(2, 0).getSimbolo() == jugador.getMarkup()
				&& tablero.getCelda(1, 1).getSimbolo() == jugador.getMarkup()
				&& tablero.getCelda(0, 2).getSimbolo() == jugador.getMarkup()) {
			setFinDePartida(true);
		}
		setGanador(jugador);
		return isFinDePartida();
	}

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @return Devuelve un booleano en funcion de si todas las celdas estan
	 *         ocupadas, pero no hay un ganador, en dicho caso habria empate.
	 */
	public boolean comprobarEmpate() {
		int contadorOcupadas = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!getTablero().getCelda(i, j).isOcupada()) {
					contadorOcupadas++;
				} 
			}
		}
		if (contadorOcupadas == 9) {
			setFinDePartida(true);
		} else {
			setFinDePartida(false);
		}

		return isFinDePartida();
	}

} 