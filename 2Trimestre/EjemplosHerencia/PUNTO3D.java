package EjemplosHerencia;

public class PUNTO3D extends PUNTO2D{
	
	private int z;
	
	public PUNTO3D() {
		super();
		this.z=0;
	}
	
	public PUNTO3D(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void MovProf(int dist) {
		this.z+=dist;
	}

	@Override
	public String toString() {
		return "(" + super.toString() + this.getZ() + ")";
	}
	
	
}
