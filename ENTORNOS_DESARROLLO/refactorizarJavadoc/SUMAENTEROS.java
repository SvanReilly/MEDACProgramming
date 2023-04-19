package refactorizarJavadoc;

/**
 * Programa de suma de enteros.
 * 
 * @version 1.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * 
 *         Este programa contiene una clase principal llamada SUMAENTEROS que
 *         realiza la suma de dos numeros enteros utilizando dos metodos estaticos.
 *         
 */

public class SUMAENTEROS {

	   /** Realiza la suma de dos numeros enteros.
	 	* 
	 	* @param a Primer numero entero a sumar.
	 	* 
	 	* @param b Segundo numero entero a sumar.
	 	* 
	 	* @return La suma de los dos numeros enteros.
	 	*/
	public static int sumar(int a, int b) {
		return a + b;
	}

	  /**
	   * Metodo que imprime en consola el resultado de la suma de dos numeros enteros junto con los numeros utilizados.
	   * 
	   * @param a Primer numero entero sumado.
	   * @param b Segundo numero entero sumado.
	   * @param resultado El resultado de la suma de los dos numeros enteros.
	   */
	public static void imprimirResultado(int a, int b, int resultado) {
		System.out.println("La suma de " + a + " y " + b + " es " + resultado);
	}

	
	  	/**
		 * Metodo que imprime en consola el resultado de la suma de dos numeros enteros junto con
		 * los numeros utilizados.
		 * 
		 * @param num1 variable de tipo entero que almacena un valor.
		 * @param num2 variable de tipo entero que almacena un valor.
		 * @param num3 variable de tipo entero que almacena un valor.
		 * @param num4 variable de tipo entero que almacena un valor.
		 * @param num5 variable de tipo entero que almacena un valor.
		 * @param num6 variable de tipo entero que almacena un valor.
		 * @param resultado1 variable de tipo entero que almacena el 1er resultado.
		 * @param resultado2 variable de tipo entero que almacena el 2do resultado.
		 * @param resultado3 variable de tipo entero que almacena el 3er resultado.
		 *                    
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
