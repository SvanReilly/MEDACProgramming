package examenArrayListsHashmaps;

public class CantanteFamoso {

	private String name;
	private int sales;
	private String musicalGenre;

	public CantanteFamoso(String name, String musicalGenre) {
		this.name = name;
		this.musicalGenre = musicalGenre;
		this.sales = 0;
	}

	public CantanteFamoso(String name, int sales, String musicalGenre) {
		this.name = name;
		this.sales = sales;
		this.musicalGenre = musicalGenre;
	}

	public String getNombre() {
		return name;
	}

	public void setNombre(String name) {
		this.name = name;
	}

	public int getVentas() {
		return sales;
	}

	public void setVentas(int sales) {
		this.sales = sales;
	}

	public String getGeneroMusical() {
		return musicalGenre;
	}

	public void setGeneroMusical(String musicalGenre) {
		this.musicalGenre = musicalGenre;
	}
}
