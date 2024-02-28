package Ex5;

public class Transatlantico extends Embarcacao {

	private int anoBatismo;
	private int capacidadeBoteSalvaVidas;
	
	public Transatlantico(String id, String modelo, int qtdPessoas, double capacidadeCombustivel,
			double queimaDecombustivel, int qtdBotesSalvaVidas, int anoBatismo, int capacidadeBoteSalvaVidas) {
		super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDecombustivel, qtdBotesSalvaVidas);
		setAnoBatismo(anoBatismo);
		setCapacidadeBoteSalvaVidas(capacidadeBoteSalvaVidas);
		
	}
	
	@Override
	public String verificaSeguranca() {
		int qntLugares = this.capacidadeBoteSalvaVidas * getQtdBotesSalvaVidas();
		if(qntLugares >= getQtdPessoas()) {
			return "Botes OK";
		} else {
			return "ALERTA: embarcação necessitando de mais botes!";
		}
	}
	
	public void adicionaBotes(int quantidade) {
		int novaQuantidade = getQtdBotesSalvaVidas() + quantidade;
		setQtdBotesSalvaVidas(novaQuantidade);
	}

	public int getAnoBatismo() {
		return anoBatismo;
	}

	public void setAnoBatismo(int anoBatismo) {
		if (anoBatismo < 0) {
			throw new IllegalArgumentException("Ano inválido.");
		} else {
		this.anoBatismo = anoBatismo;
		}
	}
	public int getCapacidadeBoteSalvaVidas() {
		return capacidadeBoteSalvaVidas;
	}

	public void setCapacidadeBoteSalvaVidas(int capacidadeBoteSalvaVidas) {
		if (capacidadeBoteSalvaVidas < 0) {
			throw new IllegalArgumentException("Inválido.");
		} else {
		this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
		}
	}

}
