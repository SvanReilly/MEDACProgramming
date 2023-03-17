package EjemplosInterface;

public class Libro implements iPublicacion,iPrestable,iConsultable{
	private int codigo;
	private String autor;
	private String titulo;
	private int anio;
	private boolean prestado;
	private boolean consultado;
	public Libro(int codigo, String autor, String titulo, int anio) {
		
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.prestado = false;
		this.consultado=false;
	}
	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void setCodigo(int codigo) {
		// TODO Auto-generated method stub
		this.codigo=codigo;
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return this.autor;
	}

	@Override
	public void setAutor(String autor) {
		// TODO Auto-generated method stub
		this.autor=autor;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo=titulo;
	}

	@Override
	public int getAnio() {
		// TODO Auto-generated method stub
		return this.anio;
	}

	@Override
	public void setAnio(int anio) {
		// TODO Auto-generated method stub
		this.anio=anio;
	}

	@Override
	public boolean isPrestado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}

	@Override
	public void setPrestado(boolean prestado) {
		// TODO Auto-generated method stub
		this.prestado=prestado;
	}
	@Override
	public void prestar() {
		if(!this.prestado && !this.consultado) {
			this.prestado=true;
		}
		
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		if(this.prestado || this.consultado) {
			this.prestado=false;
			this.consultado=false;
		}
	}
	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		if(!this.consultado && !this.prestado) {
			this.consultado=true;
		}
	}
	@Override
	public boolean isConsultando() {
		// TODO Auto-generated method stub
		return this.consultado;
	}

}
