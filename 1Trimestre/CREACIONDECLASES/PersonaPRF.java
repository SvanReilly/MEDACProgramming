package CREACIONDECLASES;

public class PersonaPRF {
	private double peso;
	private double altura;
	private double IMC;
	private String clasiOMS;
	private int edad;
	private String sexo;
	private final String DNI;
	
	public PersonaPRF() {
		this.peso=0;
		this.altura=0;
		this.edad=0;
		this.sexo="";
		this.IMC=0;
		this.clasiOMS="";
		this.DNI="";
	}
	
	public PersonaPRF(double peso, double altura, int edad, String sexo){
		this.peso=peso;
		this.altura=altura;
		this.edad=edad;
		this.sexo=sexo;
		this.IMC=this.calcularIMC();
		this.clasiOMS=this.clasiOMS();
		this.DNI=this.generarDNI();
	}

	public double getPeso() {
		return peso;
	}

	public boolean setPeso(double peso) {
		boolean correcto=true;
		if(peso<=0) {
			correcto=false;
		}else {
			this.peso = peso;
			this.IMC= this.calcularIMC();
			this.clasiOMS=this.clasiOMS();
		}
		return correcto;
	}

	public double getAltura() {
		return altura;
	}

	public boolean setAltura(double altura) {
		boolean correcto=true;
		if(altura<=0) {
			correcto=false;
		}else {
			this.altura = altura;
			this.IMC= this.calcularIMC();
			this.clasiOMS=this.clasiOMS();
		}
		return correcto;
	}

	public double getIMC() {
		return IMC;
	}


	public String getClasiOMS() {
		return clasiOMS;
	}


	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		boolean correcto=true;
		if(edad<0) {
			correcto=false;
		}else {
			this.edad = edad;
		}
		return correcto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDNI() {
		return DNI;
	}
	
	public String toString() {
		return "Mi DNI es " + this.DNI +" mi IMC es " + this.IMC+ " , mi clasificacion OMS es " + this.clasiOMS + " mayor de edad: " + this.isMayorEdad();
	}
	
	public double calcularIMC() {
		return this.peso/Math.pow(this.altura, 2);
	}
	
	public String clasiOMS() {
		String resultado="";
		if(this.IMC<18.5) {
			resultado = "Bajo Peso";
		}else if(this.IMC<=24.9) {
			resultado = "Adecuado";
		}else if(this.IMC<=29.9) {
			resultado = "Sobrepeso";
		}else {
			resultado= "Obesidad";
		}
		return resultado;
	}
		
	public boolean isMayorEdad() {
		boolean mayoredad =true;
		if(this.edad<18) {
			mayoredad=false;
		}
		return mayoredad;
	}
	
	public boolean comprobarSexo(String sexo) {
		boolean correcto=true;
		if(!this.sexo.toUpperCase().equals(sexo.toUpperCase())){
			correcto=false;
		}
		return correcto;
	}
	
	public String generarDNI() {
		String dni ="";
		int numdni = (int)(Math.random()*99999999 + 1000000);
		dni+=numdni;
		int index = numdni%23;
		String letrasposibles = "TRWAGMYFPDXDNJZSQVHLCKE";
		dni+=letrasposibles.charAt(index);
		return dni;
	}
	}

