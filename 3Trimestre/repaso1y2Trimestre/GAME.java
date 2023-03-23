package repaso1y2Trimestre;

import java.util.Scanner;

public class GAME {

	private TABLERO tablero;
	private JUGADOR jugador1;
	private JUGADOR jugador2;
	private boolean finDePartida;
	private JUGADOR ganador;

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

	public int pedirCoordenada(String tipo) {
		System.out.println("Introduce la " + tipo + " (0-2): ");
		Scanner scanner = new Scanner(System.in);
		int coordenada = scanner.nextInt();
		while (coordenada < 0 || coordenada > 2) {
			System.out.println("Coordenada no válida. Introduce la " + tipo + " (0-2): ");
			coordenada = scanner.nextInt();
		}
		return coordenada;
	}

	public JUGADOR cambiarJugador(JUGADOR jugadorActual) {
		if (jugadorActual == this.jugador1) {
			return this.jugador2;
		} else {
			return this.jugador1;
		}
	}

	public boolean comprobarVictoria(JUGADOR jugador) {
		// Comprobar filas
		for (int i = 0; i < 3; i++) {
			if (this.tablero.getCelda(i, 0).getSimbolo() == jugador.getMarkup()
					&& this.tablero.getCelda(i, 1).getSimbolo() == jugador.getMarkup()
					&& this.tablero.getCelda(i, 2).getSimbolo() == jugador.getMarkup()) {
				return true;
			}
		}
		// Comprobar columnas
		for (int j = 0; j < 3; j++) {
			if (this.tablero.getCelda(0, j).getSimbolo() == jugador.getMarkup()
					&& this.tablero.getCelda(1, j).getSimbolo() == jugador.getMarkup()
					&& this.tablero.getCelda(2, j).getSimbolo() == jugador.getMarkup()) {
				return true;
			}

		}
		return finDePartida;
	}

	public boolean comprobarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!this.tablero.getCelda(i, j).isOcupada()) {
					// Todavía hay celdas vacías, por lo que no hay empate.
					return false;
				}
			}
		}
		// Todas las celdas están ocupadas, pero no hay un ganador, por lo que hay
		// empate.
		return true;
	}

	public void empezarPartida() {
		int fila, columna;
		JUGADOR jugadorActual = this.jugador1;
		while (!this.finDePartida) {
			System.out.println(this.tablero);
			System.out.println("Turno del jugador " + jugadorActual.getMarkup());
			fila = pedirCoordenada("fila");
			columna = pedirCoordenada("columna");
			while (this.tablero.getCelda(fila, columna).isOcupada()) {
				System.out.println("La celda está ocupada. Introduce otra coordenada.");
				fila = pedirCoordenada("fila");
				columna = pedirCoordenada("columna");
			}
			this.tablero.setCelda(fila, columna, jugadorActual.getMarkup());
			if (comprobarVictoria(jugadorActual)) {
				System.out.println(this.tablero);
				System.out.println("¡Ha ganado el jugador " + jugadorActual.getMarkup() + "!");
				this.finDePartida = true;
				this.ganador = jugadorActual;
			} else if (comprobarEmpate()) {
				System.out.println(this.tablero);
				System.out.println("¡Empate!");
				this.finDePartida = true;
			} else {
				jugadorActual = cambiarJugador(jugadorActual);
			}
		}
	}
}