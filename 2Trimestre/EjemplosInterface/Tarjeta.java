package EjemplosInterface;

public class Tarjeta implements TarjetaMonedero{
	private String id;
	private String DNITitular;
	private float saldo;
	@Override
	public void comprar(float importa, String dni) {
		// TODO Auto-generated method stub
		if(this.DNITitular==dni) {
			this.saldo-=importa;
		}
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getDniTitular() {
		// TODO Auto-generated method stub
		return this.DNITitular;
	}

	@Override
	public int getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPin(int pin) {
		// TODO Auto-generated method stub
		
	}

}
