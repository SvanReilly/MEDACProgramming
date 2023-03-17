package HERENCIA_CLASES;

public class PEZ extends ANIMAL2{
	private String nombre;
	private String color;
	private String tipo;
	private int edad;

	public PEZ() {
		super();
		this.nombre = "";
		this.color = "";
		this.tipo = "";
		this.edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setRaza(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String NADAR() {
		return "está nadando";

	}

}
