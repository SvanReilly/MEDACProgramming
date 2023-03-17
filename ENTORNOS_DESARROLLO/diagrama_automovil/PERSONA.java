package diagrama_automovil;

import java.util.ArrayList;

public class PERSONA extends AUTOMOVIL{

	private String nombre;
	ArrayList <AUTOMOVIL> garaje= new ArrayList <AUTOMOVIL>();
	
	
	public PERSONA() {
		this.nombre="";
		this.garaje= garaje;
	}
	
	public PERSONA (String nombre) {
		this.nombre=nombre;
		this.garaje= garaje;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "La persona en cuestión se llama " + nombre + 
				" y, en su garaje tiene: \n " + garaje;
	}
	
	
}

	
