package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RatasConArrayLists {
	public static void main(String[] args) {

		/*
		 * Escribir un programa que lea el peso de cada una de las 20 ratas de
		 * laboratorio del departamento de Biología de la Nutrición. Calcular el peso
		 * medio de las ratas e imprimir un informe parecido al siguiente: hay 2 ratas
		 * que pesan 200 gramos hay 1 rata que pesa 350 gramos ... peso medio: 325.23
		 * gramos La introducción del peso no tiene que efectuarse ordenadamente, por
		 * eso, almacene los pesos en un vector y luego ordene el vector antes de
		 * imprimir las estadísticas.
		 */

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> pesoRatas = new ArrayList<Double>();

		// Para crear Listas diferenciadas dentro de un mismo ArrayList
		// List<Double> ratones = Arrays.asList(225.0, 246.0, 346.0, 210.0, 225.0,
		// 274.0, 225.0, 254.0, 359.0, 398.0,
		// 346.0, 346.0, 398.0, 398.0, 254.0, 264.0, 285.0, 290.0, 290.0, 346.0);

		pesoRatas.addAll(Arrays.asList(225.0, 246.0, 346.0, 210.0, 225.0, 274.0, 225.0, 254.0, 359.0, 398.0, 346.0,
				346.0, 398.0, 398.0, 254.0, 264.0, 285.0, 290.0, 290.0, 346.0));

		pesoRatas.sort(null);
		double pesoTotal = 0;

		for (int i = 0; i < pesoRatas.size(); i++) {
			pesoTotal += pesoRatas.get(i);

		}
		double pesoMedio = pesoTotal / pesoRatas.size();

		System.out.println(pesoRatas);
		System.out.println(pesoMedio);

		
		//Saber cuantas ratas tiene el mismo peso e imprimir dicho peso.
		int contador = 0;
		for (int i = 0; i < pesoRatas.size(); i++) {
			for (int k = 1; k < pesoRatas.size(); k++) {
				if (pesoRatas.get(i) == pesoRatas.get(k)) {

					contador += 1;
				}

			}

		}
		System.out.println("Hay " + contador + " ratas con el mismo peso.");
	}
}
