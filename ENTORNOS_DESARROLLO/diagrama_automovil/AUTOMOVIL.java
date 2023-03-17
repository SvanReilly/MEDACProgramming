package diagrama_automovil;

public class AUTOMOVIL {

	public PERSONA due�o;
	PUERTA derecha;
	PUERTA izquierda;
	MOTOR motor;

	public AUTOMOVIL() {
		due�o = new PERSONA();
		derecha = new PUERTA();
		izquierda = new PUERTA();
		motor = new MOTOR();
	}
	
	public AUTOMOVIL(PERSONA due�o, PUERTA derecha, PUERTA izquierda, MOTOR motor) {
		this.due�o = due�o;
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

		return ("El due�o del autom�vil es: " + due�o.getNombre() + 
				"\nLa puerta derecha est� " + derecha.isAbierta() +
				" y la puerta izquierda est� " + izquierda.isAbierta() + 
				"\nmotor=" + motor.isEncendido() + 
				"\nla ventanilla derecha est�: " + derecha.ventana.isAbierta() + 
				"\nla ventanilla izquierda est�:" + izquierda.ventana.isAbierta());
	}

}
