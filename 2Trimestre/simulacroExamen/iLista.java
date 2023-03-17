package simulacroExamen;

public interface iLista {
	public int[] getArrayEnteros();
	public void setArrayEnteros(int[] arrayEnteros);
	
	public int getCapacidadMaxima();
	public void setCapacidadMaxima(int capacidadMaxima);
	
	public boolean isFull();
	public boolean isEmpty();
	
	public void push(int elemento);
	public int pop();
}
