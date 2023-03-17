package Ejemplos;

import java.util.Random;

public class Randomizando {
	
	public static void main(String[] args) {
		
		String[] dias= {"viernes","lunes"};
		Random random = new Random();
		int indice= random.nextInt(dias.length);
		
		System.out.println("El examen sera el " + dias[indice] + ".");
	}
}

