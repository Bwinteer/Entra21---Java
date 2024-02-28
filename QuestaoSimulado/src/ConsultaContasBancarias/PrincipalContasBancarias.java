package ConsultaContasBancarias;

import java.util.Scanner;

public class PrincipalContasBancarias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		contasBancarias clienteUm = new contasBancarias("Jorge", "Private", 2022, 2500000, "Ana");
		contasBancarias clienteDois = new contasBancarias("Luís", "Stilo", 2015, 500000, "Ana");
		contasBancarias clienteTres = new contasBancarias("Cláudio", "Exclusive", 2017, 250000, "Marina");
		contasBancarias clienteQuatro = new contasBancarias("Bruna", "Prime", 2005, 5500000, "Paulo");
		contasBancarias clienteCinco = new contasBancarias("Ana", "Exclusive", 2023, 240000, "Paulo");

		contasBancarias clienteMaisRico = null;
		double saldoMaximo = Integer.MIN_VALUE;
		contasBancarias nomeClienteComMaisDinheiro = null;
		int contaMaisAntiga = Integer.MAX_VALUE;
		contasBancarias clienteAntigo = null;

		System.out.println("Informe os gerentes: ");
		String gerenteUm = scanner.next();
		String gerenteDois = scanner.next();
		String gerenteTres = scanner.next();
		int contador = 0;

		System.out.println("Clientes do gerente dois: ");

		for (contasBancarias d : contasBancarias.dadosConta) {
			if (d.getSaldo() > saldoMaximo) {
				saldoMaximo = d.getSaldo();
				nomeClienteComMaisDinheiro = d;
			}
			if (d.getNomeGerente().equalsIgnoreCase(gerenteUm) && d.getAnoDeCadastro() < contaMaisAntiga) {
				contaMaisAntiga = d.getAnoDeCadastro();
				clienteAntigo = d;
			}

			if (d.getNomeGerente().equalsIgnoreCase(gerenteDois)) {
				System.out.println(d);
			}

			if (d.getNomeGerente().equalsIgnoreCase(gerenteTres)) {
				contador++;
			}
		}

		System.out.println("Cliente mais rico: " + nomeClienteComMaisDinheiro.toString());
		System.out.println("Cliente mais antigo: " + clienteAntigo.toString());
		System.out.println("Número de clientes do gerente 3: " + contador);

	}
}