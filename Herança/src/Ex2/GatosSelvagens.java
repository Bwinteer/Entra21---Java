package Ex2;

public class GatosSelvagens extends Animal {

	private String corDaPelagem;
	private String tiposDeManchas;
	
	public GatosSelvagens(String raca, String nomeDeIdentificacao, String porte, String habitat, String paisDeOrigem, 
			String corDaPelagem, String tiposDeManchas) {
		super(raca, nomeDeIdentificacao, porte, habitat, paisDeOrigem, corDaPelagem, tiposDeManchas);
		setCorDaPelagem(corDaPelagem);
		setTiposDeManchas(paisDeOrigem);	
		
	}

	public String getCorDaPelagem() {
		return corDaPelagem;
	}

	public void setCorDaPelagem(String corDaPelagem) {
		if (!corDaPelagem.equalsIgnoreCase("pardo") || !corDaPelagem.equalsIgnoreCase("preto")) {
			this.corDaPelagem = corDaPelagem;
		} else {
			throw new IllegalArgumentException("Inválido");
		}
}

	public String getTiposDeManchas() {
		return tiposDeManchas;
	}

	public void setTiposDeManchas(String tiposDeManchas) {
		if (!tiposDeManchas.equalsIgnoreCase("ausente de manchas") || !tiposDeManchas.equalsIgnoreCase("pintado") || !tiposDeManchas.equalsIgnoreCase("listrado")) {
			this.tiposDeManchas = tiposDeManchas;
		} else {
			throw new IllegalArgumentException("Inválido");
		}
}
	@Override
	public String toString() {
		// vem da classe pai super.toString()
		return super.toString() + ", Cor da Pelagem: " + this.corDaPelagem + ", Tipo de Mancha: " + this.tiposDeManchas;
	}
}