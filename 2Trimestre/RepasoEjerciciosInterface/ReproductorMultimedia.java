package RepasoEjerciciosInterface;

/*P2.  a)  Defina  una  clase  ReproductorMultimedia.  Un  reproductor  multimedia  es  un  reproductor 
port�til que puede reproducir tanto archivos de sonido como archivos de video. Decida si la clase 
ReproductorMultimedia deber� extender alguna clase de las definidas anteriormente, as� como 
si  dicha  clase  deber�  implementar  alguna  de  las  interfaces  anteriormente  definidas  y,  si  es 
necesario, defina una interfaz adecuada para la misma. 
 
Recuerde  dotar  a  la  clase  de  un  constructor  con  argumentos  que  pueda  recibir  tanto  los 
argumentos que recibe el constructor de la clase ReproductorAudio como los argumentos que 
recibe el constructor de la clase ReproductorVideo. 
 
b) Cree un programa principal que demuestre las capacidades de los objetos de la clase como 
reproductores de audio y como reproductores de video. 
*/

public class ReproductorMultimedia extends ReproductorPortatil implements iReproductorVideo, iReproductorAudio {

	// Atributos propios de la clase ReproductorMultimedia//
	private String archivoVideo;
	private String formatoDeVideo;
	private String archivoAudio;
	private String formatoDeAudio;

	// Atributos requeridos de la interfaz iReproductorAudio//
	private boolean reproduceCDS, reproduceMP3, reproduceWMA, reproduceVorbis, accesoCarpetas, radio, grabadoraVoz;
	// Atributos requeridos de la interfaz iReproductorVideo//
	private boolean reproduceWMV, reproduceDIVX, reproduceMPG, reproduceDVD, reproduceJPG, television;
	private float tamanoDeLaPantalla;

	// Constructor por defecto//
	public ReproductorMultimedia() {
		super();
		this.setMarca("Apple");
		this.setModelo("iPod 3G");
		this.setArchivoVideo("El Atlas De Las Nubes");
		this.setFormatoDeVideo("DIVX");
		this.setArchivoAudio("Andromeda - Gorillaz");
		this.setFormatoDeAudio("MP3");
		this.setReproduceCDS(false);
		this.setReproduceMP3(true);
		this.setReproduceWMA(true);
		this.setReproduceVorbis(false);
		this.setAccesoCarpetas(true);
		this.setRadio(true);
		this.setGrabadoraVoz(true);
		this.setReproduceWMV(true);
		this.setReproduceDIVX(true);
		this.setReproduceMPG(true);
		this.setReproduceDVD(false);
		this.setReproduceJPG(true);
		this.setTelevision(true);
		this.setTamanoDeLaPantalla(5.5f);
	}
	// Constructores por par�metros//

	public ReproductorMultimedia(String marca, String modelo, String archivoVideo, String formatoDeVideo,
			String archivoAudio, String formatoDeAudio) {
		super();
		this.setMarca(marca);
		this.setModelo(modelo);
		this.archivoVideo = archivoVideo;
		this.formatoDeVideo = formatoDeVideo;
		this.archivoAudio = archivoAudio;
		this.formatoDeAudio = formatoDeAudio;
		this.setReproduceCDS(false);
		this.setReproduceMP3(true);
		this.setReproduceWMA(true);
		this.setReproduceVorbis(false);
		this.setAccesoCarpetas(true);
		this.setRadio(true);
		this.setGrabadoraVoz(true);
		this.setReproduceWMV(true);
		this.setReproduceDIVX(true);
		this.setReproduceMPG(true);
		this.setReproduceDVD(false);
		this.setReproduceJPG(true);
		this.setTelevision(true);
		this.setTamanoDeLaPantalla(5.5f);

	}

	public ReproductorMultimedia(String archivoVideo, String formatoDeVideo, String archivoAudio, String formatoDeAudio,
			boolean reproduceCDS, boolean reproduceMP3, boolean reproduceWMA, boolean reproduceVorbis,
			boolean accesoCarpetas, boolean radio, boolean grabadoraVoz, boolean reproduceWMV, boolean reproduceDIVX,
			boolean reproduceMPG, boolean reproduceDVD, boolean reproduceJPG, boolean television,
			float tamanoDeLaPantalla) {
		super();
		this.archivoVideo = archivoVideo;
		this.formatoDeVideo = formatoDeVideo;
		this.archivoAudio = archivoAudio;
		this.formatoDeAudio = formatoDeAudio;
		this.reproduceCDS = reproduceCDS;
		this.reproduceMP3 = reproduceMP3;
		this.reproduceWMA = reproduceWMA;
		this.reproduceVorbis = reproduceVorbis;
		this.accesoCarpetas = accesoCarpetas;
		this.radio = radio;
		this.grabadoraVoz = grabadoraVoz;
		this.reproduceWMV = reproduceWMV;
		this.reproduceDIVX = reproduceDIVX;
		this.reproduceMPG = reproduceMPG;
		this.reproduceDVD = reproduceDVD;
		this.reproduceJPG = reproduceJPG;
		this.television = television;
		this.tamanoDeLaPantalla = tamanoDeLaPantalla;
	}

	/*
	 * GETTERS&SETTERS propios, de la clase heredada y de los parametros incluidos
	 * en las dos interfaces que hereda
	 */

	public String getArchivoVideo() {
		return archivoVideo;
	}

	public void setArchivoVideo(String archivoVideo) {
		this.archivoVideo = archivoVideo;
	}

	public String getFormatoDeVideo() {
		return formatoDeVideo;
	}

