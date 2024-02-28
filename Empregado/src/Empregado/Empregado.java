package Empregado;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

	/*Crie uma classe Empregado que terá como atributos:
	
	Identificação
	Nome
	Sobrenome
	Salário
	
	Crie métodos para:
	Saber o salário anual do empregado
	Saber o nome completo do empregado
	Modificar o salário, o parâmetro do método deve ser o percentual de aumento
	Imprima o toString do usuário que após o aumento ficou com o maior do salário*/

		private double identificação;
		private String nome;
		private String sobrenome;
		private double salario;

		public static List<Empregado> listaEmpregado = new ArrayList<>();

		public Empregado(double identificação, String nome, String sobrenome, double salario) {
			super();
			setIdentificação(identificação);
			setNome(nome);
			setSobrenome(sobrenome);
			setSalario(salario);
			listaEmpregado.add(this);

		}

		public double getIdentificação() {
			return identificação;
		}

		public void setIdentificação(double identificação) {
			this.identificação = identificação;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			if (salario <= 0) {
				System.out.println("Inválido, valor não pode ser negativo");
			}
			this.salario = salario;
		}

		public double salarioAnual() {
			return this.getSalario() * 12;
		}

		public String nomeCompleto() {
			return nome + " " + sobrenome;

		}

		public static void setListaEmpregado(List<Empregado> listaEmpregado) {
			Empregado.listaEmpregado = listaEmpregado;
		}

		public void porcentagem(double aumentoSalario) {
			setSalario(this.getSalario() + aumentoSalario / 100);

		}

		@Override
		public String toString() {
			return "O salário do empregado " + this.nome + this.sobrenome + " é de " + this.salario;
		}

	}