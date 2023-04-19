package refactorizarJavadoc;

/**
 * Programa de suma de enteros.
 * 
 * @version 1.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * 
 *         Este programa contiene una clase principal llamada SUMAENTEROS que
 *         realiza la suma de dos números enteros utilizando dos métodos: - El
 *         método 'sumar' que recibe dos enteros como parámetros y devuelve la
 *         suma de ambos. - El método 'imprimirResultado' que imprime en consola
 *         el resultado de la suma de dos números enteros junto con los números
 *         utilizados. El programa realiza varias sumas con diferentes números
 *         de ejemplo utilizando los métodos mencionados.
 */

public class SUMAENTEROS {

	   /** Realiza la suma de dos números enteros.
	 	* 
	 	* @param a Primer número entero a sumar.
	 	* 
	 	* @param b Segundo número entero a sumar.
	 	* 
	 	* @return La suma de los dos números enteros.
	 	*/
	public static int sumar(int a, int b) {
		return a + b;
	}

	  /**
	   * Imprime en consola el resultado de la suma de dos números enteros junto con los números utilizados.
	   * 
	   * @param a Primer número entero sumado.
	   * @param b Segundo número entero sumado.
	   * @param resultado El resultado de la suma de los dos números enteros.
	   */
	public static void imprimirResultado(int a, int b, int resultado) {
		System.out.println("La suma de " + a + " y " + b + " es " + resultado);
	}

	
	  /**
	   * Imprime en consola el resultado de la suma de dos números enteros junto con los números utilizados.
	   * 
	   * @param num1, num2, num3, num4, num5, num6 Primer número entero sumado.
	   * @param  Segundo número entero sumado.
	   * @param resultado1, resultado2, resultado3 variable de tipo entero que almacena los diferentes resultados.
	   */
	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		int resultado1 = sumar(num1, num2);
		imprimirResultado(num1, num2, resultado1);

		int num3 = 4, num4 = 5;
		int resultado2 = sumar(num3, num4);
		imprimirResultado(num3, num4, resultado2);

		int num5 = 6, num6 = 7;
		int resultado3 = sumar(num5, num6);
		imprimirResultado(num5, num6, resultado3);
	}

}
