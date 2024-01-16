import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Ejercicio 4
//		Generar una matriz de 3×3 con números aleatorios sin repetirse.
		int[][] matriz = generarMatrizAleatoriaSinRepetir(3, 3);

        // Imprimir la matriz generada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
	}

	private static int[][] generarMatrizAleatoriaSinRepetir(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];
        int[] numerosDisponibles = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cantidadNumeros = 9;

        Random random = new Random();

        // Generar la matriz con números aleatorios sin repetirse
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int indice = random.nextInt(cantidadNumeros);
                matriz[i][j] = numerosDisponibles[indice];
                
                for (int k = indice; k < cantidadNumeros - 1; k++) {//elimino el ultimo que uso
                    numerosDisponibles[k] = numerosDisponibles[k + 1];
                }
                cantidadNumeros--;
            }
        }

        return matriz;
    }

}
