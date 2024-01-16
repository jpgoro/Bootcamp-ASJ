import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
//		Ejercicio 5
//		Dada la matriz anterior, realizar la suma de una columna o fila aleatoria 
//		(preguntar al usuario que desea sumar, si una fila o una columna, y cual de ellas).
//		Extra: mostrar el resultado al final de la fila/columna correspondiente

		int[][] matriz = generarMatrizAleatoriaSinRepetir(3, 3);

		System.out.println("Matriz generada:");
		imprimirMatriz(matriz);

		Scanner scanner = new Scanner(System.in);
		System.out.print("\n¿Desea sumar una fila o una columna? (fila/columna): ");
		String eleccion = scanner.nextLine().toLowerCase();

		if (eleccion.equals("fila")) {
			System.out.print("Ingrese el número de la fila que desea sumar (0, 1 o 2): ");
			int fila = scanner.nextInt();
			sumarFila(matriz, fila);
		} else if (eleccion.equals("columna")) {
			System.out.print("Ingrese el número de la columna que desea sumar (0, 1 o 2): ");
			int columna = scanner.nextInt();
			sumarColumna(matriz, columna);
		} else {
			System.out.println("Opción no válida.");
		}

		scanner.close();
	}

	private static int[][] generarMatrizAleatoriaSinRepetir(int filas, int columnas) {
		if (filas * columnas > 9) {
			throw new IllegalArgumentException("No hay suficientes números disponibles para llenar la matriz");
		}

		int[][] matriz = new int[filas][columnas];
		int[] numerosDisponibles = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int cantidadNumeros = 9;

		Random random = new Random();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int indice = random.nextInt(cantidadNumeros);
				matriz[i][j] = numerosDisponibles[indice];
				for (int k = indice; k < cantidadNumeros - 1; k++) {
					numerosDisponibles[k] = numerosDisponibles[k + 1];
				}
				cantidadNumeros--;
			}
		}

		return matriz;
	}

	private static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void sumarFila(int[][] matriz, int fila) {
		int suma = 0;
		for (int j = 0; j < matriz[fila].length; j++) {
			suma += matriz[fila][j];
		}
		System.out.println("La suma de la fila " + fila + " es: " + suma);
	}

	private static void sumarColumna(int[][] matriz, int columna) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[i][columna];
		}
		System.out.println("La suma de la columna " + columna + " es: " + suma);
	}
}
