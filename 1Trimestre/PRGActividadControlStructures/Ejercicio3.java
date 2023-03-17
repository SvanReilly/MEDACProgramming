package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int numIns, i, suma=0; //Declaración de variables, 'número insertado' e 'i' para el bucle FOR, 
							   // asimismo 'suma' con valor 0 para usarlo como acumulador de valores por iteración del bucle.
		System.out.println("Inserte un número entero por encima de 0: ");
		numIns=sc.nextInt();
		
		for (i = 1; i <=numIns; i++) {	// Ejecutando el bucle FOR en su forma más básica. Insertando un número el valor de la 'i', partiendo desde el 1, ->...
										//...-> se irá incrementando en +1 hasta que la i sea menor o igual que el valor del número insertado.
					
					suma= suma+i; //El contador suma va almacenando el resultado en la misma variable por cada iteración del BUCLE FOR.
								// cada i mostrada en cada iteración se va sumando a 'suma' que parte su valor en 0. Es decir si insertamos un 3 
								// aparacerán 3 valores para la 'i' y se vería algo así:
								// i1 = 1, i2 = 2, i3 = 3, i4 = 4.
								// 1ª iteración de suma = 0 + i1 = 1.
								// 2ª iteración de suma = 0 + i1 + i2 = 3.
								// 3ª iteración de suma = 0 + i1 + i2 + i3 = 6.
								// 4ª iteración de suma = 0 + i1 + i2 + i3 + i4 = 10.
		}
				
			System.out.println("La sumatoria de N desde el valor 1 es: " + suma);
	
	}		
}
