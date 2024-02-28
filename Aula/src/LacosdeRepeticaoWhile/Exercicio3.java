package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Faça um programa que peça ao usuário um número entre 12 e 20. 
		//Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente. 
		//Se digitar correto mostrar o número digitado.
		
		int numero = 0;
		
		System.out.println("Digite um número entre 12 e 20: ");
		numero = entrada.nextInt();
		
		while (numero < 12 || numero > 20) {
			System.out.println("Entrada inválida!");
			numero = entrada.nextInt();
		}
		System.out.println(numero);
		System.out.println("Fim!");
		
	}

}
