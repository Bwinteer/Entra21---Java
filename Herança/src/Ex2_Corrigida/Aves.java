package Ex2_Corrigida;

public class Aves extends Animal {
	

	private String corPredominante;
	private String tipoDeAlimentacao;
	
	public Aves(String raca, String nomeId, String porte, String habitat, String paisOrigem,
			// atributos próprios do filho
			String corPredominante, String tipoDeAlimentacao
			) {
		super(raca, nomeId, porte, habitat, paisOrigem);
		setTipoDeAlimentacao(tipoDeAlimentacao);
		setCorPredominante(corPredominante);
		// TODO Auto-generated constructor stub
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}

	public String getTipoDeAlimentacao() {
		return tipoDeAlimentacao;
	}

	public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
		this.tipoDeAlimentacao = tipoDeAlimentacao;
	}
	
	@Override
	public String toString() {
		// super -> chamando a classe pai = this.Animal
		return super.toString() + ", cor: " + this.corPredominante 
				+ ", alimentacao: " + this.tipoDeAlimentacao;
	}
	
	
}
