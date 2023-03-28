package diagrama_automovil;

public class AUTOMOVIL {

	public PERSONA dueno;
	PUERTA derecha;
	PUERTA izquierda;
	MOTOR motor;

	public AUTOMOVIL() {
		dueno = new PERSONA();
		derecha = new PUERTA();
		izquierda = new PUERTA();
		motor = new MOTOR();
	}
	
	public AUTOMOVIL(PERSONA dueno, PUERTA derecha, PUERTA izquierda, MOTOR motor) {
		this.dueno = dueno;
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

		return ("El dueno del automovil es: " + dueno.getNombre() + 
				"\nLa puerta derecha esta " + derecha.isAbierta() +
				" y la puerta izquierda esta " + izquierda.isAbierta() + 
				"\nmotor=" + motor.isEncendido() + 
				"\nla ventanilla derecha est�: " + derecha.ventana.isAbierta() + 
				"\nla ventanilla izquierda est�:" + izquierda.ventana.isAbierta());
	}

}
