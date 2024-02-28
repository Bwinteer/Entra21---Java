package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu*/
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		System.out.println("Digite o índice desejado: ");
		int indice = scanner.nextInt();
		
		lista.set(indice, 0);
		System.out.println(lista);
		
	}

}
