package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.
		//Repetição - Valor inicio - Valor Fim - Valor que acrescenta
		
		System.out.print("Digite cinco números inteiros: ");
		for (int i = 0; i < 5; i++) {
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é ímpar");
            }
		}
	}

}