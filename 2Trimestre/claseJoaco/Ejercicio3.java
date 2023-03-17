package claseJoaco;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		try {
			if(n<3) {
				throw new ExceptionTusMuertos("cagaste puto");
			}	
		}catch(ExceptionTusMuertos e) {
			System.out.println(e);
		}
		
	}
}
