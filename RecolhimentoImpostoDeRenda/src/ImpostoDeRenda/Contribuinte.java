package ImpostoDeRenda;

public class Contribuinte {

		/*Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, PR e SC) e RENDA ANUAL.
		EX:
		Nome: João da Silva
		CPF: 123.456.789-00
		UF: PR
		RendaAnual: R$40.000

		Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:

		Nível de Renda Anual     Alíquota
		0 a 4.000                  0%
		4.001 a 9.000              5,8%
		9.001 a 25.000             15%
		25.001 a 35.000            27,5%
		acima de 35.000            30%
		*/

		private String nome; // Criacao dos atributos encapsulados
		private String cpf;
		private String uf;
		private double rendaAnual;

		public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
			setNome(nome); // Fazendo atribuicao por meio dos sets
			setCpf(cpf);
			setUf(uf);
			setRendaAnual(rendaAnual);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) { // Exemplo de validacao de String
			if (nome.isBlank() || nome.isEmpty()) {
				System.out.println("Nome invalido");
			} else {
				this.nome = nome;
			}
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			if (cpf.isBlank() || cpf.isEmpty()) {
				System.out.println("CPF invalido");
			} else {
				this.cpf = cpf;
			}
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			if (uf.isBlank() || uf.isEmpty()) {
				System.out.println("UF invalido");
			}
			this.uf = uf;
		}

		public double getRendaAnual() {
			return rendaAnual;
		}

		public void setRendaAnual(double rendaAnual) { // Exemplo de validação de números
			if (rendaAnual < 0) {
				System.out.println("Renda nao pode ser negativo");
			} else {
				this.rendaAnual = rendaAnual;
			}
		}

		public double calcularIRPF() { // Calculo do imposto de renda
			if (this.getRendaAnual() < 4000) {
				return 0;
			} else if (this.getRendaAnual() > 4000 && this.getRendaAnual() < 9000) {
				return this.getRendaAnual() * 0.058;
			} else if (this.getRendaAnual() > 9000 & this.getRendaAnual() < 25000) {
				return this.getRendaAnual() * 0.15;
			} else if (this.getRendaAnual() > 25000 && this.getRendaAnual() < 35000) {
				return this.getRendaAnual() * 0.275;
			}
			return this.getRendaAnual() * 0.3;
		}

		@Override
		public String toString() { // toString do objeto
			return "Contribuinte " + this.getNome() + " cujo cpf é: " + this.getCpf();
		}

	}