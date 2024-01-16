import java.util.ArrayList;
import java.util.List;

public class LISTTTTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		
		lista.add("Perro");
		lista.add("mandril");
		lista.add("ornitorrinco");
		lista.add("libelula");
		
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("---------------");
		for(String animal:lista) {
			System.out.println(animal);
		}
	}

}
