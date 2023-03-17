package eXtraPoints;

import java.util.ArrayList;

public class ArrayPokemon {

	private ArrayList<Pokemon> pokes;

	// CONSTRUCTORES//
	public ArrayPokemon() {
		this.pokes = new ArrayList<Pokemon>();
	}

	public ArrayPokemon(ArrayList<Pokemon> pokes) {
		this.pokes = pokes;
	}

	public ArrayList<Pokemon> getPokes() {
		return pokes;
	}

	public void setPokes(ArrayList<Pokemon> pokes) {
		this.pokes = pokes;
	}

	// SPECIFIC METHODS//
	public void añadirPokemon(Pokemon pokemon) {
		this.pokes.add(pokemon);
	}

	public void borrarPokemon(Pokemon pokemon) {
		this.pokes.remove(pokemon);
	}

	public void borrarPokemon(int index) {
		this.pokes.remove(index);
	}

	public void borrarPokemon(String tipo) {
		this.pokes.removeIf(poke -> (poke.getTipo().equals(tipo)));
	}

	public String consultarTipo(int index) {
		return this.pokes.get(index).getTipo();
	}

	public String consultarDescripcion(int index) {
		return this.pokes.get(index).getDescripcion();
	}

	public int consultarID(int index) {
		return this.pokes.get(index).getId();
	}

	public String consultarNombre(int index) {
		return this.pokes.get(index).getNombre();
	}

}
