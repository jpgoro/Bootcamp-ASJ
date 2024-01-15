import java.util.Scanner;

public class Estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario que ingrese ¿cuantos notas quiere ingresar?
		//segun eso, pedir, el valor de cada nota (1 al 10)
		// Sacar el promedio
		//P/D: hacerlo con for, while y do-while
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de notas");
		int notas = scanner.nextInt();
		int i=0;
		int k=0;
		int calificacion = 0;
		double promedio;
		
		//-------------WHILE-----------------
		
//		while(i<notas) {
//			System.out.println("Ingrese una nota del 1 al 10");
//			calificacion += scanner.nextInt();
//			i++;
//		}
		
		//-------------FOR-----------------
		
//		for(int j=0;j<notas;j++) {
//			System.out.println("Ingrese una nota del 1 al 10");
//			calificacion += scanner.nextInt();
//		}
		
		//-------------DO WHILE-----------------
		
		do {
			System.out.println("Ingrese una nota del 1 al 10");
			calificacion += scanner.nextInt();
			k++;
		}while(k<notas);
		
		System.out.println(calificacion);
		promedio = (double) calificacion/notas;
		System.out.println("El promedio es: "+ promedio);
		
	}

}
