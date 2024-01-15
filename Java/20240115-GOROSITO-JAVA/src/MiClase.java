import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		/*System.out.println("Tipo - Mínimo - Máximo");
		System.out.println("byte: "+Byte.MIN_VALUE +"--"+ Byte.MAX_VALUE);
		System.out.println("int: "+Integer.MIN_VALUE +"--"+ Integer.MAX_VALUE);
		System.out.println("double: "+Double.MIN_VALUE +"--"+ Double.MAX_VALUE);
		System.out.println("float: "+Float.MIN_VALUE +"--"+ Float.MAX_VALUE);
		System.out.println("short: "+Short.MIN_VALUE +"--"+ Short.MAX_VALUE);
		System.out.println("long: "+Long.MIN_VALUE +"--"+ Long.MAX_VALUE);*/
		
		//Dada una palabra ingresada por el usuario (por teclado), mostrar su equivalente en ASCII letra por letra.
		Scanner scanner = new Scanner(System.in);			
		int ascii;
		String palabra = scanner.nextLine();
		
		for(int i=0; i<palabra.length();i++) {
			ascii = (int) palabra.charAt(i);
			System.out.print(ascii+" ");
		}
		
		scanner.close();
	}
}
