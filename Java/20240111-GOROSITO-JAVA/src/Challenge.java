import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// .useDelimiter("\r?\n");

		// primer challenge
		/*
		 * System.out.println("Ingrese 3 numeros enteros"); //String myString =
		 * scanner.next(); int Int = scanner.nextInt(); int Int1 = scanner.nextInt();
		 * int Int2 = scanner.nextInt(); scanner.close();
		 * 
		 * System.out.println("\n"+Int+"\n"+Int1+"\n"+Int2);
		 */

		// segundo challenge

		/*
		 * System.out.println("Ingrese un número entero"); int entero =
		 * scanner.nextInt(); scanner.nextLine();
		 * System.out.println("Ingrese un número decimal"); double decimal =
		 * scanner.nextDouble(); System.out.println("Ingrese una palabra"); String
		 * palabra = scanner.next(); scanner.close();
		 * 
		 * System.out.println("\n"+"String:"+palabra);
		 * System.out.println("Double:"+decimal); System.out.println("Int:"+entero);
		 */

		// tercer challenge

		/*
		 * System.out.println("Ingrese un numero entre 1 y 100"); int numero =
		 * scanner.nextInt(); scanner.close(); if (1 <= numero && numero <= 100) { if
		 * (numero % 2 == 1 || (numero % 2 == 0 && numero >= 6 && numero <= 20)) {
		 * System.out.println("Weird"); } else { System.out.println("Not Weird"); } }
		 * else { System.out.println("Weird");
		 * 
		 * }
		 */

		// cuarto challenge

		/*System.out.println("Ingrese un numero entre 2 y 20");
		int numero = scanner.nextInt();
		scanner.close();
		if (numero >= 2 && numero <= 20) {
			int i = 1;
			while (i <= 10) {
				System.out.println(numero + " x " + i + " = " + numero * i);
				i++;
			}
		} else {
			System.out.println("Ingrese un múmero correcto");
		}*/
		
		
		//quinto challenge
		
		System.out.println("ingrese un numero para consultas entre 0 y 500");
		int q = scanner.nextInt();
		for(int i=0;i<q;i++) {
			System.out.println("Ingrese un valor para a mayor a 0");
			int a = scanner.nextInt();
			System.out.println("Ingrese un valor para b menor o igual a 50");
			int b = scanner.nextInt();
			System.out.println("Ingrese un valor para n entre 1 y 15");
			int n = scanner.nextInt();
			
			
			for (int j=0; j<n; j++) {
				a += Math.pow(2,j)*b;
				System.out.println(a + " ");
				
			}
			System.out.println();
		}
	}

}
