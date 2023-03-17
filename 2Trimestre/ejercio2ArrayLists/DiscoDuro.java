package ejercio2ArrayLists;

import java.util.ArrayList;

public class DiscoDuro {
	private ArrayList<Archivo> FILES;
	private int maxCapacity;
	private int occupiedSpace;

	public DiscoDuro(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.FILES = new ArrayList<Archivo>();
		this.occupiedSpace = 0;
	}

	public ArrayList<Archivo> getFILES() {
		return FILES;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public int getOccupiedSpace() {
		return occupiedSpace;
	}

	public void saveFile(Archivo file) {
		if (this.occupiedSpace + file.getSize() <= this.maxCapacity) {
			FILES.add(file);
			this.occupiedSpace += file.getSize();
			System.out.println("Archivo guardado con éxito.");
		} else {
			System.out.println("No hay espacio suficiente para guardar el archivo.");
		}
	}

	public void removeFile(String name) {
		Archivo archivoEliminar = null;
		for (Archivo file : FILES) {
			if (file.getName().equals(name)) {
				archivoEliminar = file;
				break;
			}
		}
		if (archivoEliminar != null) {
			FILES.remove(archivoEliminar);
			this.occupiedSpace -= archivoEliminar.getSize();
			System.out.println("Archivo eliminado con éxito.");
		} else {
			System.out.println("Archivo no encontrado.");
		}
	}

	public void listWholeContent() {
		System.out.println("Nombre\tTamaño");
		for (Archivo file : FILES) {
			System.out.println(file.getName() + "\t" + file.getSize());
		}
		System.out.println("Tamaño ocupado: " + this.occupiedSpace);
	}

	public void formatDisk() {
		FILES.clear();
		this.occupiedSpace = 0;
		System.out.println("Disco formateado con éxito.");
	}

}