package refactorizarJavadoc;

import java.util.Scanner;

/**
 * Programa para calcular el valor promedio de una secuencia de 5 numeros enteros.
 *
 * @version 1.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * @see Scanner utilizado para leer la entrada del usuario desde la consola.
 * 
 * @param valorPromedio que almacena el valor promedio de los numeros de la secuencia. Se hace una conversion a decimal para obtener un valor mas preciso.
 * 
 * Este programa contiene una clase principal llamada VALORPROMEDIO que
 * solicita al usuario ingresar 5 numeros enteros, los almacena en un arreglo,
 * calcula la suma de los numeros y luego calcula el promedio de los mismos.
 * Finalmente, imprime en consola la suma y el promedio de los numeros ingresados.
 */
public class VALORPROMEDIO {

  /**
   * Metodo principal que inicia la ejecucion del programa.
   * @param args Argumentos de linea de comandos (util para la ejecucion del programa en consolas externas como CMD de Windows).
   */
  public static void main(String[] args) {


	  Scanner numScanner = new Scanner(System.in);


	  int[] secuenciaNumeros = new int[5];

	  System.out.println("Ingrese 5 numeros:");
	  for (int i = 0; i < 5; i++) {
	    secuenciaNumeros[i] = numScanner.nextInt();
	  }

	  int sumatorio = 0;
	  for (int i = 0; i < 5; i++) {
	    sumatorio += secuenciaNumeros[i];
	  }


	  double valorPromedio = (double) sumatorio / 5;

	  System.out.println("La suma de los numeros es: " + sumatorio);
	  System.out.println("El promedio de los numeros es: " + valorPromedio);

	}
}

