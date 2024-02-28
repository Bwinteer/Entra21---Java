package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		/*Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
		Imprima também o seu índice*/
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (lista.contains(numero)) {
			System.out.println("O número informado " + numero + " está presente na lista na posição " + lista.indexOf(numero));
		} else {
			System.out.println("O número informado " + numero + " não está presente na lista.");
		}
		
	}

}
