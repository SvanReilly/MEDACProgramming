/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1y2Trimestre;

import java.util.Arrays;

import TresEnRayaconArrays.Celda;

public class Tablero {
	
	private Celda[][] tableroDeJuego;

	public Tablero() {
		this.tableroDeJuego = new Celda[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.tableroDeJuego[i][j] = new Celda();
			}
		}
	}

	public Celda getCelda(int fila, int columna) {
		return tableroDeJuego[fila][columna];
	}

	public void setCelda(int fila, int columna, char simbolo) {
		this.tableroDeJuego[fila][columna].setSimbolo(simbolo);
		this.tableroDeJuego[fila][columna].setOcupada(true);
	}

	public String toString() {
		String DeployedBoard = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				DeployedBoard += "[" + this.tableroDeJuego[i][j] + "]";
			}
			DeployedBoard += "\n";
		}
		return DeployedBoard;

	}
}
