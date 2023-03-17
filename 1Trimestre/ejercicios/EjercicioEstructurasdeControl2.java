package ejercicios;
import java.util.Scanner;

public class EjercicioEstructurasdeControl2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Realizar un programa que devuelva si un número introducido por teclado es primo o no.
		// Los 25 primeros números primos son 2, 3, 5, 7, 11, 13, 
        // 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 
		// 59, 61, 67, 71, 73, 79, 83, 89 y 97.
		int n1, i;
		
		System.out.println("Inserte un numero entero para comprobar si es primo: ");
		n1=sc.nextInt();
		
		if (n1==1 || n1==2 || n1==3 || n1==5 || n1==7 || n1==11 || n1==13) {
			System.out.println(n1+ " es un numero primo.");
		
		} else if (n1==4) {
			System.out.println(n1+ " es un numero compuesto.");
			
		} for (i=2; i<n1; i++) {
				if (n1%i==0) {
			
			System.out.println(n1 + " es un numero primo.");
			
		} else if (n1/i==0){
			System.out.println(n1+ " es un numero compuesto.");
			
			}
		}
	}	
}

