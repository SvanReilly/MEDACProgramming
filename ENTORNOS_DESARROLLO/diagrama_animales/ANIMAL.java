package diagrama_animales;

public class ANIMAL implements Acciones {

	public String nombre;
	public int edad;

	public ANIMAL() {
		this.nombre = "";
		this.edad = 0;
	}

	public ANIMAL(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		boolean correcto=true;
		if(edad<0) {
			correcto=false;
		}else if (edad>0) {
			correcto=true;
			this.edad = edad;
		}	
			return correcto;
	}

	public String HABLAR() {
		return this.nombre + " está emitiendo sonidos";
	}

	public String DESPLAZARSE() {
		return this.nombre + " se está desplazando";
	}

	public String ALIMENTARSE() {
		return this.nombre + " está comiendo";
	}

}
