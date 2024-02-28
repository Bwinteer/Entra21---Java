package Cidade;

public class Cidade {
	
	/*O código a seguir foi escrito por um programador descuidado que, após tê-lo escrito, perdeu o código original da classe Cidade.
	Verifique o trecho de código abaixo, e escreva qual seria o código necessário da classe.


	Cidade gaspar = new Cidade();
	gaspar.nome( "Gaspar" );
	gaspar.uf( "SC" );
	gaspar.populacaoMasculina( 28141 );
	 
	Cidade indaial = new Cidade();
	indaial.nome( "Indaial" );
	indaial.populacaoFeminina( 25844 );
	indaial.calculado( true );
	*/

	private String nome;
	private String uf;
	private String populacaoMasculina;
	private String populacaoFeminina;
	private boolean calculado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPopulacaoMasculina() {
		return populacaoMasculina;
	}
	public void setPopulacaoMasculina(String populacaoMasculina) {
		this.populacaoMasculina = populacaoMasculina;
	}
	public String getPopulacaoFeminina() {
		return populacaoFeminina;
	}
	public void setPopulacaoFeminina(String populacaoFeminina) {
		this.populacaoFeminina = populacaoFeminina;
	}
	public boolean isCalculado() {
		return calculado;
	}
	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}
		
}
	


