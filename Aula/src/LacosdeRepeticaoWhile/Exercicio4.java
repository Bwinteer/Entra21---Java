package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0 
		//Calcule a média de altura das mesmas.

		double altura = 0;
		double somaAltura = 0;
		double media = 0;
		double valorMedia = 0;
		
		System.out.println("Digite uma altura: ");
		altura = scan.nextDouble();
		while (altura != 0) {
		somaAltura = altura + somaAltura;
		valorMedia++;
		
		System.out.println("Digite outra altura: ");
		altura = scan.nextDouble();
		
	}
		media = somaAltura / valorMedia;
		System.out.println("O valor é média: " + media);
		
			}
}
