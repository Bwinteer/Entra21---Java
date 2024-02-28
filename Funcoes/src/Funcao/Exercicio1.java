package Funcao;

import java.util.Scanner;

public class Exercicio1 {
	// Mensagem é do tipo String
	// Limite mínimo, máximo e valor escolhido
	public static String verifica(int min, int max, int valorInserido) {
		
		// Para verificar se o valor está dentro do limite
		if (valorInserido > min && valorInserido < max) {
			return  valorInserido + " está nos limites impostos";
		} else {
			// senão
			return "não está no limite";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário
		
		Por exemplo:

		Usuário inseriu o limite máximo como 100.
		Usuário inseriu o limite mínimo como 70.

		Depois ele inseriu o número 80.

		A saída deve ser: 80 está nos limites impostos.*/
		
		System.out.println("Informe o limite mínimo: ");
		int limiteMinimo = scanner.nextInt();
		
		System.out.println("Informe o limite máximo: ");
		int limiteMaximo = scanner.nextInt();
		
		System.out.println("Informe um número para verificação: ");
		int numero = scanner.nextInt();
		
		System.out.println(verifica(limiteMaximo, limiteMinimo, numero));
		
	}	   
}