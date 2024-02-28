package contasBancarias;

import java.util.ArrayList;
import java.util.List;

// Definição da classe ContaBancaria
public class ContaBancaria {

	// Atributos da conta bancária
	private String nomeDoCliente;
	private String categoria;
	private int anoDeCadastro;
	private double saldo;
	private String gerente;

	// Construtor da classe ContaBancaria
	public ContaBancaria(String nomeDoCliente, String categoria, int anoDeCadastro, double saldo, String gerente) {
		this.nomeDoCliente = nomeDoCliente;
		this.categoria = categoria;
		this.anoDeCadastro = anoDeCadastro;
		this.saldo = saldo;
		this.gerente = gerente;
	}

	// Métodos para obter informações da conta bancária
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAnoDeCadastro() {
		return anoDeCadastro;
	}

	public String getGerente() {
		return gerente;
	}

	// Método para formatar informações da conta bancária em uma String
	@Override
	public String toString() {
		return "Nome do Cliente: " + nomeDoCliente + "\nCategoria: " + categoria + "\nAno de Cadastro: " + anoDeCadastro
				+ "\nSaldo: R$ " + saldo + "\nGerente: " + gerente;
	}

}
