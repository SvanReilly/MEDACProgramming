package CREACIONDECLASES;

public class FECHA {

	/*
	 * CREE UNA CLASE FECHA. LA CLASE CONTENDR� CONSTRUCTORES, M�TODOS PARA
	 * MANIPULAR LAS PROPIEDADES Y EL M�TODO toString(). ADEM�S DEBER TENER UN
	 * M�TODO PARA COMPROBAR SI LA FECHA ES CORRECTA Y OTROS PARA A�ADIR Y RESTAR UN
	 * D�A A LA FECHA, ACTUALIZ�NDOLA CONVENIENTEMENTE.
	 */

	private int dia;
	private int mes;
	private int a�o;

	public FECHA() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 0;
	}

	public FECHA(int dia, int mes, int a�o) {
		if (this.comprobarFecha(dia, mes, a�o)) {
			this.dia = dia;
			this.mes = mes;
			this.a�o = a�o;

		} else {
			this.dia = 1;
			this.mes = 1;
			this.a�o = 0;
		}
	}

	public int getDia() {
		return dia;
	}

	public boolean setDia(int dia) {
		boolean correcto = true;
		if (this.comprobarFecha(dia, this.mes, this.a�o)) {
			this.dia = dia;
		} else {
			correcto = false;
		}
		return correcto;
	}

	public int getMes() {
		return mes;
	}

	public boolean setMes(int mes) {
		boolean correcto = true;
		if (this.comprobarFecha(this.dia, mes, this.a�o)) {
			this.mes = mes;
		} else {
			correcto = false;
		}
		return correcto;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public void incrementarDia() {
		if (this.comprobarFecha(this.dia + 1, this.mes, this.a�o)) {
			this.dia++;
		} else {
			if (this.mes == 12) {
				this.dia = 1;
				this.mes = 1;
				this.a�o++;
			} else {
				this.dia = 1;
				this.mes++;
			}
		}
	}

	public void decrementarDia() {
		if (this.comprobarFecha(this.dia - 1, this.mes, this.a�o)) {
			this.dia--;
		} else {
			if (this.mes == 1) {
				this.dia = 31;
				this.mes = 12;
				this.a�o--;
			} else {
				if (this.mes - 1 == 2) {
					if (this.comprobarFecha(this.dia - 1, this.mes, this.a�o)) {
						this.dia--;
					} else {
						if (this.comprobarFecha(29, mes--, this.a�o)) {
							this.dia = 29;
							this.mes--;
						} else {
							this.dia = 28;
							this.mes--;
						}
					}
					if (this.comprobarFecha(this.dia - 1, this.mes, this.a�o)) {
						this.dia = 31;
						this.mes--;
					} else {
						if (this.comprobarFecha(this.dia - 1, this.mes - 1, this.a�o)) {
							this.dia = 30;
							this.mes--;
						}
					}
				}
			}
		}
	}

	public boolean comprobarFecha(int dia, int mes, int a�o) {
		boolean correcto = true;
		if (dia < 1 || mes < 1 || dia > 31 || mes > 12) {
			correcto = false;
		} else {
			if (mes == 2) {
				if ((dia == 29 && a�o%4!= 0 || dia >= 30))
					correcto = false;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia == 31) {
				correcto = false;
			}
		}

		return correcto;

	}

	public String toString() {
		return "La fecha es " + dia + " / " + mes + " / " + a�o + ".";
	}

}
