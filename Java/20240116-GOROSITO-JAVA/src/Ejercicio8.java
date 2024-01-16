import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto a cifrar: ");
        String textoOriginal = scanner.nextLine();

        int desplazamiento = 2; 

        //String textoCifrado = cifrarTexto(textoOriginal, desplazamiento);

        //System.out.println("Texto cifrado: " + textoCifrado);

        scanner.close();
    }

	//private static String cifrarTexto(String texto, int desplazamiento) {
//        String textoCifrado = "";
//
//        for (int i = 0; i < texto.length(); i++) {
//            char caracter = texto.charAt(i);
//
//            if (Character.isLetter(caracter)) {
//                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
//                char cifrado = (char) ((caracter - base + desplazamiento) % 26 + base);
//                textoCifrado += cifrado;
//            } else {
//                textoCifrado += caracter;
//            }
//        }
//
 //      return textoCifrado;
		

	//}

}
