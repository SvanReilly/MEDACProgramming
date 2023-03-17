package arrayLists;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Ejercicio1 ejemplo = new Ejercicio1(3);
		Scanner sc =new Scanner(System.in);
		ejemplo.addColor("gris");
		ejemplo.addColor("rojo");
		ejemplo.addColor("verde");
		ejemplo.addColor("blanco");
		ejemplo.addColor("negro");
		
		ejemplo.setColorByName("gris", "azul");
		
		System.out.println(ejemplo.toString());
		System.out.println(ejemplo.getColores());
		
	}

}
