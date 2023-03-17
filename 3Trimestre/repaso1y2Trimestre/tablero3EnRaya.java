/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1y2Trimestre;

import java.util.Arrays;

public class tablero3EnRaya {

    private char[][] tablero = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};


	public tablero3EnRaya() {
        this.tablero=tablero;
	}


	public char[][] getTablero() {
		return tablero;
	}


	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}

	public String mostrarTablero() {
		String firstRow = "|"; 
		String scndRow = "|"; 
		String thirdRow = "|";
		
		for (int i = 0; i < tablero.length; i++) { 
			  for (int j = 0; j < tablero.length; j++) 
				  
		  firstRow += (tablero[i = 0][j]) + "|"; 
		  
		  for (int j = 0; j < tablero.length; j++)
		  scndRow += (tablero[i = 1][j]) + "|"; 
		  
		  for (int j = 0; j < tablero.length; j++)
		  thirdRow += (tablero[i = 2][j]) + "|"; 
		  
		  }

		return firstRow + "\n" + scndRow + "\n" + thirdRow;		
	}

	@Override
	public String toString() {
		return Arrays.toString(tablero);
	}
    





    
}
