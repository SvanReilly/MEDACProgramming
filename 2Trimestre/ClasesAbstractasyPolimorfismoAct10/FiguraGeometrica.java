package ClasesAbstractasyPolimorfismoAct10;

public abstract class FiguraGeometrica {

	private double area;

	protected FiguraGeometrica(double area) {
		if (area > 0) {
			this.area = area;
		} else {
			this.area = calcArea();
		}

	}

	protected FiguraGeometrica() {
		this.area = calcArea();
	}

	public String compararArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		String resultado = "";
		if (figura1.area < figura2.area) {

			resultado = "El �rea de la figura principal es menor";
		} else if (figura1.area > figura2.area) {

			resultado = "El �rea de la figura principal es mayor";
		} else {
			resultado = "El �rea de ambas figuras es la misma";
		}
		return resultado;
	}

	public abstract double calcArea();

	public abstract double calcPerimetro();

	@Override
	public String toString() {
		return "Tu figura geom�trica tiene un �rea de : " + area + "cm. ";
	}

}
