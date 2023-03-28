package examenPolimorfismo;

public class Fraccion implements iOperable {

	private int numerador;
	private int denominador;
	private int numeroEntero;

	public Fraccion() {
		this.numerador = 2;
		this.denominador = 3;
	}

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

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

	@Override
	public void Sumar(int numeroEntero) {
		// TODO Auto-generated method stub
		 this.numerador= (numeroEntero*this.numerador) + (numeroEntero*this.numerador);
		 this.denominador= numeroEntero*this.denominador;
	}

	@Override
	public void Restar(int numeroEntero) {
		// TODO Auto-generated method stub
		 this.numerador= (numeroEntero*this.numerador) - (numeroEntero*this.numerador);
		 this.denominador= numeroEntero*this.denominador;
	}

	@Override
	public void Multiplicar(int numeroEntero) {
		// TODO Auto-generated method stub
		this.numerador = this.numerador * numeroEntero;

	}

	@Override
	public void Dividir(int numeroEntero) {
		// TODO Auto-generated method stub
		this.denominador = this.denominador * numeroEntero;
	}

}
