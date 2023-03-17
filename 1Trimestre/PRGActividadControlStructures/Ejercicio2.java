package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i; // Declaraci�n de variables, 'n�mero insertado' e 'i' para el bucle FOR
		System.out.println("Inserte un n�mero entero por encima de 0: ");
		numIns=sc.nextInt(); // Pidiendo al usuario un valor (positivo en este caso) para el n�mero insertado que, m�s tarde, ser� la referencia para el valor iterativo de la 'i'.
		
		System.out.println("El conteo desde el n�mero insertado hasta 0 es: ");
		
		for (i=numIns; i >=0; i--) { // Ejecutando el bucle FOR en su forma m�s b�sica. Insertando un n�mero el valor de la 'i' ->...
		      						//...-> se ir� reeduciendo en 1 hasta que el valor de i sea mayor o igual a 0
			
		System.out.println( i );
		}
	}
}
