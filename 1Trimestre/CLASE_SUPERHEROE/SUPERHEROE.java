package CLASE_SUPERHEROE;

public class SUPERHEROE {

	private String nombre;
	private String descripcion;
	private boolean capa;

	public SUPERHEROE() {
		this.nombre = "";
		this.descripcion = "";
		this.capa = false;
	}

	public SUPERHEROE(String nombre) {
		this.nombre = nombre;
		this.descripcion = "";
		this.capa = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}

	public String toString() {
		String CAPA = "";
		if (capa == true) {
			CAPA = "En esta versi�n lleva capa.";
		} else {
			CAPA = "En esta versi�n no lleva capa";
		}
		return "Nombre del superheroe: " + this.nombre + " \nDescripci�n: " + this.descripcion + "\n" + CAPA + ".";
	}

}
