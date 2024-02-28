package MateriaisConstrucao;

import java.util.ArrayList;
import java.util.List;

public class MaterialConstrucao { // Nome do objeto

	/*
	 * Crie um sistema para uma loja de materiais de construção Os objetos terão os
	 * atributos: Nome, descrição, preço, peso e estoque
	 * 
	 * Crie um método para adicionar mais unidades da peça ao estoque. Crie um
	 * método para a venda desse produto, podendo ser vendidos até o mesmo número de
	 * peças que tem no estoque. Crie um método para colocar o produto em promoção,
	 * o parâmetro do método deve ser a porcentagem do desconto.
	 */

	// Cria um atributo no objeto é private(privado)
	private String nome;
	private String descricao;
	private double preco;
	private double peso;
	private int estoque;
	private double desconto;

	public static List<MaterialConstrucao> listaMateriais = new ArrayList<MaterialConstrucao>();

	public MaterialConstrucao(String nome, String descricao, double preco, double peso, int estoque) {
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setPeso(peso);
		setEstoque(estoque);
		listaMateriais.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco * (1d - desconto);
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			System.out.println("invalido, numero não pode ser negativo");
		}
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("invalido, numero não pode ser negativo");
		}
		this.peso = peso;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void AdicionarEstoque() {
		if (estoque <= 10) {
			estoque = 30;
		}
	}

	public void Venda() {
		if (estoque <= 0) {
			System.out.println("Não possui mais produto em estoque");
		}
	}

	@Override
	public String toString() {
		return "É o " + this.nome + " de descrição " + this.descricao;
	}
}