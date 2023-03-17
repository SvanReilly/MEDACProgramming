package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

	private ArrayList<String> colores = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	public Ejercicio1(int numeroColores) {

		for (int i = 0; i < numeroColores; i++) {
			this.colores.add(sc.nextLine());

		}

	}

	public ArrayList<String> getColores() {
		return this.colores;
	}

	public void setColores(ArrayList<String> colores) {
		this.colores = colores;
	}
	// SPECIFIC METHODS//
	public void addColor(String color) {

		this.colores.add(color);
	}

	public void add1stColor(String color) {
		this.colores.add(0, color); // 0 marca la posición del elemento del array.
	}

	public void addMiddleColor(String color) {
		int posicion = this.colores.size() / 2;
		this.colores.add(posicion, color);
	}

	public String removeColor(int position) {

		return this.colores.remove(position);
	}

	public void setColorByPosition(int posicion, String color) {
		this.colores.set(posicion, color);

	}

	public void setColorByName(String colorInicial, String colorCambio) {
		setColorByPosition((this.colores.indexOf(colorInicial)), colorCambio);
	}

	public boolean searchColor(String color) {
		return this.colores.contains(color);

	}

	public void barajarColor() {
		Collections.shuffle(colores); // Método de la clase abstracta Collections.
	}
	
	public void invertirColores() {
		Collections.reverse(colores);
	}
	
	public void intercambiar(int pos1, int pos2) {
		Collections.swap(colores, pos1, pos2);
	}
	
	@Override
	public String toString() {

		String respuesta = "(";

		for (int i = 0; i < colores.size(); i++) {

			respuesta += this.colores.get(i);
			if (i != this.colores.size() - 1) {
				respuesta += ", ";
			}
		}
		respuesta += ")";
		return respuesta;
	}

}
