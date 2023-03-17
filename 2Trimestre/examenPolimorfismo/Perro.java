package examenPolimorfismo;

public class Perro extends Animal {

	private String nombre;
	private String color;
	private String raza;
	private int edad;
	private char genero;

	public Perro(String reino, String familia, String especie) {
		this.nombre = "Kiba";
		this.color = "Blanco";
		this.raza = "Husky Siberiano";
		this.edad = 3;
		this.genero = 'M';
	}

	public Perro(String reino, String familia, String especie, String nombre, String color, String raza, int edad,
			char genero) {
		super(reino, familia, especie);
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		if (edad >= 0) {
			this.edad = edad;
		} else {
			this.edad = 1;

		}
		this.genero = genero;
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

	public boolean setEdad(int edad) {

		boolean correcto = true;
		if (edad >= 0) {
			this.edad = edad;
			correcto = true;
		} else {
			correcto = false;
		}
		return correcto;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "BRR GUAU :D";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "^^ ---->  :3:.";
	}

	@Override
	public String reproducción() {
		// TODO Auto-generated method stub
		String sexualidad = "";
		if (this.genero == 'M') {
			sexualidad = ";D 8====D";
		} else if (this.genero == 'F') {
			sexualidad = ";D ((ô)) ";
		} else {
			sexualidad = "GGGGGGRRRRRR! >:3 (No juzgues mi sexualidad)";

		}
		return sexualidad;
	}

	public String bocaoEnElPecho() {

		return " (GRGRGRR)·$U%$&$%·$%·!!!)";

	}

}
