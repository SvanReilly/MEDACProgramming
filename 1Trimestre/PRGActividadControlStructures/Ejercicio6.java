package PRGActividadControlStructures;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n1=0,n2=1,n3,i, numIns;// Declaración de variables de tipo entero que servirán para componer el patrón numérico de Fibonnaci.
								// 'i' = marca la numeración en la cantidad de términos Fibo de cada iteración.
								// numIns = marca la cantidad final de términos Fibo que quiere el usuario y la referencia de la i para detener el bucle una vez haya alcanzado dicho cantidad.
									
		
		
		System.out.println("Inserte un número positivo: ");
		numIns = sc.nextInt();
		
		if (numIns==0) { // Resumiendo este IF: Filtrando los casos en los que el usuario inserte un número de términos Fibo menor de 3.
						// para numero insertado = 0 se imprimirá...
			
			System.out.println("El número insertado no es valido"); 
		} else if (numIns == 1) { // para numero insertado = 1 se imprimirá...
			System.out.println("Los números de la serie de Fibonacci pedidos son los siguientes: "+ n1+".");
			
		} else if (numIns == 2) {// para numero insertado = 2 se imprimirá...
			System.out.println("Los números de la serie de Fibonacci pedidos son los siguientes: "+ n1+" "+n2);
	
		} else {
		
		
		System.out.print("Los números de la serie de Fibonacci pedidos son los siguientes: "+ n1+" "+n2); 
		  
		 for(i=2;i<numIns;++i){  //El bucle empieza en 2 porque el 0 y el 1 ya están definidos previamente en el if, 
		  n3=n1+n2; //n3 = el valor del término Fibo que se mostrará al final de cada iteración
		  n1=n2; //n1= partiendo como el primer valor de la serie de Fibo su valor inicial es 0 en la primera iteración y 
		  		 //será la referencia al comienzo de cada iteración como primer sumando para calcular el numero siguiente.
		  
		  n2=n3; //n2= partiendo como el segundo valor de la serie Fibo su valor inicial es 1 en la primera iteración y 
		  		 //será la referencia al comienzo de cada iteración como segundo sumando para calcular el numero siguiente.
		  
		  
		  
		  System.out.print(" "+ n3); //El proceso tras el código para calcular el n3 se vería algo así:
		  							//si: numIns = 4, i=2, n1=0(i1), n2=1 (i2), n3=0+1. (Primera iteración)
		  							//n3=0+1=1 (i3). n3 guarda el valor 1 para la siguiente, n1=n2=1 (n1 adopta el valor de n2 tras la iteración avanzando a la posición que tenía n2,
		  							//del mismo modo n2=n3 hace que n2 ahora tenga el valor que ha adquirido n3 tras la suma.
		  							//n3=1+1=2. (i4)
		  							//
		  							//syso (n1+ n2+ n3= ''i1'' + ''i2'' + ''i3'' + ''i4'')
		  							// n1 + n2 + n3= ''0'' ''1'' ''1'' ''2''
		 
		 	}
		}  
	}
}
