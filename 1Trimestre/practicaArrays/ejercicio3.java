package practicaArrays;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Escriba un programa que lea desde teclado un vector de caracteres (uno a uno)
		 * de tamaño fijado por una constante simbólica.
		 * 
		 * Una vez leído, el programa debe indicar si dicho vector forma un palíndromo.
		 * 
		 * Un palíndromo es una palabra, frase o número que se lee igual de derecha a
		 * izquierda que de izquierda a derecha, por ejemplo: “reconocer”.
		 */

		System.out.println("Introduce una palabra:");
		String palabraIns = sc.next();
		int palabraInsInv = palabraIns.length();
		int contador = 0;
		char palindromo[] = new char[palabraIns.length()];

		for (int i = 0; i < palindromo.length; i++) {
			palindromo[i] = palabraIns.charAt(i);
			if (palindromo[i] == palindromo[palabraInsInv - 1]) {
				contador++;
			}
			palabraInsInv--;

		}
		if (palabraIns.length() % 2 == 0) {
			if (contador == (palabraIns.length()) / 2) {
				System.out.println("La palabra insertada es palíndroma.");
			} else {
				System.out.println("La palabra insertada NO es palíndroma.");
			}
		} else {

			if (contador == (palabraIns.length() + 1) / 2) {
				System.out.println("La palabra insertada es palíndroma.");
			} else {
				System.out.println("La palabra insertada NO es palíndroma.");
			}
		}
	}
}
