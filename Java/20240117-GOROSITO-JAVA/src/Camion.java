
public class Camion extends Auto{
	
	private double cargaMax;
	
	public Camion() {
		
	}

	public Camion(String marca, int puertas, String color, String patente) {
		super(marca, puertas, color, patente);
		// TODO Auto-generated constructor stub
	}

	public Camion(double cargaMax) {
		super();
		this.cargaMax = cargaMax;
	}

	@Override
	public String toString() {
		return "Camion [cargaMax=" + cargaMax + ", getMarca()=" + getMarca() + ", getPuertas()=" + getPuertas()
				+ ", getColor()=" + getColor() + ", getPatente()=" + getPatente() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
