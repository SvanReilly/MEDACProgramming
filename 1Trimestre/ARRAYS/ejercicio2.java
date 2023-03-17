package ARRAYS;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Números a introducir: ");
		int tam = sc.nextInt();
		int[] arraisito = new int[tam];

		for (int i = 0; i < arraisito.length; i++) {
			arraisito[i] = sc.nextInt();
		}
		
			System.out.println("");
			
		for (int i = arraisito.length - 1; i >= 0; i--) {
			System.out.print(arraisito[i]);
		}

	}

}
