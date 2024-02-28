package Retangulo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Retangulo> retangulos = new ArrayList<>();

        retangulos.add(new Retangulo(5.0, 3.0));
        retangulos.add(new Retangulo(2.0, 4.0));
        retangulos.add(new Retangulo(6.0, 2.5));
        retangulos.add(new Retangulo(5.0, 7.0));
        retangulos.add(new Retangulo(3.0, 3.0));
        retangulos.add(new Retangulo(8.0, 1.0));
        retangulos.add(new Retangulo(2.0, 9.0));
        retangulos.add(new Retangulo(5.5, 2.0));
        retangulos.add(new Retangulo(1.0, 6.0));
        retangulos.add(new Retangulo(3.5, 5.0));

        // Encontrando o retângulo com a maior área e o maior perímetro
        double maiorArea = Double.MIN_VALUE;
        double maiorPerimetro = Double.MIN_VALUE;

        for (Retangulo r : retangulos) {
            if (r.calcularArea() > maiorArea) {
                maiorArea = r.calcularArea();
            }

            if (r.calcularPerimetro() > maiorPerimetro) {
                maiorPerimetro = r.calcularPerimetro();
            }
        }

        System.out.println("Retângulo com a maior área: " + maiorArea);
        System.out.println("Retângulo com o maior perímetro: " + maiorPerimetro);
			}
	
	}