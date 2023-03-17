package BlaCKjack;
public class Cartas {

	private int numero;
	private String palo;

	public Cartas(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Cartas(String figure, String palo) {
		if (figure.equalsIgnoreCase("Jack") || figure.equalsIgnoreCase("Queen") || figure.equalsIgnoreCase("King")) {
			this.numero = 10;
		}
		this.palo = palo;
	}

	public Cartas(String palo) {
		this.palo = palo;
		this.numero = 11;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String toString() {
		if(this.numero==11) {
			return this.palo;
		}else {
				return this.numero + " of " + this.palo;
		}
			}
}
