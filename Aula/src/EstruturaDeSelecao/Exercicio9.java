package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Escreva um algoritmo em que o usuário entra com um número. 
		 *Depois ele escolhe a operação que vai ser feita com esse número 
		 *Caso ele escolha a operação 1 
		 *Modifique a variável do número entrado e some 10 ao número original 
		 *Caso ele escolha a operação 2 
		 *Modifique a variável do número entrado e subtraia 10 do número original 
		 *Caso ele escolha a operação 3 
		 *Modifique a variável do número entrado e multiplique 10 ao número original 
		 *Caso ele escolha a operação 4 
		 *Modifique a variável do número entrado e divida 10 do número original
		*/
		
		System.out.println("Digite um número: ");
		double numUm= entrada.nextDouble();
		System.out.println("Escolha a operação:");
	    System.out.println("1 - Somar 10 ao número original");
	    System.out.println("2 - Subtrair 10 do número original");
	    System.out.println("3 - Multiplicar o número original por 10");
	    System.out.println("4 - Dividir o número original por 10");
	    System.out.print("Operação: ");
        int operacao = entrada.nextInt();
        
        double variavelAuxiliar = 10;
        
        switch (operacao) {
		case 1:
			variavelAuxiliar = numUm + variavelAuxiliar;
			break;
		case 2:
			variavelAuxiliar = numUm - variavelAuxiliar;
			break;
		case 3:
			variavelAuxiliar = numUm * variavelAuxiliar;
			break;
		case 4:
			variavelAuxiliar = numUm / variavelAuxiliar;
		
		default:
			System.out.println("Valor inválido!");
			break;
		}
        
        System.out.println("O resultado é: " + variavelAuxiliar);
	}

}
