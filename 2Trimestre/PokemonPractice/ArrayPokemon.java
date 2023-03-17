package PokemonPractice;

import java.util.ArrayList;

public class ArrayPokemon {
	private ArrayList<Pokemon> pokes;
	
	public ArrayPokemon() {
		this.pokes=new ArrayList<Pokemon>();
	}

	public ArrayList<Pokemon> getPokes() {
		return pokes;
	}

	public void setPokes(ArrayList<Pokemon> pokes) {
		this.pokes = pokes;
	}
	
	public void addPokemon(Pokemon p) {
		this.pokes.add(p);
	}
	public void borrarPokemon(Pokemon p) {
		this.pokes.remove(p);
	}
	public void borrarPokemon(int index) {
		this.pokes.remove(index);
	}
	
	public void borrarPokemon(String tipo) {
		this.pokes.removeIf(poke->(poke.getTipo().equals(tipo)));
	}
	public Pokemon consultarPokemon(int index) {
		return this.pokes.get(index);
	}
	public String consultarTipo(int index) {
		return this.pokes.get(index).getTipo();
	}
	public String consultarDescripcion(int index) {
		return this.pokes.get(index).getDescripcion();
	}
	public String consultarNombre(int index) {
		return this.pokes.get(index).getNombre();
	}
	public int consultarID(int index) {
		return this.pokes.get(index).getId();
	}
	
	@Override
	public String toString() {
		return this.pokes.toString();
	}
}
