package aula3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Faça um programa que verifique (usando if e else) se uma letra digitada 
		 *é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, 
		 *Sexo inválido.
		 */
	
		System.out.println("Qual é o seu sexo? Digite F para Feminino ou M para Masculino.");
		String sexo = entrada.nextLine();
		if (sexo.equalsIgnoreCase("F")) {
		System.out.println("Feminino");
		
		}else if(sexo.equalsIgnoreCase("M")) {
		System.out.println("Masculino");
			
		}else {
			System.out.println("Sexo inválido!");
			
		}
			}
	
	}

