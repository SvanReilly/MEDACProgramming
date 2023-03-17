package diagrama_animales;

public class MAIN {
	public static void main(String[] args) {
		
		
		PERRO podenco = new PERRO ("Lola", 8, "beige", true);
		HUMANO granadino = new HUMANO ("Svan", 28, 1.82f, podenco);
		GALLINA gallina = new GALLINA ("Pita", 1, "blanco" );
		
		System.out.println(podenco.HABLAR() + "\n" + granadino.DORMIR()
		+ "\n" + gallina.ALIMENTARSE() + " y " + gallina.DESPLAZARSE() + ".");
		
		
	}

}
