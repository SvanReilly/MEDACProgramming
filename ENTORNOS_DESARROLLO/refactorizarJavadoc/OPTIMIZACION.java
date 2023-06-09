package refactorizarJavadoc;

/**
 * @version 2.0
 * @since 2023/04/19
 * @author Alejandro Ortega Maldonado
 * 
 * Esta clase contiene varios métodos, cuya funcion es el calculo del producto de numeros enteros,
 * obtener el valor mas alto dentro de un array, elevar un numero entero a otro ambos numeros insertados
 * por parametro y el calculo del factorial de un numero insertado pasado por parametro, respectivamente.
 */
public class OPTIMIZACION {
	public static int productoEnteros(int factor1, int factor2) {
		int producto = factor1 * factor2;

		return producto;
	}

	/**
	 * @version 2.0
	 * @since 2023/04/19
	 * @author Alejandro Ortega Maldonado
	 * @param arrayEnteros array de tipo entero el cual será recorrido por el metodo para obtener finalmente el valor mas alto de entre todas las posiciones del mismo.
	 * 
	 */
	public static int valorMax(int[] arrayEnteros) {
		int maxValue = -1000000;
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] > maxValue) {
				maxValue = arrayEnteros[i];
			}
		}
		return maxValue;
	}

	/**
	 * @version 2.0
	 * @since 2023/04/19
	 * @author Alejandro Ortega Maldonado
	 * @param base      numero entero sobre el cual se aplicara el valor del
	 *                  exponente para obtener el resultado de su elevación
	 * @param exponente numero entero que determinara el numero de veces el cual se
	 *                  multiplicara la base por si misma
	 * @see Math utilizado el metodo .pow(x,y) de la case Math para realizar la operacion de elevar un numero
	 */
	public static int elevarEntero(int base, int exponente) {
		int resultadoElevar = (int) Math.pow(base, exponente);
		return resultadoElevar;
	}

	/**
	 * @version 2.0
	 * @since 2023/04/19
	 * @author Alejandro Ortega Maldonado
	 * @param numInsertado variable de tipo entero pasado por parametro para la ejecucion del metodo.
	 * @return factorial Devuelve el resultado del factorial del numero insertado por parametro.
	 */
	public static int factorialNumIns(int numInsertado) {
		int factorial;
		if (numInsertado == 0) {
			factorial = 0;
			numInsertado = 1;
		}
		factorial = 1;
		for (int i = 1; i <= numInsertado; i++) {
			factorial *= i;
		}
		return factorial;
	}

	/**
	 * @version 2.0
	 * @since 2023/04/19
	 * @author Alejandro Ortega Maldonado
	 * @param args un array de Strings.
	 * 
	 */
	public static void main(String[] args) {

		// prueba productoEnteros
		int factor1 = 4;
		int factor2 = 5;
		int producto = productoEnteros(factor1, factor2);
		System.out.println("El producto de los enteros insertados es " + producto);

		// prueba valorMax
		int[] arrayEnteros = { 5, 2, 7, 4, 1, 100 };
		int maxValue = valorMax(arrayEnteros);
		System.out.println("El valor mas alto del array es " + maxValue);

		// prueba elevarEntero
		int base = 3;
		int exponente = 4;
		int resultadoElevar = elevarEntero(base, exponente);
		System.out.println(base + " elevado a " + exponente + " es igual a " + resultadoElevar);

		// prueba factorialNumIns
		int numeroInsertado = 4;
		int factorialNumIns = factorialNumIns(numeroInsertado);
		System.out.println("El factorial de " + numeroInsertado + " es " + factorialNumIns);
	}
}
