package practicaArrays;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) { // POR HACER ''MOSTRAR LA MODA''

		Scanner sc = new Scanner(System.in);

		// Implemente un programa que inicialice una matriz de enteros de dimensiones
		// m�ximas
		// NxM, y muestre la moda, es decir, el elemento que m�s se repite.
		// Para ello, tenga en cuenta que la matriz s�lo podr� almacenar enteros del 1
		// al 10.

		int contador = 0;
		int modaMatriz = 0;
		int matrizInt[][] = new int[7][8];

		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt.length; j++) {
				matrizInt[i][j] = (int) ((Math.random() * 10 + 1));
			}
		}

		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt.length; j++)
				System.out.print("|" + matrizInt[i][j] + "|");
			System.out.println("\n");

		}
		System.out.println("\n");

		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt.length; j++) {

				if (matrizInt[i][j] == matrizInt[0][1]) {
					contador++;

					modaMatriz = matrizInt[i][j];
				}
			}
		}
		System.out.println("El n�mero que m�s se repite es el " + modaMatriz + " y aparece " + contador + " veces.");
	}
}
