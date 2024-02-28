package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.
		 */
		
		System.out.println("Digite uma letra para verificação: ");
		String letter = entrada.nextLine();
		letter = letter.toLowerCase();
		
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")|| letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
		    System.out.println("É uma vogal.");
		} else {
		    System.out.println("É uma consoante.");
		}
	
	}
}