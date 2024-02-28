package Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {

	// Faça uma classe chamada Retangulo, com os atributos altura e largura.
	// Faça um método para descobrir a área e outro para descobrir o perímetro.
	// Crie 10 objetos de Retangulo.
	// Imprima o toString do retângulo com a maior área e o toString do retângulo
	// com o maior perímetro

	// atributos privados

	private double altura;
	private double largura;
	public static List<Retangulo> listaRetangulos = new ArrayList<>();

	// metodoConstructor

	public Retangulo(double altura, double largura) {

		setAltura(altura);
		setLargura(largura);
		listaRetangulos.add(this);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("Altura inválida");
		} else {
			this.altura = altura;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura < 0) {
			System.out.println();
		} else {
			this.largura = largura;

		}
	}

	public double perimetro() {
		return (this.getAltura() * 2) + (this.getLargura() * 2);

	}

	public double area() {
		return this.getAltura() * this.getLargura();

	}

	@Override
	public String toString() {
		return "É o retângulo de altura " + this.getAltura() + " e de largura " + this.getLargura();
	}

}
