package Ejemplos;

import java.util.Scanner;

public class VariableFOR {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	/*
	 * 
	 */
		System.out.println("Inserte un numero entero para ejecutar el bucle FOR: ");
		int i=sc.nextInt();
	
		for (i++; i<=28;i++) {
	System.out.println(i);
		}
	}
}
