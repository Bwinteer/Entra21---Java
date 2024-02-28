package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("Bruna");
		lista.add("Pablo");
		lista.add("Ricardo");
		lista.add(1, "Marquinhos");
		lista.remove("Bruna");
		lista.remove(1);
		
		System.out.println(lista);

	}

}
