package Ex5;

public abstract class Embarcacao {
	
	private String id;
	private String modelo;
	private int qtdPessoas;
	private double capacidaDeCombustivel;
	private double queimaDeCombustivel;
	private int qtdBotesSalvaVidas;
	
	
	public Embarcacao(String id, String modelo, int qtdPessoas, double capacidadeCombustivel,
			double queimaDecombustivel, int qtdBotesSalvaVidas) {
		setId(id);
		setModelo(modelo);
		setQtdPessoas(qtdPessoas);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaDecombustivel(queimaDecombustivel);
		setQueimaDecombustivel(queimaDecombustivel);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public double getCapacidadeCombustivel() {
		return capacidaDeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		if(queimaDeCombustivel < 0) {
			throw new IllegalArgumentException("Quantidade de queima de combustível inválida.");
		} else {
		this.capacidaDeCombustivel = capacidadeCombustivel;
		}
	}	
	public double getQueimaDecombustivel() {
		return queimaDeCombustivel;
	}

	public void setQueimaDecombustivel(double queimaDecombustivel) {
		if(capacidaDeCombustivel < 0) {
			throw new IllegalArgumentException("Capacidade de combustível inválida.");
		} else {
		this.queimaDeCombustivel = queimaDecombustivel;
		}
	}
	public int getQtdBotesSalvaVidas() {
		return qtdBotesSalvaVidas;
	}

	public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) {
		if (qtdBotesSalvaVidas < 0) {
			throw new IllegalArgumentException("Quantidade inválida, não pode ser negativa.");
		} else {
		this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
		}
	}
	
	public boolean planejarViagem(double distancia) {
		// Recebe uma distância e verifica se tem a quantidade suficiente de combustivel
		double distanciaTotal = this.capacidaDeCombustivel * this.queimaDeCombustivel;
		// distanciaTotal que consegue percorrer com o combusível
		if(distancia <= distanciaTotal) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract String verificaSeguranca();

	@Override
	public String toString() {
		return "A embarcação de id: " + this.id + " do modelo " + this.modelo + " cabe " + this.qtdPessoas
				+ " pessoas e possui " + this.qtdBotesSalvaVidas + " botes salva vidas.";
	}
	
}

