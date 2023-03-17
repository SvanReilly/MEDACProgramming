package Ejemplos;
/*
 * Cómo Usar Acumuladores (Sumatorios) en Java
 * Un Acumulador (o Sumatorio) es una variable numérica (entero o real) que acumula/suma un conjunto de valores.
 * Por ejemplo, para sumar todos los valores de una lista.
 * Para usar un acumulador hay que: declararlo, inicializarlo, incrementarlo (cuando corresponda) y consultarlo. 
 * Veamos un ejemplo:
 */
public class Acumulador {
	public static void main(String[] args) {
		int[] lista = new int[100]; // Lista de números enteros que supondremos llena.
		int acumulador = 0; // Declaramos e inicializamos el acumulaador.

		for (int i = 0; i < 100; i++)
			acumulador += lista[i]; // Incrementamos el acumulador

		// Al finalizar el programa, el acumulador nos da el valor de la suma.
		System.out.println("La suma es " + acumulador);
	}
}
// El mismo concepto puede aplicarse a Productorios (multiplicación), Divisorios, Sustractorios
// o incluso "Modulorios" (módulo de división entera).