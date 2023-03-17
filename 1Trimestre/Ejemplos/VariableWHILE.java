package Ejemplos;

import java.util.Scanner;

public class VariableWHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Todo lo que haya entre el DO y el WHILE se repetirá hasta que las condiciones de WHILE rompan el bucle.
		 */
		int numIns;
		
		do { 
			System.out.println("Inserte un número entero: "); //
		numIns = sc.nextInt();
			
		} while (numIns<1 || numIns>10); //Las condiciones de WHILE determinan el bucle, en este caso el bucle no se detendrá MIENTRAS el numIns sea menor de 1 o mayor de 10.
		
		
		System.out.println("Bucle detenido.");
		
	
	}
		
}
