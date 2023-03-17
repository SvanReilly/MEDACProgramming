package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i; // Declaración de variables de tipo entero 'numero insertado' e 'i' para el FOR que usaremos más adelante.
		
		System.out.println("Inserte un numero entero para comprobar si es primo o no: ");
		numIns=sc.nextInt();
		
		boolean primo = true; // Se hace un booleano que nos servirá para las bifurcaciones del IF tras el FOR.
		
		if (numIns==0 || numIns == 1) { //Para el caso en el que se introduzca el 0 o el 1 los cuales no son primos.
			System.out.println(numIns+ " no es un numero primo.");
		
						
		} else { // En caso que el número insertado no sea 0, 1 se ejecutará el siguiente bloque.
			
				
		for (i=2; i<numIns; i++) { // Se abre un FOR que comience en 2 (primer numero primo empezando desde 0)
		
			if (numIns%i==0) { //aquí establecemos que si el resto resultante del número insertado/i es 0 primo= false y cerraría el for dando paso al siguiente IF
				primo=false;
			}
		}	
			if (primo) { // dicho IF activaría el valor principal de primo que es true como está especificado al principio y seguidamente ejecutaría el syso contiguo
				System.out.println(numIns+ " es un numero primo.");
			
				
		}	else { // En caso que el numIns no cumpla ninguna de las condiciones previamente descritas se desbloquearía la siguiente acción.
		
			System.out.println(numIns + " es un numero compuesto.");
			
		  	}
		}
	}
}