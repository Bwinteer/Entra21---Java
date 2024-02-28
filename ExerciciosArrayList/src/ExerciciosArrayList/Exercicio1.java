package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {

		/*Coloque 5 elementos em uma Array List e ordene-os
		 *Em ordem crescente.
		 */
		
		List<String> lista = new ArrayList<>();
		
		lista.add("1");
		lista.add("3");
		lista.add("5");
		lista.add("2");
		lista.add("4");
		
		lista.sort(null);
		System.out.println(lista);

	}

}
