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
 * @param coordenada
 * 
 * @see repaso1y2Trimestre.CELDA
 * @see repaso1y2Trimestre.GAME
 * @see repaso1y2Trimestre.JUGADOR
 * @see repaso1y2Trimestre.TABLERO
 *
 */
public class TESTMAIN {
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
		final String ANSI_LIGHT_YELLOW = "\u001B[93m";
		final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		final String ANSI_BOLD = "\u001B[1m";
		final String ANSI_UNBOLD = "\u001B[21m";
		final String ANSI_UNDERLINE = "\u001B[4m";
		final String ANSI_STOP_UNDERLINE = "\u001B[24m";
		final String ANSI_BLINK = "\u001B[5m";
		
		final String ANSI_LIGHT_BLUE =  "\033[1;34m";
		final String ANSI_LIGHT_CYAN  = "\033[1;36m";
		final String ANSI_LIGHT_GREEN  = "\033[1;32m";
		final String ANSI_LIGHT_PURPLE  = "\033[1;35m";
		final String ANSI_LIGHT_RED =  "\033[1;31m";
		final String ANSI_BROWN = "\033[0;33m";
		final String ANSI_GRAY =  "\033[0;37m";
		Scanner sc = new Scanner(System.in);

		boolean playAgain = true;
		String playAgainAnswer;
		String namePJ1, namePJ2;

		do {

			GAME game = new GAME();

			System.out.println(ANSI_RED + "THREE " + ANSI_RESET + ANSI_YELLOW + "INNA' " + ANSI_RESET + ANSI_GREEN
					+ "ROW.\n" + ANSI_RESET);
			do {
				System.out.println(ANSI_LIGHT_GREEN + ANSI_UNDERLINE + "Introduzca su nombre PJ1 (marca 'X'):" + ANSI_STOP_UNDERLINE + ANSI_RESET);
				namePJ1=sc.nextLine().toUpperCase();
				if (namePJ1.length() < 4) {
					System.out.println(ANSI_BOLD+"Por favor, minimo 4 caracteres"+ANSI_RESET);
				}
			} while (namePJ1.length() < 4);
			
			game.getJugador1().setName(ANSI_GREEN + namePJ1 + ANSI_RESET);
			game.getJugador1().setMarkup(ANSI_LIGHT_GREEN+"X"+ ANSI_RESET);
			
			do {
				System.out.println(ANSI_LIGHT_CYAN + "Introduzca su nombre PJ2 (marca 'O'): " + ANSI_RESET);
				namePJ2=sc.nextLine().toUpperCase();
				if (namePJ2.length() < 4) {
					System.out.println(ANSI_BOLD+ "Por favor, minimo 4 caracteres" + ANSI_RESET);
				}

			} while (namePJ2.length() < 4);
			
			game.getJugador2().setName(ANSI_CYAN + namePJ2 + ANSI_RESET);
			game.getJugador2().setMarkup(ANSI_LIGHT_CYAN + "O" + ANSI_RESET);
			
			
			
			game.setJugadorActual(game.getJugador1());
			
			do {

				System.out.println("\nTurno de : " + game.getJugadorActual().getName());
				System.out.println(game.getTablero());

				System.out.println(ANSI_BLINK + "Inserte una posicion para su marca (desde A - I): " + ANSI_RESET);
				String coordenada = sc.next();
				if (!game.comprobarCeldas(coordenada)) {
					game.pedirCoordenada(coordenada, game.getJugadorActual());

					game.cambiarJugador(game.getJugadorActual());
				} else {
					System.out.println(ANSI_RED + "Por favor, elija una casilla valida: " + ANSI_RESET);
				}

				game.comprobarEmpate();
				game.comprobarVictoria(game.getJugador1());
				game.comprobarVictoria(game.getJugador2());

			} while (game.isFinDePartida() == false);

			if (game.getGanador() != null) {
				System.out.println("\n\n\n\n\n\n\n\n"+ANSI_UNDERLINE + game.getGanador().getName() + ANSI_STOP_UNDERLINE + ANSI_PURPLE + " es nuestro ganador." + ANSI_RESET );
			} else {
				System.out.println(ANSI_LIGHT_PURPLE + "\n\n\n\n\n\n\n\n\nHa habido un empate entre estos dos titanes: " + ANSI_RESET + "\n - "
						+ game.getJugador1().getName() + "\n - " + game.getJugador2().getName());
			}

			System.out.println(ANSI_UNDERLINE+ ANSI_YELLOW + "\nJugar otra partida? (Y/N): " + ANSI_RESET + ANSI_STOP_UNDERLINE);
			playAgainAnswer = sc.next();

			switch (playAgainAnswer.toUpperCase()) {
			case "Y":
				playAgain = true;
				namePJ1= "a";
				namePJ2= "b";
				break;
			case "N":
				playAgain = false;
				break;
			default:
				playAgain = true;
				break;
			}

		} while (playAgain == true);

		System.out.println("\nLa partida se ha terminado, saliendo del juego.");

	}
}


