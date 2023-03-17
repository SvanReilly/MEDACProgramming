package CREACIONDECLASES;

public class LIBRO {

	private int añopublicacion, numpag;
	private long ISBN;
	private String titulo, autor;
	private boolean prestado;

	// CONSTRUCTOR VACÍO//
	public LIBRO() {
		this.ISBN = 0;
		this.titulo = "";
		this.autor = "";
		this.añopublicacion = 0;
		this.numpag = 0;
		this.prestado = false;
	}

	// CONSTRUCTOR CON PARÁMETROS//
	public LIBRO(long ISBN, String titulo, String autor, int añopublicacion, int numpag, boolean prestado) {
		this.ISBN = 0;
		this.titulo = "";
		this.autor = "";
		this.añopublicacion = 868;
		this.numpag = 49;
		this.prestado = false;
	}

	// GETTERS AND SETTERS//

	public long getISBN() {
		return this.ISBN;
	}

	public void setISBN(long ISBN) {
		if (ISBN<9999999999999L && ISBN>1000000000000L) {
			this.ISBN = ISBN;
		} else {
			this.ISBN = 1000000000001L;
		}
		
		
	}

	public int getAñopublicacion() {
		return this.añopublicacion;
	}

	public void setAñopublicacion(int añopublicacion) {
		this.añopublicacion = añopublicacion;
		
	}

	public int getNumpag() {
		return this.numpag;
	}

	public void setNumpag(int numpag) {
		if (numpag > 48) {
			this.numpag = numpag;
		} else {
			this.numpag = 49;
		}

	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void getPrestado(boolean prestado) {
		this.prestado=prestado;
	}
	
	public boolean setPrestado (boolean prestado) {
		return this.prestado;
	}
	

	// SPECIFICS METHODS//

	public boolean Prestar() {
		boolean correcto=true;
		if(this.prestado) {
			correcto=false ;
		}else {
			this.prestado=true;
		} return correcto;
				
	}
	public boolean Devolver() {
		boolean correcto=true;
		if(!this.prestado) {
			correcto=false ;
		}else {
			this.prestado=true;
		} return correcto;
		
	}
	// Checar páginas.
	public boolean CheckPages(LIBRO librocomp) {
		return this.numpag>librocomp.getNumpag();
		
	}
	// TO STRING//

	@Override
	public String toString() {
			
		return "El libro: " + this.titulo + " con ISBN: " + this.ISBN + "y creado por " + this.autor +
				 "en " + this.añopublicacion + " tiene " + this.numpag + " páginas y está " + this.prestado;
				
	}

}
