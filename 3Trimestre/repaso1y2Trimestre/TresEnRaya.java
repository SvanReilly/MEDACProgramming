package repaso1y2Trimestre;

/**
 * @author Alejandro Ortega Maldonado
 * @author Aaron Rodriguez Gonzalez
 * @version 1.0
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

		

		GAME juego = new GAME();

		System.out.println(juego.getTablero());

		
		JUGADOR jugadorActual = juego.getJugador1();
		while (!juego.isFinDePartida()) {
			int fila = juego.pedirCoordenada("fila");
			int columna = juego.pedirCoordenada("columna");

			if (!juego.getTablero().getCelda(fila, columna).isOcupada()) {
				juego.getTablero().setCelda(fila, columna, jugadorActual.getMarkup());
				System.out.println(juego.getTablero());

				// Comprobar si el jugador actual ha ganado
				if (juego.comprobarVictoria(jugadorActual)) {
					juego.setFinDePartida(true);
					juego.setGanador(jugadorActual);
				} else {
					jugadorActual = juego.cambiarJugador(jugadorActual);
				}
			} else {
				System.out.println("Esta celda ya esta ocupada. Introduce otra coordenada.");
			}
		}

		if (juego.getGanador() != null) {
			System.out.println("Felicidades, " + juego.getGanador().getName() + " con la marca (" + juego.getGanador().getMarkup() + ") has ganado.");
		} else {
			System.out.println("Empate de" + juego.getJugador1().getName());
		}
	} 
} 
