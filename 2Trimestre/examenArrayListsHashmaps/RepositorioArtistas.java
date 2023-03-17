package examenArrayListsHashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioArtistas {

	private HashMap<String, ArrayList<String>> repository;

	public RepositorioArtistas() {
		this.repository = new HashMap<>();
	}

	public void aņadirCantante(String singerName, ArrayList<String> songs) {
		this.repository.put(singerName, songs);
	}

	public void aņadirCanciones(String singerName, ArrayList<String> songs) {
		ArrayList<String> existingSongs = this.repository.get(singerName);
		if (existingSongs == null) {
			existingSongs = new ArrayList<>();
		}
		existingSongs.addAll(songs);
		this.repository.put(singerName, existingSongs);
	}

	public ArrayList<String> obtenerCanciones(String singerName) {
		return this.repository.get(singerName);
	}

}
