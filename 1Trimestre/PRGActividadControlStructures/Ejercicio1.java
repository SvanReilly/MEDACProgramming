package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i; // Declaración de variables, 'número insertado' e 'i' para el bucle FOR
		System.out.println("Inserte un número entero por encima de 0: ");
		numIns=sc.nextInt(); // Pidiendo al usuario un valor (positivo en este caso) para el número insertado que, más tarde, será la referencia para el valor iterativo de la 'i'.
		
		System.out.println("El conteo de números hasta el número insertado es: ");
		
		for (i = 0; i <=numIns; i++) { // Ejecutando el bucle FOR en su forma más básica. Insertando un número el valor de la 'i' ->...
								      //...-> se irá incrementando en 1 hasta que la i sea menor o igual que el valor del número insertado.
			
		System.out.println( i );
		}
	}
}
