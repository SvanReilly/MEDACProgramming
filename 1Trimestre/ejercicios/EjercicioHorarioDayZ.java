package ejercicios;

import java.util.Scanner;

public class EjercicioHorarioDayZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Un programa lee por teclado un numero entero entre 0-24 con las siguientes salidas: si el numero es entre 
		 * 00:00-6:00 = DayZ Enjoyer Time.
		 * 6:00-14:00= A dormir como un campeon.
		 * a las 15:00 = Granizada y pa' clase.
         * de 15:00 a 21:30 = Ojala tener programacion.
         * de 21:30 a 00:00 = Autorecreamiento y autocuidado.
		 */
		
				
		int hora, min;
		System.out.println("Ingrese las horas (de 00 a 23)");
		hora = sc.nextInt(); 
		System.out.println("Ingrese los minutos (de 00 a 59)");
		min= sc.nextInt();
		
		if (hora<00 || hora>23 || min<00 || min>59) {
				System.out.println("Inserte un formato válido para horas y minutos.");
		
		} else if ((hora>=00 && min>00) && (hora<=6 && min<=59)) {
				System.out.println("DayZ enjoyer time.");
		
		} else if ((hora>=06 && min>00) && (hora<=14 && min<=30)) {
				System.out.println("A dormir, crack.");
			
		} else if ((hora==14  &&  min==59)) {
				System.out.println("Granizada y a clase.");
			
		} else if ((hora>=15 && min>00) && (hora<=21 && min<=30)) {
				System.out.println("Ojala tener programacion.");

		} else if ((hora>=21 && min>30) && (hora<=00 && min<=00)) {
				System.out.println("Autorecreamiento y autocuidado.");
				
		}
	}
}
