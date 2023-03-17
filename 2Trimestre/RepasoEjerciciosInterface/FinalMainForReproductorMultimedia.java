package RepasoEjerciciosInterface;

public class FinalMainForReproductorMultimedia {
	public static void main(String[] args) {
		
		ReproductorMultimedia iPod = new ReproductorMultimedia();
		
		
		System.out.println(iPod.getArchivoAudio());
		System.out.println(iPod.getArchivoVideo());
		iPod.setArchivoAudio("Never Gonna Give Up (Slowed&Reverb) - Rick Astley");
		System.out.println(" :D ");
		System.out.println(iPod.reproducirAudio());
		
		
		
		
		
		
		
	}

}
