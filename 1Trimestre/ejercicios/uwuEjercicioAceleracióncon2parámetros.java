package ejercicios;

import java.util.Scanner;

public class uwuEjercicioAceleraci髇con2par醡etros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3. Implementa un programa en Java que reciba dos par谩metros de tipo entero: distancia 
		 * y tiempo. El programa mostrar谩 por pantalla la aceleraci贸n obtenida a partir de estas 
		 * variables. La f贸rmula de la aceleraci贸n aceleraci贸n = velocidad / tiempo.
		 */
		
		System.out.println("Inserte un valor numerico para la velocidad en metros por segundo");
		double velocidad = sc.nextDouble();
		System.out.println("Inserte un valor numerico para el tiempo en segundos");
		double tiempo = sc.nextDouble();
		
		
		double aceleracion = (velocidad / tiempo);
		
		System.out.println("La aceleracion resultante es de: " + aceleracion + " metros/segundo^2");
		
	
	}	

}
