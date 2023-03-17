package Prueba1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double y, z, resultadoX; // Declarando variables del valor y, z y para albergar el resultado de la x.
			final double C = 356.18;// Declarando constante de C, en este caso 356.18
			System.out.println("Introduce un valor numerico para la Z: ");
			z=sc.nextDouble();
			System.out.println("Introduce un valor numerico para la Y: ");
			y=sc.nextDouble();
			
		    resultadoX = ((C * ((Math.pow(z, 2)) * (Math.pow(y,2)))) / (z+C)); 
		    //aplicando la ecuación con sus debidos paréntesis respetando la jerarquia en las operaciones segun se presenta en la fórmula. 
			
			System.out.println("El valor de X es: " + resultadoX);
	}
}