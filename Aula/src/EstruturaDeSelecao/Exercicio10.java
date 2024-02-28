package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /* Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
		(considere que a idade entre homens e mulheres sempre serão 
		diferentes). Calcule e escreva a soma das idades do homem mais velho 
		com a mulher mais nova, e o produto das idades 
		do homem mais novo com a mulher mais velha.
		*/
        
        System.out.println("Digite a idade do primeiro homem:");
        int idadeHomem1 = entrada.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        int idadeHomem2 = entrada.nextInt();
        System.out.println("Digite a idade da primeira mulher:");
        int idadeMulher1 = entrada.nextInt();
        System.out.println("Digite a idade da segunda mulher:");
        int idadeMulher2 = entrada.nextInt();
        
        int homemMaisVelho, homemMaisNovo, mulherMaisVelha, mulherMaisNova;
        
        if (idadeHomem1 > idadeHomem2) {
            homemMaisVelho = idadeHomem1;
            homemMaisNovo = idadeHomem2;
        } else {
            homemMaisVelho = idadeHomem2;
            homemMaisNovo = idadeHomem1;
        }

        if (idadeMulher1 > idadeMulher2) {
            mulherMaisVelha = idadeMulher1;
            mulherMaisNova = idadeMulher2;
        } else {
            mulherMaisVelha = idadeMulher2;
            mulherMaisNova = idadeMulher1;
        }

        int somaIdades = homemMaisVelho + mulherMaisNova;
        int produtoIdades = homemMaisNovo * mulherMaisVelha;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);
    }
}
