package HashMap;

public class Tiempo {
	
	private double temperatura;
	private double viento;
	private String clima;
	private int humedad;
	private double precipitaciones;
	private boolean lluvia;
	
	public Tiempo(double temperatura, double viento, String clima, int humedad, double precipitaciones,
			boolean lluvia) {
	
		this.temperatura = temperatura;
		this.viento = viento;
		this.clima = clima;
		this.humedad = humedad;
		this.precipitaciones = precipitaciones;
		this.lluvia = lluvia;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getViento() {
		return viento;
	}

	public void setViento(double viento) {
		this.viento = viento;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public double getPrecipitaciones() {
		return precipitaciones;
	}

	public void setPrecipitaciones(double precipitaciones) {
		this.precipitaciones = precipitaciones;
	}

	public boolean isLluvia() {
		return lluvia;
	}

	public void setLluvia(boolean lluvia) {
		this.lluvia = lluvia;
	}

	@Override
	public String toString() {
		return "Va a ser un día " + this.clima  + ", con unas temperaturas de " + this.temperatura;
	}
	
	
	
	
	

}
