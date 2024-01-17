package Ejercicios;

public class ClasePrueba {

	public static void main(String[] args) {
		
		//Ejercicio 1 -------------------------------------------------------------
		Ejercicio1 ejer = new Ejercicio1(3.3,7.5);
		ejer.suma();
		ejer.resta();
		ejer.multipicacion();
		ejer.division();
		ejer.setNumero1(10.4);
		System.out.println("cambio de valor ------------");
		ejer.suma();
		ejer.resta();
		ejer.multipicacion();
		ejer.division();
		
		//Ejercicio 2 -------------------------------------------------------------
		
		Cuenta cuenta = new Cuenta("Roberto");
		cuenta.setCantidad(120);
		cuenta.ingresar(120);
		cuenta.retirar(100);
		cuenta.retirar(30);
		
		//Ejercicio 3 -------------------------------------------------------------
	
	}

}
