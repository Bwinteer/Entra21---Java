package Ex4;
// isto aqui é uma classe abstrata e uma classe pai
public abstract class Animal {
	
	private String especie;
	private boolean estimacao;
	private double peso;
	
	
	public Animal(String especie, boolean estimacao, double peso) {
		super();
		setEspecie(especie);
		setEstimacao(estimacao);
		setPeso(peso);
	}
	
	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}
	
	public boolean isEstimacao() {
		return estimacao;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		// getEspecie() || this.especie -> não fazer
		// pois eu não valido o que está na minha classe
		// eu valido o dado que vem de fora
		if(especie != null || !especie.isBlank()) {			
			this.especie = especie;
		}
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 1) {
			this.peso = peso;			
		}
	}
	
	// Tudo que está em italico é abstrato
	// Metodo abstrato -> Não tem corpo (;)
	// Ele não tem chaves e encerra com ponto e virgula
	// public abstract Tipo nomeDoMetodo() 
	public abstract String som();
	
	

}
