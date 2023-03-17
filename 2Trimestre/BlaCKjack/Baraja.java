package BlaCKjack;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

	private final Cartas H2 = new Cartas(2, "Hearts");
	private final Cartas H3 = new Cartas(3, "Hearts");
	private final Cartas H4 = new Cartas(4, "Hearts");
	private final Cartas H5 = new Cartas(5, "Hearts");
	private final Cartas H6 = new Cartas(6, "Hearts");
	private final Cartas H7 = new Cartas(7, "Hearts");
	private final Cartas H8 = new Cartas(8, "Hearts");
	private final Cartas H9 = new Cartas(9, "Hearts");
	private final Cartas H10 = new Cartas(10, "Hearts");
	private final Cartas C2 = new Cartas(2, "Clubs");
	private final Cartas C3 = new Cartas(3, "Clubs");
	private final Cartas C4 = new Cartas(4, "Clubs");
	private final Cartas C5 = new Cartas(5, "Clubs");
	private final Cartas C6 = new Cartas(6, "Clubs");
	private final Cartas C7 = new Cartas(7, "Clubs");
	private final Cartas C8 = new Cartas(8, "Clubs");
	private final Cartas C9 = new Cartas(9, "Clubs");
	private final Cartas C10 = new Cartas(10, "Clubs");
	private final Cartas D2 = new Cartas(2, "Diamonds");
	private final Cartas D3 = new Cartas(3, "Diamonds");
	private final Cartas D4 = new Cartas(4, "Diamonds");
	private final Cartas D5 = new Cartas(5, "Diamonds");
	private final Cartas D6 = new Cartas(6, "Diamonds");
	private final Cartas D7 = new Cartas(7, "Diamonds");
	private final Cartas D8 = new Cartas(8, "Diamonds");
	private final Cartas D9 = new Cartas(9, "Diamonds");
	private final Cartas D10 = new Cartas(10, "Diamonds");
	private final Cartas S2 = new Cartas(2, "Spades");
	private final Cartas S3 = new Cartas(3, "Spades");
	private final Cartas S4 = new Cartas(4, "Spades");
	private final Cartas S5 = new Cartas(5, "Spades");
	private final Cartas S6 = new Cartas(6, "Spades");
	private final Cartas S7 = new Cartas(7, "Spades");
	private final Cartas S8 = new Cartas(8, "Spades");
	private final Cartas S9 = new Cartas(9, "Spades");
	private final Cartas S10 = new Cartas(10, "Spades");
	private final Cartas AH = new Cartas("Heart Ace");
	private final Cartas AC = new Cartas("Clubs Ace");
	private final Cartas AD = new Cartas("Diamond Ace");
	private final Cartas AS = new Cartas("Spades Ace");
	private final Cartas JH = new Cartas("Jack", "Hearts");
	private final Cartas JC = new Cartas("Jack", "Clubs");
	private final Cartas JD = new Cartas("Jack", "Diamonds");
	private final Cartas JS = new Cartas("Jack", "Spades");
	private final Cartas QH = new Cartas("Queen", "Hearts");
	private final Cartas QC = new Cartas("Queen", "Clubs");
	private final Cartas QD = new Cartas("Queen", "Diamonds");
	private final Cartas QS = new Cartas("Queen", "Spades");
	private final Cartas KH = new Cartas("King", "Hearts");
	private final Cartas KC = new Cartas("King", "Clubs");
	private final Cartas KD = new Cartas("King", "Diamonds");
	private final Cartas KS = new Cartas("King", "Spades");
	private static ArrayList<Cartas> Baraja = new ArrayList<Cartas>();

	public ArrayList<Cartas> getBaraja() {
		return Baraja;
	}

	public void setBaraja(ArrayList<Cartas> baraja) {
		Baraja.add(H2);		Baraja.add(H3);		Baraja.add(H4);	
		Baraja.add(H5);		Baraja.add(H6);		Baraja.add(H7);	
		Baraja.add(H8);		Baraja.add(H9);		Baraja.add(H10);
		Baraja.add(C2);		Baraja.add(C3);		Baraja.add(C4);
		Baraja.add(C5);		Baraja.add(C6);		Baraja.add(C7);
		Baraja.add(C8);		Baraja.add(C9);		Baraja.add(C10);
		Baraja.add(D2);		Baraja.add(D3);		Baraja.add(D4);
		Baraja.add(D5);		Baraja.add(D6);		Baraja.add(D7);
		Baraja.add(D8);		Baraja.add(D9);		Baraja.add(D10);
		Baraja.add(S2);		Baraja.add(S3);		Baraja.add(S4);
		Baraja.add(S5);		Baraja.add(S6);		Baraja.add(S7);
		Baraja.add(S8);		Baraja.add(S9);		Baraja.add(S10);
		Baraja.add(AH);		Baraja.add(AC);		Baraja.add(AD);		Baraja.add(AS);
		Baraja.add(JH);		Baraja.add(JC);		Baraja.add(JD);		Baraja.add(JS);
		Baraja.add(QH);		Baraja.add(QC);		Baraja.add(QD);		Baraja.add(QS);
		Baraja.add(KH);		Baraja.add(KC);		Baraja.add(KD);		Baraja.add(KS);
	}

	public int getScore(int num) {
		return Baraja.get(num).getNumero();
	}
	
	public static void shuffle() {

		Collections.shuffle(Baraja);
		
	}
}
