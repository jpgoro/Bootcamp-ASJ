package PairProgMuniecos;

public class SuperHeroe {
	private String nombre;
	private String descripcion;
	private boolean isCapa;
	public SuperHeroe(String nombre) {
		this.nombre = nombre;
		this.descripcion="";
		this.isCapa=false;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public boolean isCapa() {
		return isCapa;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setCapa(boolean isCapa) {
		this.isCapa = isCapa;
	}
	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", descripcion=" + descripcion + ", isCapa=" + isCapa + "]";
	}
}
