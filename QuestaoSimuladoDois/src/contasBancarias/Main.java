package contasBancarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Criação de uma lista para armazenar as contas bancárias
		ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();

        // Adicione as contas bancárias à lista
        contasBancarias.add(new ContaBancaria("Jorge", "Private", 2022, 2500000, "Ana"));
        contasBancarias.add(new ContaBancaria("Luís", "Stilo", 2015, 500000, "Ana"));
        contasBancarias.add(new ContaBancaria("Cláudio", "Exclusive", 2017, 250000, "Ana"));
        contasBancarias.add(new ContaBancaria("Bruna", "Prime", 2005, 5500000, "Marina"));
        contasBancarias.add(new ContaBancaria("Ana", "Exclusive", 2023, 240000, "Paulo"));
        contasBancarias.add(new ContaBancaria("Paulo", "Exclusive", 2023, 500000, "Marina"));

        // a) Informações do cliente com mais dinheiro no banco
        ContaBancaria clienteMaisRico = encontreClienteMaisRico(contasBancarias);
        System.out.println("Informações do cliente com mais dinheiro no banco:");
        System.out.println(clienteMaisRico);

        // b) Informações do cliente mais antigo de um dado gerente
        String gerenteProcurado = "Ana";
        ContaBancaria clienteMaisAntigo = encontreClienteMaisAntigoDeGerente(contasBancarias, gerenteProcurado);
        System.out.println("\nInformações do cliente mais antigo de " + gerenteProcurado + ":");
        System.out.println(clienteMaisAntigo);

        // c) Listar as informações de todos os clientes de um dado gerente
        gerenteProcurado = "Marina";
        List<ContaBancaria> clientesDoGerente = encontreClientesDeGerente(contasBancarias, gerenteProcurado);
        System.out.println("\nInformações de todos os clientes de " + gerenteProcurado + ":");
        for (ContaBancaria cliente : clientesDoGerente) {
            System.out.println(cliente);
        }

        // d) Informar quantos clientes um dado gerente tem
        gerenteProcurado = "Ana";
        int numClientesDoGerente = conteClientesDeGerente(contasBancarias, gerenteProcurado);
        System.out.println("\nO gerente " + gerenteProcurado + " tem " + numClientesDoGerente + " clientes.");
    }

    // Função para encontrar o cliente com mais dinheiro
    private static ContaBancaria encontreClienteMaisRico(List<ContaBancaria> contas) {
        ContaBancaria maisRico = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maisRico.getSaldo()) {
                maisRico = conta;
            }
        }
        return maisRico;
    }

    // Função para encontrar o cliente mais antigo de um gerente
    private static ContaBancaria encontreClienteMaisAntigoDeGerente(List<ContaBancaria> contas, String gerente) {
        ContaBancaria maisAntigo = null;
        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                if (maisAntigo == null || conta.getAnoDeCadastro() < maisAntigo.getAnoDeCadastro()) {
                    maisAntigo = conta;
                }
            }
        }
        return maisAntigo;
    }

    // Função para listar todos os clientes de um gerente
    private static List<ContaBancaria> encontreClientesDeGerente(List<ContaBancaria> contas, String gerente) {
    	ArrayList<ContaBancaria> clientesDoGerente = new ArrayList<>();
        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                clientesDoGerente.add(conta);
            }
        }
        return clientesDoGerente;
    }

    // Função para contar quantos clientes um gerente tem
    private static int conteClientesDeGerente(List<ContaBancaria> contas, String gerente) {
        int contador = 0;
        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                contador++;
            }
        }
        return contador;
    }
}