package ejercicios;

import java.util.Scanner;

public class uwuEjercicioGravedad {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 2. Implemente un programa en Java que resuelva la siguiente fórmula para resolver con 
	     * qué fuerza se atraen dos cuerpos: 
		 * El programa deberá pedir al usuario que introduzca tres valores por teclado: 
 		 * m1: Masa del primer objeto 
		 * m2: Masa del segundo objeto 
		 * r: Distancia entre los centros de los dos objetos
		 * Además, se informa que G es la constante gravitacional, con un valor de G = 6.673e-11. 
		 */
		
		double G = 6.673*Math.pow(10, -11); // Declarando la constante de gravitación universal.
		
		System.out.println("Inserta el valor numerico de la masa 1 (en kilogramos)");
		double m1= sc.nextDouble(); // Masa del primer objeto. Ej: Tierra= 5,973E24 
		
		System.out.println("Inserta el valor numerico de la masa 2 (en kilogramos)");
		double m2= sc.nextDouble(); // Masa del segundo objeto. Ej: Luna= 7,349E22 
		
		System.out.println("Inserta el valor numerico de la distancia entre los dos centros de masa (en metros)");
		double r= sc.nextDouble(); // Distancia entre los dos centros de masas. Ej: d= 384E6 (distancia Tierra/Luna en metros)
		
		double r2= Math.pow(r,2); // Distancia elevada al cuadrado.
		
		double Fresultante= (G*m1*m2)/r2; // Formula de la fuerza gravitatoria que se ejercen dos masas puntuales en el vacio.
				
		
		System.out.println("La fuerza con la que se atraen ambos cuerpos en el vacio y sin influencias gravitatorias externas es de " + Fresultante + " N (Newtons.)" );
		
	}
		
}
