package CLASE_SUPERHEROE;

public class DIMENSIONES {

	private double alto, ancho, profundidad;
	private SUPERHEROE superheroe;

	public DIMENSIONES() {
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
		this.superheroe = new SUPERHEROE();

	}

	public DIMENSIONES(double alto, double ancho, double profundidad, SUPERHEROE superheroe) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.superheroe = superheroe;
	}

	public double getAlto() {
		return alto;
	}

	public boolean setAlto(double alto) {
		boolean correcto = true;
		if (alto < 0) {
			correcto = false;
		} else {
			this.alto = alto;
		}

		return correcto;
	}

	public double getAncho() {
		return ancho;
	}

	public boolean setAncho(double ancho) {
		boolean correcto = true;
		if (ancho < 0) {
			correcto = false;
		} else {
			this.ancho = ancho;
		}

		return correcto;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public boolean setProfundidad(double profundidad) {
		boolean correcto = true;
		if (profundidad < 0) {
			correcto = false;
		} else {
			this.profundidad = profundidad;
		}

		return correcto;
	}

	public double getVolumen() {
		return (this.ancho * this.alto * this.profundidad);
	}

	public String toString() {
		return "Las dimensiones de " + this.superheroe.getNombre() + " son " + this.alto + " cm de alto, " + this.ancho
				+ " cm de ancho y " + this.profundidad + " cm de profundidad. "
				+ "\nEl volumen máximo de la figura es de: " + getVolumen() + " cm^3.";
	}

}
