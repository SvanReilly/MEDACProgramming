package BlaCKjack;

import java.util.Random;

public class Game extends Baraja {

	private Crupier crupier;
	private Player player;
	private Baraja Cards;

	public Game() {
		this.crupier = crupier;
		this.player = player;
		this.Cards= new Baraja();
	}

	public Game(Crupier crupier, Player player) {

		this.crupier = crupier;
		this.player = player;
		this.Cards= new Baraja();

	}

	public Crupier getJose() {
		return crupier;
	}

	public Player getJacinto() {
		return player;
	}

	public Baraja getCards() {
		return Cards;
	}

	public String newGame() {

		this.crupier.setScore(0);
		this.player.setScore(0);
		Baraja.shuffle();
		Random r = new Random();
		int low = 0;
		int high = 52;
		int result = r.nextInt(high - low) + low;
		this.player.setScore(result);
		int lowa = 0;
		int higha = 52;
		int resulta = r.nextInt(higha - lowa) + lowa;
		this.player.setScore(resulta);

		return "Crupier: " + this.crupier.getScore() + "/ " + this.player.getName() + ":" + this.player.getScore();
	}

	public void turn(int num) {
		if (num == 1) {

		} else if (num == 2) {

		} else {

		}
	}
}
