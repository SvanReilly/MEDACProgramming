package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Inserte un numero: ");
		int num = sc.nextInt();
		System.out.println("Inserte un numero: ");
		int num1 = sc.nextInt();
				
	    int suma = num + num1;
	    int resta = num - num1;
	    int mult = num * num1;
	    double div = (double) num / num1;
	    int mod = num%num1;
				
				System.out.println("El resultado de su operacion de modulo de los digitos " +num + " y " + num1 + " es: " + mod);
	}

}
