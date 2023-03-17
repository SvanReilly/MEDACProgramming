package HashMap;

public class LibroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro librito = new Libro();
		librito.add(1, "Página 1");
		librito.add(2, "Página 2");
		librito.add(3, "Página 3");
		librito.add(4, "Página 4");
		librito.add(5, "Página 5");
		librito.add(6, "Página 6");
		
		
		librito.replace(4, "Adiós, 4");
		
		System.out.println(librito);

	}

}
