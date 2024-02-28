package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// Escreva um programa onde caso o usuário digite a letra 's' peça para informar um número e caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor  
		// b) escreva o maior valor
		
		double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        boolean resultado = false;
        while (true) {
            System.out.print("Deseja informar um número? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Por favor, informe um número: ");
                double numero = scanner.nextDouble();
                scanner.nextLine();
                if (numero < min) min = numero;
                if (numero > max) max = numero;
                resultado = true;
            } else if (resposta.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Resposta inválida. Por favor, digite 's' ou 'n'.");
            }
        }
        if (resultado) {
            System.out.println("a) O menor valor é: " + min);
            System.out.println("b) O maior valor é: " + max);
        } else {
            System.out.println("Nenhum número foi informado.");
        }
    }
}
