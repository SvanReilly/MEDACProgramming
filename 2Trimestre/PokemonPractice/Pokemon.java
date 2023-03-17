package PokemonPractice;

public class Pokemon {
	private String nombre;
	private int id;
	private String descripcion;
	private String tipo;
	public Pokemon(String nombre, int id, String descripcion, String tipo) {
		this.nombre = nombre;
		this.id = id;
		this.descripcion = descripcion;
		this.tipo = tipo;
	}
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
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "\n" +"Nombre: " + this.nombre + "\n" +"ID:" + this.id +"\n" + "Tipo:" + this.tipo + "\n" + "Descripcion: " + this.descripcion+ "\n";
	}
	
}
