package claseJoaco;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) throws NotValidAgeException {
		if(edad<0) {
			throw new NotValidAgeException();
		}else {
			this.nombre=nombre;
			this.edad=edad;
		}
	}
}
