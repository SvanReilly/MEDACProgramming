package diagrama_automovil;

public class PUERTA extends VENTANA {

	private boolean abierta;
	VENTANA ventana;
	
	public PUERTA () {
		abierta=false;
		ventana= new VENTANA();
	}
	
	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	public VENTANA getVentana() {
		return ventana;
	}

	public void setVentana(VENTANA ventana) {
		this.ventana = ventana;
	}

	protected void abrirCerrar() {
		this.abierta = !this.abierta;
	}
	
	protected void abrirCerraVentana() {
		this.ventana.abrirCerrar();
		
	}

	@Override
	public String toString() {
		String estado= "";
		if(abierta==true) {
			estado= "abierta";
		}else {
			estado= "cerrada";
		}
		return "La puerta está " + estado + ventana;
	}
		
	
	
	
}
