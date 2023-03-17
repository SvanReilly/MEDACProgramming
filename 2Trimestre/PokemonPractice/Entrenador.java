package PokemonPractice;

import java.util.Scanner;



public class Entrenador {
	private Ruta rutica;
	private Pokedex pokedex;
	private Scanner sc;
	
	public Entrenador(Ruta rutica, Pokedex pokedex, Scanner sc) {
		this.rutica = rutica;
		this.pokedex = pokedex;
		this.sc = sc;
	}
	
	public Ruta getRutica() {
		return rutica;
	}

	public void setRutica(Ruta rutica) {
		this.rutica = rutica;
	}

	public Pokedex getPokedex() {
		return pokedex;
	}

	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	
	
}
