package Funcao;

import java.util.Scanner;

public class Exercicio3 {
	public static double calcularAreaRetangulo(double largura, double altura) {
		return largura * altura;
	}
	
	public static double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*Faça um programa que calcule o perímetro e a área de um retângulo.
		Retornar os valores calculados
		Separar em dois métodos e somente retornar os valores*/

		System.out.println("Digite a largura do retângulo: ");
		double largura = scanner.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();
		
		double area = largura * altura;
		System.out.println("A área do retângulo é: " + area);
		
		double perimetro = 2 * (largura + altura);
		System.out.println("O perímetro do retângulo é: " + perimetro);
	}

}
