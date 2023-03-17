package ejercicios;

import java.util.Scanner;

public class EjercicioEjeCartesiano {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * (COMPLETO)
		 * Crea un programa que recoja dos números enteros por teclado y te indiquen en qué cuadrante se encuentra.
		 * 
		 * 1º cuadrante: (2x,3y)
		 * 2º cuadrante: (2,-3)
		 * 3º cuadrante: (-3,-3)
		 * 4º cuadrante: (-3,2)
		 * 
		 */
		
		System.out.println("Introduzca un valor numerico para el eje X: ");
		int EjeX = sc.nextInt();
		System.out.println("Introduzca un valor numerico para el eje Y: ");
		int EjeY = sc.nextInt();
				
				
		if (EjeX == 0 && EjeY == 0) { // Para especificar el origen.
			System.out.println("Esta coordenada representa el origen.");
			
		} else if (EjeX >= 0 && EjeY >= 0) { // Para filtrar hacia el primer cuadrante.
			System.out.println("Tus coordenadas se encuentran en el 1er cuadrante.");
			
		} else if (EjeX >= 0 && EjeY <= 0) { // Para filtrar hacia el segundo cuadrante.
			System.out.println("Tus coordenadas se encuentran en el 2do cuadrante.");
			
		} else if (EjeX <= 0 && EjeY <= 0) { // Para filtrar hacia el tercer cuadrante.
			System.out.println("Tus coordenadas se encuentran en el 3er cuadrante.");
			
		} else if (EjeX <= 0 && EjeY >= 0) { // Para filtrar hacia el cuarto cuadrante.
			System.out.println("Tus coordenadas se encuentran en el 4to cuadrante.");
			}
		 {

		}{

		} {

		}
		
		
	}
}
