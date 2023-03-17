package ejercicios;

import java.util.Scanner;

public class EjercicioRndm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Haz un programa que inserte un numero de 3 cifras, seguidamente inserte un numero para que el pograma te responda
		 * true si coincide el numero de una cifra con alguna de las 3 mencionadas anteriormente y false
		 * si no coincide con ninguna
		 *
		 */
		
		int num, cifra, cifra1, cifra2, cifra3;
		
		System.out.println("Inserte un numero de 3 cifras: ");
		num=sc.nextInt();
		System.out.println("Introduce un numero de 1 cifra: ");
		cifra=sc.nextInt();
		
		
		cifra1=num%10;
		num=num/10;
		cifra2=num%10;
		num=num/10;
		cifra3=num%10;
		
		boolean resultado = cifra1 == cifra || cifra2== cifra || cifra3== cifra;
		System.out.println(resultado);
		
		
		
		
		
		
	}

}
