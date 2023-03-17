package POKEABSTRACT;

public abstract class POKEMON {
	
	protected String nombre;
	protected int PS;
	protected int LVL;
	protected String tipo;
	protected String tipo2;
	
	
	public abstract void Atacar();
	public void Saludar() {
		System.out.println("Mi nombre es " + this.nombre);
	}
	
	public abstract void sonido();

}
