package repaso1y2Trimestre;

public class TESTMAIN {

	public static void main(String[] args) {
		
		GAME test = new GAME();
	

		
		
		/*test.cambiarJugador(test.getJugadorActual());
		test.cambiarJugador(test.getJugadorActual());
		System.out.println(test.getJugador1().getName());
		System.out.println(test.getJugador2().getName());
		System.out.println(test.getJugadorActual().getName());
		*/
		/*
		test.pedirCoordenada("A", pActual);
		test.pedirCoordenada("B", pActual);
		test.pedirCoordenada("C", p1);
		
		test.pedirCoordenada("D", p1);
		test.pedirCoordenada("E", pActual);
		test.pedirCoordenada("F", p1);

		test.pedirCoordenada("G", pActual);
		test.pedirCoordenada("H", p1);
		test.pedirCoordenada("I", pActual);
		*/
		
		
		test.pedirCoordenada("A", test.getJugador1());
		test.pedirCoordenada("B", test.getJugador2());
		test.pedirCoordenada("C", test.getJugador1());
		
		test.pedirCoordenada("D", test.getJugador2());
		test.pedirCoordenada("E", test.getJugador1());
		test.pedirCoordenada("F", test.getJugador2());
		
		test.pedirCoordenada("G", test.getJugador2());
		test.pedirCoordenada("H", test.getJugador1());
		test.pedirCoordenada("I", test.getJugador2());
		
		System.out.println(test.comprobarCeldas("A"));
	/*	System.out.println(test.comprobarCeldas("A") 
				+ " " + test.comprobarCeldas("B")
				+ " " + test.comprobarCeldas("C")
				+ "\n" + test.comprobarCeldas("D")
				+ " " + test.comprobarCeldas("E")
				+ " " + test.comprobarCeldas("F")
				+ "\n" + test.comprobarCeldas("G")
				+ " " + test.comprobarCeldas("H")
				+ " " + test.comprobarCeldas("I"));
System.out.println(test.comprobarEmpate());
		
		System.out.println("\n");
		
		System.out.println(test.getTablero());
		
		*/
		
		
		
	//	System.out.println(tablero.getCelda(0, 0).isOcupada());
	
		//System.out.println(tablero.isOcupada());
		//System.out.println(test.comprobarEmpate());
		

		
		
		
	}

}
