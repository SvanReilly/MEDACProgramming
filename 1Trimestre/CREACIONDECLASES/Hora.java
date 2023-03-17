package CREACIONDECLASES;

public class Hora {

	private int hora, minutos, segundos;
	private boolean modo24;
	private boolean AM;

	public Hora() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
		this.modo24 = false;
		this.AM = false;
	}

	public Hora(int hora, int minutos, int segundos, boolean modo24, boolean AM) {
		this.modo24 = modo24;
		this.AM = AM;
		if (this.comprobarHora(hora, minutos, segundos)) {
			this.hora = hora;
			this.minutos = minutos;
			this.segundos = segundos;
		} else {
			this.hora = 0;
			this.minutos = 0;
			this.segundos = 0;
		}

	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean correcto = true;
		if (this.comprobarHora(hora, this.minutos, this.segundos)) {
			this.hora = hora;
		}
		return correcto;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean correcto = true;
		if (this.comprobarHora(this.hora, minutos, this.segundos)) {
			this.minutos = minutos;
		}
		return correcto;
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean correcto = true;
		if (this.comprobarHora(hora, this.minutos, segundos)) {
			this.segundos = segundos;
		}
		return correcto;
	}

	public boolean isModo24() {
		return modo24;
	}

	public void setModo24(boolean modo24) {
		this.modo24 = modo24;
	}

	public boolean isAM() {
		return AM;
	}

	public void setAM(boolean AM) {
		this.AM = AM;
	}

	public String toString() {
		String resultado = "";
		if (this.modo24) {
			resultado = this.hora + ":" + this.minutos + ":" + this.segundos;
		} else {
			resultado = this.hora + ":" + this.minutos + ":" + this.segundos;
			if (this.AM) {
				resultado += " AM";
			} else {
				resultado += " PM";
			}
		}
		return resultado;
	}

	public boolean comprobarHora(int hora, int minutos, int segundos) {
		boolean correcto = true;
		if (hora < 0 || minutos < 0 || segundos < 0 || minutos > 59 || segundos > 59) {
			correcto = false;
		} else {
			if (this.modo24 && hora > 23) {
				correcto = false;
			} else if (this.modo24) {

			} else if (!this.modo24 && this.AM && hora > 12) {
				correcto = false;
			} else if (!this.modo24 && !this.AM && hora > 12) {
				correcto = false;
			}
		}

		return correcto;
	}

	public void switchMode() {
		if (this.modo24) {
			this.modo24 = false;
			this.hora = this.hora % 12;
		} else {
			if (!this.AM) {
				this.modo24 = true;
				this.hora += 12;
			}
		}

	}

	public void incrementaSeg() {
		if (this.comprobarHora(this.hora, this.minutos, this.segundos + 1)) {
			this.segundos++;
		} else {
			this.segundos = 0;
			if (this.comprobarHora(this.hora, this.minutos + 1, this.segundos)) {
				this.minutos++;
			} else {
				this.minutos = 0;
				if (this.comprobarHora(this.hora + 1, this.minutos, this.segundos)) {
					this.hora++;
				} else {
					if (!this.modo24) {
						if (this.AM) {
							this.hora = 1;
							this.AM = false;
						} else {
							this.hora = 0;
							this.AM = true;

						}

					} else {
						this.hora = 0;
					}
				}
			}
		}
	}
}
