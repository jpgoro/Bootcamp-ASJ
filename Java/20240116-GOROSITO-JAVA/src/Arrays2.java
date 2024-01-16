import java.util.Scanner;

public class Arrays2 {
	private static double saldo = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String[] movimientos = new String[10];
		int contadorMovimientos = 0;
		
		do {
			mostarMenu();
			System.out.println("Elija una opción");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				extraerDinero(scanner, saldo,movimientos, contadorMovimientos);
				break;
			case 2:
				depositarDinero(scanner, saldo, movimientos,contadorMovimientos);
				break;
			case 3:
				consultarSaldo(saldo, movimientos,contadorMovimientos);
				break;
			case 4:
				verMovimientos(movimientos);
				break;
			case 5:
				System.out.println("¡Gracias por utilizar el cajero automático!");
                break;
			default:
				System.out.println("Seleccione una opción correcta");
				break;
			}
		} while (opcion != 5);

	}

	private static void verMovimientos(String[] movimientos) {
		
		System.out.println("===== Últimos Movimientos =====");
        for (String movimiento : movimientos) {
            if (movimiento != null) {
                System.out.println(movimiento);
            }
        }
	}

	private static void consultarSaldo(double saldo, String [] movimientos, int contadorMovimientos) {
		System.out.println("Saldo actual: $" + saldo);
		registrarMovimiento("Consultado saldo: $" + saldo, movimientos,contadorMovimientos);

	}

	private static void depositarDinero(Scanner scanner, double saldo, String [] movimientos,int contadorMovimientos) {
		System.out.println("Ingre el monto que desea depositar");
		double cantidad = scanner.nextDouble();
		scanner.nextLine();
		saldo += cantidad;
		registrarMovimiento("Depositado: +$" + cantidad, movimientos, contadorMovimientos);
		System.out.println("Depósito exitoso");
	}

	private static void extraerDinero(Scanner scanner, double saldo, String [] movimientos, int contadorMovimientos) {
		System.out.print("Ingrese la cantidad a extraer: ");
		double cantidad = scanner.nextDouble();
		if (cantidad > saldo) {
			System.out.println("Error: Fondos insuficientes");
		} else {
			saldo -= cantidad;
			registrarMovimiento("Extraído: -$" + cantidad, movimientos, contadorMovimientos);
			System.out.println("Extracción exitosa");
		}

	}
	
	private static void registrarMovimiento(String movimiento, String [] movimientos, int contadorMovimientos) {
		if (contadorMovimientos < movimientos.length) {
	        movimientos[contadorMovimientos] = movimiento;
	        contadorMovimientos++;
	    } else {
	        for (int i = 0; i < movimientos.length - 1; i++) {
	            movimientos[i] = movimientos[i + 1];
	        }
	        movimientos[movimientos.length - 1] = movimiento;
	    }
        
    }

	private static void mostarMenu() {

		System.out.println("\n===== Menú del Cajero Automático =====");
		System.out.println("1. EXTRAER");
		System.out.println("2. DEPOSITAR");
		System.out.println("3. CONSULTAR SALDO");
		System.out.println("4. VER ÚLTIMOS MOVIMIENTOS");
		System.out.println("5. SALIR");
	}

}
