package claseJoaco;

import java.util.Scanner;

public class mainsito {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce datos: ");
		int edad;
		String nombre= sc.next();
		do {
			edad=sc.nextInt();
			try {
			Persona p= new Persona(nombre,edad);
		} catch (NotValidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}while(edad<0);
		
		
		
	}
}
