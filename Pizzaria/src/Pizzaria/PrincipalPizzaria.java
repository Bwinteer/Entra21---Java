package Pizzaria;

public class PrincipalPizzaria {

	public static void main(String[] args) {

		// Crie 5 objetos de pizza e os coloque em uma Array List.
		// Qual é a pizza mais barata por área?

		Pizzaria p1 = new Pizzaria("Sensacao", "morango", "chocolate", "leite condensado", false, 0.025, 29.99);
		Pizzaria p2 = new Pizzaria("Calabrezuda", "calabreza", "mussarela", "cebola", true, 0.045, 56.50);
		Pizzaria p3 = new Pizzaria("Franguinho", "frango", "catupiry", "mussarela", true, 0.050, 67.00);
		Pizzaria p4 = new Pizzaria("Nevasca", "banana", "chocolate", "leite condensado", false, 0.025, 25.99);
		Pizzaria p5 = new Pizzaria("Frango", "tomate", "manjericão", "mussarela", false, 0.035, 35.00);

		double menorValor = Integer.MAX_VALUE;
		Pizzaria pizzaBarata = null;

		for (Pizzaria p : Pizzaria.listaPizzas) {
			if (p.CalculoPorArea() < menorValor) {
				menorValor = p.CalculoPorArea();
				pizzaBarata = p;
			}
		}

		System.out.println("Pizza mais barata: " + pizzaBarata.toString());

	}
}
