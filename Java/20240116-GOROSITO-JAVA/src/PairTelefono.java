import java.util.Scanner;

public class PairTelefono {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un conjunto de números a convertir");
		String numeros = scanner.nextLine();
		char[] unaCifra = { 'a', 'd', 'g', 'j', 'm', 'p', 't', 'w' };
		char[] dosCifras = { 'b', 'e', 'h', 'k', 'n', 'q', 'u', 'x' };
		char[] tresCifras = { 'c', 'f', 'i', 'l', 'o', 'r', 'v', 'y' };
		char[] cuatroCifras = { 's', 'z' };
		String palabra = "";
		String[] fragmento = numeros.split(" ");
		for (int i = 0; i < fragmento.length; i++) {
			int index = Character.getNumericValue(fragmento[i].charAt(0)) - 2;

			if (index == -2) {
				palabra += " ";
			} else if (fragmento[i].length() == 1) {
				palabra += unaCifra[index];
			} else if (fragmento[i].length() == 2) {
				palabra += dosCifras[index];
			} else if (fragmento[i].length() == 3) {
				palabra += tresCifras[index];
			} else if (fragmento[i].length() == 4) {
				if (index == 5) {
					palabra += cuatroCifras[0];
				} else {
					palabra += cuatroCifras[1];
				}
			}
			scanner.close();
			
		}
		System.out.println(palabra);
	}

}
