package HERENCIA_CLASES;

public class GATO extends ANIMAL2 {
	private String nombre;
	private String color;
	private String raza;
	private int edad;

	public GATO() {
		super();
		this.nombre = "";
		this.color = "";
		this.raza = "";
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String MAULLAR() {
		return "está maullando";

	}

}
