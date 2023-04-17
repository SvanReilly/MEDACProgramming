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
		
		JUGADOR jugador1= new JUGADOR();
		game.setJugador1(jugador1);
		
		JUGADOR jugador2= new JUGADOR();
		game.setJugador2(jugador2);

		System.out.println(ANSI_RED + "THREE " + ANSI_RESET 
				+ ANSI_YELLOW + "INNA' " + ANSI_RESET 
				+ ANSI_GREEN + "ROW." + ANSI_RESET);
		
		System.out.println("Introduzca su nombre (PJ1, marca 'X'): ");
		game.getJugador1().setName(ANSI_GREEN + sc.next() + ANSI_RESET);

		System.out.println("Introduzca su nombre (PJ2, marca '0'): ");
		game.getJugador2().setName(ANSI_CYAN + sc.next() + ANSI_RESET);

		System.out.println(game.getTablero());
		JUGADOR jugadorActual = game.getJugador1();
		
		String coordenada;
		


			do {

			System.out.println("Inserte un caracter de posicion (de 'a' hasta 'i'): ");
			coordenada = sc.next();
			game.pedirCoordenada(coordenada, jugadorActual);


			if(!game.pedirCoordenada(coordenada, jugadorActual)) {
				System.out.println("Esa celda esta ocupada elija otra, por favor: ");
				coordenada = sc.next();
				game.comprobarCeldas(coordenada);

			} else {
				game.cambiarJugador(jugadorActual);
			}

			// Comprobar si el jugador actual ha ganado
			if (game.comprobarVictoria(jugadorActual) == true) {
				game.setFinDePartida(true);
				game.setGanador(jugadorActual);
			} else {
				jugadorActual = game.cambiarJugador(jugadorActual);
				game.comprobarVictoria(jugadorActual);
				game.setFinDePartida(true);
				game.setGanador(jugadorActual);
			}

		} while (!game.isFinDePartida());
		


	}
}

// probar pedir coordenadas nuevo

// int fila = juego.pedirCoordenada1("fila");
// int columna = juego.pedirCoordenada1("columna");


 

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
