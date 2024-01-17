package PairProgMuniecos;

public class Figura {
	private String codigo;
	private double precio;
	private SuperHeroe superHeroe;
	private Dimension dimension;
	
	public Figura() {
		
	}

	public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimension dimension) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.superHeroe = superHeroe;
		this.dimension = dimension;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public SuperHeroe getSuperHeroe() {
		return superHeroe;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setSuperHeroe(SuperHeroe superHeroe) {
		this.superHeroe = superHeroe;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public void subirPrecio(double cantidad) {
		this.precio = this.precio + cantidad;
	}

	@Override
	public String toString() {
		return "Figura [codigo=" + codigo + ", precio=" + precio + ", superHeroe=" + superHeroe + ", dimension="
				+ dimension + "]";
	}
	
}
