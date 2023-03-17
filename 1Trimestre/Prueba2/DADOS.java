package Prueba2;

public class DADOS {

	private int numCaras;
	private boolean trucado;

	public DADOS() {
		this.numCaras = 4;
		this.trucado = false;
	}

	public DADOS(int numCaras, boolean trucado) {
		if (numCaras < 2) {
			this.numCaras = 2;
		} else {
			this.numCaras = numCaras;
		}
		this.trucado = trucado;
	}

	public int getNumCaras() {
		return numCaras;
	}

	public boolean setNumCaras(int numCaras) {
		boolean correcto = true;
		if (numCaras < 2) {
			correcto = false;
			this.numCaras = 2;
		} else {
			this.numCaras = numCaras;
		}
		return correcto;
	}

	public boolean isTrucado() {
		return trucado;
	}

	public void setTrucado(boolean trucado) {
		this.trucado = trucado;
	}

	public String toString() {
		String trucotrato = "";
		if (trucado = true) {
			trucotrato = " el dado está trucado.";
		} else {
			trucotrato = " el dado no está trucado.";
		}

		return "El dado tiene " + numCaras + " caras, y" + trucotrato;
	}

	public int tirarDado() {
		int valordado=0;
		if (trucado != true) {
			valordado = (int) ((Math.random() * numCaras) + 1);
		} else  {
			int truqui= (int) ((Math.random() * 2) + 1);
			if(truqui==1) {
				valordado=numCaras;
			}else {
				valordado = (int) ((Math.random() * numCaras-1) + 1);
			}
			
		} return valordado;

	}

}
