package CREACIONDECLASES;

public class LIBRO2 {
	private long ISBN;
	private String titulo;
	private String autor;
	private int a�opub;
	private int numpags;
	private boolean prestado;
	
	public LIBRO2() {
		
		this.ISBN = 0;
		this.titulo = "";
		this.autor = "";
		this.a�opub = 0;
		this.numpags = 0;
		this.prestado = false;
	}
	
	public LIBRO2(long ISBN, String titulo, String autor, int a�opub, int numpags) {
		if(numpags>0 && ISBN>0) {
			this.ISBN = ISBN;
			this.titulo = titulo;
			this.autor = autor;
			this.a�opub = a�opub;
			this.numpags = numpags;
			this.prestado = false;
		}
		
	}

	public long getISBN() {
		return this.ISBN;
	}

	public void setISBN(long iSBN) {
		if(iSBN<9999999999999L && iSBN>1000000000000L) {
			this.ISBN = iSBN;
		}
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getA�opub() {
		return a�opub;
	}

	public void setA�opub(int a�opub) {
		this.a�opub = a�opub;
	}

	public int getNumpags() {
		return numpags;
	}

	public void setNumpags(int numpags) {
		if(numpags>0) {
			this.numpags = numpags;
		}
		
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public boolean prestar() {
		boolean correcto=true;
		if(this.prestado) {
			correcto=false;
		
		}else {
			this.prestado=true;
		}
		return correcto;
	}
	public boolean devolver() {
		boolean correcto=true;
		if(!this.prestado) {
			correcto=false;
		}else {
			this.prestado=false;
		}
		return correcto;
	}
	public boolean comparar(LIBRO2 librocomp) {
		return this.numpags>librocomp.getNumpags();
	}
}
