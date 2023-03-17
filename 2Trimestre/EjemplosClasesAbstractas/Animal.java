package EjemplosClasesAbstractas;

public abstract class Animal {

	private String reino;
	private String familia;
	private String especie;
	private String rama;
	
	
	
	protected Animal(String reino, String familia, String especie, String rama) {
		this.reino = reino;
		this.familia = familia;
		this.especie = especie;
		this.rama = rama;
	}

	public String morirse() {
		return "X_X";
	}
	
	public String metabolizar () {
		return "UwU-----> UnU";
	}
	
	public abstract String sonido();
	
}
