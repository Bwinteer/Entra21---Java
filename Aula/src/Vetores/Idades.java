package Vetores;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Fórmula
		//Tipo[] nomeDaVariavel = new tipo[tamanho];
		
		int[] idades = new int[5];		
		idades[0] = 18;
		idades[1] = 24;
		idades[2] = 33;
		idades[3] = 18;
		idades[4] = 28;
		
		int soma = 0;
		soma = idades[0] + idades[1] + idades[2] + idades[3] + idades[4];
		

		System.out.println("A idade é: " + idades[0]);
		System.out.println("A idade é: " + idades[4]);
		System.out.println("A média das idades é: " + (soma / 5));
		
			for (int i = 0; i < 5; i++) {
				System.out.println(idades[i]);
		}
		
		//Vetor String		
		String[] alunos = new String[21];
			for (int i = 0; i < 21; i++) {
			System.out.println("Informe o nome dos alunos: ");
			alunos[i] = entrada.next();
		
		}
			for (int i = 0; i < 21; i++) {
			System.out.println(alunos[i]);
			}
	}
}	

