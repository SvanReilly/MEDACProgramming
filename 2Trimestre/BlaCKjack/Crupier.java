package BlaCKjack;
public class Crupier {

	private String Name;
	private int Score;

	public Crupier(String name) {

		this.Name = name;
		this.Score = 0;
	}

	public Crupier() {
		this.Name = "Crupier Maleante";
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

		return "El crupier " + getName() + " tiene " + getScore() + " puntos";
	}

}