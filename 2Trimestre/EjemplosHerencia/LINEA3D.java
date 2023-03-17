package EjemplosHerencia;

public class LINEA3D {

	private PUNTO3D punto1;
	private PUNTO3D punto2;

	// Constructor vacío//
	public LINEA3D() {
		this.punto1 = new PUNTO3D();
		this.punto2 = new PUNTO3D();
	}

	// Constructor con parámetros//
	public LINEA3D(int x, int y, int z) {
		this.punto1 = new PUNTO3D();
		this.punto2 = new PUNTO3D(x, y, z);
	}

	public LINEA3D(int x, int y, int z, int x2, int y2, int z2) {
		this.punto1 = new PUNTO3D(x, y, z);
		this.punto2 = new PUNTO3D(x2, y2, z2);
	}

	public LINEA3D(PUNTO3D punto1, PUNTO3D punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}

	// Getters & Setter//
	public PUNTO3D getPunto1() {
		return punto1;
	}

	public void setPunto1(PUNTO3D punto1) {
		this.punto1 = punto1;
	}

	public PUNTO3D getPunto2() {
		return punto2;
	}

	public void setPunto2(PUNTO3D punto2) {
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
	
	public void MoverProf(int dist) {
		this.punto1.MovProf(dist);
		this.punto2.MovProf(dist);
	}

	// ToString//
	public String toString() {
		// Ej: (3,5,6) hasta (4,9,7)
		return "(" + this.punto1 + ") hasta (" + this.punto2 + ")";
	}
}
