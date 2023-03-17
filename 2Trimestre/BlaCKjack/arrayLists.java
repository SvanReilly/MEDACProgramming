package BlaCKjack;
public class arrayLists {

	public static void main(String[] args) {

		
		Crupier crupier = new Crupier();
		Player player = new Player();
		Game a1 = new Game(crupier, player);

		a1.newGame();
		System.out.println(a1.newGame());

	}

}
