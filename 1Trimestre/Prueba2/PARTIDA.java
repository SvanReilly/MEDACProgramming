package Prueba2;

public class PARTIDA {

	private JUGADOR jugador1;
	private JUGADOR jugador2;
	private JUGADOR ganador;
	private int numRondas;

	public PARTIDA(JUGADOR jugador1, JUGADOR jugador2, int numRondas) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.ganador = new JUGADOR();
		if (numRondas <= 0) {
			this.numRondas = 1;
		} else {
			this.numRondas = numRondas;
		}
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

	public JUGADOR getGanador() {
		return ganador;
	}

	public void setGanador(JUGADOR ganador) {
		this.ganador = ganador;
	}

	public int getNumRondas() {
		return numRondas;
	}

	public boolean setNumRondas(int numRondas) {
		boolean correcto = true;
		if (numRondas <= 0) {
			correcto = false;
			this.numRondas = 1;
		} else {
			this.numRondas = numRondas;
		}
		return correcto;
	}

	public void jugar() { 
	int valordado1=0;
	int valordado2=0;
		for (int i = 1; i <=numRondas; i++) {	

			jugador1.tirarDadoJugador();
			jugador2.tirarDadoJugador();
			

			
			
		}
		if (jugador1.getPuntuacion()<jugador2.getPuntuacion()) {
			ganador=jugador2;
			
		}else {
			ganador=jugador1;
		}
	}
	
	
	public String toString() {
		return "En la partida  entre el jugador 1, de nombre " + jugador1 + ", y el jugador 2, de nombre " + jugador2 + "\n" + 
	", el ganador es:" + ganador + "con "+ ganador.getPuntuacion() + " puntos, tras "+ numRondas + " rondas de juego.";
	}

	
	
}
