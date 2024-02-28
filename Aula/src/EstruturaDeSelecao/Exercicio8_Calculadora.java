package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio8_Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação desejada (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão):");
        int operacao = entrada.nextInt();

        if (operacao == 1) {
            System.out.println("A soma é: " + (num1 + num2));
        } else if (operacao == 2) {
            System.out.println("A subtração é: " + (num1 - num2));
        } else if (operacao == 3) {
            System.out.println("A multiplicação é: " + (num1 * num2));
        } else if (operacao == 4) {
            if (num2 != 0) {
                System.out.println("A divisão é: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Erro: Operação inválida.");
        }
    }
}