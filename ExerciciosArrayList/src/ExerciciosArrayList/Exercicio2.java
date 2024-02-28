package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*Crie uma Array List e imprima os últimos elementos por primeiro*/
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		
	for (int i = lista.size() - 1; i >= 0; i--) {
		System.out.println(lista.get(i));
	}


	}

}
