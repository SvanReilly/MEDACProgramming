package CREACIONDECLASES;

public class Contador { //Plantilla
	private int numero;
	
	//Constructor vac�o//
	public Contador() {
		this.numero=0;
		
		}
	//Constructor con par�metros//
		public Contador(int numero) {
			this.numero=numero;
		}
	//GETTERS//
		public int getNumero() {
			return this.numero;
		}
	
	//SETTERS//
		public void setNumero(int numero) {
			this.numero=numero;
		}
			
	//SPECIFIC METHODs//
		
		public void incrementar() { //Para incrementar.
			this.numero++;	
		}
		
		public void reducir() {	// Para reducir.
			this.numero--;
		}
	}
