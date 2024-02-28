package Vetores;

import java.util.Scanner;

public class Array10Elementos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Crie um array de 10 elementos e depois peça ao usuário para informar um índice, 
		//imprima o o valor que está no vetor conforme indice informado pelo usuario
		
		int[] vetor = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99};
		//Entrada - Indice solicitado ao usuário
		System.out.println("Informe um índice: ");
		int indice = entrada.nextInt();
		// Imprima o valor que está no vetor conforme índice
		System.out.println(vetor[indice]);
		
	}

}
