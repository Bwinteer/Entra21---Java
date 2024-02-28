package Funcao;

public class Funcao {
	// Fórmula: public static tipo nome() {}
	public static String imprimirNome() {
		// Dentro do nosso escopo, a gente passa a ter o retorno
		// Sempre crie uma variável não retorne diretamente
		
		String nome = "Bruna";
		return nome;
	}
	
	public static double soma(double numUm, double numDois) {
		
		// Fiz o processo, ou melhor, a função
		double soma = numUm + numDois;
		return soma;
	}
	
	public static void main(String[] args) {
		System.out.println(imprimirNome());
		System.out.println(soma(10, 15));

	}

}
