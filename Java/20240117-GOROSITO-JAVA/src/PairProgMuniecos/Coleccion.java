package PairProgMuniecos;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
	private String nombre;
	private List<Figura> listaFiguras;

	public Coleccion(String nombre) {
		this.nombre = nombre;
		this.listaFiguras = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void aniadirFigura(Figura figura) {
		this.listaFiguras.add(figura);
	}

	public void subirPrecio(double cantidad, String id) {
		for (int i = 0; i < listaFiguras.size(); i++) {
			if (listaFiguras.get(i).getCodigo().equals(id)) {
				listaFiguras.get(i).subirPrecio(cantidad);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder figuras = new StringBuilder();
		for (Figura figura : listaFiguras) {
			figuras.append(figura.toString()+"\n");
		}
		return figuras.toString();

	}
	
	public String conCapa() {
		StringBuilder figuras = new StringBuilder();
		for (Figura figura : listaFiguras) {
			if(figura.getSuperHeroe().isCapa()) {
				figuras.append(figura.toString()+"\n");
			}
		}
		return figuras.toString();

	}
	
	public Figura masValioso() {
		Figura masValiosa = listaFiguras.getFirst();
		for (Figura figura : listaFiguras) {
			if(figura.getPrecio()>masValiosa.getPrecio()) {
				masValiosa=figura;
			}
		}
		return masValiosa;
	}
	
	public double getValorColeccion() {
		double acumulador = 0;
		for (Figura figura : listaFiguras) {
			acumulador+=figura.getPrecio();
		}
		return acumulador;
	}
	
	public double getVolumenColeccion() {
		double acumulador = 0;
		for (Figura figura : listaFiguras) {
			acumulador+=figura.getDimension().getVolumen();
		}
		return acumulador+200;
	}
	

}
