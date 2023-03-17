package ejercicios;

import java.util.Scanner;

public class InvertirNumeroWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Invertir numero entero con WHILE.
		 */
		int numIns, numInv = 0, resto;
		
		System.out.println("Ejemplo para la inversion de un numero: ");
		
		System.out.println("Introduce un numero: ");
		numIns = sc.nextInt();
		
			while (numIns > 0) { 
				resto = numIns%10;
				numInv = numInv * 10 + resto;
				numIns = numIns / 10; 
				
				//Con la operacion modulo y posterior division, lo que se consigue es ir pasando por los distintos digitos de numIns, 
				// desde la derecha hacia la izquierda e ir añadiendo los digitos de numIns en orden inverso en numInv
				
			}
		System.out.println("El numero invertido es: " + numInv);
		
	}
}
