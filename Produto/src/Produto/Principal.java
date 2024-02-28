package Produto;

public class Principal {

	public static void main(String[] args) {
		Produto um = new Produto();
		Produto dois = new Produto();
		Produto tres = new Produto();
		
		um.nome = "Caderno";
		um.descricao = "Caderno em espiral tamanho médio";
		um.precoUnitario = 4.50;
		um.desconto = 0.50;
		
		dois.nome = "Caneta ESF";
		dois.descricao = "Caneta esferográfica 5mm";
		dois.precoUnitario = 1.20;
		dois.desconto = 0.20;
		
		tres.nome = "Esquadro";
		tres.descricao = "Esquadro de acrílico 20 cm";
		tres.precoUnitario = 2.35;
		tres.desconto = 0.10;
		
		
	}

}
