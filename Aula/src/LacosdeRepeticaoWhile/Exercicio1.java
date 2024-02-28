package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.
		
		double numero = 0;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextDouble();
		while (numero > 1) {
		System.out.println("Digite outro número: ");
		numero = entrada.nextDouble();
		
		}
		
        System.out.println("O número digitado é menor ou igual a 1.");

			}
		}


