package SinkOrFloat;

public class Occupied extends Square {

	private Ship ship;

	public Occupied(String coord, Ship ship) {
		super(coord);
		this.ship = ship;
		this.id= 'S';
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean occupied() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void attack() {
		this.ship.hit();
	}
	

}
