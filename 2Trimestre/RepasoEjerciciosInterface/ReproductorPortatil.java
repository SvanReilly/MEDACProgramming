package RepasoEjerciciosInterface;

public class ReproductorPortatil implements iReproductorPortatil{
	
	private String marca;
	private String modelo;
	private boolean reproduceSonido;
	private boolean reproduceVideo;
	private String tipoAlmacenamiento;
	private int capacidadAlmacenamiento;
	private String pantalla, tipoBateria;
	private int autonomia;
	private double peso, ancho, largo, grosor;	

		
	public ReproductorPortatil() {
		super();
	}
	
	public ReproductorPortatil(String marca, String modelo, String tipoAlmacenamiento) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isReproduceSonido() {
		return reproduceSonido;
	}
	public void setReproduceSonido(boolean reproduceSonido) {
		this.reproduceSonido = reproduceSonido;
	}
	public boolean isReproduceVideo() {
		return reproduceVideo;
	}
	public void setReproduceVideo(boolean reproduceVideo) {
		this.reproduceVideo = reproduceVideo;
	}
	public String getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}
	public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	public int getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}
	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}
	public String getPantalla() {
		return pantalla;
	}
	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	public String getTipoBateria() {
		return tipoBateria;
	}
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getGrosor() {
		return grosor;
	}
	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	
	
	
	
}
