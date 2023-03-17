package SinkOrFloat;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {

	private HashMap<String, Square> Map;

	public Map() {
		this.Map = new HashMap<String, Square>();
		char letra = 'A';
		int num = 1;
		String coord = "";
		for (int i = 0; i < 25; i++) {
			coord = "";
			if (num == 6) {
				letra++;
				num = 1;
			}
			coord += letra;
			coord += num;

			this.Map.put(coord, new Water(coord));
			num++;
		}
	}

	public HashMap<String, Square> getMap() {
		return Map;
	}

	public void setMap(HashMap<String, Square> map) {
		this.Map = map;
	}

	public void addSquare(String id, Square square) {
		this.Map.put(id, square);

	}

	public String toString() {
		String resultado = "";
		int cont = 0;
		ArrayList<String> arrayString = new ArrayList<String>(this.Map.keySet());
		arrayString.sort(null);
		for (int i = 0; i < arrayString.size(); i++) {

			if (i % 5 == 0 && i != 0) {
				resultado += "\n";

			}
			resultado += this.Map.get(arrayString.get(i)).getId() + " ";
		}
		return arrayString.toString();
	}
}
