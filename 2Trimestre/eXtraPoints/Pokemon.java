package eXtraPoints;

public class Pokemon {

	private String nombre;
	private int id;
	private String descripcion;
	private String tipo1;
	private String tipo2;

	// CONSTRUCTORES//
	public Pokemon() {
		this.id = 0;
		this.nombre = "";
		this.tipo1 = "";
		this.tipo2 = "";
		this.descripcion = "";
	}

	public Pokemon(int id, String nombre, String tipo1, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = null;
		this.descripcion = descripcion;
	}

	public Pokemon(int id, String nombre, String tipo1, String tipo2, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.id = id;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.descripcion = descripcion;
	}

	// GETTERS&SETTERS//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo1;
	}

	public void setTipo(String tipo) {
		this.tipo1 = tipo;
	}

	public String toString() {

		if (this.tipo2 == null) {
			return "Nombre: " + this.nombre + "\nID:" + this.id + "\nTipo: " + this.tipo1 + "\nDescripción: "
					+ this.descripcion;
		} else {
			return "Nombre: " + this.nombre + "\nID:" + this.id + "\nTipo Principal: " + this.tipo1
					+ "\nTipo Secundario: " + this.tipo2 + "\nDescripción: " + this.descripcion;
		}
	}

}
