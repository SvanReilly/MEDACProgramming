package refactorizarJavadoc;

import java.util.Scanner;

/*
 * Programa para calcular el valor promedio de una secuencia de 5 números enteros.
 *
 * @version 1.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * 
 * 
 * @param valorPromedio que almacena el valor promedio de los números de la secuencia. Se hace una conversion a decimal para obtener un valor mas preciso.
 * 
 * Este programa contiene una clase principal llamada VALORPROMEDIO que
 * solicita al usuario ingresar 5 números enteros, los almacena en un arreglo,
 * calcula la suma de los números y luego calcula el promedio de los mismos.
 * Finalmente, imprime en consola la suma y el promedio de los números ingresados.
 */
public class VALORPROMEDIO {

  /*
   * Método principal que inicia la ejecución del programa.
   * @param args Argumentos de línea de comandos (util para la ejecucion del programa en consolas externas como CMD de Windows).
   */
  public static void main(String[] args) {

	  /*
	   * @see Scanner utilizado para leer la entrada del usuario desde la consola.
	   */
	  Scanner numScanner = new Scanner(System.in);


	  int[] secuenciaNumeros = new int[5];

	  System.out.println("Ingrese 5 números:");
	  for (int i = 0; i < 5; i++) {
	    secuenciaNumeros[i] = numScanner.nextInt();
	  }

	  int sumatorio = 0;
	  for (int i = 0; i < 5; i++) {
	    sumatorio += secuenciaNumeros[i];
	  }


	  double valorPromedio = (double) sumatorio / 5;

	  System.out.println("La suma de los números es: " + sumatorio);
	  System.out.println("El promedio de los números es: " + valorPromedio);

	}
}

