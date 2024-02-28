package Ex2_Corrigida;

// classe mãe, super classe
// abstract -> tornando abstrata
public abstract class Animal {

	private String raca;
	private String nomeId;
	private String porte;
	private String habitat;
	private String paisOrigem;

	public Animal(String raca, String nomeId, String porte, String habitat, String paisOrigem) {
		setRaca(raca);
		setNomeId(nomeId);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNomeId() {
		return nomeId;
	}

	public void setNomeId(String nomeId) {
		this.nomeId = nomeId;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		if(porte.equals("pequeno") || porte.equals("medio") 
				|| porte.equals("grande")) {			
			this.porte = porte;
		}
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nomeId + ", raca: " + this.raca 
				+ ", porte: " + this.porte + ", habitat: " + this.habitat
				+ ", origem: " + this.paisOrigem;
	}

}
