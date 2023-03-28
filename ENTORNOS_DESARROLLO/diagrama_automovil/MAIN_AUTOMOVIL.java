package diagrama_automovil;

public class MAIN_AUTOMOVIL {
	public static void main(String[] args) {
		
		PERSONA dueno =new PERSONA("Reilly");
		PUERTA derecha= new PUERTA();
		PUERTA izquierda= new PUERTA();
		MOTOR motor=new MOTOR();
		
		
		AUTOMOVIL automovil = new AUTOMOVIL(dueno,derecha,izquierda,motor);
		
		
		System.out.println(automovil);
		
		
		
	}
}
