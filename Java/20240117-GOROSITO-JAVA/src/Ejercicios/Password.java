package Ejercicios;

import java.util.Random;

public class Password {
//	3) Haz una clase llamada Password que siga las siguientes condiciones:
//		Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
//		Un constructor por defecto.
//		Un constructor con la longitud que nosotros le pasemos. Generara una contraseña
//		aleatoria con esa longitud.
//		Los métodos que implementa serán al menos:
//	-- esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe
//	tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
//	    -- generarPassword(): genera la contraseña del objeto con la longitud que
//	tenga.
//	   -- Método get para contraseña y longitud.
//	   -- Método set para longitud.
//
//	Ahora, crea una clase clase ejecutable:
//	Obtener por teclado, contraseñas ingresadas por el usuario (pueden utilizar arrays o ArrayList).
//	Mostrar todas las contraseñas y si son fuertes o no.
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		generarContraseña(this.longitud);
	}
	public Password(int longitud) {
		this.longitud = longitud;
		generarContraseña(this.longitud);
	}
	
	private void generarContraseña(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        char[] contraseñaArray = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseñaArray[i] = caracteres.charAt(indice);
        }

        this.contraseña = new String(contraseñaArray);
    }
	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (char caracter : this.contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }
}
