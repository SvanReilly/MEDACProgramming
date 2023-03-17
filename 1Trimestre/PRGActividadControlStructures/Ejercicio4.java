package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int numIns, i, factorial=1; //Declaración de variables, 'número insertado' e 'i' para el bucle FOR, 
		   							// asimismo 'factorial' con valor 1 para usarlo como acumulador de valores por iteración del bucle.
		
		System.out.println("Inserte un número en valor absoluto: ");
		numIns=sc.nextInt();
		
		
		if (numIns==0) { // 
			System.out.println("El factorial de 0 es: " + (factorial-=1)); // Caso en el que el usuario inserte 0.
			
		} else {
			
		
		for (i = 1; i <=numIns; i++) {  // Ejecutando el bucle FOR en su forma más básica. Insertando un número el valor de la 'i', partiendo desde el 1, ->...
										//...-> se irá incrementando en +1 hasta que la i sea menor o igual que el valor del número insertado.
			System.out.println( i );
			
					factorial= factorial*i; //El contador factorial va almacenando el resultado en la misma variable por cada iteración del BUCLE FOR.
											// cada i mostrada en cada iteración se va multiplicando a 'factorial' que parte su valor en 1. Es decir si insertamos un 4 
											// aparacerán 4 valores para la 'i' y se vería algo así:
											// i1 = 1, i2 = 2, i3 = 3, i4 = 4.
											// 1ª iteración de factorial = 1 * i1 = 1.
											// 2ª iteración de factorial = 1 * i1 * i2 = 3.
											// 3ª iteración de factorial = 1 * i1 * i2 * i3 = 6.
											// 4ª iteración de factorial = 1 * i1 * i2 * i3 * i4 = 24.
		}
				
			System.out.println("El factorial de N desde el valor 1 es: " + factorial);
		}
	}		
}
