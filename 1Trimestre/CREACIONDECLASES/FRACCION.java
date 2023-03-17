package CREACIONDECLASES;

public class FRACCION {

	private int numerador;
	private int denominador;

	// CONSTRUCTOR VACÍO//
	public FRACCION() {
		this.numerador = 1;
		this.denominador = 1;

	}

	// CONSTRUCTOR CON PARÁMETROS//
	public FRACCION(int numerador, int denominador) {

		this.numerador = numerador;
		this.denominador = denominador;
	}

	// GETTERS AND SETTERS//

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	// SPECIFICS METHODS//

	public FRACCION Sumar(FRACCION fraccion) {
		int denominador2 = this.denominador * fraccion.denominador;
		int numerador2 = this.numerador * fraccion.denominador;
		int numerador3 = this.denominador * fraccion.numerador;

		return new FRACCION(numerador2 + numerador3, denominador2);
	}

	public FRACCION Restar(FRACCION fraccion) {
		int denominador2 = this.denominador * fraccion.denominador;
		int numerador2 = this.numerador * fraccion.denominador;
		int numerador3 = this.denominador * fraccion.numerador;

		return new FRACCION(numerador2 - numerador3, denominador2);
	}

	public FRACCION Multiplicar(FRACCION fraccion) {
		int nuevoNumerador = this.numerador * fraccion.numerador;
		int nuevoDenominador = this.denominador * fraccion.denominador;

		return new FRACCION(nuevoNumerador, nuevoDenominador);

	}

	public FRACCION Dividir(FRACCION fraccion) {
		int nuevoNumerador = this.numerador * fraccion.denominador;
		int nuevoDenominador = this.denominador * fraccion.numerador;

		return new FRACCION(nuevoNumerador, nuevoDenominador);
	}

	public void Simplificar() {
		// PENDIENTE//

	}

	public String toString() {
		return this.numerador + "/" + this.denominador;
	}

}
