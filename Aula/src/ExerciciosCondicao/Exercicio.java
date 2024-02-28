package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

		// Entrada
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = entrada.nextInt();

		System.out.println("Informe o segundo número: ");
		int segundoNumero = entrada.nextInt();

		// Processo - maior valor entre eles
		if (primeiroNumero > segundoNumero) {
			System.out.println("O primeiro número é maior que o segundo número.");
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O primeiro número é menor que o segundo número.");
		} else {
			System.out.println("Os números são iguais.");
		}
	}
}