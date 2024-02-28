package aula3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

		System.out.println("Informe o valor para verificação: ");
		int valor = entrada.nextInt();
		
		if (valor > 0) {
		    System.out.println("O valor é positivo.");
		} else if (valor < 0) {
		    System.out.println("O valor é negativo.");
		} else {
		    System.out.println("O valor é zero.");
		}
	}
}

