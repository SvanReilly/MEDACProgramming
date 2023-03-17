package ejercicios;

import java.util.Scanner;

public class CalcularEdad {
	public static void main(String[] args) {
		/* 
		 * Escribe un programa que lea desde teclado una fecha de nacimiento y 
		 * la fecha del dia de hoy e imprima por pantalla el numero de dias que 
		 * lleva viviendo, una fecha viene representada por 3 numeros enteros, aÃ±o, mes y dÃ­a
		 * Consideres que todos los aÃ±os tienen 365 dias y todos los meses 30 dÃ­as 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un aÃ±o: ");
		int año = sc.nextInt();
		System.out.println("Inserte un numero de mes: ");
		int mes = sc.nextInt();
		System.out.println("Inserte un dia: ");
		int dia = sc.nextInt();
		System.out.println("Inserte el aÃ±o actual: ");
		int añoA = sc.nextInt();
		System.out.println("Inserte un numero de mes actual: ");
		int mesA = sc.nextInt();
		System.out.println("Inserte el dia actual: ");
		int diaA = sc.nextInt();
		
		int añototal = (añoA - año) * 365;
		int mestotal = (mesA - mes) * 30;
		int diastotal = (añototal + mestotal) + (diaA - dia);
		int añoreales = diastotal / 365;
	
		System.out.println("Llevas viviendo " + diastotal + " dias, equivalente a " + añoreales + " año/s.");
	}

}
