package HashMap;

public class LibroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro librito = new Libro();
		librito.add(1, "P�gina 1");
		librito.add(2, "P�gina 2");
		librito.add(3, "P�gina 3");
		librito.add(4, "P�gina 4");
		librito.add(5, "P�gina 5");
		librito.add(6, "P�gina 6");
		
		
		librito.replace(4, "Adi�s, 4");
		
		System.out.println(librito);

	}

}
