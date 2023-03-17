package diagrama_automovil;

public class MOTOR extends AUTOMOVIL {
	private boolean encendido;

	public MOTOR() {
		encendido=false;
	}
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	protected void encenderApagar() {
		this.encendido = !this.encendido;

	}

	@Override
	public String toString() {
			String estado= "";
			if(encendido==true) {
				estado= "encendido.";
			}else {
				estado= "apagado.";
			}
		return "El motor está " + estado;
	}
	
	
}
