package Vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Crie um programa que solicite 3 notas e armazene em um vetor, depois imprima
		// a média.

		double[] notas = new double[3];

			double soma = 0;
			double media = 0;
			for (int i = 0; i < 3; i++) {
				System.out.println("Informe a nota: ");
				notas[i] = entrada.nextDouble();
				soma = soma + notas[i];
			}
			System.out.println("A média das notas é: " + (soma / 3));
		}
	}

