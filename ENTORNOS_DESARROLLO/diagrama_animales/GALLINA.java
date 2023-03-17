package diagrama_animales;

public class GALLINA extends ANIMAL{
	
	private String colorPlumas;
	
	public GALLINA() {
		this.colorPlumas= "marrón";
	}

	public GALLINA(String nombre, int edad, String colorPlumas) {
		super(nombre, edad);
		this.colorPlumas = colorPlumas;
		
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public String ponerHuevo() {
		return this.nombre + " ha puesto un huevo.";
	}

	@Override
	public String toString() {
		return "La gallina de nombre: \n" + this.nombre + "tiene " + this.edad + " años y su plumaje es de color: " + this.colorPlumas;
	}
	
}

