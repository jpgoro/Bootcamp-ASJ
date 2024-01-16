import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ejercicio 2
//		Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array, es decir,
//		el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última
//		posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.

		/*
		 * 
		 * Scanner scanner = new Scanner(System.in); int[] numeros = new int[15];
		 * System.out.println("Ingrese 15 números:");
		 * 
		 * for (int i = 0; i < 15; i++) { System.out.print("Número " + (i + 1) + ": ");
		 * numeros[i] = scanner.nextInt(); } rotarArray(numeros);
		 * invertirArray(numeros);
		 * System.out.println("\nArray después de la rotación e inversión:"); for (int
		 * numero : numeros) { System.out.print(numero + " "); }
		 * 
		 * scanner.close(); }
		 * 
		 * private static void rotarArray(int[] array) { if (array.length > 0) { int
		 * ultimoElemento = array[array.length - 1]; for (int i = array.length - 1; i >
		 * 0; i--) { array[i] = array[i - 1]; } array[0] = ultimoElemento; } }
		 * 
		 * private static void invertirArray(int[] array) { int izquierda = 0; int
		 * derecha = array.length - 1; while (izquierda < derecha) { int temp =
		 * array[izquierda]; array[izquierda] = array[derecha]; array[derecha] = temp;
		 * izquierda++; derecha--; } }
		 * 
		 */

//		Ejercicio 3 
//		Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. 
//		El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y 
//		todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.

		int[] array = new int[20];
		int[] aux1;
		for (int i = 0; i < 20; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		ordenarImparesYPares(array);
		
		
		for (int numero : array) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}

	private static void ordenarImparesYPares(int[] array) {
		int izquierda = 0;
		int derecha = array.length - 1;

		while (izquierda < derecha) {
			while (izquierda < array.length && array[izquierda] % 2 != 0) {
				izquierda++;
			}
			while (derecha >= 0 && array[derecha] % 2 == 0) {
				derecha--;
			}
			if (izquierda < derecha) {
				int temp = array[izquierda];
				array[izquierda] = array[derecha];
				array[derecha] = temp;
			}
		}

	}
}
