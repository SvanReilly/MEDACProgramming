package ejercicios;

import java.util.Scanner;

public class EjercicioCondicionales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escribir una estructura de control que examine el valor de una variable real llamada temp
		 * y escriba uno de los siguientes mensajes dependiendo de su valor:
		 * HIELO, si el valor de temp es menor que 0.
		 * AGUA, si el valor de temp se encuentra entre 0 y 100.
		 * VAPOR, si el valor de temp es mayor que 100
		 */
		
		
		System.out.println("Inserte un numero entero: ");
		int temp= sc.nextInt();
		
		if (temp<=0) {
			System.out.println("HIELO");
		} else if (temp<100) {
			System.out.println("AGUA");
		} else if (temp>=100){
			System.out.println("VAPOR");
			
	
		}
		
		
		
	}
}
