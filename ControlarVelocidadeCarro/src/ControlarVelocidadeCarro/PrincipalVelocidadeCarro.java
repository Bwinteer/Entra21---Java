package ControlarVelocidadeCarro;

import java.util.Scanner;

public class PrincipalVelocidadeCarro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VelocidadeCarro carro = new VelocidadeCarro();

		System.out.print("Digite a velocidade inicial do carro: ");
        double velocidadeInicial = scanner.nextDouble();
        carro.setVelocidade(velocidadeInicial);

        System.out.println("Velocidade Inicial: " + carro.getVelocidade());

        System.out.print("Digite o valor de aceleração: ");
        double aceleracao = scanner.nextDouble();
        carro.acelerar(aceleracao);
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade());

        System.out.print("Digite o valor de redução: ");
        double reducao = scanner.nextDouble();
        carro.reduzir(reducao);
        System.out.println("Velocidade após reduzir: " + carro.getVelocidade());

        scanner.close();
        
		    }

	}