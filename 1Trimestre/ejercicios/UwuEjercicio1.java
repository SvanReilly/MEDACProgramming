package ejercicios;

import java.util.Scanner;

public class UwuEjercicio1{
	public static void main(String[] args) {
		 /*
		  * 1. Implemente un programa en Java que acepte un número entero por teclado, 
		  * representando un número en centímetros, y muestre por pantalla su descomposición 
		  * en metros y kilómetros. NOTA: Se debe utilizar el operador módulo. Un ejemplo de 
		  * ejecución es el siguiente: 
		  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un numero en cm con caracteres numericos: ");
		
		int numinsertado= sc.nextInt(); // Para recoger la cantidad de centímetros deseados para su descomposición
		int km= numinsertado / 100000; // Para calcular los kilómetros
		int kmResto= numinsertado % 100000; // Para calcular los metros
		int metros= kmResto / 100; // Para calcular los cm
		int mResto= kmResto % 100 ;
		int cm= mResto;
		
		System.out.println("La descomposicion resultante de " + numinsertado + " es:");
		System.out.println("Kilometros: " + km + ".");
		System.out.println("Metros: " + metros + ".");
		System.out.println("Centimetros:" + cm + ".");
	}
}
