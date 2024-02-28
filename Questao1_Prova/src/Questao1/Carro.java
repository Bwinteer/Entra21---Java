package Questao1;

public class Carro {
	
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int localizacao;
	
	public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizacao) {
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreco(preco);
		setLocalizacao(localizacao);
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}
	
	public double calcularDepreciacao(int anoBase) {
		int anos = anoBase - ano;
		double depreciacao = 0.0;
		if (anos >= 13) {
			depreciacao = preco * 0.07 * anos;
		} else if (anos >= 10) {
			depreciacao = preco * 0.05 * anos;
		}
		return depreciacao;
    }
	
	@Override
    public String toString() {
		return "Modelo: " + modelo + ", Marca: " + marca + ", Placa: " + placa + ", Cor: " + cor + ", Ano: " + ano
                + ", Preço: " + preco + ", Localização: " + localizacao + ", Depreciação: " + calcularDepreciacao(2023);

    }
}