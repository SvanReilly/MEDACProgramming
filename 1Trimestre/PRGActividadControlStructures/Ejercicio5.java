package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	
		
		int n1, n2=0, contador=0; // Declaración de variables de valor entero 'n1' (número insertado) 'n2=0' (numero que almacenará la suma de número insertados, sucesión de n1)
								// 'contador' variable que irá acumulando la cantidad de iteraciones del bucle Do/While hasta que termine el bucle insertando cualquier valor negativo
		
		float media; 	// Declaración de variable tipo float para calcular la media puramente hablando, sin aproximaciones y ahorrando algo de memoria.
				
		
		do {
			System.out.println("Inserte un numero entero: ");
			n1=sc.nextInt();
			
			if(n1>=0) { //Para evitar que sume la iteración a 'contador' al insertar el número negativo que acabaría con el bucle.
			n2+=n1; // En esta parte n2 irá acumlando los valores insertados por teclado como se aclara previamente.
			contador++; // 'contador' parte de 0 adquiriendo +1 por cada iteración
			}
			
		} while (n1 >= 0); // Aclarando que mientras el numero insertado por teclado sea mayor o igual a 0 se repetirá el proceso, insertar numero negativo para romper el ciclo.
		

		media = (float) n2/contador; // Casteo de los valores enteros de n2 y contador a float para calcular con mas precisión numérica la media de los valores.
		
		
		System.out.println("La media de la serie de numeros introducidos es: " + media );
		
		
	}
}