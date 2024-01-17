
public class Auto {
private String marca;
private int puertas;
private String color;
private String patente;

public Auto() {
	
}

public Auto(String marca, int puertas, String color, String patente) {
	this.marca = marca;
	this.puertas = puertas;
	this.color = color;
	this.patente = patente;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getPuertas() {
	return puertas;
}
public void setPuertas(int puertas) {
	this.puertas = puertas;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getPatente() {
	return patente;
}
public void setPatente(String patente) {
	this.patente = patente;
}


}
