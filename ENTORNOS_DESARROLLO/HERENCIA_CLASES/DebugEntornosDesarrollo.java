package HERENCIA_CLASES;

public class DebugEntornosDesarrollo {
	public static void main(String[] args) {
		
		float random = (float) (Math.random());
		int num = (int) ((random) * 10);
		
		
		if (num < 5) {
			System.out.println("El numero "+ num + " es menor que 5.");
			
		} else {
			System.out.println("El numero "+ num + " es mayor que 5.");
			
		}
		
		
		
	}

}
