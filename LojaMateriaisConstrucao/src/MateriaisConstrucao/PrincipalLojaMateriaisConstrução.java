package MateriaisConstrucao;

public class PrincipalLojaMateriaisConstrução {

	public static void main(String[] args) {
		/*
		 * Calcule: a) Qual o nome do material mais caro b) Qual o nome do material mais
		 * leve c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a
		 * quantidade multiplicado pelo peso
		 */

		MaterialConstrucao m1 = new MaterialConstrucao("saco com pregos",
				"uma haste de metal, com uma das pontas afiada e com outra achatada, 10 und", 5.00, 0.020, 50);
		MaterialConstrucao m2 = new MaterialConstrucao("pincel", "achatado, cerdas pretas e macias", 19.99,
				0.350, 34);
		MaterialConstrucao m3 = new MaterialConstrucao("martelo", "ponta achatada de metal e cabo de madeira",
				38.75, 1.0, 108);
		MaterialConstrucao m4 = new MaterialConstrucao("saco de cimento",
				"alta qualidade, forte e resistente", 68.50, 25.5, 71);
		MaterialConstrucao m5 = new MaterialConstrucao("tijolo 10 un",
				"feito de barro vermelho, dimensoes 5x22x10 cm", 10.99, 30.0, 89);

		m3.setDesconto(0.10);

		double maiorValor = Integer.MIN_VALUE;
		double maisLeve = Integer.MAX_VALUE;
		double materialCaroPeso = 0;
		double caroPeso = 0;
		MaterialConstrucao produtoCaro = null;
		MaterialConstrucao produtoLeve = null;

		for (MaterialConstrucao m : MaterialConstrucao.listaMateriais) {
			if (m.getPreco() > maiorValor) {
				maiorValor = m.getPreco();
				produtoCaro = m;
				materialCaroPeso = m.getPeso();
			}

			if (m.getPeso() < maisLeve) {
				maisLeve = m.getPeso();
				produtoLeve = m;
			}

			caroPeso = materialCaroPeso * m.getEstoque();
		}

		System.out.println("O material mais caro: " + produtoCaro.toString());
		System.out.println("O material mais leve: " + produtoLeve.toString());
		System.out.println("O material mais caro peso: " + caroPeso);
	}

}
