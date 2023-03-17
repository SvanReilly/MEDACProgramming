package ejercicios;

import java.util.Scanner;

public class Copia3digitoscomparacion {
	public static void main(String[] args) {
		
		/* 3.- (REVISAR INCOMPLETO) Realiza un programa en Java que reciba por teclado un número de tres cifras
	 * y un número de una cifra. El programa devolverá true en caso de que el 
	 * número de un dígito aparezca dentro del número de tres dígitos. (INCOMPLETO)
	 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número de 3 cifras");
		int numerotrescifras= sc.nextInt();
		
		System.out.println("Escribe un número de 1 cifra");
		int numerounacifra= sc.nextInt();
		
		int op2= numerotrescifras % 100;
		int op3= numerotrescifras % 10;  //numero de la derecha
		int op4 = (numerotrescifras - op2)/100; //numero de la izquierda
		int op5 = (op2 - op3)/10;  //numero de en medio
		
		
		boolean conclusion= numerounacifra == op3 || numerounacifra == op4 || numerounacifra == op5;
		
		
		System.out.println("Conclusión: " + conclusion);	
		
		
		
		
		
		
		
	}

}
