package Prueba2;

public class JUGADOR {
//nombre y un dado)
	
	private String nombre;
	private DADOS dado;
	private int puntuacion;
	
	
	public JUGADOR() {
		this.nombre="";
		this.dado= new DADOS();
		this.puntuacion=0;
	}
	
	public JUGADOR(String nombre, DADOS dado, int puntuacion) {
		this.nombre="";
		this.dado= new DADOS();
		this.puntuacion=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DADOS getDado() {
		return dado;
	}

	public void setDado(DADOS dado) {
		this.dado = dado;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public boolean setPuntuacion(int puntuacion) { // filtro al set para que la puntuación se mantenga siempre por encima de cero
		boolean correcto=true;
		if (puntuacion<0) {
			correcto=false;
			this.puntuacion=0;
		}else {
			this.puntuacion = puntuacion;
		}
		return correcto;
	}
	
	//Método tirar dado del jugador//
	public void tirarDadoJugador() {
		this.puntuacion+=this.dado.tirarDado();
		
	}

	//toString//
	public String toString() {
		return "El nombre del jugador:" + nombre + 
				" \ncon un dado con las siguientes características:" + dado + 
				"\ntiene una puntuación de " + puntuacion + "puntos";
	
	}
	
	
	
	
	
}
