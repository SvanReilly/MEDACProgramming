package ARRAYS;

public class ejercicio1 {
	public static void main(String[] args) {

		// crear un array de 10 posiciones

		int[] arraisito = new int[10];

		for (int i = 0; i < arraisito.length; i++) {
			arraisito[i] = i + 1;

		}
		for (int i = 0; i < arraisito.length; i++) {
			System.out.print(arraisito[i] + ", ");
		}
		
		
		
		
		for (int i = 1; i < arraisito.length; i += 2) {
			arraisito[i] = -arraisito[i];

		}
		System.out.println("");

		for (int i = 0; i < arraisito.length; i++) {
			System.out.print(arraisito[i] + ", ");
		}

	}
}
