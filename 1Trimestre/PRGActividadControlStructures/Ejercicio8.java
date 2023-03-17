package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String fraseInv = "", frase; // Declarando el string que guardar� los caracteres en posici�n invertida de
										// 'frase'
		System.out.println("Escriba su frase a continuaci�n:");
		frase = sc.nextLine(); // Frase insertada

		int contador = 0, i, indice; // Declaraci�n

		for (i = 0; i < frase.length(); i++) { // Contador de vocales con el charAt() detectamos en cada iteraci�n la
												// presencia de cada vocal minuscula y/o mayuscula
			if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
					|| (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u') || (frase.charAt(i) == 'A')
					|| (frase.charAt(i) == 'E') || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O')
					|| (frase.charAt(i) == 'U')) {
				contador++; // el contador almacena cada iteraci�n realizada en cada detecci�n de vocales,
							// las suma y las almacena.

			}
		}

		for (indice = frase.length() - 1; indice >= 0; indice--) { // Frase insertada invertida. donde "indice" es igual
																	// al valor de la longitud de la frase,
																	// la frase invertida es igual a los car�cteres de
																	// la frase original con el parametro del
																	// "indice" del bucle for por lo que enviara las
																	// vocales en posicion invertida
			fraseInv += frase.charAt(indice);
		}

		System.out.println("La frase " + "''" + frase + "''" + " tiene " + contador + " vocales. "
				+ "La frase invertida es " + "''" + fraseInv + "''");
	}
}