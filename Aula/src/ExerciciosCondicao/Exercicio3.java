package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu.

		// Entrada
		System.out.println("Informe o nome: ");
		String primeiroNome = entrada.nextLine();
		String nomeCorreto = "Bruna";

		// Processo
		if (primeiroNome.equalsIgnoreCase(nomeCorreto)) {
			System.out.println("O nome informado é igual ao nome desejado!");
		} 
		
		if(!primeiroNome.equalsIgnoreCase(nomeCorreto)) {
			System.out.println("Os nomes informados não são iguais ao nome desejado!");
		}
	}
}