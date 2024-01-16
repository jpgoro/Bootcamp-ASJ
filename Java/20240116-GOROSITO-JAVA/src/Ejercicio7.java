import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
        int cantidadPersonas = 10;

        
        int[] sexo = new int[cantidadPersonas];
        int[] trabaja = new int[cantidadPersonas];
        int[] sueldo = new int[cantidadPersonas];

        
        Random random = new Random();

        
        for (int i = 0; i < cantidadPersonas; i++) {
            sexo[i] = random.nextInt(2) + 1;
            trabaja[i] = random.nextInt(2) + 1;
            if (trabaja[i] == 1) {
                sueldo[i] = random.nextInt(1401) + 600;
            } else {
                sueldo[i] = 0;
            }
        }
        System.out.println("Resultados de la encuesta:");
        System.out.println("----------------------------");
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Sexo: " + (sexo[i] == 1 ? "Masculino" : "Femenino"));
            System.out.println("Trabaja: " + (trabaja[i] == 1 ? "Sí" : "No"));
            System.out.println("Sueldo: " + sueldo[i]);
            System.out.println("----------------------------");
        }
        
     // Calcular y mostrar el porcentaje de hombres
        int totalHombres = 0;

        for (int i = 0; i < cantidadPersonas; i++) {
            if (sexo[i] == 1) {
                totalHombres++;
            }
        }

        double porcentajeHombres = (double) totalHombres / cantidadPersonas * 100;
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        
     // Calcular y mostrar el porcentaje de mujeres
        int totalMujeres = cantidadPersonas - totalHombres;

        double porcentajeMujeres = (double) totalMujeres / cantidadPersonas * 100;
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        
     // Calcular y mostrar el porcentaje de hombres que trabajan
        int hombresQueTrabajan = 0;
        int sumaSueldosHombresQueTrabajan = 0;

        for (int i = 0; i < cantidadPersonas; i++) {
            if (sexo[i] == 1 && trabaja[i] == 1) {
            	sumaSueldosHombresQueTrabajan += sueldo[i];
                hombresQueTrabajan++;
            }
        }

        double porcentajeHombresQueTrabajan = (double) hombresQueTrabajan / totalHombres * 100;
        System.out.println("Porcentaje de hombres que trabajan: " + porcentajeHombresQueTrabajan + "%");
        double sueldoPromedioHombresQueTrabajan = (double) sumaSueldosHombresQueTrabajan / hombresQueTrabajan;
        System.out.println("Sueldo promedio de los hombres que trabajan: " + sueldoPromedioHombresQueTrabajan);

        
     // Calcular y mostrar el porcentaje de mujeres que trabajan
        int mujeresQueTrabajan = 0;
        int sumaSueldosMujeresQueTrabajan = 0;

        for (int i = 0; i < cantidadPersonas; i++) {
            if (sexo[i] == 2 && trabaja[i] == 1) {
            	sumaSueldosMujeresQueTrabajan += sueldo[i];
                mujeresQueTrabajan++;
            }
        }

        double porcentajeMujeresQueTrabajan = (double) mujeresQueTrabajan / totalMujeres * 100;
        System.out.println("Porcentaje de mujeres que trabajan: " + porcentajeMujeresQueTrabajan + "%");
        double sueldoPromedioMujeresQueTrabajan = (double) sumaSueldosMujeresQueTrabajan / mujeresQueTrabajan;
        System.out.println("Sueldo promedio de las mujeres que trabajan: " + sueldoPromedioMujeresQueTrabajan);



	}

}
