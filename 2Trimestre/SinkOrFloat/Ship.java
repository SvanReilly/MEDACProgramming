package SinkOrFloat;

public class Ship {

	private int size;
	private char id;
	private int health;

	protected Ship(int size, char id) {
		this.size = size;
		this.id = id;
		this.health = this.size;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public void hit() {
		this.health--;
	}

	public boolean isAlive() {
		boolean vivo = true;

		if (this.health == 0) {
			vivo = false;

		}
		return vivo;
	}

}
