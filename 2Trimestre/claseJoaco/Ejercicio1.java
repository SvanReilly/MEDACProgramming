package claseJoaco;

import java.util.MissingResourceException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		double n = 0;
		do {
			try {
				System.out.println("Dime el double");
				n = sc.nextDouble();
				check = true;
			}catch(Exception e) {
				System.out.println("NUMEROS SOLO TONTO");
				System.out.println(e);
				sc.next();
			}
		}while(!check);
		System.out.println("has metido el num: "+ n);
	}
}