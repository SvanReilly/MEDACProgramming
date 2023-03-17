package ejercicios;

import java.util.Scanner;

public class CalcularSalario {
	public static void main(String[] args) {
		/*
		 * Escriba un programa que imprima en la pantalla con el formato del ejemplo
		 * el salario semanal de una persona cuyas horas extras y horas semanales trabajadas son leídas
		 * por el teclado. Considere que en la empresa en la que trabaja dicha persona a 10€ la hora 
		 * y que las horas extras a 20€.
		 * 40 horas trabajadas y 15 horas extras corresponden a un salario semanal de 700€.
		 */
		Scanner sc = new Scanner(System.in);
		
		final int salariohoranormal = 10;
		final int salariohoraextra = 20;
		
	
		
		
		System.out.println("Horas normales trabajadas, número");
		double horasnormales = sc.nextDouble();
	    System.out.println("Horas extras trabajadas, número");
	    double horasextras = sc.nextDouble();
	    
	    double sueldo = (salariohoranormal * horasnormales) + (salariohoraextra * horasextras) ;
		
		
		System.out.println("El salario total semanal es: "+ sueldo + "€.");
		}

}
