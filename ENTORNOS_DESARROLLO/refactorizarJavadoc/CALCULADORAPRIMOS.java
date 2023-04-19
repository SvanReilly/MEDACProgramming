package refactorizarJavadoc;

import java.util.Scanner;

/**
 * @class contiene un metodo principal que permite al usuario ingresar un número
 *        y luego verifica si el número es primo o no.
 * 
 * 
 * @version 1.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * @param numInsertado variable de tipo entero para almacenar el numero
 *                     insertado por consola por parte del usuario.
 * @param esPrimo      variable de tipo booleano para establecer si el numero
 *                     insertado es o no un numero primo
 * @param i            variable de tipo entero para recorrer el array
 */

public class CALCULADORAPRIMOS {

	public static void main(String[] args) {

		Scanner numScanner = new Scanner(System.in);

		boolean esPrimo = true;

		System.out.print("Ingrese un número: ");
		int numInsertado = numScanner.nextInt();

		if (numInsertado < 2) {
			System.out.println("El número debe ser mayor o igual a 2.");
		} else {

			for (int i = 2; i < numInsertado; i++) {
				if (numInsertado % i == 0) {
					esPrimo = false;
				}
			}
		}

		if (esPrimo) {
			System.out.println("El número es primo.");
		} else {
			System.out.println("El número no es primo.");
		}

	}

}