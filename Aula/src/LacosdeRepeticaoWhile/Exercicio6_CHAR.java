package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio6_CHAR {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
	// Escreva um programa onde caso o usuário digite a letra 's' peça para informar um número e caso digite 'n' encerre o programa e por fim
	// a) escreva o menor valor  
	// b) escreva o maior valor
		
	// Entrada
	System.out.println("Informe uma opção: (s/n)");
	char opcao = entrada.next().charAt(0);
	// Um número
	int numero = 0;
				
	int menor = Integer.MAX_VALUE; // variavel auxiliar - valor
	int maior = Integer.MIN_VALUE;
	// debug
	System.out.println(menor);
	// debug
	System.out.println(maior);
				
	while(opcao == 's') {
		System.out.println("Informe um número:");
		numero = entrada.nextInt();
		// Processo
	if(numero < menor) {
		menor = numero;
		}
	// debug
	// System.out.println("menor temp " + menor);
	if(numero > maior) {
		maior = numero;
		
	while (opcao != 'n' && opcao != 's') {
         System.out.println("Resposta inválida. Por favor, digite 's' ou 'n'.");
         opcao = entrada.next().charAt(0);
     }
}
	
	// não entrar em loop
	// opcao = 'n';
		System.out.println("Informe uma opção");
		opcao = entrada.next().charAt(0);
					
		}
	// saida
	System.out.println("Menor " + menor);
	System.out.println("Maior " + maior);
						
	}

		}
