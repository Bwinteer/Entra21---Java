package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio2 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		
		/*Para doar sangue é necessário ter entre 18 e 67 anos. 
		 *Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar 
		 *sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
		 */
			
		System.out.println("Bem-vindo ao aplicativo de verificação de doação de sangue!");
	    System.out.print("Digite sua idade: ");
	    int idade = entrada.nextInt();

	    if (idade >= 18 && idade <= 67) {
	    System.out.println("Você está dentro da faixa etária permitida para doação de sangue.");
	    } else {
	       System.out.println("Você não está dentro da faixa etária permitida para doação de sangue.");
	        }

	    }
	}


