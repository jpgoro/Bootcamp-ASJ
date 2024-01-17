import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> miLista = new java.util.ArrayList<String>();
		//agregar
		miLista.add("rojo");
		//eliminar un elemento
		miLista.remove("rojo");
		//limpia la lista
		miLista.clear();
		//devuelve el indice del primero
		miLista.indexOf("rojo");
		//devuelve el indice del ultimo
		miLista.lastIndexOf("rojo");
		//cheque si esta vacio
		miLista.isEmpty();
		
		//Iterardor
		Iterator<String> miIterador = miLista.iterator();
		
		while(miIterador.hasNext()) {
			String elemento = miIterador.next();
			System.out.println(elemento + "-");
		}
		
		
	}
	
	

}
