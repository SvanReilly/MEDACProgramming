package CREACIONDECLASES;

public class FECHA {

	/*
	 * CREE UNA CLASE FECHA. LA CLASE CONTENDRÁ CONSTRUCTORES, MÉTODOS PARA
	 * MANIPULAR LAS PROPIEDADES Y EL MÉTODO toString(). ADEMÁS DEBER TENER UN
	 * MÉTODO PARA COMPROBAR SI LA FECHA ES CORRECTA Y OTROS PARA AÑADIR Y RESTAR UN
	 * DÍA A LA FECHA, ACTUALIZÁNDOLA CONVENIENTEMENTE.
	 */

	private int dia;
	private int mes;
	private int año;

	public FECHA() {
		this.dia = 1;
		this.mes = 1;
		this.año = 0;
	}

	public FECHA(int dia, int mes, int año) {
		if (this.comprobarFecha(dia, mes, año)) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;

		} else {
			this.dia = 1;
			this.mes = 1;
			this.año = 0;
		}
	}

	public int getDia() {
		return dia;
	}

	public boolean setDia(int dia) {
		boolean correcto = true;
		if (this.comprobarFecha(dia, this.mes, this.año)) {
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
		if (this.comprobarFecha(this.dia, mes, this.año)) {
			this.mes = mes;
		} else {
			correcto = false;
		}
		return correcto;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void incrementarDia() {
		if (this.comprobarFecha(this.dia + 1, this.mes, this.año)) {
			this.dia++;
		} else {
			if (this.mes == 12) {
				this.dia = 1;
				this.mes = 1;
				this.año++;
			} else {
				this.dia = 1;
				this.mes++;
			}
		}
	}

	public void decrementarDia() {
		if (this.comprobarFecha(this.dia - 1, this.mes, this.año)) {
			this.dia--;
		} else {
			if (this.mes == 1) {
				this.dia = 31;
				this.mes = 12;
				this.año--;
			} else {
				if (this.mes - 1 == 2) {
					if (this.comprobarFecha(this.dia - 1, this.mes, this.año)) {
						this.dia--;
					} else {
						if (this.comprobarFecha(29, mes--, this.año)) {
							this.dia = 29;
							this.mes--;
						} else {
							this.dia = 28;
							this.mes--;
						}
					}
					if (this.comprobarFecha(this.dia - 1, this.mes, this.año)) {
						this.dia = 31;
						this.mes--;
					} else {
						if (this.comprobarFecha(this.dia - 1, this.mes - 1, this.año)) {
							this.dia = 30;
							this.mes--;
						}
					}
				}
			}
		}
	}

	public boolean comprobarFecha(int dia, int mes, int año) {
		boolean correcto = true;
		if (dia < 1 || mes < 1 || dia > 31 || mes > 12) {
			correcto = false;
		} else {
			if (mes == 2) {
				if ((dia == 29 && año%4!= 0 || dia >= 30))
					correcto = false;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia == 31) {
				correcto = false;
			}
		}

		return correcto;

	}

	public String toString() {
		return "La fecha es " + dia + " / " + mes + " / " + año + ".";
	}

}
