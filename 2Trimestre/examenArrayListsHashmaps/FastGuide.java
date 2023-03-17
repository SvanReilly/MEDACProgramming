package examenArrayListsHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class FastGuide {
	public static void main(String[] args) {
		
		//ARRAYLISTS//
		ArrayList<String> arrayString = new ArrayList<String>();
		ArrayList<Integer> arrayInt = new ArrayList<Integer>();
		ArrayList<Float> arrayFloat = new ArrayList<Float>();
		ArrayList<Double> arrayDouble = new ArrayList<Double>();

		arrayString.add("Holi");
		arrayString.add("Adiós");
		arrayString.add("Vaporeon");
		arrayString.add("UwU");
		arrayString.add("Vaporeon");

		// Imprimir ArrayList

		// System.out.println(arrayString);

		// Obtener valor concreto de la posicion 0
		// System.out.println(arrayString.get(0));

		// Modificar un elemento del array
		arrayString.set(2, "platanito");

		System.out.println(arrayString);

		// Borrar elemento
		arrayString.remove(2);

		// Borrar elementos con el mismo nombre

		// while(arrayString.remove("Vaporeon"));

		arrayString.removeIf(i -> (i.equals("Vaporeon")));
		// Borrar elementos con condiciones
		arrayString.removeIf(i -> (i.charAt(0) == 'V') || i.charAt(1) == 'H');

		// Ordenar el array por defecto orden alfabético
		arrayString.sort(null);

		
		//HASHMAPS//
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		HashMap<Integer, String> mapa2 = new HashMap<Integer, String>();
		mapa.put(1, "Enricardo");
		mapa.put(2, "Alex");
		mapa.put(3, "Dani");
		mapa.put(4, "Adrián");

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
