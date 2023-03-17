package PokemonPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Pokedex {
	
	private HashMap<String, Pokemon> pokedex;
	private final Pokemon bulbasaur = new Pokemon ("Bulbasaur",1,"Es un Bulbasaur","Planta");     
	private final Pokemon charmander = new Pokemon("Charmander", 2, "Es un charmander", "Fuego");     
	private final Pokemon squirtle = new Pokemon  ("Squirtle", 3, "Es un Squirtle", "Agua");
	
	public Pokedex() {
		this.pokedex = new HashMap<String, Pokemon>();
		addHard();
	}

	public HashMap<String, Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<String, Pokemon> pokedex) {
		this.pokedex = pokedex;
	}
	public void addPokePokedex(Pokemon p) {
		this.pokedex.put(p.getNombre(), p);
	}
	
	private void addHard() {
		pokedex.put(bulbasaur.getNombre(), bulbasaur);
		pokedex.put(charmander.getNombre(), charmander);
		pokedex.put(squirtle.getNombre(), squirtle);
	}
	
	public String toString() {
		return "-----Pokedex----- " + "\n" + this.pokedex.toString();
	}
}
