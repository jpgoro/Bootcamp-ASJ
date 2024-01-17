package Ejercicios;

import java.util.List;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Password> contraseñas = new java.util.ArrayList<Password>();
		int opcion;
		boolean flag=true;
		
		do {
			mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch(opcion) {
            case 1:
            	System.out.println("Desea alguna longitud de contraseña? s/n");
            	String eleccion = scanner.next();
            	if(eleccion.equals("s")) {
            		System.out.println("Ingrese la longitud de contraseña");
            		int pass = scanner.nextInt();
            		Password password = new Password(pass);
            		contraseñas.add(password);
            	}else {
            		Password password = new Password();
            		contraseñas.add(password);
            	}
            	break;
            case 2:
            	System.out.println("\nContraseñas ingresadas:");
                for (Password contraseña : contraseñas) {
                    System.out.println("Contraseña: " + contraseña.getContraseña());
                    System.out.println("Es fuerte: " + contraseña.esFuerte());
                    System.out.println("------------------------------");
                }
            	break;
            case 3:
            	System.out.println("Hasta luego");
            	flag =false;
            	
            default: System.out.println("Ingresar una opción correcta");
            break;
            }
		}while(flag);
		
	}
	private static void mostrarMenu() {
        System.out.println("\n---- Menú ----");
        System.out.println("1. Generar contraseña");
        System.out.println("2. Mostrar contraseñas");
        System.out.println("3. Salir");
    }

}
