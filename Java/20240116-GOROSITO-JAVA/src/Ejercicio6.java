import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int opcion;
		System.out.println("Rellene la matriz");
		rellenarMatriz(matriz,scanner);
		do {
			
			mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            switch(opcion) {
           
			case 1:
				imprimirMatriz(matriz);
				break;
			case 2:
				System.out.print("\nIngrese el número de la fila que desea sumar (0, 1, 2 o 3): ");
				int fila = scanner.nextInt();

				
				if (fila >= 0 && fila < matriz.length) {
					int sumaFila = sumarFila(matriz, fila);
					System.out.println("La suma de la fila " + fila + " es: " + sumaFila);
				} else {
					System.out.println("Fila no válida. Debe ser un número entre 0 y " + (matriz.length - 1));
				}
				break;
			case 3:
				System.out.print("Ingrese el número de la columna que desea sumar (0, 1, 2 o 3): ");
		        int columna = scanner.nextInt();

		        if (columna >= 0 && columna < matriz[0].length) {
		            int sumaColumna = sumarColumna(matriz, columna);
		            System.out.println("La suma de la columna " + columna + " es: " + sumaColumna);
		        } else {
		            System.out.println("Columna no válida. Debe ser un número entre 0 y " + (matriz[0].length - 1));
		        }
		        
				break;
			case 4:
				int sumaDiagonalPrincipal = sumarDiagonalPrincipal(matriz);
		        System.out.println("\nLa suma de la diagonal principal es: " + sumaDiagonalPrincipal);
				break;
			case 5:
				int sumaDiagonalInversa = sumarDiagonalInversa(matriz);
		        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
				break;
			case 6:
				 double mediaMatriz = calcularMediaMatriz(matriz);
			        System.out.println("La media de todos los valores de la matriz es: " + mediaMatriz);
				break;
			case 7:
				break;
			default: System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
			
		}while (opcion != 7);
		
       
		
		scanner.close();
	}
	private static void mostrarMenu() {
        System.out.println("\n---- Menú ----");
        System.out.println("1. Imprimir la matriz");
        System.out.println("2. Sumar una fila");
        System.out.println("3. Sumar una columna");
        System.out.println("4. Sumar la diagonal principal");
        System.out.println("5. Sumar la diagonal inversa");
        System.out.println("6. Calcular la media de la matriz");
        System.out.println("7. Salir");
    }

	private static void rellenarMatriz(int[][] matriz, Scanner scanner) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Ingrese un número para la posición [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
	}

	private static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int sumarFila(int[][] matriz, int fila) {
		int suma = 0;
		for (int j = 0; j < matriz[fila].length; j++) {
			suma += matriz[fila][j];
		}
		return suma;
	}
	
	private static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
	private static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
	
	private static int sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }
	
	private static double calcularMediaMatriz(int[][] matriz) {
        int totalElementos = matriz.length * matriz[0].length;
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        return (double) sumaTotal / totalElementos;
    }
	
	
}
