package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // 1. Faça uma calculadora. O usuário entra com dois números e depois com a operação desejada.  
        // Caso o número da operação seja 1: some os dois números.  
        // Caso seja 2: subtraia os dois números.  
        // Caso seja 3: multiplique os dois números.  
        // Caso seja 4: divida os dois números. 
        // Após realizada a operação, solicite ao usuário se deseja continuar realizando operações (sempre com dois novos valores) 
        // digite qualquer tecla e caso queira encerrar informe a letra ‘n’.

        System.out.println("Digite o primeiro número:");
        double numUm = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double numDois = entrada.nextDouble();

        System.out.println("Digite a operação desejada (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão):");
        int operacao = entrada.nextInt();

	// variavel auxiliar
	double variavelAuxiliar = 0;

		switch (operacao) {
		
		case 1:
			variavelAuxiliar = numUm + numDois;
			break;
		case 2:
			variavelAuxiliar = numUm - numDois;
			break;
		case 3:
			variavelAuxiliar = numUm * numDois;
			break;
		case 4:
			variavelAuxiliar = numUm / numDois;
			break;
           
         default:
        	 System.out.println("Operação inválida!");
        	 break;
            
        }
		System.out.println("O resultado é: " + variavelAuxiliar);
		
		System.out.println("Você deseja continuar a realizar operações?");
    	char opcao = entrada.next().charAt(0);

    	while(opcao != 'n') {
    		System.out.println("Informe um número:");
    		double numero = entrada.nextInt();
    		System.out.println("Informe outro número:");
    		double numeroDois = entrada.nextInt();
    		
    	System.out.println("Digite a operação desejada (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão):");
        int operacaoNova = entrada.nextInt();
        
        double variavelAuxiliarDois = 0;

		switch (operacao) {
		
		case 1:
			variavelAuxiliarDois = numero + numeroDois;
			break;
		case 2:
			variavelAuxiliarDois = numero - numeroDois;
			break;
		case 3:
			variavelAuxiliarDois = numero * numeroDois;
			break;
		case 4:
			variavelAuxiliarDois = numero / numeroDois;
			break;
           
         default:
        	 System.out.println("Operação inválida!");
        	 break;
            
        }
        
		System.out.println("O resultado é: " + variavelAuxiliarDois);
    	}
    }
}