import java.util.Scanner;

public class Estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir al usuario que ingrese ¿cuantos notas quiere ingresar?
		// segun eso, pedir, el valor de cada nota (1 al 10)
		// Sacar el promedio
		// P/D: hacerlo con for, while y do-while

		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Ingrese la cantidad de notas"); int notas =
		 * scanner.nextInt(); int i=0; int k=0; int calificacion = 0; double promedio;
		 * 
		 * //-------------WHILE-----------------
		 * 
		 * // while(i<notas) { // System.out.println("Ingrese una nota del 1 al 10"); //
		 * calificacion += scanner.nextInt(); // i++; // }
		 * 
		 * //-------------FOR-----------------
		 * 
		 * // for(int j=0;j<notas;j++) { //
		 * System.out.println("Ingrese una nota del 1 al 10"); // calificacion +=
		 * scanner.nextInt(); // }
		 * 
		 * //-------------DO WHILE-----------------
		 * 
		 * do { System.out.println("Ingrese una nota del 1 al 10"); calificacion +=
		 * scanner.nextInt(); k++; }while(k<notas);
		 * 
		 * System.out.println(calificacion); promedio = (double) calificacion/notas;
		 * System.out.println("El promedio es: "+ promedio);
		 */

		// Crear un programa donde se introduzcan los tres ángulos internos de un
		// triángulo y se determine si el triángulo es válido o no.

		/*
		 * int angulo1;
		 * 
		 * int angulo2;
		 * 
		 * int angulo3; while(true) { System.out.println("Ingrese el primer angulo");
		 * angulo1 = scanner.nextInt(); System.out.println("Ingrese el segundo angulo");
		 * angulo2 = scanner.nextInt(); System.out.println("Ingrese el tercer angulo");
		 * angulo3 = scanner.nextInt(); if ((angulo1 + angulo2 + angulo3) == 180 &&
		 * angulo1 > 0 && angulo2 > 0 && angulo3 > 0) {
		 * System.out.println("¡Los ángulos forman un triángulo válido!"); } else {
		 * System.out.println("Los ángulos no forman un triángulo válido."); }
		 * 
		 * System.out.println("¿Quere seguir calculando triángulos? (s/n): "); char
		 * respuesta = scanner.next().charAt(0); if (respuesta != 's') { break; } }
		 * scanner.close();
		 */

		// Crear un programa que determine si un string introducido por un usuario
		// empieza con un número o con una letra

		/*
		 * System.out.println("ingrese un texto"); String palabra = scanner.nextLine();
		 * char caracter = palabra.charAt(0); if (Character.isDigit(caracter)) {
		 * System.out.println("El carácter es numérico."); } else {
		 * System.out.println("El carácter no es numérico."); }
		 */

		// Realizar la suma de todos los números pares entre N y M donde N y M los
		// ingresa un usuario

		/*
		 * System.out.println("Ingrese el primer numero"); int M = scanner.nextInt();
		 * System.out.println("Ingrese el segundo numero"); int N = scanner.nextInt();
		 * 
		 * int contador=0; for(int i=M;i<=N;i++) { if(i % 2 == 0) { contador += i; }
		 * System.out.println("provisorio:" + contador); }
		 * System.out.println("la suma es " + contador); scanner.close();
		 */

		// Crear un programa que determine si un número es perfecto o no, (se dice que
		// un número es perfecto si el número es igual a la suma de sus divisores
		// positivos,
		// excluido él mismo., Ejemplos 6 = 1 + 2 + 3)

		/*
		 * System.out.println("ingrese un numero"); int numero = scanner.nextInt(); int
		 * sumatoria = 0; for (int i = 1; i < numero; i++) { if (numero % i == 0) {
		 * sumatoria += i; } } if(sumatoria == numero) {
		 * System.out.println(numero+" es un número perfecto"); }else {
		 * System.out.println(numero+" no es un número perfecto"); }
		 */

		// Dibujo de asteriscos

		System.out.println("Ingre la cantidad de filas");
		int filas = scanner.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= filas - 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" *");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
