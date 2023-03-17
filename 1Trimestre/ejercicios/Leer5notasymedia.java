package ejercicios;

import java.util.Scanner;

public class Leer5notasymedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nota 1");
		double nota1 = sc.nextDouble();
		System.out.println("Introduce nota 2");
		double nota2 = sc.nextDouble();
		System.out.println("Introduce nota 3");
		double nota3 = sc.nextDouble();
		System.out.println("Introduce nota 4");
		double nota4 = sc.nextDouble();
		System.out.println("Introduce nota 5");
		double nota5 = sc.nextDouble();
		
		double resultado = (nota1 + nota2 + nota3 + nota4 + nota5)/ 5;
		
		System.out.println("Tu nota media es " + resultado);
		
	}

}
