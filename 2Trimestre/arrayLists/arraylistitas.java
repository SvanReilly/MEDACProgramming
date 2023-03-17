package arrayLists;

import java.util.ArrayList;

public class arraylistitas {
	public static void main(String[] args) {

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

	}

}
