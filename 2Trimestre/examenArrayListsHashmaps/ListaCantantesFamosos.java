package examenArrayListsHashmaps;

import java.util.ArrayList;

public class ListaCantantesFamosos {

	private ArrayList<CantanteFamoso> listaCantantesFamosos;

	public ListaCantantesFamosos() {
		this.listaCantantesFamosos = new ArrayList<>();
	}

	public void anadirCantante(CantanteFamoso singer) {
		this.listaCantantesFamosos.add(singer);
	}

	public void borrarCantante(CantanteFamoso singer) {
		this.listaCantantesFamosos.remove(singer);
	}

	public String buscarPorGenero(String genre) {
		String singerList = "";
		for (CantanteFamoso singer : this.listaCantantesFamosos) {
			if (genre.equalsIgnoreCase(singer.getGeneroMusical())) {
				singerList += singer.getNombre() + ", con sus aportaciones a la m�sica " + singer.getGeneroMusical()
						+ ", ha conseguido un total de " + singer.getVentas() + " ventas registradas." + "\n";
			}
		}
		return singerList;
	}

	public CantanteFamoso obtenerCantantePorVentas() {
		CantanteFamoso resultado = null;
		int maxSales = Integer.MIN_VALUE;
		for (CantanteFamoso singer : this.listaCantantesFamosos) {
			if (singer.getVentas() > maxSales) {
				resultado = singer;
				maxSales = singer.getVentas();
			}
		}
		return resultado;
	}

	public void mostrarCantantes() {
		for (CantanteFamoso singer : this.listaCantantesFamosos) {
			System.out.println(
					singer.getNombre() + " - " + singer.getGeneroMusical() + " - " + singer.getVentas() + " ventas");
		}
	}
}
