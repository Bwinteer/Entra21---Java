package Retangulo;

import java.util.ArrayList;
import java.util.ArrayList;

public class PrincipalRetangulo {

	public static void main(String[] args) {

		// Faça uma classe chamada Retangulo, com os atributos altura e largura.
		// Faça um método para descobrir a área e outro para descobrir o perímetro.
		// Crie 10 objetos de Retangulo.
		// Imprima o toString do retângulo com a maior área e o toString do retângulo
		// com o maior perímetro

		// Crie 10 objetos de Retangulo.

		ArrayList<Retangulo> retangulos = new ArrayList<>();

		retangulos.add(new Retangulo(3.0, 4.0));
		retangulos.add(new Retangulo(5.0, 2.0));
		retangulos.add(new Retangulo(6.0, 3.0));
		retangulos.add(new Retangulo(2.5, 7.0));
		retangulos.add(new Retangulo(4.0, 4.0));
		retangulos.add(new Retangulo(8.0, 2.0));
		retangulos.add(new Retangulo(4.0, 6.0));
		retangulos.add(new Retangulo(3.0, 5.0));
		retangulos.add(new Retangulo(7.0, 1.0));
		retangulos.add(new Retangulo(2.0, 8.0));

		double maiorArea = Double.MIN_VALUE;
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo MaiorPerimetro = null;
		Retangulo MaiorArea = null;

		// Encontre o retângulo com a maior área e o maior perímetro

		for (Retangulo retangulo : Retangulo.listaRetangulos) {
			if (retangulo.area() > maiorArea) {
				maiorArea = retangulo.area();
				MaiorArea = retangulo;
			}
			if (retangulo.perimetro() > maiorPerimetro) {
				maiorPerimetro = retangulo.perimetro();
				MaiorPerimetro = retangulo;
			}
		}

		// Imprima os toString dos retângulos com a maior área e o maior perfímetro

		System.out.println("Retângulo com a maior área: " + MaiorArea.toString());
		System.out.println("Retângulo com o maior perímetro: " + MaiorPerimetro.toString());
	}
}
