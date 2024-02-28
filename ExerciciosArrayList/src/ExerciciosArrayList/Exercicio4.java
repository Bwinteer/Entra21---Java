package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {

	/*Faça um algoritmo que atribua valores à Array List de acordo com o quadrado do seu índice
	Ex:
	[0] = 0
	[1] = 1
	[2] = 4
	[3] = 9
	[4] = 16; */
		
	List<Integer> lista = new ArrayList<>();
	int tamanho = 5;
		
	for (int i = 0; i < tamanho; i++) {
		lista.add(i * i);
	}

	for (int i = 0; i < tamanho; i++) {
        System.out.println("[" + i + "] = " + lista.get(i));
		}
	}
}
	
