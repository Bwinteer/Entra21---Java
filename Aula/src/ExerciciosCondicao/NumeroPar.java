package ExerciciosCondicao;

import java.util.Scanner;

public class NumeroPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Dados dois números inteiros descreva um algoritmo para informar se eles são múltiplos ou não;

		// Entrada
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = entrada.nextInt();

		System.out.println("Informe o segundo número: ");
		int segundoNumero = entrada.nextInt();

		// Processo - se eles são pares ou não
		if (primeiroNumero % segundoNumero % 2 == 0) {
			System.out.println("Os números informados são pares.");
		} else {
			// Saída
			System.out.println("Os números informados não são pares.");
		}
	}
}