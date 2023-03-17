package ejercicios;

import java.util.Scanner;

public class EurosPesetas {
	public static void main(String[] args) {
		final double conversion =166.386;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce euros a convertir: ");
		double euros = sc.nextDouble();
		
	    double resultado = euros*conversion;
		
		System.out.println("El resultado de tu conversion es " + resultado);
	}

}
