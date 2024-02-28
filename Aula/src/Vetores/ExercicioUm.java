package Vetores;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice e printe o vetor. 
		//Ex: 
		//[0] = 0 
		//[1] = 1 
		//[2] = 4 
		//[3] = 9

		//Tipo[] nome = new tipo[tamanho do vetor];
		int[] vetor = new int[10];
		
		// System.out.print1n(vetor[0]); - Imprimindo o valor de UMA variável.
		
		for (int indice = 0; indice < 10; indice++)	{
			vetor[indice] = indice * indice; 
		}

		for(int indice = 0; indice < 10; indice++) {
			System.out.println(vetor[indice]);
		}
		
		
	}

}
