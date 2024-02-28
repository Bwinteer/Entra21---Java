package Retangulo;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	// Método para calcular a área
	public double calcularArea() {
		return altura * largura;
	}

	// Método para calcular o perímetro
	public double calcularPerimetro() {
		return 2 * (altura + largura);
	}

}

