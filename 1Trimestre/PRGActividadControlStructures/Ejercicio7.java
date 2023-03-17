package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIns, i; // Declaraci�n de variables de tipo entero 'numero insertado' e 'i' para el FOR que usaremos m�s adelante.
		
		System.out.println("Inserte un numero entero para comprobar si es primo o no: ");
		numIns=sc.nextInt();
		
		boolean primo = true; // Se hace un booleano que nos servir� para las bifurcaciones del IF tras el FOR.
		
		if (numIns==0 || numIns == 1) { //Para el caso en el que se introduzca el 0 o el 1 los cuales no son primos.
			System.out.println(numIns+ " no es un numero primo.");
		
						
		} else { // En caso que el n�mero insertado no sea 0, 1 se ejecutar� el siguiente bloque.
			
				
		for (i=2; i<numIns; i++) { // Se abre un FOR que comience en 2 (primer numero primo empezando desde 0)
		
			if (numIns%i==0) { //aqu� establecemos que si el resto resultante del n�mero insertado/i es 0 primo= false y cerrar�a el for dando paso al siguiente IF
				primo=false;
			}
		}	
			if (primo) { // dicho IF activar�a el valor principal de primo que es true como est� especificado al principio y seguidamente ejecutar�a el syso contiguo
				System.out.println(numIns+ " es un numero primo.");
			
				
		}	else { // En caso que el numIns no cumpla ninguna de las condiciones previamente descritas se desbloquear�a la siguiente acci�n.
		
			System.out.println(numIns + " es un numero compuesto.");
			
		  	}
		}
	}
}