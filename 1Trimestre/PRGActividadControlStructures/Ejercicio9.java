package PRGActividadControlStructures;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float random; // Declaraci�n de variable float para random (en teor�a el Math.random pide un double pero hice un cast a float m�s adelante.)
		int numIns, numRandom, contador=3; //Declaraci�n de valores enteros para las variables de numero Insertado, numero Random, y para el contador que al ser 3 intentos le adjudicamos ese valor.
		
		do {
			random = (float) (Math.random()); // Cast de random hacia float, un poco de gratih.
			numRandom = (int) ((random) * 9); // Para calcular el numero aleatorio entre 1 y 9. Tambi�n funcionar�a sin el Do/While y "((random)*9 +1)" ->...
											  // ... -> pero lo deduje as� y decid� dejarlo finalmente por donde me trajo la intuici�n, lel.
		} while (numRandom<1);
		System.out.println(numRandom);
		System.out.println("Acierte un n�mero entre 1 y 9."); // Una impresi�n en pantalla para aclarar de qu� va esto.
		
/////////////////////////////////////////////////////////////////////////////////////////
		
		do {System.out.println("Intentos disponibles: " + contador + "."); // Impresi�n en pantalla que mostrar� los intentos restantes en cada iteraci�n del Do.
			System.out.println("Inserte un n�mero: ");
			numIns=sc.nextInt();
			contador--; // variable Int de valor inicial 3 que ir� reduciendo en 1 por cada iteraci�n.

		
		} while ((contador>0) && ((numIns<numRandom) || (numIns>numRandom))); //Mientras el contador est� por encima de 0 y adem�s, el n�mero insertado sea diferente al n�mero random generado se repetir� el bucle.
			
			if ((numIns==numRandom)) { // Cuando el n�mero insertado = n�mero aleatorio imprimir� "El n�mero insertado es el correcto."
				 System.out.println("El n�mero " + numIns + " es el correcto.");
			
			} else {	// En caso de que el contador llegue a 0 y el n�mero insertado siga siendo diferente saldr� el siguiente mensaje: "Juego terminado, camarada. Int�ntelo m�s tarde."
					 System.out.println("Game over, pal. Try again later.");
				
			}
			
			
			
		}
	}
