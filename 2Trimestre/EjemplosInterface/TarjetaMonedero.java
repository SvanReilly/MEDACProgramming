package EjemplosInterface;

public interface TarjetaMonedero {
	public void comprar(float importa,String dni);
	public String getId();
	public String getDniTitular();
	public int getSaldo();
	public void setPin(int pin);
}
