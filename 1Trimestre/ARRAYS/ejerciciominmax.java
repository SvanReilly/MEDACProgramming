package ARRAYS;

import java.util.Scanner;

public class ejerciciominmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Haz un programa con arrays que lea por teclado una serie de valores e imprima
		 * el valor más alto y más bajo insertados.
		 */

		int[] numeros;

		System.out.println("¿Cuántos números serán?");
		numeros = new int[sc.nextInt()];
		double min = numeros[0];
		double max = numeros[0];
		System.out.println("Inserte los valores del array");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();

		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
		// PARA EL MÍNIMO//
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < min) {
				min = numeros[i];

			}
		}
		System.out.println("El número mas bajo es: " + min);
		// PARA EL MÁXIMO//
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}

		}
		System.out.println("El número más alto es: " + max);

	}
}
