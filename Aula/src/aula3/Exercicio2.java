package aula3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Faça um programa que peça um valor e mostre se ele é par ou impar;
		
		System.out.println("Informe o número para verificação: ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número informado é par.");
		} else {
			System.out.println("O número informado é impar.");
		}
	}
}