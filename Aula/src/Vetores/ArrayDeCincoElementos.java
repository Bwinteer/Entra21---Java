package Vetores;

import java.util.Scanner;

public class ArrayDeCincoElementos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Crie uma array de 5 elementos e no momento de imprimir, comece pelo último elemento até o primeiro elemento.
		int[] elementos = new int [5];
				
		// Preencher o vetor com valores de exemplo
		for (int i = 0; i < 5; i++) {
			elementos[i] = i + 1; // Valores de exemplo de 1 a 5
		}
			
		// Imprimir o vetor começando pelo último elemento até o primeiro
	    for (int i = 4; i >= 0; i--) { // i = i - 1
	    	System.out.println(elementos[i]);
	    	
	    	}
	    }
	}
