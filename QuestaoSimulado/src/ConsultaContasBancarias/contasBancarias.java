package ConsultaContasBancarias;

import java.util.ArrayList;
import java.util.List;

public class contasBancarias {
	private String nome;
	private String categoria;
	private int anoDeCadastro;
	private int saldo;
	private String nomeGerente;

	public static List<contasBancarias> dadosConta = new ArrayList<>();

	public contasBancarias(String nome, String categoria, int anoDeCadastro, int saldo, String nomeGerente) {

		setNome(nome);
		setCategoria(categoria);
		setAnoDeCadastro(anoDeCadastro);
		setSaldo(saldo);
		setNomeGerente(nomeGerente);
		dadosConta.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			throw new IllegalArgumentException("Nome não pode estar vázio ou nulo.");
		} else {
			this.nome = nome;
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoDeCadastro() {
		return anoDeCadastro;
	}

	public void setAnoDeCadastro(int anoDeCadastro) {
		if (anoDeCadastro < 0) {
			throw new IllegalArgumentException("O saldo não pode ser negativo");
		} else {
			this.anoDeCadastro = anoDeCadastro;
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	public void calculoRendimento(double taxaDeRendimento) {
		double rendimento = saldo * (taxaDeRendimento / 100);
		saldo += rendimento;
	}
	@Override
	public String toString() {
		return "Cliente " + this.nome + " com a categoria " + this.categoria + " com o saldo " + this.saldo;
	}
}