package ARRAYS;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantas calificaciones serán?");
		int cantidad = sc.nextInt();
		double total = 0, media = 0;
		int[] calificacion = new int[cantidad];

		System.out.println("Introduce tus notas: ");
		for (int i = 0; i < calificacion.length; i++) {
			calificacion[i] = sc.nextInt();
		}

		for (int i = 0; i < calificacion.length; i++) {
			total += calificacion[i];
			media = total / cantidad;
		}

		System.out.println("Las calificaciones insertadas son las siguientes: \n");
		for (int i = 0; i < calificacion.length; i++) {

			System.out.println(calificacion[i]);
		}

		System.out.println("\nLa media de las calificaciones citadas es: " + media);

	}
}
