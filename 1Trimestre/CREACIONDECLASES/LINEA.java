package CREACIONDECLASES;

public class LINEA {

	private PUNTO punto1;
	private PUNTO punto2;

	// Constructor vacío//
	public LINEA() {
		this.punto1 = new PUNTO();
		this.punto2 = new PUNTO();
	}

	// Constructor con parámetros//
	public LINEA(int x, int y) {
		this.punto1 = new PUNTO();
		this.punto2 = new PUNTO(x, y);
	}

	public LINEA(int x, int y, int x2, int y2) {
		this.punto1 = new PUNTO(x, y);
		this.punto2 = new PUNTO(x2, y2);
	}

	public LINEA(PUNTO punto1, PUNTO punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}

	// Getters & Setter//
	public PUNTO getPunto1() {
		return punto1;
	}

	public void setPunto1(PUNTO punto1) {
		this.punto1 = punto1;
	}

	public PUNTO getPunto2() {
		return punto2;
	}

	public void setPunto2(PUNTO punto2) {
		this.punto2 = punto2;
	}

	// Specific Methods//

	public void MoverVert(int dist) {
		this.punto1.MovVert(dist);
		this.punto2.MovVert(dist);
	}

	public void MoverHor(int dist) {
		this.punto1.MovHor(dist);
		this.punto2.MovHor(dist);
	}

	// ToString//
	public String toString() {
		// Ej: (3,5) hasta (4,9)
		return "(" + punto1 + ") hasta (" + punto2 + ")";
	}
}
