package Ex2_Corrigida;

public class Gato extends Animal {
	private String corDaPelagem;
	private String manchas;

	public Gato(String raca, String nomeId, String porte, String habitat, String paisOrigem,
		 String corDaPelagem, String manchas
		 ) {
		super(raca, nomeId, porte, habitat, paisOrigem);
		setCorDaPelagem(corDaPelagem);
		setManchas(manchas);
		// TODO Auto-generated constructor stub
	}

	public String getCorDaPelagem() {
		return corDaPelagem;
	}

	public void setCorDaPelagem(String corDaPelagem) {
		this.corDaPelagem = corDaPelagem;
	}

	public String getManchas() {
		return manchas;
	}

	public void setManchas(String manchas) {
		if(manchas.equalsIgnoreCase("ausente") || 
				manchas.equalsIgnoreCase("pintado") ||
				manchas.equalsIgnoreCase("listrado")) {
			this.manchas = manchas;			
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ",cor: " + this.corDaPelagem 
				+ ", machas: " + this.manchas;
	}
}
