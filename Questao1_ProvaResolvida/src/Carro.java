package prova;

import java.util.ArrayList;
import java.util.List;

public class Carro {
// encapsulamento = private
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco; // 20000 = 10000 = 5000
	private int local;



	// construtor
	public Carro(String modelo, String marca, String placa, String cor, int ano, int local, double preco) {
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreco(preco);
		setLocal(local);

	}
	
	public double depreciacao() {
		// variavel aux = é a que vai ser retornada no fim
		double resp = this.preco;
		// variavel auxiliar para receber qual a % de depreciacao
		double depre = 0;

		if(ano < 2010) {
			// 7% -> 100% - 7% = 93%
			depre = 0.93;
		} else {
			// 5%]
			depre = 0.95;	
		}
		
		// tenho que dimiur o valor a cada ano
		// laço de repetição
		// eu quero o valor final no meu ano atual = 2023
		for (int i = getAno(); i < 2023; i++) {
			// contador
			resp = resp * depre;
			// certo tambem
			// (resp * 0,07) descobrir o valor do desconto
			// resp valor um ano antes menos o desconto
			// valor atual seria igual ao calculo
			// resp = resp - (resp * 0,07)
		}
		
		
		return resp;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {

		if(modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
			// modelo.isEmpty() = ""
			//modelo.isBlank() = "" && "    "
		} else {
			throw new IllegalArgumentException("Modelo inválido");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		// 0
		if(ano < 1800 || ano > 2023) {
			throw new IllegalArgumentException("Ano inválid");
		} else {			
			this.ano = ano;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}
	
	@Override
	public String toString() {
		return "Carro [modelo: " + this.modelo + ", marca: " + this.marca
				+ ", placa: " + this.placa + ",cor: " + this.cor
				+ ", preco: " + this.preco + ", local: " + this.local
				+ "]";
	}
	
	

}
