package ImpostoDeRenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	/*Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
	Imposto a pagar = Renda Anual * Alíquota

	Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.

	Calcule:
	a) Quem mais paga imposto.
	b) Quem menos paga imposto.
	c) Qual o total de imposto pago entre os 5 contribuintes?*/
	
	Scanner scanner = new Scanner(System.in);
	
	Contribuinte c1 = new Contribuinte("João da Silva", "123.456.789-00", "PR", 40000);
	Contribuinte c2 = new Contribuinte("Bruna Winter", "093.427.949-71", "SC", 8000);
	Contribuinte c3 = new Contribuinte("Felipe Souza", "123.425.956-60", "SC", 1000);
	Contribuinte c4 = new Contribuinte("Carlos Eduardo", "123.425.956-60", "RS", 3000);
	Contribuinte c5 = new Contribuinte("Marquinhos Winter", "123.123.837-12", "PR", 1000);
	
	Contribuinte vetor[] = new Contribuinte[5]; // Criando um vetor do tipo Mercado
	vetor[0] = c1;
	vetor[1] = c2;
	vetor[2] = c3;
	vetor[3] = c4;
	vetor[4] = c5;
	
	double somaImposto = 0;
	
	double maiorImposto = Integer.MIN_VALUE;
	int iMaiorImposto = 0;
	double menorImposto = Integer.MAX_VALUE;
	int iMenorImposto = 0;
    
    for (int i = 0; i < vetor.length; i++) {
		somaImposto += vetor[i].calcularIRPF();

		if (vetor[i].calcularIRPF() > maiorImposto) {// Comparacao maior
			maiorImposto = vetor[i].calcularIRPF();
			iMaiorImposto = i;
		}

		if (vetor[i].calcularIRPF() < menorImposto) {// Comparacao menor
			menorImposto = vetor[i].calcularIRPF();
			iMenorImposto = i;
		}
	}

	System.out.println("Quem mais paga imposto é o " + vetor[iMaiorImposto].toString());
	System.out.println("Quem menos paga imposto é o " + vetor[iMenorImposto].toString());
	System.out.println("A soma dos imposto é de R$" + somaImposto);
}

}