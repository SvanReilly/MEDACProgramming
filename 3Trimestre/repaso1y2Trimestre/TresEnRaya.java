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
	
		boolean playAgain = true;
		String playAgainAnswer = "";
		
		do {

			
			GAME game = new GAME();

			TABLERO tablero = game.getTablero();

			JUGADOR jugador1 = game.getJugador1();
			JUGADOR jugador2 = game.getJugador2();
			JUGADOR jActual = game.getJugadorActual();
			JUGADOR ganador = game.getGanador();
		



			System.out.println(ANSI_RED + "THREE " + ANSI_RESET + ANSI_YELLOW + "INNA' " + ANSI_RESET + ANSI_GREEN + "ROW."
					+ ANSI_RESET);

			System.out.println("Introduzca su nombre (PJ1, marca 'X'): ");
			jugador1.setName(ANSI_GREEN + sc.next() + ANSI_RESET);
			jugador1.setMarkup("X");
			System.out.println("Introduzca su nombre (PJ2, marca '0'): ");
			jugador2.setName(ANSI_CYAN + sc.next() + ANSI_RESET);
			jugador2.setMarkup("O");

			while (game.isFinDePartida()) {
				String coordenada;
				System.out.println(game.getTablero());

				System.out.println("Inserte una posicion para su marca (desde A - I): ");
				game.pedirCoordenada(sc.next(), jActual);
				System.out.println(jActual.getName());

				game.cambiarJugador(game.getJugador1());

				game.comprobarEmpate();
				game.comprobarVictoria(jActual);

			}

			
			System.out.println("\nJugar otra partida? (Y/N): ");
			playAgainAnswer = sc.next();
			
			switch (playAgainAnswer.toUpperCase()) {
				case "Y":
					playAgain=true;
					break;
				case "N":
					playAgain=false;
					break;
				default:
					playAgain=true;
					break;
			}

		} while (playAgain == true);

		System.out.println("\nLa partida se ha terminado, saliendo del juego.");

	}
}



/*
 * do { System.out.println(game.getTablero());
 * game.comprobarVictoria(jugadorActual); game.comprobarEmpate();
 * 
 * System.out.println("Turno de: " + jugadorActual.getName() + ". \n" +
 * "Inserte un caracter de posicion (de 'a' hasta 'i'): "); coordenada =
 * sc.next().toUpperCase(); game.pedirCoordenada(coordenada, jugadorActual);
 * 
 * if (!game.comprobarCeldas(coordenada)) {
 * System.out.println("Esa celda esta ocupada elija otra, por favor: ");
 * coordenada = sc.next(); game.comprobarCeldas(coordenada);
 * 
 * } else { game.cambiarJugador(jugadorActual);
 * 
 * }
 * 
 * } while (!game.isFinDePartida());
 * 
 * if (game.comprobarEmpate()) { System.out.println(game.getJugador1().getName()
 * + " y " + game.getJugador2().getName() + " han empatado"); } else if
 * (game.comprobarVictoria(jugadorActual)) {
 * System.out.println(game.getGanador().getName() + " ha ganado la partida."); }
 */