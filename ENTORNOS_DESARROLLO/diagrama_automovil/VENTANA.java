package diagrama_automovil;

public class VENTANA {

	private boolean abierta;
	
	public VENTANA() {
		abierta=false;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	protected void abrirCerrar() {
		this.abierta = !this.abierta;

	}

	@Override
	public String toString() {
		String estado= "";
		if(abierta==true) {
			estado= "abierta";
		}else {
			estado= "cerrada";
		}
		return "La ventana está " + estado;
	}
	
	
	
}
