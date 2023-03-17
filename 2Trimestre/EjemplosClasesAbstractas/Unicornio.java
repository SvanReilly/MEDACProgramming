package EjemplosClasesAbstractas;

public class Unicornio extends Animal{
	private int tamañoCuerno;
	private int edad;
	
	
	public Unicornio(int tamañoCuerno, int edad, String reino, String familia, String especie, String rama) {
		super (reino, familia, especie, rama);
		this.tamañoCuerno = tamañoCuerno;
		this.edad = edad;
		
	}

	public String poderDeCuerno() {
		return "o^o";
	}

	@Override
	public String sonido() {
	
		return "AWA de UWU";
	}

	@Override
	public String morirse() {
		// TODO Auto-generated method stub
		return super.morirse();
	}

	@Override
	public String metabolizar() {
		// TODO Auto-generated method stub
		return super.metabolizar();
	}
	
	
	
	
	
}
