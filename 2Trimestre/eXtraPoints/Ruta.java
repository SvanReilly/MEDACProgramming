package eXtraPoints;

import java.util.ArrayList;

public class Ruta {

	private String nombreRuta;
	private ArrayPokemon pokemonRuta;
	private Pokemon pokemon;
	

	// CONSTRUCTORES//
	public Ruta() {
		this.nombreRuta = "";
		this.pokemonRuta = new ArrayPokemon();
	}

	public Ruta(ArrayPokemon pokemonRuta) {
		this.nombreRuta = "";
		this.pokemonRuta = pokemonRuta;
	}

	public Ruta(String nombreRuta, ArrayPokemon pokemonRuta) {
		this.nombreRuta = nombreRuta;
		this.pokemonRuta = pokemonRuta;
	}

	//
	public void aņadirPokemon(Pokemon pokemon) {
		this.pokemonRuta.aņadirPokemon(pokemon);
	}

	public void aņadirPokemon(String nombrePokemon) {
		for (int i = 0; i < pokemonRuta.getPokes().size(); i++) {
			if (nombrePokemon.equals(pokemonRuta.getPokes().get(i).getNombre())) {
				this.pokemonRuta.aņadirPokemon(pokemon);
			} else {

			}
		}
	}

	
	//GETTERS&SETTERS//
	public ArrayList<Pokemon> getPokeRuta() {
		return pokemonRuta.getPokes();
	}

	public void setPokeRuta(ArrayList<Pokemon> pokeRuta) {
		this.pokemonRuta.setPokes(pokeRuta);
	}

	public String getNombreRuta() {
		return this.nombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}

	@Override
	public String toString() {
		return "En la ruta " + getNombreRuta() + " se encuentran los siguientes Pokemon: " + getPokeRuta();
	}

}
