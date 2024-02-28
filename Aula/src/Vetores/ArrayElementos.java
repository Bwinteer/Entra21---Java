package Vetores;

import java.util.Scanner;

public class ArrayElementos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Crie um array de elementos e depois peça ao usuário para informar um valor, 
		//verifique se este valor está presente no array e printe o índice.

		int[] vetor = new int[10];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("Informe um valor para " + "ver se está presente");
		int variavelAuxiliar = entrada.nextInt();
		
		boolean possuiValor = false;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == variavelAuxiliar) {
				System.out.println("Indíce: " + i);
				possuiValor = true;
			}
			
		}
		
		if (possuiValor == false) {
			System.out.println("Valor informado não existe no índice!");
		}
	}
}
