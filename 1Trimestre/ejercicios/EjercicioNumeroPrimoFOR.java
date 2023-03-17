package ejercicios;

import java.util.Scanner;

public class EjercicioNumeroPrimoFOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i;
		System.out.println("Inserte un numero entero para comprobar si es primo o no: ");
		numIns=sc.nextInt();
		
		boolean primo = true;
		
		if (numIns==0 || numIns == 1) {
			System.out.println(numIns+ " no es un numero primo.");
		} else if (numIns==4) {
				System.out.println(numIns+ " es un numero compuesto.");
				
			
		} else {
			
				
		for (i=2; i<(numIns); i++) {
		
			if (numIns%i==0) {
				primo=false;
			}
		}	
			if (primo) {
				System.out.println(numIns+ " es un numero primo.");
			
				
		}	else {
		
			System.out.println(numIns + " es un numero compuesto.");
			
		  	}
		}
	}
}