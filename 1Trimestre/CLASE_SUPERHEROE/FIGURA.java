package CLASE_SUPERHEROE;

public class FIGURA {

	private String codigo;
	private double precio;

	private SUPERHEROE superheroe;
	private DIMENSIONES dimensiones;

	public FIGURA() {
		this.codigo = "";
		this.precio = 0;
		this.superheroe = new SUPERHEROE();
		this.dimensiones = new DIMENSIONES();
	}

	public FIGURA(String codigo, double precio, SUPERHEROE superheroe, DIMENSIONES dimensiones) {
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimensiones = dimensiones;

	}

	public FIGURA(String codigo, double precio, SUPERHEROE superheroe, DIMENSIONES dimensiones, FIGURA figura2) {
		if (codigo.equals(figura2.getCodigo())) {
			this.codigo = "";
		} else {
			this.codigo = codigo;

		}
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimensiones = dimensiones;

	}

	public String getCodigo() {
		return codigo;
	}

	public boolean setCodigo(String codigonuevo, FIGURA figura2) {
		boolean correcto = true;
		if (codigonuevo.equals(figura2.getCodigo())) {
			correcto = false;
		} else {
			this.codigo = codigonuevo;
		}
		return correcto;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean setPrecio(double precio) {
		boolean correcto = true;
		if (precio < 0) {
			correcto = false;
		} else {
			this.precio = precio;
		}

		return correcto;

	}

	public SUPERHEROE getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(SUPERHEROE superheroe) {
		this.superheroe = superheroe;
	}

	public DIMENSIONES getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(DIMENSIONES dimensiones) {
		this.dimensiones = dimensiones;
	}

	public void subirPrecio(double cantidad) {
		if (cantidad < 0) {
			this.precio += 0;
		} else {
			this.precio += cantidad;
		}

	}

	public String toString() {
		return "Información relativa a la figura con codigo " + this.codigo + " es: \nPrecio:" + this.precio + "$ \n"
				+ this.superheroe + "\n" + this.dimensiones + "\n";
	}

}
