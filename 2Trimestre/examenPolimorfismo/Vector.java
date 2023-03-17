package examenPolimorfismo;

import java.util.Iterator;

public class Vector implements iOperable {
	
	private int [] vector= new int [2];
	private int numeroEntero;

	
	public Vector(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVectores() {
		return vector;
	}

	public void setVectores(int[] vector) {
		this.vector = vector;
	}

	@Override
	public void Sumar(int numeroEntero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vector.length; i++) {
			this.vector[i]+=numeroEntero;
		}
	}

	@Override
	public void Restar(int numeroEntero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vector.length; i++) {
			this.vector[i]-=numeroEntero;
		}
	}

	@Override
	public void Multiplicar(int numeroEntero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vector.length; i++) {
			this.vector[i]*=numeroEntero;
		}
	}

	@Override
	public void Dividir(int numeroEntero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vector.length; i++) {
			this.vector[i]/=numeroEntero;
		}
	}

	


	
	
	
	

}
