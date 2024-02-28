package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;


public class Exercicio9 {

	public static void main(String[] args) {

		 /*Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list
		 *tenha tamanho par, remova o valor da segunda metade.
		 * 
		 *Por exemplo: Em uma ArrayList de tamanho 6, remova o valor no índice 4
		 */
		
		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);

		int tamanho = lista.size();

		if (tamanho % 2 == 0) {
			// Se o tamanho for par, remova o valor da segunda metade
			int indiceRemover = tamanho / 2 - 1; // Índice da segunda metade
			lista.remove(indiceRemover);
		} else {
			// Se o tamanho for ímpar, remova o valor do meio
			int indiceRemover = tamanho / 2; // Índice do valor do meio
			lista.remove(indiceRemover);
		}

		System.out.println(lista);
	}

}
