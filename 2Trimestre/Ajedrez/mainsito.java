package Ajedrez;

public class mainsito {

	public static void main(String[] args) {
		PiezaCelda c = new PiezaCelda(1, 'A');
		PiezaTorre t1 = new PiezaTorre(true, c);
		System.out.println(t1);
		PiezaCelda c2 = new PiezaCelda(3, 'B');
		t1.moverse(c2);
		System.out.println(t1);

	}

}
