package diagrama_animales;

public class PERRO extends ANIMAL {

	private String colorPelo;
	private boolean sentado;

	public PERRO() {
		this.colorPelo = "Blanco";
		this.sentado = false;
		
	}

	public PERRO(String nombre, int edad, String colorPelo, boolean sentado) {
		super (nombre, edad);
		this.colorPelo = colorPelo;
		this.sentado = sentado;

	}

	public boolean isSentado() {
		return sentado;
	}

	public void setSentado(boolean sentado) {
		this.sentado = sentado;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public boolean SENTARSE() {
		if (this.sentado == false) {
			this.sentado = true;

		} else if (this.sentado == true) {
			this.sentado = false;
		}
		return this.sentado;

	}
	
	public String toString() {
		String estado="";
		if (this.sentado==true) {
			estado="está descansando en el suelo";
		} else {
			estado="está en pie y deseando realizar alguna actividad";
		}
		
		return "El perro de nombre: \n" + this.nombre + "tiene " + this.edad + " años y su pelaje es de color: " + this.colorPelo + 
		". \n" + this.nombre + " " + estado;
	}

}
