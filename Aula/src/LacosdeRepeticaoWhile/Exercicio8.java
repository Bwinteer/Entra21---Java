package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
		// mostrando uma mensagem de erro e voltando a pedir as informações, caso seja certo, de os parabéns e encerre o programa.
		
		System.out.println("Digite o seu usuário: ");
		String usuario = entrada.nextLine();
		System.out.println("Digite a sua senha: ");
		String senha = entrada.nextLine();
		
		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Digite novamente, a sua senha não pode ser a mesma que o seu usuário: ");
			senha = entrada.nextLine();
		
		}
		
		    System.out.println("Parabéns! Você entrou.");
		   
		}
		
	}


