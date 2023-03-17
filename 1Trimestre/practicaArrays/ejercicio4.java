package practicaArrays;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que lea el peso de cada una de las 20 ratas de
		 * laboratorio del departamento de Biología de la Nutrición. Calcular el peso
		 * medio de las ratas e imprimir un informe parecido al siguiente: hay 2 ratas
		 * que pesan 200 gramos hay 1 rata que pesa 350 gramos ... peso medio: 325.23
		 * gramos La introducción del peso no tiene que efectuarse ordenadamente, por
		 * eso, almacene los pesos en un vector y luego ordene el vector antes de
		 * imprimir las estadísticas.
		 */
		Scanner sc = new Scanner(System.in);

		int support;
		int contador = 0;
		int[] peso = new int[20];
		System.out.print("Inserte los valores del peso en gramos para cada rata: ");
		for (int i = 0; i < peso.length; i++) {
			peso[i] = sc.nextInt();
		}

		
		for (int i = 0; i < peso.length - 1; i++) {
			for (int j = 0; j < peso.length - i - 1; j++) {
				if (peso[j + 1] < peso[j]) {
					support = peso[j + 1];
					peso[j + 1] = peso[j];
					peso[j] = support;
				}
			}
		}
		
		for (int i = 0; i < peso.length - 1; i++) {
			contador++;
			if (peso[i] != peso[i + 1]) {
				System.out.println("Hay " + contador + " ratas con un peso de " + peso[i] + " gramos");
				contador = 0;
			}
			if (i == peso.length - 2) {
				contador++;
				System.out.println("Hay " + contador + " ratas con un peso de " + peso[i + 1] + " gramos");
			}
		}

		int pesomedio = 0;
		for (int i = 0; i < peso.length; i++) {
			pesomedio = pesomedio + peso[i];
		}
		pesomedio = pesomedio / peso.length;
		System.out.print("El peso medio de las 20 ratas es de " + pesomedio + " gramos.");
	}

}