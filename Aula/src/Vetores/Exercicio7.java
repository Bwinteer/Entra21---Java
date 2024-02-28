package Vetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e por fim printe o vetor.
		
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			System.out.println("Escolha um índice para mudar por 0: ");
			int indice = entrada.nextInt();
			//indice que o usuário escolheu, coloque o número 0
			vetor[indice] = 0;
			
			for(int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
			}
					
		}
		
	}

