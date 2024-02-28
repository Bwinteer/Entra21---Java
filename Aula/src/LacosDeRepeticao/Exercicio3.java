package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 1000.
		//Repetição - Valor inicio - Valor Fim - Valor que acrescenta
		
		int somaImpar = 0;
		int somaPar = 0;
		
		for (int i = 1; i <= 1000; i++) { // contando sempre i = i +1	
			if (i % 2 == 0) { //Verifica se é par
				somaPar = somaPar + i;
			} else {
				somaImpar = somaImpar + i;
            }
		}
			System.out.println("A quantidade números pares é: " + somaPar);
			System.out.println("A quantidade números ímpares é: " + somaImpar);
		}
}
