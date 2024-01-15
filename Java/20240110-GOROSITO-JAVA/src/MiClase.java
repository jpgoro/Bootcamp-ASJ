
public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		int edad;
		char letra;
		double num1;
		boolean estado;
		String nombre;
		float precio;

		edad = 25;
		letra = 'c';
		num1 = 123.4;
		estado = false;
		nombre = "goro";
		precio = 99.9f;

		System.out.println("La edad es " + (edad + 1));
		System.out.println(letra);
		System.out.println(edad);
		System.out.println(num1);
		System.out.println(estado);
		System.out.println(nombre);
		System.out.println(precio);
		
		
		if(edad > 18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}

}
