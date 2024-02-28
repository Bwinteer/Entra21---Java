package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Crie um programa para ler 3 notas e mostrar a média delas.

        // Lê as notas do usuário
 
		double somaNotas = 0;
        int numeroDeNotas = 3;

        // Solicita e lê as notas do usuário
        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = entrada.nextDouble();
            somaNotas += nota;
        }

        // Calcula a média das notas
        double media = somaNotas / numeroDeNotas;

        // Exibe a média das notas
        System.out.printf("A média das notas é: %.2f%n", media);

    }
}
