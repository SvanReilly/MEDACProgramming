package ARRAYS;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] fiveNum= new int[5]; //Declaración del array de tipo entero.
		double total = 0, media = 0, varianza=0, totaldif=0;
		System.out.println("Inserte 5 números: ");
		
		for (int i = 0; i < fiveNum.length; i++) {
			fiveNum[i]= sc.nextInt();
		}
		
		for (int i = 0; i < fiveNum.length; i++) { //Calculando la media artimética//
			total += fiveNum[i];
			media = total / fiveNum.length;
		}
		
		System.out.println("Los 5 números insertados son los siguientes: ");
		for (int i = 0; i < fiveNum.length; i++) { //Mostrando los valores insertados

		System.out.print(fiveNum[i] + " ");
	}
		System.out.println("\nLa media de los 5 números citados es: " + media);

		for (int i = 0; i < fiveNum.length; i++) { //Calculando la varianza.
			total += fiveNum[i];
			media = total / fiveNum.length;
			fiveNum[i]-=media;
			fiveNum[i]= (int) Math.pow(fiveNum[i], 2);
			totaldif+=fiveNum[i];
			varianza= totaldif/fiveNum.length;
			
		} System.out.println("El valor de la varianza de los 5 numeros es: " + varianza);
		double desvStandard= Math.sqrt(varianza);
		System.out.println("El valor de la desviación estándar es: " + desvStandard);
		
		
	}
	
}
