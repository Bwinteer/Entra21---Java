package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.

		int valor;

        System.out.print("Digite um valor entre 1 e 10: ");
        valor = entrada.nextInt();

        if (valor >= 1 && valor <= 10) {
            System.out.println("Tabuada do " + valor + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", valor, i, valor * i);
            }
        } else {
            System.out.println("Valor fora do intervalo permitido.");
        }

	}

}
