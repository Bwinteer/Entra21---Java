package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		//No final, mostre a soma dos números digitados.

		double numero = 0;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextDouble();
		
		while (numero > 1) {
		System.out.println("Digite um número: ");
		numero = entrada.nextDouble();
		
		{
		int soma = 0;
		System.out.println("Escreva um número igual a zero: ");
		int valor = entrada.nextInt();
		
		while (valor > 0) {
			System.out.println("Digite um número: ");
			valor = entrada.nextInt();
			soma = soma + valor;
		}
				
			System.out.println("A soma dos números é: " + soma);
	}
		}
	}
}