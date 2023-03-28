package ejercicios;

import java.util.Scanner;

public class uwuEjercicioAceleracioncon2parametros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3. Implementa un programa en Java que reciba dos parámetros de tipo entero: distancia 
		 * y tiempo. El programa mostrará por pantalla la aceleración obtenida a partir de estas 
		 * variables. La fórmula de la aceleración aceleración = velocidad / tiempo.
		 */
		
		System.out.println("Inserte un valor numerico para la velocidad en metros por segundo");
		double velocidad = sc.nextDouble();
		System.out.println("Inserte un valor numerico para el tiempo en segundos");
		double tiempo = sc.nextDouble();
		
		
		double aceleracion = (velocidad / tiempo);
		
		System.out.println("La aceleracion resultante es de: " + aceleracion + " metros/segundo^2");
		
	
	}	

}
