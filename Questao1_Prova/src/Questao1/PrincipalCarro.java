package Questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalCarro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000, 1));
		carros.add(new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2));
		carros.add(new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3));
		carros.add(new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1));
		carros.add(new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000, 1));
		
		// Encontre o carro mais caro de um determinado ano
		System.out.println("Informe um ano para verificação do carro mais caro: ");
		int anoDesejado = scanner.nextInt();
        double maxPreco = 0;
        Carro carroMaisCaro = null;
	
        for (Carro carro : carros) {
            if (carro.getAno() == anoDesejado && carro.getPreco() > maxPreco) {
                maxPreco = carro.getPreco();
                carroMaisCaro = carro;
            }
        }

        if (carroMaisCaro != null) {
            System.out.println("Carro mais caro de " + anoDesejado + ":");
            System.out.println(carroMaisCaro);
        } else {
            System.out.println("Nenhum carro encontrado para o ano desejado.");
        }
        
        // Encontre carros de uma determinada marca com preço entre X e Y
        System.out.println("Informe uma marca (VW, FIAT OU FORD) para consultar informações de todos os carros dela: ");
        String marcaDesejada = scanner.next();
        double precoMin = 25000;
        double precoMax = 35000;

        System.out.println("\nCarros da marca " + marcaDesejada + " com preço entre R$" + precoMin + " e R$" + precoMax + ":");
        for (Carro carro : carros) {
            if (carro.getMarca().equals(marcaDesejada) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax) {
                System.out.println(carro);
        }
 }
       
        // Encontre o carro mais caro e mais barato de um determinado local
        System.out.println("Informe um número de local para verificação: ");
        int localDesejado = scanner.nextInt();
        double maxLocal = 0;
        double minLocal = Double.MAX_VALUE;
        Carro carroMaisCaroLocal = null;
        Carro carroMaisBaratoLocal = null;

        for (Carro carro : carros) {
            if (carro.getLocalizacao() == localDesejado) {
                if (carro.getPreco() > maxLocal) {
                    maxLocal = carro.getPreco();
                    carroMaisCaroLocal = carro;
                }
                if (carro.getPreco() < minLocal) {
                    minLocal = carro.getPreco();
                    carroMaisBaratoLocal = carro;
                }
            }
        }

        if (carroMaisCaroLocal != null) {
            System.out.println("\nCarro mais caro no local " + localDesejado + ":");
            System.out.println(carroMaisCaroLocal);
        } else {
        	System.out.println("Nenhum carro encontrado no local desejado.");
        }

        if (carroMaisBaratoLocal != null) {
            System.out.println("\nCarro mais barato no local " + localDesejado + ":");
            System.out.println(carroMaisBaratoLocal);
        }
      
	}
}
