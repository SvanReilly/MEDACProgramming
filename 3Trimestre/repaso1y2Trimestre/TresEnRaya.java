package repaso1y2Trimestre;

import java.util.Scanner;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
 * 
 * 
 * @param juego
 * @param jugadorActual
 * @param fila
 * @param columna
 * 
 * @see repaso1y2Trimestre.CELDA
 * @see repaso1y2Trimestre.GAME
 * @see repaso1y2Trimestre.JUGADOR
 * @see repaso1y2Trimestre.TABLERO
 *
 */
public class TresEnRaya {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GAME juego = new GAME();

		System.out.println(juego.getTablero());

		JUGADOR jugadorActual = juego.getJugador1();
		char coordenada;

		do {

			System.out.println("Inserte un caracter de posicion (de 'a' hasta 'i'): ");
			coordenada = sc.next().charAt(0);
			juego.comprobarCeldas(coordenada);

			do {
				System.out.println("Esa celda esta ocupada elija otra, por favor: ");
				coordenada = sc.next().charAt(0);
				juego.comprobarCeldas(coordenada);

			} while (!juego.pedirCoordenada(coordenada, jugadorActual));

			// Comprobar si el jugador actual ha ganado
			if (juego.comprobarVictoria(jugadorActual) == true) {
				juego.setFinDePartida(true);
				juego.setGanador(jugadorActual);
			} else {
				jugadorActual = juego.cambiarJugador(jugadorActual);
				juego.comprobarVictoria(jugadorActual);
				juego.setFinDePartida(true);
				juego.setGanador(jugadorActual);
			}

		} while (!juego.isFinDePartida());

	}
}

// probar pedir coordenadas nuevo

// int fila = juego.pedirCoordenada1("fila");
// int columna = juego.pedirCoordenada1("columna");

/*
 * 
 */

/*
 * System.out.println(juego.getTablero());
 * 
 * 
 * }
 * 
 * 
 * if (juego.getGanador() != null) { System.out.println("Felicidades, " +
 * juego.getGanador().getName() + " con la marca (" +
 * juego.getGanador().getMarkup() + ") has ganado."); } else if
 * (juego.getGanador()==null) { System.out.println("Empate de" +
 * juego.getJugador1().getName() + " y " + juego.getJugador2().getName()); } } }
 * 
 */
