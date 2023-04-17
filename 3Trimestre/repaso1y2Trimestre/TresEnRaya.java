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
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_BLACK = "\u001B[30m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_BLUE = "\u001B[34m";
		final String ANSI_PURPLE = "\u001B[35m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_WHITE = "\u001B[37m";
		Scanner sc = new Scanner(System.in);
		GAME game = new GAME();

		TABLERO tablero = new TABLERO();
		game.setTablero(tablero);
		

		JUGADOR jugador1 = new JUGADOR();
		game.setJugador1(jugador1);

		JUGADOR jugador2 = new JUGADOR();
		game.setJugador2(jugador2);
		
		JUGADOR jugadorActual = game.getJugador1();

		JUGADOR ganador = new JUGADOR();
		game.setGanador(null);

		

		System.out.println(ANSI_RED + "THREE " + ANSI_RESET + ANSI_YELLOW + "INNA' " + ANSI_RESET + ANSI_GREEN + "ROW."
				+ ANSI_RESET);

		System.out.println("Introduzca su nombre (PJ1, marca 'X'): ");
		game.getJugador1().setName(ANSI_GREEN + sc.next() + ANSI_RESET);
		game.getJugador1().setMarkup(jugador1);
		System.out.println("Introduzca su nombre (PJ2, marca '0'): ");
		game.getJugador2().setName(ANSI_CYAN + sc.next() + ANSI_RESET);
		game.getJugador2().setMarkup(jugador1);

	

		String coordenada;
		
		do {
			
			System.out.println(game.getTablero());
			
			
			System.out.println("Inserte una posicion para su marca "
					+ "\n(a, b, c,"
					+ "\nd, e , f,"
					+ "\ng, h, i");
			game.pedirCoordenada(sc.next(), jugadorActual);
			System.out.println(jugadorActual.getName());
			
			
			game.cambiarJugador(game.getJugador1());
			
			game.comprobarEmpate();
			game.comprobarVictoria(jugadorActual);
			
			
		} while (!game.isFinDePartida());

		jugadorActual = game.cambiarJugador(game.getJugador1());
		
		
		
		
		System.out.println(jugadorActual.getName());
		/*	do {
			System.out.println(game.getTablero());
			game.comprobarVictoria(jugadorActual);
			game.comprobarEmpate();

			System.out.println("Turno de: " + jugadorActual.getName() + ". \n"
					+ "Inserte un caracter de posicion (de 'a' hasta 'i'): ");
			coordenada = sc.next().toUpperCase();
			game.pedirCoordenada(coordenada, jugadorActual);

			if (!game.comprobarCeldas(coordenada)) {
				System.out.println("Esa celda esta ocupada elija otra, por favor: ");
				coordenada = sc.next();
				game.comprobarCeldas(coordenada);

			} else {
				game.cambiarJugador(jugadorActual);

			}

		} while (!game.isFinDePartida());

		if (game.comprobarEmpate()) {
			System.out.println(game.getJugador1().getName() + " y " + game.getJugador2().getName() + " han empatado");
		} else if (game.comprobarVictoria(jugadorActual)) {
			System.out.println(game.getGanador().getName() + " ha ganado la partida.");
		}
*/
	}
}
