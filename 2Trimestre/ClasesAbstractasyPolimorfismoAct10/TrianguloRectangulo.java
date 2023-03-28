package ClasesAbstractasyPolimorfismoAct10;

public class TrianguloRectangulo extends FiguraGeometrica {

	private double catetoA;
	private double catetoB;
	private double hipotenusa;

	protected TrianguloRectangulo(double catetoA, double catetoB, double hipotenusa) {
		super();
		if (catetoA > 0) {
			this.catetoA = catetoA;
		} else if (catetoA == 0) {
			this.catetoA = 1;
		}

		if (catetoB > 0) {
			this.catetoB = catetoB;
		} else if (catetoB == 0) {
			this.catetoB = 1;
		}
		if ((hipotenusa == (Math.sqrt((Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2)))))) {
			this.hipotenusa = hipotenusa;
		} else {
			this.hipotenusa = (Math.sqrt((Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2))));
		}

	}

	// GETTERS & SETTERS//

	public double getCatetoA() {
		return this.catetoA;
	}

	public void setCatetoA(double catetoA) {
		if (catetoA > 0) {
			this.catetoA = catetoA;
		} else {
			this.catetoA = 1;
		}
	}

	public double getCatetoB() {
		return this.catetoB;
	}

	public void setCatetoB(double catetoB) {
		if (catetoB > 0) {
			this.catetoB = catetoB;
		} else {
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

	@Override
	public String compararArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		return super.compararArea(figura1, figura2);
	}

	@Override
	public double calcArea() {

		return ((this.catetoA * this.catetoB) / 2);
	}

	@Override
	public double calcPerimetro() {

		return (this.catetoA+this.catetoB+this.hipotenusa);
	}

	@Override
	public String toString() {

		return super.toString() + "La figura se trata de un Tri�ngulo rect�ngulo y sus medidas son:" + "\nCateto A: "
				+ this.catetoA + "\nCateto B: " + this.catetoB + " \nHipotenusa: " + this.hipotenusa + " \nArea: "
				+ this.calcArea() + " \nPerimetro: " + this.calcPerimetro()
				+ "\n****************************************************************";

	}

}
