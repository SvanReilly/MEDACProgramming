package eXtraPoints;

import java.util.HashMap;

public class Pokedex1 {

	private HashMap<ArrayPokemon, Boolean> pokedex;
	private Pokemon pokemon;
	ArrayPokemon APokemon = new ArrayPokemon();
	Pokemon Bulbasaur = new Pokemon(1, "Bulbasaur", "Plant", "Poison",
			"There is a plant seed on its back right from the day this Pok�mon is born. The seed slowly grows larger.");
	Pokemon Charmander = new Pokemon(4, "Charmander", "Fire",
			"It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
	Pokemon Squirtle = new Pokemon(7, "Squirtle", "Water",
			"When it retracts its long neck into its shell, it squirts out water with vigorous force.");

	public Pokedex1() {
		this.pokedex = new HashMap<ArrayPokemon, Boolean>();
		this.Bulbasaur = Bulbasaur;
		this.Charmander = Charmander;
		this.Squirtle = Squirtle;
	}

	public Pokedex1(HashMap<ArrayPokemon, Boolean> pokedex, Pokemon bulbasaur, Pokemon charmander, Pokemon squirtle) {
		this.pokedex = pokedex;
		Bulbasaur = bulbasaur;
		Charmander = charmander;
		Squirtle = squirtle;
	}

	public HashMap<ArrayPokemon, Boolean> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<ArrayPokemon, Boolean> pokedex) {
		this.pokedex = pokedex;
	}

	@SuppressWarnings("unused")
	public boolean anadirPokemonPokedex(String nombrePokemon) {
		boolean respuesta = false;
		for (int i = 0; i < APokemon.getPokes().size(); i++) {
			if (nombrePokemon.equals(APokemon.getPokes().get(i).getNombre())) {
				this.APokemon.anadirPokemon(pokemon);
				respuesta = true;
			} else {

				respuesta = false;
			}

		}
		return respuesta;

	}

	public String PokeInfo(String nombrePokemon) {
		String PokeInfo = "";
		for (int i = 0; i < APokemon.getPokes().size(); i++) {
			if (nombrePokemon.equals(APokemon.getPokes().get(i).getNombre())) {
				PokeInfo=this.pokemon.toString();
	
			} else {

				PokeInfo = "No hay informaci�n acerca del Pokemon mencionado.";
			}

		}
		return PokeInfo;
	}
}
