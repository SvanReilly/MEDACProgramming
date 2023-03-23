package repaso1y2Trimestre;

public class TresEnRaya {
	public static void main(String[] args) {

		TABLERO tablero = new TABLERO();
		JUGADOR jugador1 = new JUGADOR();
		JUGADOR jugador2 = new JUGADOR();
		boolean finDePartida = false;
		JUGADOR ganador = new JUGADOR();

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
				System.out.println("Esta celda ya está ocupada. Introduce otra coordenada.");
			}
		}

		if (juego.getGanador() != null) {
			System.out.println("¡Felicidades, " + juego.getGanador().getMarkup() + "! ¡Has ganado!");
		} else {
			System.out.println("¡Empate!");
		}
	}
}
