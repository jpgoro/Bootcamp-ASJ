package Ejercicios;

import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private String sexo;
	private int peso;
	private double altura;

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = generarDNI();
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generarDNI();
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni= generarDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	private int generarDNI() {
		Random random = new Random();
	    int minimo = 9999999;
	    int maximo = 99999999;

	    return random.nextInt(maximo - minimo + 1) + minimo;
		
	}
	
	public int calcularIMC(int peso, double altura) {
		int resultado = 0;
		int imc = (int)(peso/(altura*altura));
		if(imc>25) {
			resultado=1;
		}else if(imc>=20 && imc<=25) {
			resultado = 0;
		}else {
			resultado = -1;
		}
	return resultado;
	}
	
	public boolean esMayorDeEdad(int edad) {
		if(edad>=18) {
			return true;
		}
		return false;
	}
	public void comprobarSexo(String sexo){
		if(!(sexo.toLowerCase().equals("h"))&& !(sexo.toLowerCase().equals("m"))) {
			sexo="H";
		}
		else {
			System.out.println("sexo correcto");
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
}

