package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	ArrayList<Integer> Elementos = new ArrayList<Integer>();

	Scanner sc = new Scanner(System.in);

	public Ejercicio2() {

		for (int i = 0; i < Elementos.size(); i++) {
			this.Elementos.add(sc.nextInt());
		}

	}

	public ArrayList<Integer> getElementos() {
		return this.Elementos;
	}

	public void setElementos(ArrayList<Integer> elementos) {
		this.Elementos = elementos;
	}

	public ArrayList<Integer> diferenciaTiempos() {
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < this.Elementos.size(); i++) {
			resultado.add(this.Elementos.get(i) - this.Elementos.get(0));
		}

		return resultado;
	}

	@Override
	public String toString() {

		return this.Elementos.toString();
	}
}
