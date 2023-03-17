package ejercicios;

import java.util.Scanner;

public class EjercicioComparaci�nHoras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Escriba un programa que pida al usuario una hora determinada, que denominaremos h1,
		 * (pidiendo primero las horas expresadas en formato 00-23 horas, y a continuación los minutos).
		 * Posteriormente se pedirá al usuario otra hora h2.
		 * 
		 * El programa deberá indicar si h1 es posterior o anterior a h2. 
		 * 
		 * En el caso de ser posterior se mostrará un mensaje y se indicará cuantas horas y minutos han pasado.
		 * 
		 * En el caso de ser anterior se mostrará un mensaje similar al primer caso indicando las horas y minutos que faltan.
		 *
		 */
		
		int h1, h2;
		int min1, min2;
		
		System.out.println("Inserte un numero de horas (entre 00-23).");
		h1= sc.nextInt();
		System.out.println("Inserte un numero de minutos (entre 00-59)");
		min1= sc.nextInt();
		
		System.out.println("Inserte de nuevo un numero de horas (entre 00-23)");
		h2= sc.nextInt();
		System.out.println("Inserte un de nuevo un numero de minutos (entre 00-59)");
		min2= sc.nextInt();
		
		int hR1 = h1 - h2; //Calcular la diferencia cuando h1>h2.
		int hR2 = h2 - h1; // Calcular la diferencia cuando h1<h2.
		int minR1 = min1 - min2; //Calcular la diferencia cuando min1>min2.
		int minR2 = min2 - min1; //Calcular la diferencia cuando min1<min2.
		
		if (h1<00 || h1>23 || min1<00 || min1>59|| h2<00 || h2>23 || min2<00 || min2>59) {
			System.out.println("Inserte un formato de horas y minutos válido.");
		
		} else if ((h1==h2)&&(min1==min2)) {
			System.out.println("La diferencia de tiempo entre las horas y minutos insertados es 0.");
		
		} else if ((h1==h2) && (min1>min2)) {
			System.out.println("Quedan 24 horas y " + minR1 + " minutos.");
		} else if ((h1==h2) && (min1<min2)) {
			System.out.println("Quedan 0 horas y " + minR2 + " minutos.");
			
			
		} else if ((h1>h2)&&(min1>min2)) {
			System.out.println("Quedan " + hR1 + " horas y " + minR1 + " minutos.");
			
		} else if ((h1<h2)&&(min1<min2)) {
			System.out.println("Quedan " + hR2 + " horas y " + minR2 + " minutos.");
			
		} else if ((h1>h2)&& (min1<min2)) {
			System.out.println("Quedan " + hR1 + " horas y " + minR2 + " minutos.");
			
		} else if ((h1<h2) && (min1>min2)) {
			System.out.println("Quedan " + hR2 + " horas y " + minR1 + " minutos.");
			
		}
	}
}