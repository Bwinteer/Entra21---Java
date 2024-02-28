package contasBancarias;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();

		banco.adicionarConta(new ContaBancaria("Jorge", "Private", 2022, 2500000, "Ana"));
		banco.adicionarConta(new ContaBancaria("Luís", "Stilo", 2015, 500000, "Ana"));
		banco.adicionarConta(new ContaBancaria("Cláudio", "Exclusive", 2017, 250000, "Marina"));
		banco.adicionarConta(new ContaBancaria("Bruna", "Prime", 2005, 5500000, "Paulo"));
		banco.adicionarConta(new ContaBancaria("Ana", "Exclusive", 2023, 240000, "Paulo"));

		// a) Informações do cliente com mais dinheiro no banco
		ContaBancaria maisRico = banco.clienteMaisRico();
		System.out.println("Cliente com mais dinheiro no banco: " + maisRico);

		// b) Informações do cliente mais antigo de um dado gerente
		String gerenteParaBuscar = "Paulo";
		ContaBancaria maisAntigoDoGerente = banco.clienteMaisAntigoDoGerente(gerenteParaBuscar);
		System.out.println("Cliente mais antigo do gerente " + gerenteParaBuscar + ": " + maisAntigoDoGerente);

		// c) Listar as informações de todos os clientes de um dado gerente
		String gerenteParaListar = "Ana";
		List<ContaBancaria> clientesDoGerente = banco.clientesDoGerente(gerenteParaListar);
		System.out.println("Clientes do gerente " + gerenteParaListar + ":");
		for (ContaBancaria cliente : clientesDoGerente) {
			System.out.println(cliente);
		}

		// d) Informar quantos clientes um dado gerente tem
		int numClientesDoGerente = banco.quantosClientesDoGerente(gerenteParaBuscar);
		System.out.println("O gerente " + gerenteParaBuscar + " tem " + numClientesDoGerente + " clientes.");

		// Calcular rendimentos de um cliente com uma taxa de juros anual de 5%
		double taxaJurosAnual = 5.0; // Por exemplo, 5% de taxa de juros
		double rendimentosCliente = maisRico.calcularRendimentos(taxaJurosAnual);
		System.out.println("Rendimentos do cliente mais rico: R$ " + rendimentosCliente);
	}
}