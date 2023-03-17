package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicios10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String palabra_secreta, caracteres_ocultos = ""; // Declaración de variables
		int intentos_totales, i, posicion;
		char letra;

		System.out.print("Escriba una palabra a acertar: ");
		palabra_secreta = scanner.nextLine();
		intentos_totales = palabra_secreta.length() + ((palabra_secreta.length() * 50) / 100);// Los intentos totales
																								// será equivalentes al
																								// numero de letras que
																								// tenga la palabra
																								// insertada + su 50%.

		for (i = 0; i < palabra_secreta.length(); i++) { // Para establecer tantos guiones como caracteres tenga la palabra.
			caracteres_ocultos += "-";

		}
		System.out.println(caracteres_ocultos);

		do {
			if (intentos_totales > 0) { // Si los intentos totales son mayores que 0 entonces ejecutará los siguientes
										// comandos hasta el else

				System.out.println("Intentos disponibles: " + intentos_totales + "."); // Impresión en pantalla que
																						// mostrará los intentos
																						// restantes en cada iteración
																						// del Do.
				System.out.println("Inserte un letra (a-z): ");
				letra = scanner.next().charAt(0);

				for (posicion = 0; posicion < palabra_secreta.length(); posicion++) { // Para detectar el numero de
																						// posiciones en funcion del
																						// numero de caracteres de la
																						// palabra insertada.

					if (posicion == 0 && palabra_secreta.charAt(posicion) == letra) { // Si la posicion de la letra es 0
																						// y la posicion del caracter de
																						// la palabra es igual al de la
																						// letra los caracteres ocultos,
						caracteres_ocultos = letra + caracteres_ocultos.substring(1); // es decir los guiones se
																						// sustituirán por la letra
																						// insertada
					} else if (palabra_secreta.charAt(posicion) == letra) { // en caso en el que varios caracteres de la
																			// palabra secreta sean igual a la letra
																			// insertada,
						caracteres_ocultos = caracteres_ocultos.substring(0, posicion) + letra
								+ caracteres_ocultos.substring(posicion + 1); // los caracteres ocultos se sustituirán
																				// por tantos guiones como veces
																				// contenga esa letra en distintas
																				// posiciones
					}
				}
				System.out.println(caracteres_ocultos); // En el momento en el que el chequeo del segundo for termine
														// sin cumplir las condiciones del if y else if los intentos
														// disponibles disminuirán en 1.
				intentos_totales--; // y repetirá desde el comienzo el proceso, almacenando tanto los intentos
									// totales como las letras descubiertas
			} else { // Si los intentos totales llegan a 0 los intentos totaltes se ejecutará el
				break;		// break y seguidamente saltará al if que hay a continuación del while.
			
			}
		} while (!caracteres_ocultos.equals(palabra_secreta)); // Mientras los caracteres ocultos no sean los mismos a
																// los caracteres de la palabra insertada se repetira el
																// proceso (mientras no se acierte la palabra vaya)
		if (intentos_totales == 0) { // finalmente si los intentos totales llegan a 0 imprimirá el siguiente mensaje.
			System.out.println("Game over, pal. La palabra oculta era: " + palabra_secreta);
		} else { // en cuyo caso los intentos sean mayor que 0 y se hayan acertado todas las
					// letras de la palabra se imprimirá el siguiente mensaje.
			System.out.println("Felicidades, has acertado la palabra secreta.");

		}
	}
}
