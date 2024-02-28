package DesempenhoVereadores;

import java.util.ArrayList;
import java.util.List;

public class Vereadores {
	
	/*A Câmara Municipal de Vereadores de Blumenau pretende realizar uma estatística sobre o desempenho dos seus parlamentares.
	Para cada um dos 15 vereadores, ela possui o nome, partido, quantidade de projetos apresentados, quantidade de projetos aprovados. 
	O desempenho é calculado da seguinte forma: 
	(projetos aprovados / projetos apresentados) * índice de trabalho. 
	Se não apresentou nenhum projeto, o desempenho é 0 (zero).
	
	O índice de trabalho é definido pela seguinte tabela:
	Projetos apresentados 		Índice de trabalho
	01 – 05 						0,80
	06 – 10 						1,00
	11 – 17 						1,08
	acima de 17 					1,22
	
	Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima o nome, partido e desempenho do vereador.
	
	Imprima:
	a) o total de projetos apresentados e de aprovados na câmara;
	
	b) o nome, partido e desempenho do vereador com mais projetos aprovados;
	
	c) o nome, partido e desempenho do vereador com menor desempenho;
	
	d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara;*/
	
	private String nome;
	private String partido;
	private double qtdProjetosApresentados;
	private double qtdProjetosAprovados;
	
	public static List<Vereadores> listaVereadores = new ArrayList<>();

	public Vereadores(String nome, String partido, int qtdProjetosApresentados, int qtdProjetosAprovados) {
		setNome(nome);
		setPartido(partido);
		setQtdProjetosApresentados(qtdProjetosApresentados);
		setQtdProjetosAprovados(qtdProjetosAprovados);
		listaVereadores.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome não pode estar vázio ou nulo.");
		} else {
			this.nome = nome;
		}

	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		if (partido.isBlank() || partido.isEmpty() || partido == null) {
			System.out.println("Partido não pode estar vázio ou nulo.");
		} else {
			this.partido = partido;
		}

	}

	public double getQtdProjetosApresentados() {
		return qtdProjetosApresentados;
	}

	public void setQtdProjetosApresentados(int qtdProjetosApresentados) {
		this.qtdProjetosApresentados = qtdProjetosApresentados;
	}

	public double getQtdProjetosAprovados() {
		return qtdProjetosAprovados;
	}

	public void setQtdProjetosAprovados(int qtdProjetosAprovados) {
		this.qtdProjetosAprovados = qtdProjetosAprovados;
	}
	
	/* O índice de trabalho é definido pela seguinte tabela:
		Projetos apresentados 		Índice de trabalho
		01 – 05 						0,80
		06 – 10 						1,00
		11 – 17 						1,08
		acima de 17 					1,22 */
	
	// Somente a classe vereador irá utilizar
	private double indiceTrabalho() {
		if (qtdProjetosApresentados >= 1 && qtdProjetosApresentados <= 5) {
			return 0.80;
		} else if (qtdProjetosApresentados >= 6 && qtdProjetosApresentados <= 10) {
			return 1.00;
		} else if (qtdProjetosApresentados >= 11 && qtdProjetosApresentados <= 17) {
			return 1.08;
		} else if (qtdProjetosApresentados > 17) {
			return 1.22;
		} else {
			return 0.0;
		}
	}
	
	/*O desempenho é calculado da seguinte forma: 
	projetos aprovados / projetos apresentados) * índice de trabalho. 
	Se não apresentou nenhum projeto, o desempenho é 0 (zero).*/

	public double desempenho() {
		// Recebo por função o dado do indíce de trabalho
		if (qtdProjetosApresentados == 0) {
		// Se não apresentou nenhum projeto, desempenho é 0 (zero).
			return 0;
		} else {
			return (qtdProjetosAprovados / (double) qtdProjetosApresentados) * indiceTrabalho();
		}

	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Partido: " + this.partido + " - Desempenho: " + this.desempenho();
	}
}