package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		/*Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou*/
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		
		System.out.println("Digite o índice que deseja alterar: ");
		int indice = scanner.nextInt();
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		lista.set(indice, numero);
		System.out.println(lista);
		
	}

}