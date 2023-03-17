package practicaArrays;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* En un experimento de física se lanzan a la vez desde una determinada altura 5 objetos 
		 * de diferente masa y superficie de rozamiento. Escriba un programa que lea el tiempo en 
		 * segundos en que se produce la llegada al suelo de cada objeto en el orden en el que van 
		 * cayendo. Una vez leídos los 5 números, el programa deberá de imprimir por pantalla la lista 
		 * de tiempos de llegada de los objetos con respecto al primero. 
		 * Por ejemplo, si los tiempos son 5, 6, 8, 11 y 15, el programa 
		 * deberá de devolver la lista de diferencias de tiempos siguiente: 
		 * 0, 1, 3, 6, 10.
		 */
		int segundos []= new int [5];
		int diferencia [] = new int[5];
		System.out.println("Introduzca los 5 valores en segundos: ");
		
		for (int i = 0; i < segundos.length; i++) {
			segundos [i] = sc.nextInt()	;
			
		}
		
		System.out.println("La diferencia de tiempos de caída respecto al primero son: ");
		
		for (int i = 0; i < segundos.length; i++) {
			diferencia [i] = segundos[i] - segundos[0];
			
		}System.out.println(diferencia[0] + "s, " + diferencia[1] + "s, " + diferencia[2] +"s, " + diferencia [3] +"s y " + diferencia [4] +"s." );
	}
}

