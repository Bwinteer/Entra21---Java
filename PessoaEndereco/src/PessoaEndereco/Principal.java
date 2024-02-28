package PessoaEndereco;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		Pessoa pessoa1 = new Pessoa("Leo", new Endereco("Rua A", "Apto 101", 123));
		Pessoa pessoa2 = new Pessoa("Bruna", new Endereco("Rua B", "Casa 2", 456));
		Pessoa pessoa3 = new Pessoa("Vinicius", new Endereco("Rua C", "Sala 3", 789));

		// Adicione as pessoas à lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		// Percorra a lista de pessoas e exiba os detalhes
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
			System.out.println();
		}
	}
}
