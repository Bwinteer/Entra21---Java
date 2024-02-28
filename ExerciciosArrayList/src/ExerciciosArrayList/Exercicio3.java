package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Crie uma Array List O usuário vai colocando valores decimais até ele colocar
		 * o número 0. Calcular: a) Qual o menor número b) Qual o maior número c)
		 * Calcular a média
		 */

		Scanner scanner = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();

		System.out.println("Insira valores decimais na lista. Digite 0 para parar.");
		double valor = scanner.nextDouble();
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double soma = 0;
		
		while (valor != 0) {
			lista.add(valor);
			soma += valor;
			if (valor < min) {
				min = valor;
			}
			if (valor > max) {
				max = valor;
			}
			System.out.println("Insira valores decimais na lista. Digite 0 para parar.");
			valor = scanner.nextDouble();
		}


		System.out.println("O menor valor é " + min);
		System.out.println("O maior valor é " + max);
		System.out.println("A média dos valores é " + soma / lista.size());
		
	}
}
