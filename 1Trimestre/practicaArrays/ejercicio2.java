package practicaArrays;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escriba un programa que lea desde teclado 6 números correspondientes a la
		 * combinación ganadora de la lotería primitiva. A continuación, el programa
		 * leerá otros 6 números correspondientes a un boleto con el que se participa en
		 * dicho sorteo. Finalizada la lectura, el programa deberá de indicar el número
		 * de aciertos del boleto cuyos números hemos introducido.
		 * 
		 * Ejemplo: si la combinación ganadora es 3 6 4 8 9 23 el boleto 8 6 23 5 9 1
		 * tiene 2 aciertos.
		 */
		int[] boleto = new int[6];
		int[] combGanadora = new int[6];
		int aciertos = 0;
		System.out.println("La combinación ganadora de La Primitiva es: ");

		for (int i = 0; i < combGanadora.length; i++) {
			combGanadora[i] = sc.nextInt();
		}
		
		System.out.println("La combinación del boleto es: ");

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
