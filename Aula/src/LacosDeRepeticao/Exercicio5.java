package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.
		
		for (int i = 0; i <= 3; i++) {
            System.out.print("Digite o primeiro número: ");
            int num = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            int numDois = entrada.nextInt();
            
            int resultado = num - numDois;
            
            System.out.println("Resultado da subtração: " + resultado);

        }
    }
}