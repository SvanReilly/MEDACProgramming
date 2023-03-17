package EjemplosExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		boolean seguir = true;
		int edad = 0;

		do {

			try {
				edad = sc.nextInt();
				seguir=false;
				int [] holi= new int [2];
				holi[3]=0;
			} catch (InputMismatchException e) {
				System.out.println("TONTO");
				sc.next();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("TONTO pero de array");
				sc.next();
			}
			
		} while (seguir);

		System.out.println("Tu edad es: " + edad);

	}
}
