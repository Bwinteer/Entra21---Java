package contasBancarias;

import java.util.ArrayList;
import java.util.List;

class ContaBancaria {
    private String nomeCliente;
    private String categoria;
    private int anoCadastro;
    private double saldo;
    private String gerente;

    public ContaBancaria(String nomeCliente, String categoria, int anoCadastro, double saldo, String gerente) {
        this.nomeCliente = nomeCliente;
        this.categoria = categoria;
        this.anoCadastro = anoCadastro;
        this.saldo = saldo;
        this.gerente = gerente;
    }

    // Métodos getter para acessar as informações da conta bancária
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoCadastro() {
        return anoCadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getGerente() {
        return gerente;
    }

    // Método para calcular os rendimentos com base em uma taxa de juros anual
    public double calcularRendimentos(double taxaJurosAnual) {
        double rendimentos = saldo * (taxaJurosAnual / 100);
        return rendimentos;
       }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + ", Categoria: " + categoria + ", Ano de Cadastro: " + anoCadastro
                + ", Saldo: R$ " + saldo + ", Gerente: " + gerente;
    }
}

class Banco {
    private List<ContaBancaria> contas = new ArrayList<>();

    // Método para adicionar uma conta bancária
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Método para encontrar o cliente com mais dinheiro no banco
    public ContaBancaria clienteMaisRico() {
        if (contas.isEmpty()) {
            throw new IllegalArgumentException("O banco não possui contas.");
        }

        ContaBancaria maisRico = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maisRico.getSaldo()) {
                maisRico = conta;
            }
        }

        return maisRico;
    }

    // Método para encontrar o cliente mais antigo de um dado gerente
    public ContaBancaria clienteMaisAntigoDoGerente(String gerente) {
        if (contas.isEmpty()) {
            throw new IllegalArgumentException("O banco não possui contas.");
        }

        ContaBancaria maisAntigo = null;

        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                if (maisAntigo == null || conta.getAnoCadastro() < maisAntigo.getAnoCadastro()) {
                    maisAntigo = conta;
                }
            }
        }

        if (maisAntigo == null) {
            throw new IllegalArgumentException("Nenhum cliente encontrado para o gerente especificado.");
        }

        return maisAntigo;
    }

    // Método para listar as informações de todos os clientes de um dado gerente
    public List<ContaBancaria> clientesDoGerente(String gerente) {
        List<ContaBancaria> clientesGerente = new ArrayList<>();

        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                clientesGerente.add(conta);
            }
        }

        if (clientesGerente.isEmpty()) {
            throw new IllegalArgumentException("Nenhum cliente encontrado para o gerente especificado.");
        }

        return clientesGerente;
    }

    // Método para informar quantos clientes um dado gerente tem
    public int quantosClientesDoGerente(String gerente) {
        int contador = 0;

        for (ContaBancaria conta : contas) {
            if (conta.getGerente().equals(gerente)) {
                contador++;
            }
        }

        return contador;
    }

	//Método para calcular rendimentos de todas as contas com uma taxa de juros anual
	public void calcularRendimentosDeTodas(double taxaJurosAnual) {
	    for (ContaBancaria conta : contas) {
	        double rendimentos = conta.calcularRendimentos(taxaJurosAnual);
	        throw new IllegalArgumentException("Rendimentos de " + conta.getNomeCliente() + ": R$ " + rendimentos);
	    }
	}
}