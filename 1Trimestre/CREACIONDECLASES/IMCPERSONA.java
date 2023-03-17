package CREACIONDECLASES;

public class IMCPERSONA {

	private double peso;
	private double altura;
	private int edad;
	private String genero;
	private String DNI;
	private double IMC;

	// CONSTRUCTOR VACÍO//

	public IMCPERSONA() {
		this.peso = 0;
		this.altura = 0;
		this.edad = 0;
		this.IMC = 0;
		this.genero = "";
		this.DNI = "";

	}

	// CONSTRUCTORES CON PARÁMETROS//
	public IMCPERSONA(double peso, double altura, int edad, String genero) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.genero = genero;
		this.IMC = this.calcularIMC();
		this.DNI = this.generarDNI();

	}

	// GETTERS&SETTERS//

	public double getPeso() {
		return peso;
	}

	public boolean setPeso(double peso) {
		boolean correcto = true;
		if (peso <= 0) {
			correcto = false;
		} else {
			this.peso = peso;
			this.IMC = this.calcularIMC();
		}
		return correcto;

	}

	public double getAltura() {
		return altura;
	}

	public boolean setAltura(double altura) {
		boolean correcto = true;
		if (altura <= 0) {
			correcto = false;
		} else {
			this.altura = altura;
			this.IMC = this.calcularIMC();
		}
		return correcto;

	}

	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		boolean correcto = true;
		if (edad <= 0) {
			correcto = false;
		} else {
			this.edad = edad;
		}
		return correcto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDNI() {
		return DNI;

	}

	// SPECIFIC METHODS//

	public double calcularIMC() {
		return (this.peso / Math.pow(this.altura, 2));
	}

	public String ClasiOMS() {
		String resultado = "";
		if (this.IMC <= 18.5) {
			resultado = "Bajo peso";
		} else if (this.IMC <= 24.9) {
			resultado = "Adecuado";
		} else if (this.IMC <= 29.9) {
			resultado = "Sobrepeso";
		} else if (this.IMC <= 34.9) {
			resultado = "Obesidad grado 1";
		} else if (this.IMC <= 39.9) {
			resultado = "Obesidad grado 2";
		} else {
			resultado = "Obesidad grado 3";
		}
		return resultado;
	}

	public boolean isMayorDeEdad() {
		boolean mayoredad = false;
		if (this.edad >= 18) {
			mayoredad = true;
		} else {
			mayoredad = false;
		}
		return mayoredad;
	}

	public String generarDNI() {
		String dni = "";
		int cifrasDNI = (int) (Math.random() * 99999999 + 1000000);
		dni += cifrasDNI;
		int letraDNI = cifrasDNI % 23;
		String letrasposibles = "TRWAGMYFPDXBNJZSQVHLCKE";
		dni += letrasposibles.charAt(letraDNI);
		return dni;
	}

	public boolean comprobarSexo(String genero) {
		boolean generodef = true;
		if (!this.genero.equals(genero)) { // .equals para Strings
			generodef = false;
		}
		return generodef;
	}

	// ToSTRING

	public String toString() {

		return "La persona en cuestión pesa " + this.peso + " kg, mide " + this.altura + " metros, tiene " + this.edad
				+ " años, es " + this.genero + ", su DNI es " + this.DNI + ", \ny el valor de su IMC se sitúa en "
				+ this.calcularIMC() + " con una clasificación de la OMS de " + this.ClasiOMS();

	}

}
