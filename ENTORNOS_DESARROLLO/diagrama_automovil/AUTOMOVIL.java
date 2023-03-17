package diagrama_automovil;

public class AUTOMOVIL {

	public PERSONA dueño;
	PUERTA derecha;
	PUERTA izquierda;
	MOTOR motor;

	public AUTOMOVIL() {
		dueño = new PERSONA();
		derecha = new PUERTA();
		izquierda = new PUERTA();
		motor = new MOTOR();
	}
	
	public AUTOMOVIL(PERSONA dueño, PUERTA derecha, PUERTA izquierda, MOTOR motor) {
		this.dueño = dueño;
		this.derecha = derecha;
		this.izquierda = izquierda;
		this.motor = motor;
	}

	public void abrirCerrarPuertaIzquierda() {
		izquierda.abrirCerrar();

	}

	public void abrirCerrarPuertaDerecha() {
		derecha.abrirCerrar();

	}

	public void abrirCerrarVentanaIzquierda() {
		izquierda.ventana.abrirCerrar();

	}

	public void abrirCerrarVentanaDerecha() {
		derecha.ventana.abrirCerrar();

	}

	public void arrancarApagarMoto() {
		motor.encenderApagar();

	}

	public String toString() {

		return ("El dueño del automóvil es: " + dueño.getNombre() + 
				"\nLa puerta derecha está " + derecha.isAbierta() +
				" y la puerta izquierda está " + izquierda.isAbierta() + 
				"\nmotor=" + motor.isEncendido() + 
				"\nla ventanilla derecha está: " + derecha.ventana.isAbierta() + 
				"\nla ventanilla izquierda está:" + izquierda.ventana.isAbierta());
	}

}
