package PokemonPractice;

import java.util.ArrayList;
import PokemonPractice.Pokemon;

public class Ruta {
	
	private int id;
    private String nombre;
    private ArrayList<Pokemon> pokemongos;
    
    public Ruta(int id, String nombre) {
        this.id=id;
        this.nombre=nombre;
        this.pokemongos = new ArrayList<Pokemon>();
        
    }

    public Ruta(int id, String nombre, Pokemon poke1, Pokemon poke2, Pokemon poke3, Pokemon poke4,Pokemon ... pokeN) {
        this.id=id;
        this.nombre=nombre;
        this.pokemongos = new ArrayList<Pokemon>();
        agregarPokemon(poke1);
        agregarPokemon(poke2);
        agregarPokemon(poke3);
        agregarPokemon(poke4);
        for(Pokemon p:pokeN) {
        	agregarPokemon(p);
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getPokemongos() {
        return pokemongos;
    }

    public void setPokemongos(ArrayList<Pokemon> pokemongos) {
        this.pokemongos = pokemongos;
    }

    public void agregarPokemon(Pokemon pokemongos) {
            this.pokemongos.add(pokemongos);
    }
    
    public String toString() {
    	return "El nombre de la ruta es: " + this.nombre + " y el numero de la ruta: " + this.id + ", Que contiene estos pokemons: " + this.pokemongos + "\n";
    }
}