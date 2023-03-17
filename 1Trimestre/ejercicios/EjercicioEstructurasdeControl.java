package ejercicios;

import java.util.Scanner;

public class EjercicioEstructurasdeControl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	/*
	 * Realizar un programa que lea una serie de números y obtenga su media. Un numero negativo indicará el fin de datos.
	 */
		
		int n1, n2=0, contador;
		double media;
		contador = 0;
		do {
			System.out.println("Inserte un numero entero: ");
			n1=sc.nextInt();
			if (n1>=0) {
			n2+=n1;
			contador++;
			}
			
		} while (n1 >= 0);
		

		media = n2/contador;
		
		
		System.out.println("La media de la serie de numeros introducidos es: " + media );
		
		
	}
}