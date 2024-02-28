package OnibusEscolar;

public class OnibusEscolar {

	/*
	 * Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
	 * professor
	 * 
	 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
	 * que 40, faça com que o número de alunos seja 40
	 * 
	 * Caso o número de professores for 0, o número de alunos também deve ser zerado
	 * 
	 * Faça também um método chamado remover alunos, que deverá remover os alunos de
	 * acordo com o valor passado como parâmetro
	 */

	private int estudantes;
	private int professor;

	public OnibusEscolar(int estudantes, int professor) {
		this.estudantes = estudantes;
		this.professor = professor;

	}

	public int getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(int estudantes) {
		// Tratamento de exceção para limitar o número de alunos a 40
		if (estudantes > 40) {
			this.estudantes = 40;
		} else {
			this.estudantes = estudantes;
		}

		// Se o número de professores for 0, zere também o número de alunos
		if (this.professor == 0) {
			this.estudantes = 0;
		}
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		// Se o número de professores for 0, zere também o número de alunos
		if (professor == 0 && estudantes == 0) {
			this.professor = 0;
			this.estudantes = 0;
		} else {
			this.professor = estudantes;
		}
	}

	public void removerAlunos(int valor) {
		setEstudantes(this.estudantes - valor);

	}

	@Override
	public String toString() {
		return "OnibusEscolar [Estudantes = " + estudantes + ", Professor = " + professor + "]";
	}

}