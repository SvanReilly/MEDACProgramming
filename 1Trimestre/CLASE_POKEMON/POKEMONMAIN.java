package CLASE_POKEMON;

public class POKEMONMAIN {
	public static void main(String[] args) {
		
	

	POKEMONATTACKS Ataque1 = new POKEMONATTACKS(0, "Hielo", "Especial", 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0);
	POKEMONATTACKS Ataque2 = new POKEMONATTACKS(0, "Hielo", "Especial", 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0);
	POKEMONATTACKS Ataque3 = new POKEMONATTACKS(0, "Hielo", "Especial", 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0);
	POKEMONATTACKS Ataque4 = new POKEMONATTACKS(0, "Hielo", "Especial", 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0);
	POKEMONSTATS Stats = new POKEMONSTATS();
	POKEMON Vaporeon = new POKEMON("Vaporeon", "Agua", Ataque1, Ataque2, Ataque3, Ataque4, Stats);
	
	
	
	//POKEMON Charizard = new POKEMON("Charizard", "Fuego", "Volador");
	
	//System.out.println(Charizard);
	
	System.out.println(Vaporeon);
	}
}
