package CLASE_SUPERHEROE;

public class SUPERHEROE_MAIN {
	public static void main(String[] args) {
				
		SUPERHEROE superheroe = new SUPERHEROE("Rondador Nocturno");

		superheroe.setDescripcion(
				"Heroe capaz de viajar entre dimensiones para desplazarse en el mundo físico, tiene aspecto de felino de color negro");
		DIMENSIONES dimensiones = new DIMENSIONES(13.0, 10.0, 5.0, superheroe);
		FIGURA figura1 = new FIGURA("7364234682E", 355, superheroe, dimensiones);
		
		
		SUPERHEROE superheroe1 = new SUPERHEROE("Dr. Strange");
		
		superheroe1.setDescripcion(
				"Heroe capaz de controlar las leyes físicas del universo.");
		DIMENSIONES dimensiones1 = new DIMENSIONES(13.0, 11.0, 5.0, superheroe1);
		FIGURA figura2 = new FIGURA("73642346892E", 3200.76, superheroe1, dimensiones1, figura1);
		
		
		
		
		
		System.out.println(figura1);	
		System.out.println(figura2);
	}

}