package PokemonPractice;

import java.util.ArrayList;

public class ArrayRuta {
	
	private ArrayList<Ruta> Rutas;
	
	public ArrayRuta() {
		this.Rutas = new ArrayList<Ruta>();
	}

	public ArrayList<Ruta> getRutas() {
		return Rutas;
	}

	public void setRutas(ArrayList<Ruta> rutas) {
		Rutas = rutas;
	}
	
	public void addRuta(Ruta r) {
		this.Rutas.add(r);
	}
	
	public String toString() {
		return Rutas.toString();
	}
}
