package Ejemplos;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mete un numero");
		int num=sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Vale 1");
			break;
		case 2:
			System.out.println("Vale 2");
			break;
		case 3:
			System.out.println("Vale 3");
			break;
		
		default:
			break;
		}	
		
	
	
	
	
		
	}
		
}

