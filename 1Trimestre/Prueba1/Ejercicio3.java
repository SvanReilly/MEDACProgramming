package Prueba1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num1, num2;// Declarando la 2 variables enteras necesarias para realizar la operación.
			
			
			System.out.println("Introduzca el primer numero entero: ");
			num1=sc.nextInt();
			
			System.out.println("Introduzca el segundo numero entero: ");
			num2=sc.nextInt();
			
			byte forbyte= (byte) (num1/num2); /* Declarando la variable de tipo byte y
			posteriormente a la inicialización de num1 y num2 como datos de tipo entero se realiza el casting 
			de la operación para que el resultado obtenido pase a ser de tipo byte.
			 * 
			 */
			
			System.out.println("El valor de la división en formato byte es: " + forbyte);
	}
}