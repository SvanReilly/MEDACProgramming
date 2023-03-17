package eXtraPoints;

import java.util.ArrayList;

public class mainPokemon {
	public static void main(String[] args) {

		ArrayList<Pokemon> Pokemongos = new ArrayList<Pokemon>();
		ArrayPokemon arra = new ArrayPokemon(Pokemongos);
		Pokedex1 pokedex=new Pokedex1();

		Pokemon Bulbasaur = new Pokemon(1, "Bulbasaur", "Plant", "Poison",
				"There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.");
		Pokemon Ivysaur = new Pokemon(2, "Ivysaur", "Plant", "Poison",
				"When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.");
		Pokemon Venusaur = new Pokemon(3, "Venusaur", "Plant", "Poison",
				"Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
		Pokemon Charmander = new Pokemon(7, "Charmander", "Fire",
				"It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
		Pokemon Charmeleon = new Pokemon(8, "Charmeleon", "Fire",
				"It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws.");
		Pokemon Charizard = new Pokemon(9, "Charizard", "Fire", "Flying",
				"It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.");

		arra.añadirPokemon(Bulbasaur);
		arra.añadirPokemon(Ivysaur);
		arra.añadirPokemon(Venusaur);
		arra.añadirPokemon(Charmander);
		arra.añadirPokemon(Charmeleon);
		arra.añadirPokemon(Charizard);
		pokedex.añadirPokemonPokedex("Bulbasaur");
		
		

		System.out.println(pokedex.PokeInfo("Bulbasaur"));
	}

}
