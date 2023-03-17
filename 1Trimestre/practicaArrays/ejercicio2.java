package practicaArrays;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escriba un programa que lea desde teclado 6 n�meros correspondientes a la
		 * combinaci�n ganadora de la loter�a primitiva. A continuaci�n, el programa
		 * leer� otros 6 n�meros correspondientes a un boleto con el que se participa en
		 * dicho sorteo. Finalizada la lectura, el programa deber� de indicar el n�mero
		 * de aciertos del boleto cuyos n�meros hemos introducido.
		 * 
		 * Ejemplo: si la combinaci�n ganadora es 3 6 4 8 9 23 el boleto 8 6 23 5 9 1
		 * tiene 2 aciertos.
		 */
		int[] boleto = new int[6];
		int[] combGanadora = new int[6];
		int aciertos = 0;
		System.out.println("La combinaci�n ganadora de La Primitiva es: ");

		for (int i = 0; i < combGanadora.length; i++) {
			combGanadora[i] = sc.nextInt();
		}
		
		System.out.println("La combinaci�n del boleto es: ");

		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = sc.nextInt();
		}
		
		for (int i = 0; i < boleto.length; i++) {
			if (combGanadora[i] == boleto[i]) {
				aciertos += 1;
			}
		}
		System.out.println("El boleto introducido ha tenido " + aciertos + " aciertos.");

		
		
	}
}
