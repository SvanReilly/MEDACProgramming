package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int numIns, i, suma=0; //Declaraci�n de variables, 'n�mero insertado' e 'i' para el bucle FOR, 
							   // asimismo 'suma' con valor 0 para usarlo como acumulador de valores por iteraci�n del bucle.
		System.out.println("Inserte un n�mero entero por encima de 0: ");
		numIns=sc.nextInt();
		
		for (i = 1; i <=numIns; i++) {	// Ejecutando el bucle FOR en su forma m�s b�sica. Insertando un n�mero el valor de la 'i', partiendo desde el 1, ->...
										//...-> se ir� incrementando en +1 hasta que la i sea menor o igual que el valor del n�mero insertado.
					
					suma= suma+i; //El contador suma va almacenando el resultado en la misma variable por cada iteraci�n del BUCLE FOR.
								// cada i mostrada en cada iteraci�n se va sumando a 'suma' que parte su valor en 0. Es decir si insertamos un 3 
								// aparacer�n 3 valores para la 'i' y se ver�a algo as�:
								// i1 = 1, i2 = 2, i3 = 3, i4 = 4.
								// 1� iteraci�n de suma = 0 + i1 = 1.
								// 2� iteraci�n de suma = 0 + i1 + i2 = 3.
								// 3� iteraci�n de suma = 0 + i1 + i2 + i3 = 6.
								// 4� iteraci�n de suma = 0 + i1 + i2 + i3 + i4 = 10.
		}
				
			System.out.println("La sumatoria de N desde el valor 1 es: " + suma);
	
	}		
}
