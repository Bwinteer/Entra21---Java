package Prova;

import java.util.Scanner;

public class BrunaWinter_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e depois calcule a média.
		
		int quantidadeAlturas = 10;
		double media = 0;
		double altura = 0;
		
		for (double i = 0; i < 10; i++) {
			System.out.println("Digite a sua altura: ");
			altura = entrada.nextDouble();
			quantidadeAlturas += media;		
		}
		
			media = altura / quantidadeAlturas;
			
			System.out.println("A média das alturas informadas é: " + media);
		}

	}

