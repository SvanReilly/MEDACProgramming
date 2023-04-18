package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjercicioHashMap {
	// Claves �nicas (primero, valores igual o distinto. (segundo
	public static void main(String[] args) {

		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		HashMap<Integer, String> mapa2 = new HashMap<Integer, String>();
		mapa.put(1, "Enricardo");
		mapa.put(2, "Alex");
		mapa.put(3, "Dani");
		mapa.put(4, "Adrian");

		for (Entry i : mapa.entrySet()) { // itera todos los elementos del mapa llamandolos i
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}

		System.out.println(mapa.size());

		mapa2.putAll(mapa);

		System.out.println(mapa.isEmpty());
		mapa2.clear();
		System.out.println(mapa.isEmpty());
		
		System.out.println(mapa.get(2));
		System.out.println(mapa.containsKey(9)); //devuelve true/false
		
		ArrayList<String> arra=new ArrayList <String>();
		arra.addAll(mapa.values());
		System.out.println(mapa.values()); //devuelve coleccion con todos los valores del mapa
		mapa.remove(1);
		System.out.println(mapa.get(1));
		
		
		
		

	}

}
