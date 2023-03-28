package examenPolimorfismo;

public class Pato extends Animal {
	private String nombre;
	private String color;
	private String raza;
	private int edad;
	private char genero;

	public Pato(String reino, String familia, String especie) {
		this.nombre = "Dumb Duck";
		this.color = "Negro";
		this.raza = "Pato Donald lel";
		this.edad = 4;
		this.genero = 'F';
	}

	public Pato(String reino, String familia, String especie, String nombre, String color, String raza, int edad,
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
		return "QUACK ^^";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "^^ ---->  :>.....";
	}

	@Override
	public String reproduccion() {
		// TODO Auto-generated method stub
		String sexualidad = "";
		if (this.genero == 'M') {
			sexualidad = "FUACK FUACK ;> I";
		} else if (this.genero == 'F') {
			sexualidad = "FUACK, FUACK ;> 0 ";
		} else {
			sexualidad = "QUACK, ****, ****, ******! }:> (No juzgues mi sexualidad)";

		}
		return sexualidad;
	}

	public String picotaso() {
		
		 return "KRRRRRUACK! >:)";
		 
		}
		
	
}
