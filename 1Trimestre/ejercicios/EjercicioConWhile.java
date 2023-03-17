package ejercicios;

import java.util.Scanner;

public class EjercicioConWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Realizar un programa que pida un número al usuario repetidamente hasta que el número introducido esté entre 1 y 10.
		 */
		int numIns;
		
		do { 
			System.out.println("Inserte un numero entero: "); //Todo lo que haya entre el DO y el WHILE se repetirá hasta que las condiciones de WHILE rompan el bucle.
		numIns = sc.nextInt();
			
		} while (numIns<1 || numIns>10);
		
		
		System.out.println("Bucle detenido.");
		
	
	}
		
}
