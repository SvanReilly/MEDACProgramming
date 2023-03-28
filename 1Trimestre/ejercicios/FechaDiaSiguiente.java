package ejercicios;

import java.util.Scanner;

public class FechaDiaSiguiente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Escribe un programa que lea una fecha representada por 3 datos de tipo entero e imprima
		 * en la pantalla la fecha correspondiente al d�a siguiente. 
		 */
		
		int diaIns, diaSg, mesIns, mesSg, anoIns, anoSg;		
		
		System.out.println("Inserta un d�a del mes (numero): ");
		diaIns = sc.nextInt();
		
		System.out.println("Inserta un mes del a�o (numero): ");
		mesIns = sc.nextInt();
		
		System.out.println("Inserta un a�o (numero): ");
		anoIns = sc.nextInt();
		
		if (diaIns>31 || diaIns<1 || mesIns<1 || mesIns>12)
			System.out.println("Ingrese una fecha valida, calambuco/a.");
		
		
		if (mesIns==12 && diaIns==31) { //Para pasar al ano siguiente.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 1) + "/" + (mesSg= 1) + "/" + (anoIns + 1));
			
		} else if (diaIns== 30 && (mesIns== 4 || mesIns== 6 || mesIns== 9 || mesIns== 11)) { //Para meses de 30 días.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 1) + "/" + (mesSg= 1 + mesIns) + " del a�o " + (anoIns));
			
		} else if (diaIns== 31 && (mesIns== 1 || mesIns==3 || mesIns==5 || mesIns==7 || mesIns==8 || mesIns== 10)) { // Para meses de 31 d�as.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 1) + "/" + (mesSg= 1 + mesIns) + "/" + (anoIns));
			
		} else if (diaIns== 28 && mesIns==2) { // Para febrero. Sin ser bisiesto.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 1) + "/" + (mesSg= 1 + mesIns) + "/" + (anoIns));
		
		} else if (diaIns== 28 && mesIns==2 && anoIns%4==0) { // Para 28 de febrero. Siendo bisiesto.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 29) + "/" + mesIns + "/" + anoIns);
			
		} else if (diaIns== 29 && mesIns==2 && anoIns%4==0) { // Para 29 de febrero. Siendo bisiesto.
			System.out.println("La fecha siguiente ser�a: " + (diaSg= 1) + "/" + (mesSg=mesIns + 1) + "/" + anoIns);
		
			
		}
		
	}

}
