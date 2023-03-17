package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Libro {

	private HashMap<Integer, String> libro;

	public Libro() {
		this.libro = new HashMap<Integer, String>();
	}

	public HashMap<Integer, String> getLibro() {
		return libro;
	}

	public void setLibro(HashMap<Integer, String> libro) {
		this.libro = libro;
	}

	public String add(int page, String content) {
		String resultado;
		if (this.libro.containsKey(page)) {
			this.replace(page, content);
			resultado = "Página reemplazada";
		} else {
			resultado = "Página insertada";
			this.libro.put(page, content);
		}
		return resultado;
	}

	public void remove(int page) {
		this.libro.remove(page);
	}

	public void replace(int page, String content) {
		this.remove(page);
		this.add(page, content);
	}

	public String getContent(int page) {
		return this.libro.get(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String toString() {
		String resultado = "";
		for (Map.Entry pagina : libro.entrySet()) {
			resultado += pagina.getKey() + "->" + pagina.getValue() + "\n";
		}
		return resultado;

	}

}
