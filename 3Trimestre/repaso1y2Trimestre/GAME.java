package repaso1y2Trimestre;

import java.util.Scanner;

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
	private boolean finDePartida;
	private JUGADOR ganador;

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.1
	 * @param jugador1 se inicializa en el constructor vac�o con un nombre (Jugador 1) y marca por defecto (X).
	 * @param jugador2 se inicializa en el constructor vac�o con un nombre (Jugador 2) y marca por defecto (O).
	 */
	public GAME() {
		this.tablero = new TABLERO();
		this.jugador1 = new JUGADOR("Jugador 1", 'X');
		this.jugador2 = new JUGADOR("Jugador 2", 'O');
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
	 * @param DeployedBoard es un String inicializado vac�o
	 * @return Devolver� la coordenada insertada de la fila o la columna
	 * @see repaso1y2Trimestre.TresEnRaya;
	 */
	public int pedirCoordenada(String tipo) {
		System.out.println("Introduce la " + tipo + " (0-2): ");
		Scanner sc = new Scanner(System.in);
		int coordenada = sc.nextInt();
		while (coordenada < 0 || coordenada > 2) {
			System.out.println("Coordenada no v�lida. Introduce la " + tipo + " (0-2): ");
			coordenada = sc.nextInt();
		}
		return coordenada;
	}

	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param jugadorActual 
	 * @return Devolver� al jugador1 o jugador2 dependiendo de cual tenga asignado previamente.
	 */
	public JUGADOR cambiarJugador(JUGADOR jugadorActual) {
		if (jugadorActual == this.jugador1) {
			return this.jugador2;
		} else {
			return this.jugador1;
		}
	}
	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @param jugador
	 * @return Devolver� un booleano si la partida ha terminado por victoria de algun jugador
	 */
	public boolean comprobarVictoria(JUGADOR jugador) {
	    // Comprobar filas
	    for (int fila = 0; fila < 3; fila++) {
	        if (tablero.getCelda(fila, 0).getSimbolo() == jugador.getMarkup() &&
	            tablero.getCelda(fila, 1).getSimbolo() == jugador.getMarkup() &&
	            tablero.getCelda(fila, 2).getSimbolo() == jugador.getMarkup()) {
	            return true;
	        }
	    }
	    
	    // Comprobar columnas
	    for (int columna = 0; columna < 3; columna++) {
	        if (tablero.getCelda(0, columna).getSimbolo() == jugador.getMarkup() &&
	            tablero.getCelda(1, columna).getSimbolo() == jugador.getMarkup() &&
	            tablero.getCelda(2, columna).getSimbolo() == jugador.getMarkup()) {
	            return true;
	        }
	    }
	    
	    // Comprobar diagonales
	    if (tablero.getCelda(0, 0).getSimbolo() == jugador.getMarkup() &&
	        tablero.getCelda(1, 1).getSimbolo() == jugador.getMarkup() &&
	        tablero.getCelda(2, 2).getSimbolo() == jugador.getMarkup()) {
	        return true;
	    }
	    
	    if (tablero.getCelda(2, 0).getSimbolo() == jugador.getMarkup() &&
	        tablero.getCelda(1, 1).getSimbolo() == jugador.getMarkup() &&
	        tablero.getCelda(0, 2).getSimbolo() == jugador.getMarkup()) {
	        return true;
	    }
	    
	    return finDePartida;
	}
	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.0
	 * @return Devuelve un booleano en funcion de si todas las celdas est�n ocupadas, pero no hay un ganador, en dicho caso habr�a empate.
	 */
	public boolean comprobarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!this.tablero.getCelda(i, j).isOcupada()) {
					// Todav�a hay celdas vac�as, por lo que no hay empate.
					return false;
				}
			}
		}
		
		return true;
	}
	/**
	 * @author Alejandro Ortega Maldonado
	 * @version 1.3
	 * @param fila para la coordenada de la i en el for del tablero
	 * @param columna para la coordenada de la j en el for del tablero.
	 * @param jugadorActual para almacenar la informaci�n del jugador que le toca jugar en cada turno.
	 * 
	 */
	public void empezarPartida() {
		int fila, columna;
		JUGADOR jugadorActual = this.jugador1;
		while (!this.finDePartida) {
			System.out.println(this.tablero);
			System.out.println("Turno del jugador " + jugadorActual.getMarkup());
			fila = pedirCoordenada("fila");
			columna = pedirCoordenada("columna");
			while (this.tablero.getCelda(fila, columna).isOcupada()) {
				System.out.println("La celda est� ocupada. Introduce otra coordenada.");
				fila = pedirCoordenada("fila");
				columna = pedirCoordenada("columna");
			}
			this.tablero.setCelda(fila, columna, jugadorActual.getMarkup());
			if (comprobarVictoria(jugadorActual)) {
				System.out.println(this.tablero);
				System.out.println("�Ha ganado el jugador " + jugadorActual.getName() +  jugadorActual.getMarkup() + "!");
				this.finDePartida = true;
				this.ganador = jugadorActual;
			} else if (comprobarEmpate()) {
				System.out.println(this.tablero);
				System.out.println("�Empate!");
				this.finDePartida = true;
			} else {
				jugadorActual = cambiarJugador(jugadorActual);
			}
		}
	}
}