package Prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BrunaWinter_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		//Escreva um programa onde o usuário informa um valor e a opção desejada do que deve ser 
		//feito com o valor, sendo as opções 1-converter de dólar para real e 2-converter de real para dólar, 
		//qualquer outra opção é considerada entrada inválida.
		
		double dolar = 4.97;
		System.out.println("A cotação do dólar está em: " + dolar);
		System.out.println("Digite um valor em dólar: ");
		double valorDolar = entrada.nextDouble();
		System.out.println("Escolha a opção desejada:");
		System.out.println("1 - Converter de dólar para real.");
		System.out.println("2 - Converter de real para dólar.");
		System.out.print("Operação: ");
		int opcao = entrada.nextInt();
		
		double valorReal = dolar * valorDolar;
		double valorDolarDois = valorReal / dolar;
		
		if (opcao == 1) {
			System.out.println("O valor do dólar convertido em reais ficou: " + formatar.format(valorReal));
		} else if (opcao == 2) {
			System.out.println("O valor do real convertido em dólar ficou: " + formatar.format(valorDolarDois));
		} else {
			System.out.println("Entrada inválida!");
		}
			
	}

}
