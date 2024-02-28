package aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*Faça um programa que recebe a nota do aluno e retorna: 
		 *A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete; 
		 *A mensagem “Aprovado com Distinção”, se a média for igual a dez; 
		 *A mensagem “Reprovado” se a média for menor de do que sete;
		 */
		
		System.out.println("Digite a sua média: ");
		double media = entrada.nextDouble();
		
		if(media == 10) {
			System.out.println("Aprovado com distinção!");
		} else if (media > 10) {
			System.out.println("Nota inválida!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else { 
			System.out.println("Reprovado!");
		}
	}
}