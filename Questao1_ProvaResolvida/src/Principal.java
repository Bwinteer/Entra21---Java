package prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Carro> listaDeCarros = new ArrayList<>();

		Carro c2 = new Carro("Fox", "VW", "LML002", "vermelha", 2010, 2, 30000);
		Carro c3 = new Carro("Uno", "Fiat", "MLM003", "cinza", 2011, 3, 32000);
		Carro c4 = new Carro("Fiesta", "Ford", "LLL04", "branca", 2009, 1, 29000);
		Carro c5 = new Carro("Palio", "Fiat", "KKK435", "amarelo", 2011, 1, 26000);

		listaDeCarros.add(new Carro("Gol", "VW", "MMM001", "preta", 2009, 1, 25000));
		listaDeCarros.add(c2);
		listaDeCarros.add(c3);
		listaDeCarros.add(c4);
		listaDeCarros.add(c5);

		System.out.println("Informe um ano e descubra qual o carro mais caro");
		int anoDesejado = entrada.nextInt();
		double maiorPreco = Double.MIN_VALUE;
		// eu posso inicializar o carro = null
		Carro carroMaiorPreco = null;
		// percorrendo todos os carros
		for (Carro carro : listaDeCarros) {
			// verificando se é o ano certo (desejado)
			// verifico se o valor é maior que o valor atual
			if (carro.getAno() == anoDesejado && maiorPreco < carro.getPreco()) {
				maiorPreco = carro.getPreco();
				carroMaiorPreco = carro;
			}
		}
		// imprimir carro com maior valor
		System.out.println(carroMaiorPreco.toString());

		// 2 - Utilizando um filtro de marca, valor minomo e valor maximo
		System.out.println("Informe uma marca");
		String marca = entrada.next();

		System.out.println("Informe o menor valor");
		double limiteMenor = entrada.nextDouble();
		System.out.println("Informe o maior valor");
		double limiteMaior = entrada.nextDouble();

		for (Carro carro : listaDeCarros) {
			if (carro.getMarca().equals(marca) && carro.getPreco() < limiteMaior && carro.getPreco() > limiteMenor) {
				System.out.println(carro.toString());
			}
		}

		// com base na revendedora - qual carro mais barato e
		// qual carro é mais caro

		System.out.println("Perguntando qual é a revendedora");
		int localDesejado = entrada.nextInt();

		double maisCaro = Double.MIN_VALUE;
		double maisBarato = Double.MAX_VALUE;

		String apreMaisCaro = "";
		String apreMaisBarato = "";

		for (Carro carro : listaDeCarros) {
			if (carro.getLocal() == localDesejado && carro.getPreco() > maisCaro) {
				maisCaro = carro.getPreco();
				apreMaisCaro = carro.toString();
			}
			
			if(carro.getLocal() == localDesejado &&
					carro.getPreco() < maisBarato) {
				maisBarato = carro.getPreco();
				apreMaisBarato = carro.toString();
				
			}
		}

		// apresentar
		System.out.println(apreMaisBarato);
		System.out.println(apreMaisCaro);
		
		
		System.out.println("Depreciação do Fox: " + c2.depreciacao());


	}

}
