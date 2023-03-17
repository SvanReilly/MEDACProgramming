package ClasesAbstractasyPolimorfismoAct10;

public class C�rculo extends FiguraGeom�trica {

	private final double PI = Math.PI;
	private double diametro;
	private double radio = diametro / 2;

	public C�rculo(double diametro) {
		super();
		if (diametro > 0) {
			this.diametro = diametro;
		} else {
			this.diametro = 1;
		}

	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		if (diametro > 0) {
			this.diametro = diametro;
		} else {
			this.diametro = 1;
		}

	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if (radio > 0) {
			this.radio = radio;
		} else {
			this.radio = 1;
		}

	}

	public double getPI() {
		return PI;
	}

	@Override
	public String compararArea(FiguraGeom�trica figura1, FiguraGeom�trica figura2) {
		return super.compararArea(figura1, figura2);
	}

	@Override
	public double calcArea() {
		return (PI * (Math.pow(radio, 2)));
	}

	@Override
	public double calcPerimetro() {

		return ((2*PI) * radio);
	}

	@Override
	public String toString() {
		
		return super.toString() + "La figura se trata de un C�rculo y sus medidas son:" + "\nDi�metro: "
				+ this.diametro + "\nRadio: " + this.radio + " \nValor de PI: " + this.PI + " \nArea: "
				+ this.calcArea() + " \nPerimetro: " + this.calcPerimetro()
				+ "\n****************************************************************";
	}

	
	
	
}
