package HashMap;

import java.util.HashMap;

public class mes {

	private HashMap<Integer, Tiempo> mes;
	private int numdias;
	public mes(int numdias) {
		this.mes = mes;
		this.numdias = numdias;
	}

	public mes(HashMap<Integer, Tiempo> mes) {
		this.mes = mes;
	}

	public HashMap<Integer, Tiempo> getMes() {
		return mes;
	}

	public void setMes(HashMap<Integer, Tiempo> mes) {
		this.mes = mes;
	}

	public boolean anadirDia(int dia, Tiempo t) {
		boolean resultado=false;
		if (dia > 0 && dia <= this.numdias) {
			this.mes.put(dia, t);
			resultado=true;
		}
		return resultado;
			
	}

}
