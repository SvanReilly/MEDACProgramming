package repaso1y2Trimestre;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		tablero3EnRaya tablero = new tablero3EnRaya();
		
		player p1 = new player();
		System.out.println(p1.getMarkup());
		player p2 = new player();
		System.out.println(p2.getMarkup());
		
		
		System.out.println(tablero.mostrarTablero());
		
		/*
		  char[][] mapa3EnRaya = { {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
		  boolean victoria = false;
		  
		  for (int i = 0; i < 9; i++) { char valor; if (i % 2 == 0) { valor = 'X';
		  System.out.println("X"); } else { valor = 'O'; System.out.println("O"); }
		  
		  }
		  
		  for (int i = 0; i < 9; i++) {
		  
		  if (i % 2 == 0) { System.out.println("X"); } else { System.out.println("O");
		  }
		  
		  }
		  
		  System.out.println(mapa3EnRaya);
		  
		  }
		 */
		 
		 
		
		/*  char[][] table = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }}; 
		  boolean win = false; int i = 0; char mark = ' '; 
		  
		  do {
		  
		  for (i = 0; i < 9 || win; i++) { 
		  if (i % 2 == 0) { 
			  mark = 'O'; 
		  } else { 
			  mark = 'X'; 
		  } 
		  System.out.println("Turno de " + mark + "? \n Donde poner?"); String
		  inser = sc.next();
		  
		  if (inser.equalsIgnoreCase("a")) { table[0][0] = mark;
		  
		  } else if (inser.equalsIgnoreCase("b")) { table[0][1] = mark;
		  
		  } else if (inser.equalsIgnoreCase("c")) { table[0][2] = mark;
		  
		  } else if (inser.equalsIgnoreCase("d")) { table[1][0] = mark;
		  
		  } else if (inser.equalsIgnoreCase("e")) { table[1][1] = mark;
		  
		  } else if (inser.equalsIgnoreCase("f")) { table[1][2] = mark;
		  
		  } else if (inser.equalsIgnoreCase("g")) { table[2][0] = mark;
		  
		  } else if (inser.equalsIgnoreCase("h")) { table[2][1] = mark;
		  
		  } else if (inser.equalsIgnoreCase("i")) { table[2][2] = mark; 
		  
		  } else {
		  System.out.println("La letra no se encuentra en el tablero"); 
		  i = 0; 
		  
		  }String mostrar1 = "|"; String mostrar2 = "|"; String mostrar3 = "|"; 
		  
		  for (int j = 0; j < table.length; j++) { 
			  for (int k = 0; k < table.length; k++) 
				  
		  mostrar1 += (table[j = 0][k]) + "|"; 
		  
		  for (int k = 0; k < table.length; k++)
		  mostrar2 += (table[j = 1][k]) + "|"; 
		  
		  for (int k = 0; k < table.length; k++)
		  mostrar3 += (table[j = 2][k]) + "|"; 
		  
		  } System.out.println(" " + mostrar1 + " \n " + mostrar2 + " \n " + mostrar3); // if(comprobar win condition) } }
		  }while (win); System.out.println("Fin del juego");
		  
		  
		  
		  
	
		  }*/
	}
}
