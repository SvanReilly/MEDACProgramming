package ClasesAbstractasyPolimorfismoAct10;

public abstract class FiguraGeométrica {

	private double area;

	protected FiguraGeométrica(double area) {
		if (area > 0) {
			this.area = area;
		} else {
			this.area = calcArea();
		}

	}

	protected FiguraGeométrica() {
		this.area = calcArea();
	}

	public String compararArea(FiguraGeométrica figura1, FiguraGeométrica figura2) {
		String resultado = "";
		if (figura1.area < figura2.area) {

			resultado = "El área de la figura principal es menor";
		} else if (figura1.area > figura2.area) {

			resultado = "El área de la figura principal es mayor";
		} else {
			resultado = "El área de ambas figuras es la misma";
		}
		return resultado;
	}

	public abstract double calcArea();

	public abstract double calcPerimetro();

	@Override
	public String toString() {
		return "Tu figura geométrica tiene un área de : " + area + "cm. ";
	}

}
