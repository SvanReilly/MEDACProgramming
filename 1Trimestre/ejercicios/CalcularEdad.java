package ejercicios;

import java.util.Scanner;

public class CalcularEdad {
	public static void main(String[] args) {
		/* 
		 * Escribe un programa que lea desde teclado una fecha de nacimiento y 
		 * la fecha del dia de hoy e imprima por pantalla el numero de dias que 
		 * lleva viviendo, una fecha viene representada por 3 numeros enteros, año, mes y día
		 * Consideres que todos los años tienen 365 dias y todos los meses 30 días 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un año: ");
		int a�o = sc.nextInt();
		System.out.println("Inserte un numero de mes: ");
		int mes = sc.nextInt();
		System.out.println("Inserte un dia: ");
		int dia = sc.nextInt();
		System.out.println("Inserte el año actual: ");
		int a�oA = sc.nextInt();
		System.out.println("Inserte un numero de mes actual: ");
		int mesA = sc.nextInt();
		System.out.println("Inserte el dia actual: ");
		int diaA = sc.nextInt();
		
		int a�ototal = (a�oA - a�o) * 365;
		int mestotal = (mesA - mes) * 30;
		int diastotal = (a�ototal + mestotal) + (diaA - dia);
		int a�oreales = diastotal / 365;
	
		System.out.println("Llevas viviendo " + diastotal + " dias, equivalente a " + a�oreales + " a�o/s.");
	}

}
