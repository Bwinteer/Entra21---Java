package aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e 
		 *o total de vendas efetuadas por ele no mês (em dinheiro). 
		 *Sabendo que este vendedor ganha 15% de comissão sobre suas 
		 *vendas efetuadas, informar o total a receber no final do mês, com duas 
		 *casas decimais. 
		 * Sabendo que este vendedor ganha 15% de comissão sobre suas 
		 * vendas efetuadas, informar o total a receber no final do mês, com duas 
		 * casas decimais. 
		 */
		
		// Entrada - Leia o nome de um vendedor, salário fixo, total de vendas
		System.out.println("Nome do Vendedor: ");
		String nome = entrada.nextLine();
		System.out.println("Salário fixo: ");
		double salarioFixo = entrada.nextDouble();
		System.out.println("Total de vendas: ");
		double totalVendas = entrada.nextDouble();
		
		// Processo - Ganha 15% de comissão sobre suas vendas efetuadas
		double comissao = 0.15 * totalVendas;
		double salarioFinal = comissao + salarioFixo;
		
		System.out.println("O funcionário " + nome + " e o salário total é " + salarioFinal);

		
	}

}