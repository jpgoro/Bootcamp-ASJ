import java.util.Scanner;

public class PairTelefono {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un conjunto de números a convertir");
		String numeros = scanner.nextLine();
		
		String [] fragmento = numeros.split(" ");
		for(int i =0; i<fragmento.length;i++) {
			System.out.println(fragmento[i]);
		}
	}

}
