package ClasesAbstractasyPolimorfismoAct10;

public class Rectangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super();
		if (base > 0) {
			this.base = base;
		} else {
			this.base = 1;
		}
		if (altura > 0) {
			this.altura = altura;
		} else {
			this.altura = 1;
		}

	}

	public Rectangulo() {
		super();
		this.base = 1;
		this.altura = 2;

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		} else {
			this.base = 1;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			this.altura = 1;
		}
		this.altura = altura;
	}

	@Override
	public String compararArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {

		return super.compararArea(figura1, figura2);
	}

	@Override
	public double calcArea() {

		return (this.base * this.altura);
	}

	@Override
	public double calcPerimetro() {

		return ((2 * base) + (2 * altura));
	}

	@Override
	public String toString() {

		return super.toString() + "La figura se trata de un Rect�ngulo y sus medidas son:" + "\nBase: " + this.base
				+ "\nAltura: " + this.altura + " \nArea: " + this.calcArea() + " \nPerimetro: " + this.calcPerimetro()
				+ "\n****************************************************************";
	}

}
