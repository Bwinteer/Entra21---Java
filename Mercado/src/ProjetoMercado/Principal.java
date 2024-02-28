package ProjetoMercado;

public class Principal {
	public static void main(String[] args) {

		Mercado unidadeDeBlumenau = new Mercado("Blumenau", 2000, 2.4, 2560, 2); // Criando os objetos de Mercado
		Mercado unidadeDeFloripa = new Mercado("Floripa", 4325, 2.4, 4920, 2.1);
		Mercado unidadeDeJoinville = new Mercado("Joinville", 2412, 2.15, 5050, 2.47);

		Mercado vetor[] = new Mercado[3]; // Criando um vetor do tipo Mercado
		vetor[0] = unidadeDeBlumenau; // Atribuindo aos indices do vetor os objetos de Mercado
		vetor[1] = unidadeDeFloripa;
		vetor[2] = unidadeDeJoinville;

		String locMaiorLucroMaca = ""; // Criacao das variaveis
		String locMenorLucroMaca = "";
		String locMeio = "";
		double valorMaisAlto = Integer.MIN_VALUE;
		double valorMaisBaixo = Integer.MAX_VALUE;
		double valorMeio = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) { // For para descobrir o menor e maior lucro
			if (vetor[i].lucroMacas() > valorMaisAlto) {
				valorMaisAlto = vetor[i].lucroMacas();
				locMaiorLucroMaca = vetor[i].getLocalidade();

			}

			if (vetor[i].lucroMacas() < valorMaisBaixo) {
				valorMaisBaixo = vetor[i].lucroMacas();
				locMenorLucroMaca = vetor[i].getLocalidade();
			}
		}

		for (int i = 0; i < vetor.length; i++) { /*
													 * Apos descoberto o maior e menor lucro, descobriremos quem tem o
													 * segundo maior lucro
													 */
			if (vetor[i].lucroMacas() > valorMeio && vetor[i].lucroMacas() < valorMaisAlto) {
				valorMeio = vetor[i].lucroMacas();
				locMeio = vetor[i].getLocalidade();
			}
		}

		System.out.println(locMaiorLucroMaca + " vendeu mais macas");
		System.out.println(locMeio + " vendeu meio");
		System.out.println(locMenorLucroMaca + " vendeu menos macas");

	}

}
