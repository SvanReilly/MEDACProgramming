package EjemplosInterface;

public interface iPublicacion {
	public int getCodigo();
	public void setCodigo(int codigo);
	public String getAutor();
	public void setAutor(String autor);
	public String getTitulo();
	public void setTitulo(String titulo);
	public int getAnio();
	public void setAnio(int anio);
	public boolean isPrestado();
	public void setPrestado(boolean prestado);
}
