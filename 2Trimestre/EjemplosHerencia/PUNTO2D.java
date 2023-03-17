package EjemplosHerencia;

public class PUNTO2D {

	private int x;
	private int y;

	// Constructor vacío//
	public PUNTO2D() {
		this.x = 0;
		this.y = 0;

	}

	// Constructor con parametros//
	public PUNTO2D(int x, int y) {
		this.x = x;
		this.y = y;

	}

	// Getters & Setters//
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Specific Methods//
	public void MovVert(int dist) {
		this.y += dist;
	}

	public void MovHor(int dist) {
		this.x += dist;
	}

	// ToString//
	public String toString() {
		return "(" + this.x + "," + this.y + ")";

	}

}