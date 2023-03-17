package CLASE_POKEMON;

public class POKEMON {
	private String nombre;
	private String tipo1;
	private String tipo2;
	private POKEMONATTACKS Ataque1;
	private POKEMONATTACKS Ataque2;
	private POKEMONATTACKS Ataque3;
	private POKEMONATTACKS Ataque4;
	private final int lvl=50;
	private POKEMONSTATS Stats;
	
	
	//CONSTRUCTOR VACÍO//
	public POKEMON() {
		super();
		this.nombre = "Missigno";
		this.tipo1 = "Normal";
		this.tipo2 = null;
		
	}
	
	//CONSTRUCTOR CON PARÁMETROS//
	public POKEMON(String nombre, String tipo1, String tipo2) {
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		
	}
	
	public POKEMON(String nombre, String tipo1) {
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = null;
		
	}
	
	public POKEMON(String nombre, String tipo1, String tipo2, POKEMONATTACKS Ataque1, POKEMONATTACKS Ataque2, POKEMONATTACKS Ataque3, POKEMONATTACKS Ataque4, POKEMONSTATS Stats) {
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.Ataque1= Ataque1;
		this.Ataque2= Ataque2;
		this.Ataque3= Ataque3;
		this.Ataque4= Ataque4;
		this.Stats=Stats;
	}
	
	public POKEMON(String nombre, String tipo1, POKEMONATTACKS Ataque1, POKEMONATTACKS Ataque2, POKEMONATTACKS Ataque3, POKEMONATTACKS Ataque4, POKEMONSTATS Stats) {
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = null;
		this.Ataque1= Ataque1;
		this.Ataque2= Ataque2;
		this.Ataque3= Ataque3;
		this.Ataque4= Ataque4;
		this.Stats=Stats;
	}
	
	
	//GETTERS&SETTERS//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	public int getLvl() {
		return lvl;
	}


	public String toString() {
		String resultado;
		if (this.tipo2!=null) {
			resultado= this.nombre + " es de tipo" + this.tipo1 + "/" + this.tipo2;
		} else {
			resultado= this.nombre + " es de tipo" + this.tipo1;
		}
		return resultado;
	}
	
	//SPECIFIC METHODS//
	public void Atacar(POKEMON atacado, int move) {
		if (move==1) {
//			Ataque1.Atacar(atacado);
		}else if (move==2) {
//			Ataque2.Atacar(atacado);
		}else if (move==3) {
//			Ataque3.Atacar(atacado);
		}else if (move==4) {
//			Ataque4.Atacar(atacado);
		}
		
	}
	
	//ToSTRING
	
	
}
