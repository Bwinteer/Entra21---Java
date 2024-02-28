package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Faça um programa, utilizando for, que peça para o usuário inserir um número N e mostre na tela todos os números ímpares até N.
		 
		System.out.print("Digite um número N: ");
		int n = entrada.nextInt();
			System.out.println("Números ímpares até " + n + ":");
		        for (int i = 0; i <= n; i += 2)  {
		        	System.out.println(i);
		       }
			}
	}	