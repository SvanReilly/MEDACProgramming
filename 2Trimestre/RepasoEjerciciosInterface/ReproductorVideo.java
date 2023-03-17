package RepasoEjerciciosInterface;

public class ReproductorVideo extends ReproductorPortatil implements iReproductorVideo{
	

	private boolean reproduceWMV, reproduceDIVX, reproduceMPG, reproduceDVD, reproduceJPG, television;
	private	float tama�oDeLaPantalla;

	public ReproductorVideo(String marca, String modelo, float tama�oDeLaPantalla) {
		super();
		this.setMarca(marca);
		this.setModelo(modelo);
		this.tama�oDeLaPantalla = tama�oDeLaPantalla;
	}

	public boolean isReproduceWMV() {
		return reproduceWMV;
	}

	public void setReproduceWMV(boolean reproduceWMV) {
		this.reproduceWMV = reproduceWMV;
	}

	public boolean isReproduceDIVX() {
		return reproduceDIVX;
	}

	public void setReproduceDIVX(boolean reproduceDIVX) {
		this.reproduceDIVX = reproduceDIVX;
	}

	public boolean isReproduceMPG() {
		return reproduceMPG;
	}

	public void setReproduceMPG(boolean reproduceMPG) {
		this.reproduceMPG = reproduceMPG;
	}

	public boolean isReproduceDVD() {
		return reproduceDVD;
	}

	public void setReproduceDVD(boolean reproduceDVD) {
		this.reproduceDVD = reproduceDVD;
	}

	public boolean isReproduceJPG() {
		return reproduceJPG;
	}

	public void setReproduceJPG(boolean reproduceJPG) {
		this.reproduceJPG = reproduceJPG;
	}

	public boolean isTelevision() {
		return television;
	}

	public void setTelevision(boolean television) {
		this.television = television;
	}

	public float getTama�oDeLaPantalla() {
		return tama�oDeLaPantalla;
	}

	public void setTama�oDeLaPantalla(float tama�oDeLaPantalla) {
		this.tama�oDeLaPantalla = tama�oDeLaPantalla;
	}


	
	
	
	
	
}
