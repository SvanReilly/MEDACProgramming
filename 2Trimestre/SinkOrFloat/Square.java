package SinkOrFloat;

public abstract class Square {
	
	private String coord;
	protected char id;
	
	
	public char getId() {
		return id;
	}


	public void setId(char id) {
		this.id = id;
	}


	protected Square(String coord) {
		this.coord=coord;
	}


	public String getCoord() {
		return coord;
	}


	public void setCoord(String coord) {
		this.coord = coord;
	}

	public abstract boolean occupied();
	
}
