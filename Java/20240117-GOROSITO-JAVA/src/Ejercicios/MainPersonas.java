package Ejercicios;

import java.util.Scanner;

public class MainPersonas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un Nombre");
		String nombre = scanner.next();
		System.out.println("Ingresa la edad");
		int edad = scanner.nextInt();
		System.out.println("Ingresa el sexo");
		String sexo = scanner.next();
		System.out.println("Ingresa el peso");
		int peso = scanner.nextInt();
		System.out.println("Ingresa la altura");
		double altura= scanner.nextDouble();
		Persona persona1 = new Persona(nombre,edad,sexo,peso, altura);
		System.out.println(peso(persona1,peso,altura));
		System.out.println("Ingresa un Nombre");
		String nombre1 = scanner.next();
		System.out.println("Ingresa la edad");
		int edad1 = scanner.nextInt();
		System.out.println("Ingresa el sexo");
		String sexo1 = scanner.next();
		Persona persona2 = new Persona(nombre1,edad1,sexo1);
		Persona persona3 = new Persona();
		
		//En construccion

	}
	public static String peso(Persona persona,int peso, double altura) {
		String resultado ="";
		if(persona.calcularIMC(peso, altura)==-1) {
			resultado="Presenta bajo peso";
		}else if(persona.calcularIMC(peso, altura)==0) {
			resultado="Peso Ideal, felicitaciones";
		}else {
			resultado="Peso Ideal, felicitaciones";
		}
		return resultado;
	}
	
}
