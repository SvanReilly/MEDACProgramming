package CREACIONDECLASES;

public class CUENTABANCARIA {

	private float saldo;
	private String titular;

	// CONSTRUCTOR VACÍO//

	public CUENTABANCARIA() {
		this.titular = "";
		this.saldo = 0;
	}

	// CONSTRUCTORES CON PARÁMETROS//

	public CUENTABANCARIA(String titular, float saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public CUENTABANCARIA(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	// GETTERS AND SETTERS//

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	// SPECIFIC METHODS//

	public boolean Ingresar(float money) {
		boolean correcto = true;
		if (money > 0) {
			this.saldo += money;
		} else {
			correcto = false;
		}
		return correcto;

	}

	public boolean Retirar(float money) {
		boolean correcto = true;
		if (this.saldo - money < 0) {
			correcto = false;
		} else {
			this.saldo -= money;
		}
		return correcto;

	}

	public boolean Transferir(float money, CUENTABANCARIA titular2) {
		boolean correcto = this.Retirar(money);
		if (correcto) {
			titular2.Ingresar(money);
		}
		return correcto;
	}

	public String toString() {
		return "Titular de la cuenta: " + this.titular + "/nSaldo de la cuenta: " + this.saldo;
	}

}
