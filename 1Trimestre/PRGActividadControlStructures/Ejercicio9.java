package PRGActividadControlStructures;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float random; // Declaración de variable float para random (en teoría el Math.random pide un double pero hice un cast a float más adelante.)
		int numIns, numRandom, contador=3; //Declaración de valores enteros para las variables de numero Insertado, numero Random, y para el contador que al ser 3 intentos le adjudicamos ese valor.
		
		do {
			random = (float) (Math.random()); // Cast de random hacia float, un poco de gratih.
			numRandom = (int) ((random) * 9); // Para calcular el numero aleatorio entre 1 y 9. También funcionaría sin el Do/While y "((random)*9 +1)" ->...
											  // ... -> pero lo deduje así y decidí dejarlo finalmente por donde me trajo la intuición, lel.
		} while (numRandom<1);
		System.out.println(numRandom);
		System.out.println("Acierte un número entre 1 y 9."); // Una impresión en pantalla para aclarar de qué va esto.
		
/////////////////////////////////////////////////////////////////////////////////////////
		
		do {System.out.println("Intentos disponibles: " + contador + "."); // Impresión en pantalla que mostrará los intentos restantes en cada iteración del Do.
			System.out.println("Inserte un número: ");
			numIns=sc.nextInt();
			contador--; // variable Int de valor inicial 3 que irá reduciendo en 1 por cada iteración.

		
		} while ((contador>0) && ((numIns<numRandom) || (numIns>numRandom))); //Mientras el contador esté por encima de 0 y además, el número insertado sea diferente al número random generado se repetirá el bucle.
			
			if ((numIns==numRandom)) { // Cuando el número insertado = número aleatorio imprimirá "El número insertado es el correcto."
				 System.out.println("El número " + numIns + " es el correcto.");
			
			} else {	// En caso de que el contador llegue a 0 y el número insertado siga siendo diferente saldrá el siguiente mensaje: "Juego terminado, camarada. Inténtelo más tarde."
					 System.out.println("Game over, pal. Try again later.");
				
			}
			
			
			
		}
	}
