package diagrama_animales;

public class HUMANO extends ANIMAL{

	private float altura;
	private PERRO mascota;
	
	
	public HUMANO() {
		this.altura=0.0f;
	}
	public HUMANO(String nombre, int edad, float altura, PERRO mascota) {
		super (nombre, edad);
		this.altura=altura;
		this.mascota= new PERRO();
	}
	public float getAltura() {
		return altura;
	}
	public boolean setAltura(float altura) {
		boolean correcto=true;
		if(altura<=0) {
			correcto=false;
		}else if (altura>0) {
			correcto=true;
			this.altura=altura;
		}	
			return correcto;
	}
	
	public PERRO getMascota() {
		return mascota;
	}
	public void setMascota(PERRO mascota) {
		this.mascota = mascota;
	}

	public String JUGAR() {
		return this.nombre + " está jugando";
	}
	public String DORMIR() {
		return this.nombre + " está durmiendo";
	}
	public boolean sentarMascota() {
		if(this.mascota.isSentado()==false) {
			this.mascota.setSentado(true);
		}else if (this.mascota.isSentado()==true) {
			this.mascota.setSentado(false);
		}return this.mascota.isSentado();
	}

	public String toString() {
		return "El humano de nombre: \n" + this.nombre + "tiene " + this.edad + 
				" años y mide: " + altura + ", y tiene por mascota: \n" + this.mascota ;
	} 
}
