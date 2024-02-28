package Ex2;

public class Animal {

	private String raca;
	private String nomeDeIdentificacao;
	private String porte;
	private String habitat;
	private String paisDeOrigem;
	private String especie;
	private boolean estimacao;
	protected double peso;
	
	public Animal(String raca, String nomeDeIdentificacao, String porte, String habitat, String paisDeOrigem, String especie, 
			boolean estimacao, double peso) {
		setRaca(raca);
		setNomeDeIdentificacao(nomeDeIdentificacao);
		setPorte(porte);
		setHabitat(habitat);
		setPaisDeOrigem(paisDeOrigem);
	}

	public Animal(String raca2, String nomeDeIdentificacao2, String porte2, String habitat2, String paisDeOrigem2,
			String corDaPelagem, String tiposDeManchas) {
		// TODO Auto-generated constructor stub
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNomeDeIdentificacao() {
		return nomeDeIdentificacao;
	}

	public void setNomeDeIdentificacao(String nomeDeIdentificacao) {
		if (nomeDeIdentificacao.isBlank() || nomeDeIdentificacao == null) {
			throw new IllegalArgumentException("Nome de Identificação não pode estar vázio ou nulo.");
		}
		this.nomeDeIdentificacao = nomeDeIdentificacao;
		}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		if (!porte.equalsIgnoreCase("pequeno") || !porte.equalsIgnoreCase("médio") || !porte.equalsIgnoreCase("grande")) {
			this.porte = porte;
		} else {
			throw new IllegalArgumentException("Inválido");
		}
}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		if (habitat.isBlank() || habitat == null) {
			throw new IllegalArgumentException("Nome do habitat não pode estar vázio ou nulo.");
		}
		this.habitat = habitat;
		}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		if (paisDeOrigem.isBlank() || paisDeOrigem == null) {
			throw new IllegalArgumentException("Nome do país não pode estar vázio ou nulo.");
		}
		this.paisDeOrigem = paisDeOrigem;
		}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isEstimacao() {
		return estimacao;
	}

	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return " Animal: " + getNomeDeIdentificacao() + " Raça: " + getRaca() + " Porte: " + getPorte() + " Habitat: " + getHabitat() + 
				" País: " + getPaisDeOrigem() + " Espécie: " + getEspecie() + "Estimação: " + isEstimacao() + "Peso: " + getPeso();
	}
}
	


