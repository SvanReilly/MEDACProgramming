package RepasoEjerciciosInterface;

public interface iReproductorPortatil {

	public final String CD="CD";
	public final String DVD="DVD";
	public final String MEMORIAFLASH="Memoria Flash";
	public final String MINIDISK="Minidisk";
	public final String NINGUNA="Ninguna";
	public final String TEXTO="Texto";
	public final String MONOCROMO="MONOCROMO";
	public final String COLOR="Color";
	public final String PILAS="Pilas";
	public final String LION="LI-ION";
	
	public String getMarca();
	public void setMarca(String marca);
	
	public String getModelo();
	public void setModelo(String modelo);
	
	public boolean isReproduceSonido();
	public void setReproduceSonido(boolean reproduceSonido);
	
	public boolean isReproduceVideo();
	public void setReproduceVideo(boolean reproduceVideo);
	
	public String getTipoAlmacenamiento();
	public void setTipoAlmacenamiento(String tipoAlmacenamiento);
	
	public int getCapacidadAlmacenamiento();
	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento);
	
	public String getPantalla();
	public void setPantalla(String pantalla);
	
	public String getTipoBateria();
	public void setTipoBateria(String tipoBateria);
	
	public int getAutonomia();
	public void setAutonomia(int autonomia);
	
	public double getPeso();
	public void setPeso(double peso);
	
	public double getAncho();
	public void setAncho(double ancho);
	
	public double getLargo();
	public void setLargo(double largo);
	
	public double getGrosor();
	public void setGrosor(double grosor);

	
	
}
