package CLASE_POKEMON;

public class POKEMONATTACKS {

	private int potencia;
	private String tipoAtaque;
	private String tipoDa�o;
	private int PP;
	private int precision;
	private boolean prioridad;
	private double chanceVeneno;
	private double chanceParalisis;
	private double chanceQuemar;
	private double chanceCongelado;
	private double chanceConfundir;
	private double chanceDormir;
	private double multbuff=1.5;
	private double multdebuff=0.5;
	
	//CONSTRUCTOR VAC�O//
		public POKEMONATTACKS(int potencia, String tipoAtaque, String tipoDa�o, int PP, int precision, boolean prioridad,
				double chanceVeneno, double chanceParalisis, double chanceQuemar, double chanceCongelado,
				double chanceConfundir, double chanceDormir, double multbuff, double multdebuff) {
			
			this.potencia = potencia;
			this.tipoAtaque = tipoAtaque;
			this.tipoDa�o = tipoDa�o;
			this.PP = PP;
			this.precision = precision;
			this.prioridad = prioridad;
			this.chanceVeneno = chanceVeneno;
			this.chanceParalisis = chanceParalisis;
			this.chanceQuemar = chanceQuemar;
			this.chanceCongelado = chanceCongelado;
			this.chanceConfundir = chanceConfundir;
			this.chanceDormir = chanceDormir;
			this.multbuff = multbuff;
			this.multdebuff = multdebuff;
	
		}
}


	


	//CONSTRUCTOR CON PAR�METROS//
	
	
	//GETTERS&SETTERS//
	
	
	//SPECIFIC METHODS//
	
	
	//ToSTRING