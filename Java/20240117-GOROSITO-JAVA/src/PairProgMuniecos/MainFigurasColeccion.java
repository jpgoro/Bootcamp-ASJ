package PairProgMuniecos;

public class MainFigurasColeccion {

	public static void main(String[] args) {
		SuperHeroe superHeroe1 = new SuperHeroe("Batman");
		superHeroe1.setCapa(true);
		Dimension dimension1 = new Dimension(20,10,10);
		Figura figura1 = new Figura("bat01",1000,superHeroe1,dimension1);
		
		SuperHeroe superHeroe2 = new SuperHeroe("Spiderman");
		Figura figura2= new Figura("spider04",15000,superHeroe2,dimension1);
		
		Coleccion coleccion1 = new Coleccion("Super Heroes");
		coleccion1.aniadirFigura(figura1);
		coleccion1.aniadirFigura(figura2);
		System.out.println("Figura más valiosa");
		System.out.println(coleccion1.masValioso().toString());
		System.out.println("Precio total de la coleccion");
		System.out.println(coleccion1.getValorColeccion());
		System.out.println("Volumen total de la coleccion");
		System.out.println(coleccion1.getVolumenColeccion());
		System.out.println("----------------------------------------");
		System.out.println("Coleccion completa");
		System.out.println(coleccion1.toString());
		System.out.println("----------------------------------------");
		System.out.println("Coleccion con capa");
		System.out.println(coleccion1.conCapa());
		
		

	}

}
