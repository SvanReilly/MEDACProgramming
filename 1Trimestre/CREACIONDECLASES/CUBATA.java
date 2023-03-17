package CREACIONDECLASES;

public class CUBATA {

	private int numhielos = 0;
	private final int capacidadmaxima = 500;
	private int cantidadactual = 0;
	private String Alcohol;
	private String Mezcla;
	private boolean tienelimon;
	private boolean tienenaranja;

	// Constructor vacío//
	public CUBATA() {
		this.numhielos = 0;
		this.cantidadactual = 0;
		this.Alcohol = "";
		this.Mezcla = "";
		this.tienelimon = false;
		this.tienenaranja = false;
	}

	// Constructor con parámetros//
	public CUBATA(String Alcohol, String Mezcla, int cantidadactual, int numhielos, boolean tienelimon,
			boolean tienenaranja) {
		if (numhielos > 0) {
			this.numhielos = numhielos;

		} else {
			this.numhielos = 0;
		}
		if (cantidadactual >= 0) {
			this.cantidadactual = cantidadactual;
		} else {
			this.cantidadactual = 0;
		}

		this.Alcohol = Alcohol;
		this.Mezcla = Mezcla;
		this.tienelimon = tienelimon;
		this.tienenaranja = tienelimon;

	}

	// GETTERS//
	public int getCapacidadmaxima(int capacidadmaxima) {
		return this.capacidadmaxima;
	}

	public int getNumhielos(int numhielos) {
		return this.numhielos;
	}

	public int getCantidadactual(int cantidadactual) {
		return this.cantidadactual;
	}

	public String getAlcohol(String Alcohol) {
		return this.Alcohol;
	}

	public String getMezcla(String Mezcla) {
		return this.Mezcla;
	}

	public boolean isTienelimon(boolean tienelimon) {
		return this.tienelimon;
	}

	public boolean isTienenaranja(boolean tienenaranja) {
		return this.tienenaranja;
	}

	// SETTERS//
	public void setNumhielos(int numhielos) {
		if (numhielos > 0) {
			this.numhielos = numhielos;

		} else {
			this.numhielos = 0;
		}
	}

	public void setCantidadactual(int cantidadactual) {
		if (cantidadactual >= 0 && cantidadactual <= this.capacidadmaxima) {
			this.cantidadactual = cantidadactual;
		} else if (cantidadactual >= this.capacidadmaxima) {
			this.cantidadactual = this.capacidadmaxima;
		} else {
			this.cantidadactual = 0;
		}
	}

	public void setAlcohol(String Alcohol) {
		this.Alcohol = Alcohol;
	}

	public void setMezcla(String Mezcla) {
		this.Mezcla = Mezcla;
	}

	public void setTienelimon(boolean tienelimon) {
		this.tienelimon = tienelimon;
	}

	public void setTienenaranja(boolean tienenaranja) {
		this.tienenaranja = tienenaranja;
	}

	// SPECIFIC METHODS//

	public void llenar() {
		this.cantidadactual = capacidadmaxima;
	}

	public void beber(int trago) {
		this.setCantidadactual(this.cantidadactual - trago);

	}

	public void añadirhielo(int cantidadhielo) {
		if ((this.cantidadactual <= 450) && (this.numhielos <= 3)) {
			this.numhielos = this.numhielos + cantidadhielo;
			this.cantidadactual += 25;

		} else {
			this.numhielos = this.numhielos;
		}
	}

	public void aguarse() {
		if ((this.cantidadactual <= 450) && (this.numhielos > 0)) {
			this.numhielos--;
			this.cantidadactual += 50;
		} else {
			this.numhielos = this.numhielos;
			this.cantidadactual = this.cantidadactual;
		}
	}

	public void hidalgo() {
		this.cantidadactual = 0;
		this.Alcohol = "";
		this.Mezcla = "";
		this.numhielos = 0;
		this.tienenaranja = false;
		this.tienelimon = false;
	}

	public void añadirlimon() {
		this.tienelimon = true;
		System.out.println("");
	}

	public void añadirnaranja() {
		this.tienenaranja = true;
		System.out.println("");
	}

	public void limpiarvaso() {
		this.tienenaranja = false;
		this.tienelimon = false;
		this.cantidadactual = 0;
		this.numhielos = 0;

	}

	public String toString() {

		String limon, naranja, contenidoAlc = null, contenidoMez = null;

		if ((this.Alcohol == "") || (this.Mezcla == "")) {
			contenidoAlc = " Vacío.";
			contenidoMez = " Vacío.";
		} else if (this.Alcohol == this.Alcohol) {
			contenidoAlc = this.Alcohol;
		} else if (this.Mezcla == this.Mezcla) {
			contenidoMez = this.Mezcla;
		}

		if (this.tienenaranja == true) {
			naranja = " Ahora cuenta una exaltante y dulce rodaja de naranja.";
		} else {
			naranja = " Sin naranja.";
		}

		if (this.tienelimon == true) {
			limon = " Ahora cuenta con una exaltante y agria rodaja de limón.";
		} else {
			limon = " Sin limón.";
		}

		return "****************************************************************"
				+ "\nSostienes el vaso, lo giras sutilmente y observas su contenido."
				+ "\n****************************************************************" + "\nAlcohol: " + contenidoAlc
				+ "\nMezcla/Refresco:" + contenidoMez + " \nCantidad actual del vaso: " + this.cantidadactual + "/"
				+ this.capacidadmaxima + " \n¿Naranja?:" + naranja + " \n¿Limón?:" + limon + " \nCantidad de hielos: "
				+ this.numhielos + "\n****************************************************************";

	}
}
