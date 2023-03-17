package RepasoEjerciciosInterface;

public class ReproductorAudio extends ReproductorPortatil  implements iReproductorAudio{
	
	
	private boolean reproduceCDS, reproduceMP3, reproduceWMA, 
	reproduceVorbis, accesoCarpetas, radio, grabadoraVoz;

	@Override
	public boolean isReproduceCDS() {
		// TODO Auto-generated method stub
		return reproduceCDS;
	}

	@Override
	public void setReproduceCDS(boolean reproduceCDS) throws Exception {
		if(this.getTipoAlmacenamiento().equals(CD)) {
			this.reproduceCDS = reproduceCDS;
		}else {
			throw new Exception("NO ES CD");
		}

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

	public ReproductorAudio(String marca, String modelo, String tipoAlmacenamiento, boolean reproduceCDS , boolean reproduceMP3,boolean reproduceWMA,boolean reproduceVorbis) {
		super(marca, modelo, tipoAlmacenamiento);
		this.reproduceCDS=reproduceCDS;
		this.reproduceMP3=reproduceMP3;
		this.reproduceVorbis=reproduceVorbis;
		this.reproduceWMA=reproduceWMA;
		// TODO Auto-generated constructor stub
	}

	


	
	
	
	
	



}