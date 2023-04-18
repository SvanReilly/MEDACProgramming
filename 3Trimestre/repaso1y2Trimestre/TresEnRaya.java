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

			
			System.out.println(ANSI_RED + "THREE " + ANSI_RESET + ANSI_YELLOW + "INNA' " + ANSI_RESET + ANSI_GREEN + "ROW."
					+ ANSI_RESET);

			System.out.println("Introduzca su nombre (PJ1, marca 'X'): ");
			game.getJugador1().setName(ANSI_GREEN + sc.next() + ANSI_RESET);
			game.getJugador1().setMarkup("X");
			System.out.println("Introduzca su nombre (PJ2, marca '0'): ");
			game.getJugador2().setName(ANSI_CYAN + sc.next() + ANSI_RESET);
			game.getJugador2().setMarkup("O");
			game.setJugadorActual(game.getJugador1());
			
			 do {

				System.out.println("\nTurno de : " + game.getJugadorActual().getName());
				System.out.println(game.getTablero());

			
				System.out.println("Inserte una posicion para su marca (desde A - I): ");
				String coordenada= sc.next();
				if (!game.comprobarCeldas(coordenada)) {
					game.pedirCoordenada(coordenada, game.getJugadorActual());
					System.out.println(game.getTablero());
					game.cambiarJugador(game.getJugadorActual());
				} else {
					System.out.println(ANSI_RED +"Por favor, elija una casilla valida: " + ANSI_RESET);
				}
				

				game.comprobarEmpate();
				game.comprobarVictoria(game.getJugador1());
				game.comprobarVictoria(game.getJugador2());

			} while (game.isFinDePartida()==false);
			 
			 if (game.getGanador()!=null) {
				 System.out.println(game.getGanador().getName() + ANSI_PURPLE + " es nuestro ganador." + ANSI_RESET);
			} else {
				System.out.println(ANSI_PURPLE+ "Ha habido un empate entre estos dos titanes: " + ANSI_RESET
						+ "\n - " + game.getJugador1().getName()
						+ "\n - " + game.getJugador2().getName());
			}
			 
			
			System.out.println(ANSI_YELLOW+ "\nJugar otra partida? (Y/N): " + ANSI_RESET);
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