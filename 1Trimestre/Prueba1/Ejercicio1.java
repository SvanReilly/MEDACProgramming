package Prueba1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int billetes1, billetes2; 
			/*Declarando variables de tipo entero que nos pedirán mas adelante, ya sea el número de billetes inicial (billetes1)
			 * la cantidad a pagar (pago) y la cantidad de billetes necesarios (billetes2)
			 */
			
			float pago, euros;// Declarando el valor de euros restantes en double ... un poco porque me rallaba ver que en la muestra aparecia como 3.0 euros.
			
			System.out.println("Introduce el tipo de billetes que tienes (sea 5, 10, 20, 50, 100 o 200): ");
			billetes1=sc.nextInt();
			
			System.out.println("Introduce la cantidad a pagar: ");
			pago=sc.nextFloat();
			
			billetes2 = (int) (pago / billetes1); // De esta forma sabemos cuantos billetes son necesarios para cubrir el pago.
			euros = (float) (pago % billetes1);// De esta forma salvamos el dato único de los euros restantes que no cubren los billetes insertados.
			
			
			
			System.out.println("Debes usar " + billetes2 + " billetes y te faltarían por pagar " + euros + " euros.");
			
			
			
			
			
			
	}
}
