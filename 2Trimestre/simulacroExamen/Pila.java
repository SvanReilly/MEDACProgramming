package simulacroExamen;

public class Pila implements iLista{

	private int[] arrayEnteros;
	private int capacidadMaxima;
	
	public Pila() {
		super();
		this.arrayEnteros = new int[capacidadMaxima];
		
	}

	
	public Pila(int capacidadMaxima) {
		super();
		this.arrayEnteros = new int[capacidadMaxima];
		
	}

	@Override
	public int[] getArrayEnteros() {
		// TODO Auto-generated method stub
		return this.arrayEnteros;
	}

	@Override
	public void setArrayEnteros(int[] arrayEnteros) {
		// TODO Auto-generated method stub
		this.arrayEnteros=arrayEnteros;
		
	}

	@Override
	public int getCapacidadMaxima() {
		// TODO Auto-generated method stub
		return this.capacidadMaxima;
	}

	@Override
	public void setCapacidadMaxima(int capacidadMaxima) {
		// TODO Auto-generated method stub
		this.capacidadMaxima=capacidadMaxima;
		
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		boolean resultado=false;
		if(this.arrayEnteros[this.capacidadMaxima-1]!=0) {
			resultado=true;
		}
		return resultado;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean resultado=false;
		if(this.arrayEnteros[0]==0) {
			resultado=true;
		}
		return resultado;
	}

	@Override
	public void push(int elemento) {
		// TODO Auto-generated method stub
		int posicion=0;
		if(!this.isFull()) {
			for(int i=0;i<this.capacidadMaxima;i++) {
				if(this.arrayEnteros[i]==0) {
					posicion=i;
					break;
				}
				
			}
			this.arrayEnteros[posicion]=elemento;
		}
		
	}
	

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int devolver=-1;
		if(!this.isEmpty()) {
			for(int i= this.capacidadMaxima-1;i>=0;i--) {
				if(this.arrayEnteros[i]!=0) {
					devolver=this.arrayEnteros[i];
					this.arrayEnteros[i]=0;
					break;
				}
			}
		}
		return devolver;
	}

}
