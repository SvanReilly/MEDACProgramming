package ClasesAbstractasyPolimorfismoAct10;

public class Cuadrado extends FiguraGeometrica {

	private double lado;

	public Cuadrado(double lado) {
		super();
		if (lado > 0) {
			this.lado = lado;
		} else {
			this.lado = 1;
		}

	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		} else {
			this.lado = 1;
		}

	}

	@Override
	public String compararArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {

		return super.compararArea(figura1, figura2);
	}

	@Override
	public double calcArea() {

		return Math.pow(lado, 2);
	}

	@Override
	public double calcPerimetro() {

		return (4 * lado);
	}

	@Override
	public String toString() {

		return super.toString() + "La figura se trata de un Cuadrado y sus medidas son:" + "\nLado: " + this.lado
				+ " \nArea: " + this.calcArea() + " \nPerimetro: " + this.calcPerimetro()
				+ "\n****************************************************************";
	}
}
