package ARRAYS;

import java.util.Arrays;

public class Arraysito {

	private int[] numeros;
	private int max;
	private int min;

	public Arraysito() {
		this.numeros = new int[0];
		this.max = 0;
		this.min = 0;
	}

	public Arraysito(int[] numeros) {
		this.numeros = numeros;
		this.CalcularMax();
		this.CalcularMin();
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public void CalcularMin() {
		this.min= this.numeros[0];
		for (int i = 1; i < this.numeros.length; i++) {
			if (this.numeros[i]<min) {
				this.min=this.numeros[i];
				
			}
		}
	}
	public void CalcularMax() {
		this.max= this.numeros[0];
		for (int i = 1; i < this.numeros.length; i++) {
			if (this.numeros[i]>max) {
				this.max=this.numeros[i];
				
			}
		}
	}
	public void normalizarArray() {
		for (int i = 0; i < this.numeros.length; i++) {
			this.numeros[i]=((this.numeros[i] - this.min)/(this.max - this.min));
		}
	}


	public String toString() {
		this.CalcularMax();
		this.CalcularMin();
		for (int i = 0; i < this.numeros.length; i++) {
		} return Arrays.toString(numeros) + ", max=" + max + ", min=" + min + "]";
	}	
}
