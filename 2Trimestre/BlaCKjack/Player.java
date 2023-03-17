package BlaCKjack;
public class Player {

	private String Name;
	private int Score;

	public Player(String name) {

		this.Name = name;
		this.Score = 0;
	}

	public Player() {
		this.Name = "Elber Galarga";
		this.Score = 0;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String toString() {
		return "El jugador " + getName() + " tiene " + getScore() + " puntos";
	}
}
