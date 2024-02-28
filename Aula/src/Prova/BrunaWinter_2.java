package Prova;

import java.util.Scanner;

public class BrunaWinter_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Escreva um programa onde o usuário informa os dados dos lados de um triângulo
		//depois verifique e retorne se ele é isóscele, escaleno ou equilátero.
		
		System.out.println("Informe os dados de um triângulo: ");
		int ladoUm = entrada.nextInt();
		int ladoDois = entrada.nextInt();
		int ladoTres = entrada.nextInt();
		
		if (ladoUm == ladoDois && ladoDois == ladoTres) {
			System.out.println("Equilátero.");
		} else if (ladoUm == ladoDois || ladoDois == ladoTres
				|| ladoTres == ladoUm) {
			System.out.println("Isóceles.");
		} else {
			System.out.println("Escaleno.");
		}
	}

}
