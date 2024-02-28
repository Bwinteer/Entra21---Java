package EstruturaDeSelecao;

import java.util.Scanner;

public class CalculadoraComVariavelAuxiliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação desejada (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão):");
        int operacao = entrada.nextInt();

	// variavel auxiliar
	double variavelAuxiliar = 0;

		switch (operacao) {
		
		case 1:
			variavelAuxiliar = num1 + num2;
			break;
		case 2:
			variavelAuxiliar = num1 - num2;
			break;
		case 3:
			variavelAuxiliar = num1 * num2;
			break;
		case 4:
			variavelAuxiliar = num1 / num2;
			break;
           
         default:
        	 System.out.println("Operação inválida!");
        	 break;
            
        }
		System.out.println("O resultado é: " + variavelAuxiliar);
    }
}
