package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo 	 
         *que a decisão é sempre o mais barato.
         */

        System.out.println("Bem-vindo ao aplicativo de escolha de produtos!");
        
        // Pedindo o preço do primeiro produto
        System.out.print("Digite o preço do primeiro produto: ");
        double precoProduto1 = entrada.nextDouble();

        // Pedindo o preço do segundo produto
        System.out.print("Digite o preço do segundo produto: ");
        double precoProduto2 = entrada.nextDouble();

        // Pedindo o preço do terceiro produto
        System.out.print("Digite o preço do terceiro produto: ");
        double precoProduto3 = entrada.nextDouble();
        
        if(precoProduto1 == precoProduto2 || precoProduto2 == precoProduto3 || precoProduto3 == precoProduto1) {
        	System.out.println("Preços inválidos!");
        } else {

        // Verificando qual é o produto mais barato
        if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
            System.out.println("O primeiro produto é o mais barato.");
        } else if (precoProduto2 < precoProduto3) {
            System.out.println("O segundo produto é o mais barato.");
        } else {
            System.out.println("O terceiro produto é o mais barato.");
        	}

        }
	}
}
      