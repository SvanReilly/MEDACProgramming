package ejercicios;

import java.util.Scanner;

public class FechaDiaSiguienteResuelto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Escribe un programa que lea una fecha representada por 3 datos de tipo entero e imprima
		 * en la pantalla la fecha correspondiente al día siguiente. 
		 */
		
		int dia,mes,año;
		System.out.println("Dime dia");
		dia=sc.nextInt();
		System.out.println("Dime mes");
		mes=sc.nextInt();
		System.out.println("Dime año");
		año=sc.nextInt();
		
		if (dia>31 || dia<1 || mes<1 || mes>12)
			System.out.println("Ingrese una fecha valida, calambuco/a.");
		
		if(dia<=27 || dia==29) {
			if(dia == 29 && mes == 2 && año % 4 ==0) {
				dia=1;
				mes++;
			} else {
				dia++; //dia=dia+1;
			}
			
		} else if(dia==28) {
			if(mes==2 && año % 4!=0) {
				dia=1;
				mes++;
			} else {
				dia++;
			}
		} else if(dia==30) {
			if(mes==4 || mes==6 || mes==9 || mes==11) {
				dia=1;
				mes++;
			}else {
				dia++;
			}
		} else {
			if(mes==12) {
				dia=1;
				mes=1;
				año++;
			} else {
				dia=1;
				mes++;
			}
		}
		
		
		
		System.out.println("La fecha siguiente serÃ­a: " + dia + "/" + mes + "/"+ año);
		
	}
}
