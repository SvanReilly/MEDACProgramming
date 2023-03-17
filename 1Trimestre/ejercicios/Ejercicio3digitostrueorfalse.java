package ejercicios;

import java.util.Scanner;

public class Ejercicio3digitostrueorfalse {
	public static void main(String[] args) {
		
		/* 3.- (REVISAR INCOMPLETO) Realiza un programa en Java que reciba por teclado un número de tres cifras
	 * y un número de una cifra. El programa devolverá true en caso de que el 
	 * número de un dígito aparezca dentro del número de tres dígitos. (INCOMPLETO)
	 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un n�mero de 3 cifras: ");
		int numerotrescifras = sc.nextInt();
		
		System.out.println("Escribe un n�mero de 1 cifra: ");
		int numerounacifra = sc.nextInt();
		
		
		int op3 = numerotrescifras % 10;  //numero de la derecha
		int op4 = (numerotrescifras)/100; //numero de la izquierda
		int op5 = (numerotrescifras - op3)/10;  //numero de en medio
		
		
		boolean conclusion= numerounacifra == op3 || numerounacifra == op4 || numerounacifra == op5;
		
		
		System.out.println("Conclusión: " + conclusion);	
		
		
		
		
		
		
		
	}

}
