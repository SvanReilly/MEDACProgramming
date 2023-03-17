package ejercicios;

import java.util.Scanner;

public class EjerciciosEstructurasdeControl3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Realizar un programa que lea un número y diga si es o no capicúo.
		
		long numIns, numIns2, numInv = 0, resto;
			
		
		System.out.println("Inserte un numero para su comprobacion: ");
		numIns2 = numIns = sc.nextLong();
		
		
		while (numIns > 0) { 
				resto = numIns % 10;
				numInv = numInv * 10 + resto;
				numIns = numIns / 10; 		
			
		}	
		   
		if (numIns2==numInv) {
			System.out.println("El numero insertado ES capicuo.");
			
			
		}	else  {
			System.out.println("El numero insertado NO ES capicuo.");
		  	
		  
		}	
	}
}