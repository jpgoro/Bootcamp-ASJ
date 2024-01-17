package Ejercicios;

public class Ejercicio1 {
	//1) Cree una clase que me permita realizar una operación matemática de 2 números. (Crear los metodos y atributos necesarios)
	private double numero1;
	private double numero2;
	private double resultado;
	
	
	public Ejercicio1(double numero1, double numero2, double resultado) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
	}
	public Ejercicio1(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void suma() {
		this.resultado = this.numero1 + this.numero2;
		 System.out.println(this.resultado );
		   
	}
	public void resta() {
		 this.resultado = this.numero1 - this.numero2;
		 System.out.println(this.resultado);
	}
	public void multipicacion() {
		this.resultado = this.numero1 * this.numero2;
		System.out.println(this.resultado);
	}
	public void division() {
		this.resultado = this.numero1 / this.numero2;
		System.out.println(this.resultado);
	}
	

}
