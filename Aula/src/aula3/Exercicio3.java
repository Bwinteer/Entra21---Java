package aula3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Faça um programa que pergunte em que turno você estuda. Peça para 
		 *digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem 
		 *“Bom dia!” ou “Boa Noite” ou “Valor inválido”, conforme o caso.
		 */
		
		System.out.println("Em que turno você estuda?");
		System.out.println("Digite M-Matutino, V-Vespertino ou N- Noturno");
		String turno = entrada.nextLine();
		if (turno.equalsIgnoreCase("M")) {
		System.out.println("Bom dia!");
		
		}else if(turno.equalsIgnoreCase("V")) {
		System.out.println("Boa tarde!");
			
		}else if(turno.equalsIgnoreCase("N")) {
		System.out.println("Boa Noite!");
			
		}else {
			System.out.println("Valor inválido!");
			
		}
			}
	

	}

