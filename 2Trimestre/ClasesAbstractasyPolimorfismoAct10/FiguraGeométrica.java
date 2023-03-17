package ClasesAbstractasyPolimorfismoAct10;

public abstract class FiguraGeom�trica {

	private double area;

	protected FiguraGeom�trica(double area) {
		if (area > 0) {
			this.area = area;
		} else {
			this.area = calcArea();
		}

	}

	protected FiguraGeom�trica() {
		this.area = calcArea();
	}

	public String compararArea(FiguraGeom�trica figura1, FiguraGeom�trica figura2) {
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
