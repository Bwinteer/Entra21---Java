package Pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

	/*
	 * Cada pizza tem um nome, 3 ingredientes, um boolean referente à borda,
	 * diâmetro e preço.
	 * 
	 * Crie um método para mudar algum dos ingredientes da pizza, caso alguns dos
	 * ingredientes da pizza tenha sido iniciado como null, substitua esse
	 * ingrediente pelo novo, caso contrário, mude o terceiro ingrediente.
	 */

	private String nome;
	private String ingredienteUm;
	private String ingredienteDois;
	private String ingredienteTres;
	private boolean borda;
	private double diametro;
	private double preco;
	public static List<Pizzaria> listaPizzas = new ArrayList<>();

	public Pizzaria(String nome, String ingredienteUm, String ingredienteDois, String ingredienteTres, boolean borda,
			double diametro, double preco) {
		setNome(nome);
		setIngredienteUm(ingredienteUm);
		setIngredienteDois(ingredienteDois);
		setIngredienteTres(ingredienteTres);
		setBorda(borda);
		setDiametro(diametro);
		setPreco(preco);

		listaPizzas.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getIngredienteUm() {
		return ingredienteUm;
	}

	public void setIngredienteUm(String ingredienteUm) {
		this.ingredienteUm = ingredienteUm;
	}

	public String getIngredienteDois() {
		return ingredienteDois;
	}

	public void setIngredienteDois(String ingredienteDois) {
		this.ingredienteDois = ingredienteDois;
	}

	public String getIngredienteTres() {
		return ingredienteTres;
	}

	public void setIngredienteTres(String ingredienteTres) {
		this.ingredienteTres = ingredienteTres;
	}

	public void MudarIngrediente() {
		if (ingredienteUm == null) {
			ingredienteUm = "batata";
		}

		else if (ingredienteDois == null) {
			ingredienteDois = "batata";
		}

		else {
			ingredienteTres = "batata";
		}
	}

	public double CalculoPorArea() {
		double area = diametro * Math.PI;
		return preco / area;
	}

	@Override
	public String toString() {
		return this.nome + " com os ingredientes " + this.ingredienteUm + ", " + this.ingredienteDois + ", "
				+ this.ingredienteTres;
	}
}
