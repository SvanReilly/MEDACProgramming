package examenPolimorfismo;

public abstract class Animal {

	private String reino;
	private String familia;
	private String especie;
	
	protected Animal() {
		this.reino="";
		this.familia="";
		this.especie="";
	}
	
	protected Animal(String reino, String familia, String especie) {
		this.reino = reino;
		this.familia = familia;
		this.especie = especie;
	}

	public abstract String sonido();
	
	public abstract String comer();
	
	public abstract String reproduccion();
	
}


