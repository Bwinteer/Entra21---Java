package aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formatar = new DecimalFormat("0.00");

		// Objetivo:
		// Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		// Em seguida, calcule e mostre: 
		// a) a área do triângulo retângulo que tem A por base e C por altura. 
		// b) a área do círculo de raio C. (pi = 3.14159). 
		// c) a área do trapézio que tem A e B por bases e C por altura. 
		// d) a área do quadrado que tem lado B. 
		// e) a área do retângulo que tem lados A e B. 		
				
		// Entrada
		System.out.println("Informe o valor de A: ");
		final double a = entrada.nextInt();
		System.out.println("Informe o valor de B: ");
		final double b = entrada.nextInt();
		System.out.println("Informe o valor de C: ");
		final double c = entrada.nextDouble();
		final float pi = 3.14159f;
		
		// Processo
		double areaTriangulo = (a * c) / 2;
		double areaCirculo = pi * (c *c );
		double areaTrapezio = ((a + b * c) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
				
		// Saída
		System.out.println("A área do triângulo é igual a " + areaTriangulo);
		System.out.println(("A área do circulo é ") + areaCirculo);
		System.out.println(("A área do trapezio é ") + areaTrapezio);
		System.out.println(("A área do quadrado é ") + areaQuadrado);
		System.out.println(("A área do retangulo é ") + areaRetangulo);
		
			}
		}