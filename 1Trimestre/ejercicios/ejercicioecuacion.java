package ejercicios;

import java.util.Scanner;

public class ejercicioecuacion {
	public static void main(String[] args) {
		/*
		 * Escriba un programa que tome por teclado 
		 * los coeficientes (a, b, c) de una ecuación de segundo grado y la resuelva.
		 */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Inserte valor para a");
	double a = sc.nextDouble();
	System.out.println("Inserte valor para b");
	double b = sc.nextDouble();
	System.out.println("Inserte valor para c");
	double c = sc.nextDouble();
	
	double resultado1 = (- b - (Math.sqrt((Math.pow(b, 2) - (4*a*c))))) / (2 * a);
	double resultado2 = (- b + (Math.sqrt((Math.pow(b, 2) - (4*a*c))))) / (2 * a);
	
	System.out.println("Los resultados de tu ecuación de segundo grado son: " + resultado1 + " y " + resultado2 + ".");
	}
	
}
