package Ex2;

public class Aves extends Animal {

	private String corDaPena;
	private String tipoDeAlimentacao;
	
	public Aves(String raca, String nomeDeIdentificacao, String porte, String habitat, String paisDeOrigem, String corDaPena, String tipoDeAlimentacao) {
		super(raca, nomeDeIdentificacao, porte, habitat, paisDeOrigem, corDaPena, tipoDeAlimentacao);
		setCorDaPena(paisDeOrigem);
		setTipoDeAlimentacao(raca);
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		if (corDaPena.isBlank() || corDaPena == null) {
			throw new IllegalArgumentException("Cor inválida.");
		}
		this.corDaPena = corDaPena;
	}
	
	public String getTipoDeAlimentacao() {
		return tipoDeAlimentacao;
	}

	public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
		if (tipoDeAlimentacao.isBlank() || tipoDeAlimentacao == null) {
			throw new IllegalArgumentException("Tipo de alimentação inválida.");
		}
		this.tipoDeAlimentacao = tipoDeAlimentacao;
	}
	
	@Override
	public String toString() {
		// vem da classe pai super.toString()
		return super.toString() + ", Cor da Pena: " + this.corDaPena + ", Tipo de Alimentação: " + this.tipoDeAlimentacao;
	}
}