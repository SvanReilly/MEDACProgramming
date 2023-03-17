package ejercicios;

import java.util.Scanner;

public class EjercicioTiempo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int horas,minutos,segundos,totalsegs;
		
		System.out.println("Introduce numero de segundos");
		totalsegs=sc.nextInt();
		
		horas= totalsegs/3600;
		int resto = totalsegs%3600;
		minutos= resto/60;
		segundos=resto%60;
		
		System.out.println("Horas: " + horas + " minutos: " + minutos + " segundos: " + segundos);
	
		
	
	
	
	}

}
