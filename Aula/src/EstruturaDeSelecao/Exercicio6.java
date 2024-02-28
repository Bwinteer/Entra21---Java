package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
		 *escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
		 *Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, 
		 *e apenas irmãos se todas as idades forem diferentes.
		 */
		
		System.out.println("Informe o ano de nascimento do 1º irmão: ");
		int irmaoUm = entrada.nextInt();
		System.out.println("Informe o ano de nascimento do 2º irmão: ");
		int irmaoDois = entrada.nextInt();
		System.out.println("Informe o ano de nascimento do 3º irmão: ");
		int irmaoTres = entrada.nextInt();
		
		// Se todos os anos são iguais
		if (irmaoUm == irmaoDois && irmaoDois == irmaoTres) {
            System.out.println("Eles são TRIGÊMEOS.");
            
        // Se dois dos anos são iguais e o outro diferente
        } else if (irmaoUm == irmaoDois || irmaoDois == irmaoTres || irmaoUm == irmaoTres) { 
            System.out.println("Eles são GÊMEOS.");
            
        // Se todos os anos são diferentes
        } else {
            System.out.println("Eles são APENAS IRMÃOS.");
        	}
        	
        	}
        }