	public void setFormatoDeVideo(String formatoDeVideo) {
		this.formatoDeVideo = formatoDeVideo;
	}

	public String getArchivoAudio() {
		return archivoAudio;
	}

	public void setArchivoAudio(String archivoAudio) {
		this.archivoAudio = archivoAudio;
	}

	public String getFormatoDeAudio() {
		return formatoDeAudio;
	}

	public void setFormatoDeAudio(String formatoDeAudio) {
		this.formatoDeAudio = formatoDeAudio;
	}

	public boolean isReproduceCDS() {
		return reproduceCDS;
	}

	public void setReproduceCDS(boolean reproduceCDS) {
		this.reproduceCDS = reproduceCDS;
	}

	public boolean isReproduceMP3() {
		return reproduceMP3;
	}

	public void setReproduceMP3(boolean reproduceMP3) {
		this.reproduceMP3 = reproduceMP3;
	}

	public boolean isReproduceWMA() {
		return reproduceWMA;
	}

	public void setReproduceWMA(boolean reproduceWMA) {
		this.reproduceWMA = reproduceWMA;
	}

	public boolean isReproduceVorbis() {
		return reproduceVorbis;
	}

	public void setReproduceVorbis(boolean reproduceVorbis) {
		this.reproduceVorbis = reproduceVorbis;
	}

	public boolean isAccesoCarpetas() {
		return accesoCarpetas;
	}

	public void setAccesoCarpetas(boolean accesoCarpetas) {
		this.accesoCarpetas = accesoCarpetas;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public boolean isGrabadoraVoz() {
		return grabadoraVoz;
	}

	public void setGrabadoraVoz(boolean grabadoraVoz) {
		this.grabadoraVoz = grabadoraVoz;
	}

	public boolean isReproduceWMV() {
		return reproduceWMV;
	}

	public void setReproduceWMV(boolean reproduceWMV) {
		this.reproduceWMV = reproduceWMV;
	}

	public boolean isReproduceDIVX() {
		return reproduceDIVX;
	}

	public void setReproduceDIVX(boolean reproduceDIVX) {
		this.reproduceDIVX = reproduceDIVX;
	}

	public boolean isReproduceMPG() {
		return reproduceMPG;
	}

	public void setReproduceMPG(boolean reproduceMPG) {
		this.reproduceMPG = reproduceMPG;
	}

	public boolean isReproduceDVD() {
		return reproduceDVD;
	}

	public void setReproduceDVD(boolean reproduceDVD) {
		this.reproduceDVD = reproduceDVD;
	}

	public boolean isReproduceJPG() {
		return reproduceJPG;
	}

	public void setReproduceJPG(boolean reproduceJPG) {
		this.reproduceJPG = reproduceJPG;
	}

	public boolean isTelevision() {
		return television;
	}

	public void setTelevision(boolean television) {
		this.television = television;
	}

	public float getTamanoDeLaPantalla() {
		return tamanoDeLaPantalla;
	}

	public void setTamanoDeLaPantalla(float tamanoDeLaPantalla) {
		this.tamanoDeLaPantalla = tamanoDeLaPantalla;
	}

	/* SPECIFIC METHODS */

	public String reproducirAudio () {
		if (this.reproduceCDS==true || this.reproduceMP3== true ||
			this.reproduceWMA==true || this.reproduceVorbis==true) {
			
			
			} return "Reproduciendo: " + this.archivoAudio + "." + this.formatoDeAudio;
		}
		
	public String reproducirVideo () {
		if (this.reproduceWMV==true || this.reproduceDIVX== true ||
			this.reproduceDVD==true || this.reproduceVorbis==true) {
		
		
		
		} return "Reproduciendo: " + this.archivoVideo + "." + this.formatoDeVideo;
		
		
	}

	@Override
	public String toString() {
		return "Tu " + this.getModelo() + " (" + this.getMarca() + ")" +
	" tiene seleccionado: " + 
	"\n"+ 
	"\n" +
	this.archivoVideo + "." + this.formatoDeVideo + " como archivo de v�deo." + 
	"\n"+
	this.archivoAudio + "." + this.formatoDeAudio + " como archivo de audio." +
	"\n_________________________________________________________________________"+
	"\nFormatos de audio compatibles ('true'): " +
	"\n"+
	"CDS: " + this.reproduceCDS +
	"\n"+
	"MP3: " + this.reproduceMP3 + 
	"\n"+
	"WMA: " + this.reproduceWMA +
	"\n"+
	"Vorbis: " + this.reproduceVorbis + 
	"\n_________________________________________________________________________"+
	"\nFormatos de v�deo compatibles ('true'): " +
	"\n" +
	"WMV: " + this.reproduceWMV + 
	"\n" +
	"DIVX: " + this.reproduceDIVX + 
	"MPG: " + this.reproduceMPG + 
	"DVD: " + this.reproduceDVD +
	"\nFormatos de imagen compatibles ('true'): " +
	"JPG: " + this.reproduceJPG + 
	"\n_________________________________________________________________________"+
	"\nOtras caracter�sticas ('true'): " +
	"\n" +
	"Gesti�n y acceso a carpetas: " + this.accesoCarpetas + 
	"\n" +
	"Grabadora de voz: " + this.grabadoraVoz +
	"\n" + 
	"Sintonizar emisoras de radio: " + this.radio +
	"Sintonizar canales de televisi�n: " + this.television +
	"\n" +
	"Dimensiones de la pantalla (pulgadas/inches)" + this.tamanoDeLaPantalla + ".";
	}

}

