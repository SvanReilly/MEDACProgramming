package CREACIONDECLASES;

//Una clase para representar triángulos rectángulos.
//Perímetro y Área como métodos específicos.

//////////Constructores//////////

public class TRIANGULO {

	private double catetoA;
	private double catetoB;
	private double hipotenusa;

	/// Constructor vacío///
	public TRIANGULO() {
		this.catetoA = 1;
		this.catetoB = 1;
		this.hipotenusa = 2;

	}
	/// Constructor con parámetros///

	public TRIANGULO(double catetoA, double catetoB) { // Para calcular hipotenusa si solo se tienen 2 catetos
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.sqrt((Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2)));

	}

	// GETTERS & SETTERS//

	public double getCatetoA() {
		return this.catetoA;
	}

	public void setCatetoA(double catetoA) {
		if (catetoA > 0) {
			this.catetoA = catetoA;
		} else if (catetoA == 0) {
			this.catetoA = 1;
		}
	}

	public double getCatetoB() {
		return this.catetoB;
	}

	public void setCatetoB(double catetoB) {
		if (catetoB > 0) {
			this.catetoB = catetoB;
		} else if (catetoB == 0) {
			this.catetoB = 1;
		}
	}

	public double getHipotenusa() {
		return this.hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		if ((hipotenusa == (Math.sqrt((Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2)))))) {
			this.hipotenusa = hipotenusa;
		} else {
			this.hipotenusa = (Math.sqrt((Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2))));
		}
	}

	// SPECIFIC METHODS//

	public double CalcularArea() {
		return ((this.catetoA * this.catetoB) / 2);
	}

	public double CalcularPerimetro() {
		return (this.catetoA + this.catetoB + this.hipotenusa);
	}

	public String toString() {

		return "****************************************************************"
				+ "\nEl estado actual de los parámetros de tu triangulo es:"
				+ "\n****************************************************************" + "\nCateto A: " + this.catetoA
				+ "\nCateto B: " + this.catetoB + " \nHipotenusa: " + this.hipotenusa + " \nPerimetro: "
				+ ((this.catetoA * this.catetoB) / 2) + " \nArea: " + (this.catetoA + this.catetoB + this.hipotenusa)
				+ "\n****************************************************************";

	}
}
