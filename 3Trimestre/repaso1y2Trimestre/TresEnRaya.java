package repaso1y2Trimestre;

import java.util.Scanner;

public class TresEnRaya {
	public static void main(String[] args) {
		GAME juego = new GAME();
	
		System.out.println(juego.tablero);

		player jugadorActual = juego.jugador1;
		while (!juego.finDePartida) {
			int fila = juego.pedirCoordenada("fila");
			int columna = juego.pedirCoordenada("columna");

			if (!juego.tablero.getCelda(fila, columna).isOcupada()) {
				juego.tablero.setCelda(fila, columna, jugadorActual.getMarkup());
				System.out.println(juego.tablero);

				// Comprobar si el jugador actual ha ganado
				if (juego.comprobarVictoria(jugadorActual)) {
					juego.finDePartida = true;
					juego.ganador = jugadorActual;
				} else {
					jugadorActual = juego.cambiarJugador(jugadorActual);
				}
			} else {
				System.out.println("Esta celda ya está ocupada. Introduce otra coordenada.");
			}
		}

		if (juego.ganador != null) {
			System.out.println("¡Felicidades, " + juego.ganador.getMarkup() + "! ¡Has ganado!");
		} else {
			System.out.println("¡Empate!");
		}
	}
}
