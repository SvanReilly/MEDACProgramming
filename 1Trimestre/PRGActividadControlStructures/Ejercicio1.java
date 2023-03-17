package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i; // Declaraci�n de variables, 'n�mero insertado' e 'i' para el bucle FOR
		System.out.println("Inserte un n�mero entero por encima de 0: ");
		numIns=sc.nextInt(); // Pidiendo al usuario un valor (positivo en este caso) para el n�mero insertado que, m�s tarde, ser� la referencia para el valor iterativo de la 'i'.
		
		System.out.println("El conteo de n�meros hasta el n�mero insertado es: ");
		
		for (i = 0; i <=numIns; i++) { // Ejecutando el bucle FOR en su forma m�s b�sica. Insertando un n�mero el valor de la 'i' ->...
								      //...-> se ir� incrementando en 1 hasta que la i sea menor o igual que el valor del n�mero insertado.
			
		System.out.println( i );
		}
	}
}
