package repaso1y2Trimestre;

public class MAINTEST {

	public static void main(String[] args) {
		
		GAME test = new GAME();
		


		TABLERO tablero = test.getTablero();

		JUGADOR p1 = test.getJugador1();
		test.setJugador1(p1);
		
		JUGADOR p2 = test.getJugador2();
		test.setJugador2(p2);
		
		JUGADOR pActual =test.getJugadorActual();
		test.setJugadorActual(pActual);
		
		
		

		
		test.pedirCoordenada("A", pActual);
		test.pedirCoordenada("B", pActual);
		test.pedirCoordenada("C", p1);
		
		test.pedirCoordenada("D", p1);
		test.pedirCoordenada("E", pActual);
		test.pedirCoordenada("F", p1);

		test.pedirCoordenada("G", pActual);
		test.pedirCoordenada("H", p1);
		test.pedirCoordenada("I", pActual);
		
		test.cambiarJugador(p1);
		
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(pActual.getName());
		/*System.out.println(test.comprobarCeldas("A"));
		System.out.println(test.comprobarCeldas("B"));
		System.out.println(test.comprobarCeldas("C"));

		System.out.println(test.comprobarCeldas("D"));
		System.out.println(test.comprobarCeldas("E"));
		System.out.println(test.comprobarCeldas("F"));
		
		System.out.println(test.comprobarCeldas("G"));
		System.out.println(test.comprobarCeldas("H"));
		System.out.println(test.comprobarCeldas("I"));
		
		*/
		
	//	System.out.println(tablero.getCelda(0, 0).isOcupada());
	
		//System.out.println(tablero.isOcupada());
		//System.out.println(test.comprobarEmpate());
		

		
		
		
	}

}
