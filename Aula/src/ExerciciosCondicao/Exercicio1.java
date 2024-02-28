package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio1 {
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
		// Saida
			System.out.println("O primeiro número é maior que o segundo valor.");
		} else { // Nunca é utilizado sozinho, ele sempre estará alinhado com if
			System.out.println("O segundo número é maior que o primeiro valor.");
		}
	}
}